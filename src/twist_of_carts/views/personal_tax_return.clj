(ns twist-of-carts.views.personal-tax-return
  (:require [digest :as digest]
            [twist-of-carts.components.green-checklist :refer [green-checklist]]
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

(defn personal-tax-return
  "The homepage."
  []
  {:title "Young Kim Accounting Solutions &mdash; Personal Tax Returns"
   :content
   [:div
    [:section
     [:div.container.pad-vertical
      [:h1.title "Personal Tax Return Preparation"]
      [:h2.subtitle "We'll help you navigate your tax situation for an ideal outcome."]
      [:div.columns
       [:div.column.information-page
        [:p "Are you one of many American taxpayers who just thinks personal taxes means filing a 1040 some time before the end of the tax deadline in April? Regardless, you probably know that, due to seemingly endless tax rules and regulations, taking care of personal taxes can be intimidating, stressful or overwhelming. And what's worse: without a custom-tailored tax strategy, you could be losing out on a lot of money that you've earned and to which you're entitled."]
        [:p "Young Kim Accounting Solutions boasts over twenty-five years of experience helping individuals and families clarify what benefits they're entitled to in order to minimize tax liability, with our online filing system ensuring that you get your refund as quickly as possible. Services are provided for all:"]
        [:p (green-checklist eligible-people)]
        [:p "The following is just a few of the documents that Young Kim Accounting Solutions offers tax services to help you complete:"]
        [:p (green-checklist forms)]
        [:p "If you'd like to learn more about how Young Kim Accounting Solutions can help you, "
         [:a {:href "/contact/"} "get in touch today"]
         "."]]
       [:div.column
        [:div.captioned-image
         [:img {:src "/images/invoice-stamp.jpg"}]]]]]]]})
