(ns twist-of-carts.views.personal-tax-planning
  (:require [digest :as digest]
            [twist-of-carts.components.green-checklist :refer [green-checklist]]))


(defn personal-tax-planning
  "The homepage."
  []
  {:title "Young Kim Accounting Solutions &mdash; Personal Tax Planning"
   :content
   [:div
    [:section
     [:div.container.pad-vertical
      [:h1.title "Personal Tax Planning"]
      [:h2.subtitle "We'll help you navigate your tax situation for an ideal outcome."]
      [:div.columns
       [:div.column.information-page
        [:p "Whether you've had success minimizing your or your family's tax liability through "
         [:a {:href "/personal-tax-return-preparation/"} "our personal tax preparation service"]
         " or another provider, it's quite likely that you're already aware of the major benefits of working with a CPA."]
        [:p "Though these benefits are clear, figuring things out after the end of the fiscal year is a passive and therefore likely suboptimal approach to tax minimization. For a proactive, structured approach to tax minimization, Young Kim Accounting Solutions offers personal tax planning services to all:"]
        [:p (green-checklist ["American business owners"
                              "American non-profit organization managers"
                              "Employees of American companies"
                              "American citizens, green card holders and US tax residents"])]
        [:p "We specialize in understanding the situations of clients in order to provide sound advice for your tax positions, and create a tailor-made strategy for you or your family. On top of that, we stay up-to-date with the latest information to make sure that your strategy is always the best strategy for you in a sea of constantly changing taxation policy."]
        [:p "No matter how complicated your taxation situation is, we're here to help you make the most sense of your tax situation."]
        [:p "If you'd like to learn more about how Young Kim Accounting Solutions can help you, "
         [:a {:href "/contact/"} "get in touch today"]
         "."]]
       [:div.column
        [:div.captioned-image
         [:img {:src "/images/invoice-stamp.jpg"}]]]]]]]})
