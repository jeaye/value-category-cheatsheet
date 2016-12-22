(ns lifetime-cheatsheet.home
  (:require [lifetime-cheatsheet.config :as config]
            [lifetime-cheatsheet.css :as css]
            [hiccup.core :as hiccup]
            [hiccup.page :as page]))

(defn html []
  (page/html5
    [:head [:style (css/main)]]
    [:body
     [:table.grid
      [:tr
       (for [ex (:examples @config/data)]
        [:td
         [:td (pr-str (:bad ex))]
         [:td (pr-str (:good ex))]])]]]))
