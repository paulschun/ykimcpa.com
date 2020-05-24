(ns twist-of-carts.styles
  (:require
   [garden.def :refer [defstyles]]
   [garden.selectors :refer [defpseudoelement]]))

(def colors {:soot "#606060"
             :pewter "#6E8196"
             :plant "#BCC8CC"
             :sahara "#FFFEF5"
             :snow-1 "#F8F8F1"
             :white "#FFFFFF"
             :black "#000000"})

(defpseudoelement after)

(defstyles main
  (let [{:keys [soot pewter plant sahara snow-1 black white]} colors]
    [[:html
      {:background-color snow-1}]
     [:body {:color soot :font-family "Georgia"}]
     [:.ykas-nav :.ykas-footer {:background-color plant}
      [:a :span {:color soot}]
      [:.logo:hover {:color black}]
      [:.navbar-link:hover {:background-color sahara
                            :color black}]
      [:.select:after {:border-color "red"}]
      [:.button.ykas-btn {:background-color pewter
                          :color sahara
                          :border-color sahara
                          :transition "background-color .5s"}
       [:&:hover {:background-color soot}]]
      [".navbar-link::after" {:border-color soot}]]
     [:.ykas-footer__nav-list {:line-height "2.5em"}
      [:a:hover {:color black}]]
     [:.ykas-footer__nav-list-header {:font-weight 700}]
     [:.bio {:margin-left "1em"}
      [:&__name {:font-size "2em"}]
      [:&__mini-description {:font-style "italic"}]
      [:&__degrees {:margin "1.5em 0"}
       [:li {:margin-bottom "1em"}]]
      [:&__degree {:font-weight 700}]]
     [:.captioned-image {:padding "0.5em;"
                         :background-color pewter
                         :color sahara
                         :text-align "center"}
      [:&__caption {:font-size "0.85em"}]]
     [:.pad-vertical {:margin-top "2em"
                      :margin-bottom "2em"}]
     [:.midsection-cta {:background-color sahara
                        :color soot
                        :padding "2em 0"
                        :text-align "center"}
      [:&__btn {:background-color sahara
                :border-color soot
                :color soot
                :margin-top "1em"}
       [:&:hover {:color black
                  :border-color black}]]]
     [:.ykas-hero {:background "url('/images/skyline-faded.jpg')"
                   :background-size "cover"}]
     [:.ykas-hero-black {:background-color soot
                         :color sahara
                         :background-size "cover"}
      [:a {:color white}]
      [:.title {:color white}]
      [:.subtitle {:color sahara}]]
     [:.ykas-hero :.ykas-hero-black
      [:.subtitle {:line-height "2em"}]]
     [:.ykas-hero-header {:font-size "1.5em"}]
     [:.ykas-hero-list
      [:li {:line-height "2.5em"}]]
     [:.portrait {:text-align "center"}
      [:img {:border-radius "50%"
             :border (str "5px solid " sahara)}]
      [:&__caption {:text-align "center"
                    :margin-bottom "10em"}
       [:a {:color soot}]]]
     [:.contact
      [:&__instructions {:font-size "0.9em"}]
      [:&__number {:font-size "1.25em"
                   :margin-bottom "2em"}]]
     ]))

(defstyles resume)
