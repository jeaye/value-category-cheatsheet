(ns value-categories.home
  (:require [value-categories
             [config :as config]
             [css :as css]]
            [hiccup
             [core :as hiccup]
             [page :as page]]
            [markdown.core :refer [md-to-html-string]]
            [clojure.java.io :as io]))

(def read-resource (comp slurp io/resource))
(def read-code (comp hiccup/h read-resource))
(def read-markdown (comp md-to-html-string read-resource))

(defn title [title-str]
  [:p.title title-str])

(defn code [code-str]
  [:pre
   [:code {:class "cpp"}
    code-str]])

(defn text [text-str]
  [:p.text text-str])

(defn tag-spans [tags]
  [:div.tag
   (for [tag tags]
     [:span {:class (name tag)} tag])])

(defn cell [data]
  [:td
   (when-let [title-str (:title data)]
     (title title-str))
   (when-let [code-str (:code data)]
     (code (read-code code-str)))
   (when-let [text-str (:text data)]
     (text (read-markdown text-str)))
   (when-let [text-str (:text-data data)]
     (text text-str))
   (tag-spans (:tags data))])

(defn row [example]
  [:tr (map cell ((juxt :left :right) example))])

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
       (for [section (:sections data)]
         (list
           [:h2.section (:title section)]
           (when-let [description (:description section)]
             [:p.section (read-markdown description)])
           [:table.grid
            [:colgroup
             [:col.left-column]
             [:col.right-column]]
            (for [ex (:rows section)]
              (row ex))]))])))
