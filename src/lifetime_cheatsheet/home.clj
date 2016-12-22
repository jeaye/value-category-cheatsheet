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

(defn row [example]
  (let [strs (->> example ((juxt :left :right)) (map read-example))]
    [:tr
     [:td (code (first strs))]
     [:td (code (second strs))]]))

(defn html []
  (page/html5
    [:head
     [:style (css/main)]
     [:link {:rel "stylesheet"
              :href "//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.9.0/styles/solarized-light.min.css"}]
     [:script {:src "//cdnjs.cloudflare.com/ajax/libs/highlight.js/9.9.0/highlight.min.js"}]
     [:script "hljs.initHighlightingOnLoad();"]]
    [:body
     [:table.grid
      (for [ex (:examples (config/data))]
        (row ex))]]))
