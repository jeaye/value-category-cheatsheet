(defproject value-categories "0.1.0-SNAPSHOT"
  :description "A cheatsheet for modern C++ value categories"
  :url "https://github.com/jeaye/value-category-cheatsheet"
  :license {:name "jank license"
            :url "https://upload.jeaye.com/jank-license"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [hiccup "1.0.5"]
                 [garden "1.3.2"]
                 [markdown-clj "0.9.91"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler value-categories.handler/app
         :auto-reload? true
         :auto-refresh? true}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
