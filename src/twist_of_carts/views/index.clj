(ns twist-of-carts.views.index
  (:require [digest :as digest]
            [twist-of-carts.util :refer [short-date slug-path]]))

(defn home
  "The homepage."
  []
  {:title "Young Kim Accounting Solutions &mdash; San Francisco-based tax services for local and global endeavors."
   :content [:div
             [:section.hero.is-bold.is-medium
              [:div.hero-body
               [:div.container
                [:h1.title "Young Shin Kim, CPA"]
                [:h2.subtitle "Despite the one-word biography of workaholic given by her daughter and son, she still enjoys a good day hike."]
                [:div.]
                ]]]]})
