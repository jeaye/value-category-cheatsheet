(ns lifetime-cheatsheet.home
  (:require [lifetime-cheatsheet.config :as config]
            [lifetime-cheatsheet.css :as css]
            [hiccup.core :as hiccup]
            [hiccup.page :as page]
            [clojure.java.io :as io]))

(def read-example (comp slurp io/resource :file))

(defn row [example]
  (let [bad-str (-> example :bad read-example)
        good-str (-> example :good read-example)]
    [:tr
     [:td bad-str]
     [:td good-str]]))

(defn html []
  (page/html5
    [:head [:style (css/main)]]
    [:body
     [:table.grid
      (for [ex (:examples @config/data)]
        (row ex))]]))
