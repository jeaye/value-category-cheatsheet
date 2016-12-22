(ns lifetime-cheatsheet.handler
  (:require [lifetime-cheatsheet.config :as config]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] (pr-str @config/data))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
