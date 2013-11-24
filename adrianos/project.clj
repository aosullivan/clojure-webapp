(defproject adrianos112 "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure/compojure "1.0.0"]
                 [ring "1.1.8"]]
  :plugins [[lein-ring "0.8.5"]
            [lein-beanstalk "0.2.7"]]
  :ring {:handler adrianos.core/routes})