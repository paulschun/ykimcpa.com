(ns twist-of-carts.views.marin-location
  (:require
   [twist-of-carts.components.green-checklist :refer [green-checklist]]))

(defn marin-location [{:keys [place plural-demonym]}]
  {:title (str "Young Kim Accounting Solutions &mdash; Tax Accountant Services for Residents of " place ", California")
   :content
   [:div
    [:section
     [:div.container.pad-vertical
      [:h1.title (str "Tax Accountant Services for Residents of " place ", California")]
      [:h2.subtitle
       (str "San Francisco-based Young Kim Accounting Solutions provides accounting and tax help for all " plural-demonym ".")]
      [:div.columns
       [:div.column.landing-page__description
        [:p
         "Determining who you share your financial information with is an important decision that requires unwavering trust from both sides. San Francisco-based Young Kim Accounting Solutions prides itself on providing residents of "
         place
         " with competent and personable solutions for all accounting and taxation needs, whether for you, your family or your business of any size."]

        [:p "Here's what Young Kim Accounting Solutions can do for you:"]
        [:div
         [:h3.subtitle.is-5 "Business Services"]
         [:ul.landing-page__references
          [:li [:a {:href "/business-tax-return-preparation/"} "Business Tax Return Preparation &rarr;"]]
          [:li [:a {:href "/business-tax-planning/"} "Business Tax Planning &rarr;"]]
          [:li [:a {:href "/international-tax-services/"} "International Tax &amp; Accounting Services &rarr;"]]]
         [:h3.subtitle.is-5 "Personal Services"]
         [:ul.landing-page__references
          [:li [:a {:href "/personal-tax-return-preparation/"} "Personal Tax Return Preparation &rarr;"]]
          [:li [:a {:href "/personal-tax-planning/"} "Personal Tax Planning &rarr;"]]]
         ]
        [:p "Originally founded in San Rafael, Young Kim Accounting Solutions has, for over twenty-five years, served residents of Marin County (in addition to clients from around the globe) with their business and personal accounting and taxation needs. A former long-term resident of Marin herself before moving into the city, Young has a soft spot for all things Marin"
         ". Her two children were educated in schools in the Miller Creek School District and San Rafael City Schools districts, and she enjoyed the hilly terrain that Marin has to offer, but the years of commuting into the city on the congested Southbound 101 became too much to bear."]
        [:p "If you think Young Kim Accounting Solutions can help you, "
         [:a {:href "/contact/"} "get in touch today"]
         "."]
        ]
       [:div.column
        [:div.captioned-image
         [:img {:src (str "/images/ring-mountain.jpg")}]
         [:div.captioned-image__caption "Young hiking a Marin trail. Can you guess where in Marin this is?"]]]]
      ]]]})
