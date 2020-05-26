(ns twist-of-carts.views.about-ykas
  (:require [digest :as digest]
            [twist-of-carts.util :refer [short-date slug-path]]))

(defn about-ykas
  "The homepage."
  []
  {:title "Young Kim Accounting Solutions &mdash; About Young Shin Kim"
   :content
   [:div
    [:section
     [:div.container.pad-vertical
      [:h1.title "About Young Kim Accounting Solutions"]
      [:h2.subtitle "Serving the needs of businesses and individuals since 1994."]
      [:div.columns
       [:div.column.information-page
        [:p "The mission of Young Kim Accounting Solutions is simple: to develop valuable long-term relationships with clients by consistently providing excellence."]
        [:p "Founded in 1994 by Young Shin Kim in order to foster the endeavors and growth of the San Francisco Bay Area community and its members' global visions, Young Kim Accounting Solutions boasts over twenty-five years of high-quality, knowledgeable and highly individualized consulting, taxation and accounting services to individuals, families, businesses and nonprofits operating both locally, nationally and across borders."]
        [:p "Our numbers speak for themselves: 95% of clients return for a second year, and 65% of clients are referred via word of mouth through happy clients."]]
       [:div.column
        [:div.captioned-image
         [:img {:src "/images/bookkeeping.jpg"}]]]
       ]]]]})
