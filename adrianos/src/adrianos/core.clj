(ns adrianos.core
  (:use
    [compojure.core :only (GET HEAD defroutes)]))

(defroutes routes
  (HEAD "/" [] "")
  (GET "*" request "hello its adrian"))