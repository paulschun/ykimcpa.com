(ns twist-of-carts.views.business-tax-planning
  (:require [digest :as digest]))

(defn business-tax-planning
  "The homepage."
  []
  {:title "Young Kim Accounting Solutions &mdash; Business Tax Planning"
   :content
   [:div
    [:section
     [:div.container.pad-vertical
      [:h1.title "Business Tax Planning"]
      [:h2.subtitle "Young Kim Accounting Solutions provides effective tax planning for your business needs."]
      [:div.columns
       [:div.column.information-page
        [:p "Increase cash flow and net profit of your business with effective tax planning. Young Kim Accounting Solutions provides your business with tax planning and preparation services to help you reach your goals sooner."]
        [:p "Some of our services and specialties include:"]
        [:p [:h3.subtitle "Strategic Planning"]]
        [:p "Businesses of any size can benefit from a deliberate approach to taxation. Young Kim Accounting Solutions provides decades of experience and expertise in strategic planning to minimize taxes owed."]
        [:p
         [:h3.subtitle "Bay Area, California and Other State and Local Taxation"]]
        [:p "A long-term resident of the San Francisco Bay Area, state and local taxes for this region and many others are Young Kim Accounting Solution's bread and butter. We've had decades to understand the nuances of local taxes for various regions in the Bay Area as well as state code for California and many other states."]
        [:p [:h3.subtitle "Credits and Deduction"]]
        [:p "Young Kim Accounting Solutions often recognizes taxation minimization opportunities that may have been gone unnoticed by clients otherwise."]
        [:p "This is just a small portion of the tax planning services that we offer. If you think we can help you with tax planning, get in touch today."]]
       [:div.column
        [:div.captioned-image
         [:img {:src "/images/biz-tax-planning.jpg"}]]]]]]]})
