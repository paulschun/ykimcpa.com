(ns twist-of-carts.views.korean-city
  (:require
   [twist-of-carts.components.green-checklist :refer [green-checklist]]))

(defn korean-city [{:keys [place image-url image-description far-away-from]}]
  {:title (str "Young Kim Accounting Solutions &mdash; American Tax Accountant Services for Residents of " place)
   :content
   [:div
    [:section
     [:div.container.pad-vertical
      [:h1.title (str "American Tax Accountant Services for Residents of " place)]
      [:h2.subtitle
       (str "San Francisco-based Young Kim Accounting Solutions provides accounting and tax help for Americans in " place ".")]
      [:div.columns
       [:div.column.landing-page__description
        [:p
         "Are you an American residing in "
         place
         " and looking for an accountant to help you navigate personal or business accounting and tax matters?"]
        [:p
         "San Francisco-based Young Kim Accounting Solutions might be far away from "
         far-away-from
         ", but with years of experience in providing tax services to Americans abroad in South Korea, you can expect competent, professional services for your accounting and taxation needs directly from your home in " place "."]

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
        [:p "Young Kim Accounting Solutions proudly provides services to:"]
        (green-checklist ["US Citizens" "US Green Card Holders" "US Tax Residents"])
        [:p "If you think Young Kim Accounting Solutions can help you, "
         [:a {:href "/contact/"} "get in touch today"]
         "."]
        ]
       [:div.column
        [:div.captioned-image
         [:img {:src (str "/images/korea-photos/" image-url)}]
         [:div.captioned-image__caption image-description]]]]
      ]]]})
