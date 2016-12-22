(ns lifetime-cheatsheet.home
  (:require [lifetime-cheatsheet.config :as config]
            [lifetime-cheatsheet.css :as css]
            [hiccup.core :as hiccup]
            [hiccup.page :as page]
            [clojure.java.io :as io]))

(def read-resource (comp slurp io/resource))

(defn code [code-str]
  [:pre
   [:code {:class "c"}
    code-str]])

(defn text [text-str]
  [:p.text text-str])

(defn tag-spans [tags]
  [:div.tag
   (for [tag tags]
     [:span {:class (name tag)} tag])])

(defn cell [data]
  [:td
   (when-let [code-str (:code data)]
     (code (read-resource code-str)))
   (when-let [text-str (:text data)]
     (text (read-resource text-str)))
   (when-let [text-str (:text-data data)]
     (text text-str))
   (tag-spans (:tags data))])

(defn row [example]
  [:tr
   (map cell ((juxt :left :right) example))])

(defn html []
  (let [data (config/data)]
    (page/html5
      [:head
       [:style (css/main)]
       [:link {:rel "stylesheet"
               :href "//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.9.0/styles/solarized-light.min.css"}]
       [:script {:src "//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.9.0/highlight.min.js"}]
       [:script "hljs.initHighlightingOnLoad();"]]
      [:body
       [:table.grid
        (for [ex (:examples data)]
          (row ex))]])))
