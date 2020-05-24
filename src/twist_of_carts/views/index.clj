(ns twist-of-carts.views.index
  (:require [digest :as digest]
            [twist-of-carts.util :refer [short-date slug-path]]))

(defn home
  "The homepage."
  []
  {:title "Young Kim Accounting Solutions &mdash; San Francisco-based tax services for local and global endeavors."
   :content [:div
             [:section.hero.is-bold.is-fullheight-with-navbar.ykas-hero
              [:div.hero-body
               [:div.container
                [:div.columns
                 [:div.column.portrait
                  [:img {:src "/images/portrait.jpg"}]
                  [:div.portrait__caption
                   "Young Shin Kim, CPA"
                   [:div
                    [:a {:href "/about-young-shin-kim/"} "Learn More About Young &rarr;"]]]]
                 [:div.column
                  [:h1.title "Peace of Mind Is Everything."]
                  [:h2.subtitle "Backed by decades of experience and expertise, Young Kim Accounting Solutions offers accounting and taxation services to address your personal and business needs, wherever in the world you are."]]
                 ]
                ]]]
             [:section.hero.is-fullheight.ykas-hero-black
              [:div.hero-body
               [:div.container
                [:h1.title "Bay Area, Berlin, Busan or Brisbane: No Problem."]
                [:h2.subtitle "Young Kim Accounting Solutions helps individuals and business across the globe."]
                [:div.columns

                 [:div.column
                  [:div.ykas-hero-header "Business Services"]
                  [:ul.ykas-hero-list
                   [:li [:a {:href "/"} "Corporate Tax Return Preparation &rarr;"]]
                   [:li [:a {:href "/"} "Small/Home Business Tax Return Preparation &rarr;"]]
                   [:li [:a {:href "/"} "International Taxation Services &rarr;"]]
                   [:li [:a {:href "/"} "International Accounting Services &rarr;"]]
                   [:li [:a {:href "/"} "Business Consulting &rarr;"]]
                   [:li [:a {:href "/"} "Tax Planning &rarr;"]]]]
                 [:div.column
                  [:div.ykas-hero-header "Personal Services"]
                  [:ul.ykas-hero-list
                   [:li [:a {:href "/"} "Personal Tax Return Preparation &rarr;"]]
                   [:li [:a {:href "/"} "Personal Tax Planning &rarr;"]]]]
                 [:div.column]
                 [:div.column.portrait
                  [:img {:src "/images/tax-forms.jpg" :style "max-width: 320px"}]]]]]
              ]]})
