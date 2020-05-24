(ns twist-of-carts.layout
  (:require [hiccup.page :refer [html5 include-css include-js]]))

(defn google-analytics
  ""
  []
  [:script
   "(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
      ga('create', 'UA-67228281-1', 'auto');
      ga('send', 'pageview');"])

(defn page-layout
  "Render a page with the shared layout."
  [{title :title, content :content}]
  (html5
   {:lang "en"}
   [:head
    (google-analytics)
    [:title title]
    (include-css "https://fonts.googleapis.com/css?family=Catamaran:200")
    (include-css "https://cdnjs.cloudflare.com/ajax/libs/bulma/0.8.0/css/bulma.min.css")
    (include-css "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css")
    (include-css "/css/main.css")]
   [:body
    [:nav.navbar.ykas-nav
     [:div.navbar-brand
      [:a.navbar-item.logo {:href "/"} "Young Kim Accounting Solutions"]
      [:a.navbar-burger {:role "button"
                         :aria-label "menu"
                         :aria-expanded false
                         :data-target "navMenu"}
       (take 3 (repeat [:span {:aria-hidden true}]))]]

     [:div#navMenu.navbar-menu
      [:div.navbar-start
       [:div.navbar-item.has-dropdown.is-hoverable
        [:span.navbar-link "About"]
        [:div.navbar-dropdown
         [:a.navbar-item {:href "/resume/"} "Mission Statement"]
         [:a.navbar-item {:href "/about-young-kim-accounting-solutions/"} "About Young Kim Account Solutions"]
         [:a.navbar-item {:href "/about-young-shin-kim/"} "About Young Shin Kim"]]]
       [:div.navbar-item.has-dropdown.is-hoverable
        [:span.navbar-link "Business Services"]
        [:div.navbar-dropdown
         [:a.navbar-item {:href "/"} "Business Tax Return Preparation"]
         [:a.navbar-item {:href "/"} "International Taxation Services"]
         [:a.navbar-item {:href "/"} "International Accounting Services"]
         [:a.navbar-item {:href "/"} "Business Consulting"]
         [:a.navbar-item {:href "/"} "Business Tax Planning"]]]
       [:div.navbar-item.has-dropdown.is-hoverable
        [:span.navbar-link "Personal Services"]
        [:div.navbar-dropdown
         [:a.navbar-item {:href "/"} "Personal Tax Return Preparation"]
         [:a.navbar-item {:href "/"} "Personal Tax Planning"]
         ]]
       [:div.navbar-item.has-dropdown.is-hoverable
        [:span.navbar-link "Contact"]
        [:div.navbar-dropdown
         [:a.navbar-item {:href "mailto:ykimtaxcpa@yahoo.com"} "Send an Email"]
         [:a.navbar-item {:href "/contact/"}
          "All Contact Information"]]
        ]]
      [:div.navbar-end
       [:span.navbar-item
        [:small "Call: (415) 555-5555"]]
       [:div.navbar-item
        [:a.button.hire-me.ykas-btn {:href "/contact/"}
         [:i.fas.fa-phone]
         "&nbsp;"
         [:i.fas.fa-envelope]
         "&nbsp;&nbsp;&nbsp;Get In Touch"]]]]]
    [:div content]
    [:div.midsection-cta
     [:div "Have a question, comment, or want to learn how Young Kim Accounting Solutions can help you, your business or your family?"]
     [:a.button.hire-me.midsection-cta__btn {:href "/contact/"}
      [:i.fas.fa-phone]
      "&nbsp;"
      [:i.fas.fa-envelope]
      "&nbsp;&nbsp;&nbsp;Get In Touch"]
     ]
    [:footer.footer.ykas-footer
     [:div.columns
      [:div.column
       [:span.ykas-footer__nav-list-header "Young Kim Accounting Solutions"]
       [:ul.ykas-footer__nav-list
        [:li [:a {:href "/"}  "Home"]]
        [:li [:a {:href "/"} "About Young Kim Accounting Solutions"]]
        [:li [:a {:href "/about-young-shin-kim/"} "About Young Shin Kim"]]]
       ]
      [:div.column
       [:span.ykas-footer__nav-list-header "Business Services"]
       [:ul.ykas-footer__nav-list
        [:li [:a {:href "/"} "Tax Return Preparation"]]
        [:li [:a {:href "/"} "International Taxation Services"]]
        [:li [:a {:href "/"} "International Accounting Services"]]
        [:li [:a {:href "/"} "Business Consulting"]]
        [:li [:a {:href "/"} "Tax Planning"]]]]
      [:div.column
       [:span.ykas-footer__nav-list-header "Personal Services"]
       [:ul.ykas-footer__nav-list
        [:li [:a {:href "/"} "Tax Return Preparation"]]
        [:li [:a {:href "/"} "Tax Planning"]]]]
      [:div.column
       [:span.ykas-footer__nav-list-header "Contact"]
       [:ul.ykas-footer__nav-list
        [:li [:a {:href "mailto:ykimtaxcpa@yahoo.com"} "Email"]]
        [:li [:a {:href "/contact/"} "All Contact Information"]]]
       ]
      [:div.column]
      [:div.column
       [:p "Young Kim Accounting Solutions"]
       [:p "1 6th Ave"]
       [:p "San Francisco, CA 94118"]
       [:p "&nbsp;"]
       [:p "(415) 555-5555"]
       [:p "&nbsp;"]
       [:small "Copyright &copy; 2020 Young Kim Accounting Solutions. All rights reserved."]
       ]]]
    ]))

(defn cv-layout
  "Render a page with the shared layout."
  [{title :title, content :content}]
  (html5
   [:head
    [:title title]
    (google-analytics)
    (include-css "/css/resume.css")]
   [:body
    [:div.container content]]))
