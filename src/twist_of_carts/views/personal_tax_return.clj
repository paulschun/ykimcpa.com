(ns twist-of-carts.views.personal-tax-return
  (:require [digest :as digest]
            [twist-of-carts.util :refer [short-date slug-path]]))

(def forms
  ["Form 1040: US Income Tax Return"
   "Form 1040NR: Non-Resident Alien Income Tax Return"
   "California and other states' Tax Returns for residents, nonresidents or part-year residents"
   "FBAR: FinCEN Report of Foreign Bank and Financial Accounts"
   "Statement of Specified FACTA Compliance"
   "Form 8938: Statement of Specified  Foreign Financial Assets"
   "Form 5471: Information Return of US Persons with Respect to Certain Foreign Corporations"
   "Form 3520: Annual Return to Report Transactions with Foreign Trusts and Receipt of Certain Foreign Gifts"
   "Form 709: United States Gift (and Generation-Skipping Transfer) Tax Return"
   "Form 8854: Initial and Annual Expatriation Statement"
   "Streamlined Foreign Offshore Procedures for Delinquent Filers"])

(def eligible-people
  ["US citizens, including those overseas"
   "US Green Card holders"
   "US tax residents"])

(defn green-check [s]
  [:li
   [:span.green-check
    [:i.fas.fa-check]]
   "&nbsp;&nbsp;&nbsp;"
   s])

(defn personal-tax-return
  "The homepage."
  []
  {:title "Young Kim Accounting Solutions &mdash; Service Provided for Personal Tax Returns"
   :content
   [:div
    [:section
     [:div.container.pad-vertical
      [:h1.title "Personal Tax Return Preparation"]
      [:h2.subtitle "We'll help you navigate your tax situation for an ideal outcome."]
      [:div.columns
       [:div.column.information-page
        [:p "Given the complicated nature of the seemingly endless tax rules and regulations, it's understandable that filing taxes can be tiring, stressful or overwhelming. That's why Young Kim Accounting Solutions is here to help you navigate your tax filings."]
        [:p "The following is just a few of the documents that Young Kim Accounting Solutions offers tax services to help you complete:"]
        [:ul
         (map green-check forms)]
        [:p "Services are provided for all:"]
        [:ul
         (map green-check eligible-people)]
        [:p "Get in touch today if you'd like to learn more about how Young Kim Accounting Solutions can help you."]]
       [:div.column
        [:div.captioned-image
         [:img {:src "/images/invoice-stamp.jpg"}]]]]]]]})
