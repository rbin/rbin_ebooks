(ns ebooks.app
  (:require [monger.collection :as mc]
            [monger.core :as mg]))

  ;; localhost, default port
  (mg/connect!)
  (mg/set-db! (mg/get-db "rbin_ebooks"))

  (def twitter-timeline "https://api.twitter.com/1.1/statuses/user_timeline.json")

  (defn -main []

    (mc/insert "documents" {:first_name "John"  :last_name "Lennon"})

    (println (mc/find-maps "documents" { :first_name "John"} )))
    ;; (mc/remove "documents")