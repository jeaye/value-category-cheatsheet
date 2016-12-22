(ns lifetime-cheatsheet.home
  (:require [lifetime-cheatsheet.config :as config]
            [hiccup.core :as hiccup]
            [hiccup.page :as page]))

(defn html []
  (page/html5
    [:div "meow!"]))
