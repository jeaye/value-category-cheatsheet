(ns lifetime-cheatsheet.home
  (:require [lifetime-cheatsheet.config :as config]
            [lifetime-cheatsheet.css :as css]
            [hiccup.core :as hiccup]
            [hiccup.page :as page]))

(defn html []
  (page/html5
    [:head [:style (css/main)]]
    [:div "meow!"]))
