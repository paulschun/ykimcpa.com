(ns twist-of-carts.views.about-young-kim
  (:require [digest :as digest]
            [twist-of-carts.util :refer [short-date slug-path]]))

(defn about-young-kim
  "The homepage."
  []
  {:title "Young Kim Accounting Solutions &mdash; San Francisco-based tax services for local and global endeavors."
   :content [:div
             [:section
              [:div.container.pad-vertical
               [:h1.title "About Young Shin Kim"]
               [:div.columns
                [:div.column
                 [:div.captioned-image
                  [:img {:src "/images/young-hiking.jpg"}]
                  [:div.captioned-image__caption "Young soaking in the beauty of the Big Rock Trail in Lucas Valley, Marin County, California."]]]
                [:div.column
                 [:div.bio
                  [:div.bio__name "Young Shin Kim, CPA"]
                  [:div.bio__mini-description "Certified Public Accountant in the State of California"]
                  [:div.bio__mini-description "Licensed Real Estate Broker in the State of California"]
                  [:ul.bio__degrees
                   [:li
                    [:div.bio__degree "Master of Science, Taxation"]
                    [:div.bio__school "San Francisco State University, 2004"]]
                   [:li
                    [:div.bio__degree "Bachelor of Science, Accounting"]
                    [:div.bio__school "University of San Francisco, 1983"]]]
                  [:div.bio__full_description "Despite the one-word biography of workaholic given by her daughter and son, she still enjoys a good day hike and a cup of artisanal coffee. A minority and female business owner and proud Californian, she loves the mediterranean weather that northern California offers, where she moved to from her native South Korea in 1980."]]]]]]]})
