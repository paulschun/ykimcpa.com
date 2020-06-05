(ns twist-of-carts.views.business-tax-returns
  (:require [digest :as digest]
            [twist-of-carts.components.green-checklist :refer [green-checklist]]
            [twist-of-carts.util :refer [short-date slug-path]]))

(defn business-tax-returns
  "The homepage."
  []
  {:title "Young Kim Accounting Solutions &mdash; Business Tax &amp; Return Preparation"
   :content
   [:div
    [:section
     [:div.container.pad-vertical
      [:h1.title "Business Tax Return Preparation"]
      [:h2.subtitle "Feel confident that the IRS won't hound you and that you get all deductions and credits you deserve."]
      [:div.columns
       [:div.column.information-page
        [:p "Young Kim Accounting Solutions was founded in 1994 to help businesses and organizations, both small and large, navigate their way through the windy road that is taxation. We're certain we can help business and organizations of all shapes and sizes, including:"]
        [:p
         (green-checklist
          ["C Corporations"
           "S Corporations"
           "Manager-Managed LLCs"
           "Multi-Member LLCs"
           "Single-Member LLCs"
           "Partnerships"
           "Sole Proprietorships"
           "Not-For-Profit Organizations"
           "For-Profit Benefit Corporations"]
          )]
        [:p "We've seen a lot of things over twenty-five years, and many among those have been overlooked deductions and credits to which a business or organization is entitled, while still others have been reported information that could lead to tax or IRS problems. Unfortunately, tax software alone is not enough to help business owners with these issues."]
        [:p "That's why Young Kim Accounting Solutions stands for reliable and competent accounting solutions that you and your business can rely on. We're all about developing lasting relationships with businesses and organizations, and that means focusing on both the short-term and long-term success of our client, and not on a money grab."]
        [:p "If your business or organization hasn't been keeping up with bookkeeping, that's something we can help with too. No mess is too big for us."]
        [:p "In addition to business tax return preparation, we can also "
         [:a {:href "/personal-tax-return-preparation/"} "prepare your personal tax return"]
         "."]
        [:p "To learn more about how we can help, "
         [:a {:href "/contact/"} "get in touch today"]
         "."
         ]
        ]
       [:div.column
        [:div.captioned-image
         [:img {:src "/images/person-traveling.jpg"}]]]]]]
    ]})
