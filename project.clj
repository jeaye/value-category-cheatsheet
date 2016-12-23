(defproject lifetime-cheatsheet "0.1.0-SNAPSHOT"
  :description "A cheatsheet for modern C++ value categories"
  :url "https://github.com/jeaye/lifetime-cheatsheet"
  :license {:name "jank license"
            :url "https://upload.jeaye.com/jank-license"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [hiccup "1.0.5"]
                 [garden "1.3.2"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler lifetime-cheatsheet.handler/app
         :auto-reload? true
         :auto-refresh? true}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
