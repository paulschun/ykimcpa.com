(ns twist-of-carts.views.international-tax-services
  (:require [digest :as digest]
            [twist-of-carts.components.green-checklist :refer [green-checklist]]
            [twist-of-carts.util :refer [short-date slug-path]]))

(defn international-tax-services
  "The homepage."
  []
  {:title "Young Kim Accounting Solutions &mdash; International Tax &amp; Accounting Services"
   :content
   [:div
    [:section
     [:div.container.pad-vertical
      [:h1.title "International Tax &amp; Accounting Services"]
      [:h2.subtitle "Taxes and accounting in two or more places? We can help you with that."]
      [:div.columns
       [:div.column.information-page
        [:p "Young Kim Accounting Solutions can help your business or organization in all situations concerning international taxation and accounting, including:"]
        [:p
         (green-checklist
          ["US-based companies or organizations operating or planning to operate in a different country"
           "Non-US-based companies or organizations operating or planning to operate in the United States."
           "Company employees coming to or departing from the United States"])]
        [:p "Attempting to expand internationally without a qualified financial planner is risky because a lack of knowledge of tax codes and treaties could lead to heavy tax penalties. Likewise, knowledge of the tax codes and treaties could result in substantial savings, leaving your business with more capital in its pockets."]
        [:p "For companies that plan to expand internationally, whether to or from the United States, Young Kim Accounting Solutions provides expertise in international tax planning to ensure your understanding of the tax codes are clear, and that you're ready to operate with confidence in the region of expansion."]
        [:p "For companies that have expanded already and are searching for accounting solutions, we offer international accounting services  to ensure your business stays up to speed on all bookkeeping, accounting, taxation and financial matters through the creation of a tailor-made maintainable system."]
        [:p "To learn more about how we can help, "
         [:a {:href "/contact/"} "get in touch today"]
         "."
         ]
        ]
       [:div.column
        [:div.captioned-image
         [:img {:src "/images/person-traveling.jpg"}]]]]]]
    ]})
