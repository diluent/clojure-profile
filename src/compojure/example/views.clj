(ns compojure.example.views
  (:require [net.cgrand.enlive-html :as html]))


(html/deftemplate main-page-index "./../resources/main.html" [ctxt]
  [:title] (html/content (:title ctxt))
  [:#title] (html/content (:title ctxt))
  [:#subtitle] (html/content (:subtitle ctxt))
  [:#description] (html/content (:description ctxt))
  [:body] (html/set-attr "style" "background-color: #000; color: #fff"))

(html/deftemplate auth-index "./../resources/signin.html" [ctxt]
  [:title] (html/content "Sign in"))
  
(defn index-page []
  (main-page-index {
    :title "Natalia Valkova"
    :subtitle "Designer"
    :description "profile"
  }))

(defn auth-page []
  (auth-index {}))

