(defproject profile "0.1.0"
  :description "Profile"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.1"]
                 [hiccup "1.0.0"]
                 [enlive "1.1.6"]]
  :plugins [[lein-ring "0.7.1"]]
  :ring {:handler compojure.example.routes/app})
