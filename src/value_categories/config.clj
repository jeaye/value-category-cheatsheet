(ns value-categories.config
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]))

(defn data []
  (-> (io/resource "config.edn")
      slurp
      edn/read-string))
