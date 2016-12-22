(ns lifetime-cheatsheet.home
  (:require [lifetime-cheatsheet.config :as config]
            [lifetime-cheatsheet.css :as css]
            [hiccup.core :as hiccup]
            [hiccup.page :as page]
            [clojure.java.io :as io]))

(def read-example (comp slurp io/resource :file))

(defn code [code-str]
  [:pre
   [:code {:class "c"}
    code-str]])

(defn tag-spans [tags]
  [:div.tag
   (for [tag tags]
     [:span {:class (name tag)} tag])])

(defn row [data example]
  (let [strs (->> example ((juxt :left :right)) (map read-example))
        left-tags (-> example :left :tags)
        right-tags (-> example :right :tags)]
    [:tr
     [:td
      (code (first strs))
      (tag-spans left-tags)]
     [:td
      (code (second strs))
      (tag-spans right-tags)]]))

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
          (row data ex))]])))
