(ns compojure.example.views
  (:require [net.cgrand.enlive-html :as html]))

(html/deftemplate page-index "./../resources/index.html" [ctxt]
  [:title] (html/content "Awesome application")
  [:#old] (html/content (:old ctxt))
  [:#msg2] (html/set-attr "style" "display: none"))

(defn index-page []
  (page-index {:old "123"}))