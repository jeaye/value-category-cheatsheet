(ns lifetime-cheatsheet.config
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]))

(def data (delay (-> (io/resource "config.edn")
                     slurp
                     edn/read-string)))
