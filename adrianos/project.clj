(defproject adrianos "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure/compojure "1.0.0"]
                 [ring "1.1.8"]]
  :plugins [[lein-ring "0.8.5"]
            [lein-beanstalk "0.2.7"]]
  :ring {:handler adrianos.core/routes}
  :aws {:access-key "AKIAJX23WFZA5737VMVQ"
        :secret-key "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"
        :beanstalk {:environments [{:name "dev"}
                                   {:name "demo"}
                                   {:name "uat1"}
                                   {:name "prod"}]}})
        
        