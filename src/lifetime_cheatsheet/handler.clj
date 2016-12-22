(ns lifetime-cheatsheet.handler
  (:require [lifetime-cheatsheet.home :as home]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] (home/html))
  (route/not-found "Not Found"))

(def app (wrap-defaults app-routes site-defaults))
