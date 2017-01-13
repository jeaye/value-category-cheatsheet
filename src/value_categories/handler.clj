(ns value-categories.handler
  (:require [value-categories.home :as home]
            [compojure
             [core :refer :all]
             [route :as route]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] (home/html))
  (route/not-found "Not Found"))

(def app (wrap-defaults app-routes site-defaults))
