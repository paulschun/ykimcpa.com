(ns twist-of-carts.views.contact)

(defn contact
  "The contact page."
  []
  {:title "Young Kim Accounting Solutions &mdash; Contact Young Kim Accounting Solutions"
   :content [:div
             [:section
              [:div.container.pad-vertical
               [:h1.title "Contact Young Kim Account Solutions"]
               [:h2.subtitle "Want to get in touch? Here are your options:"]
               [:div.columns
                [:div.column
                 [:h3.subtitle
                  [:small [:i.fas.fa-at]]
                  "&nbsp;&nbsp;"
                  "Email"]
                 [:div
                  [:p "Send an email at any time for a prompt response."]
                  [:form.contact-form {:action "https://formspree.io/mnqgdqya"
                          :method "POST"
                                       :enctype "multipart/form-data"}
                   [:label
                    "Full Name"
                    [:input {:type "text"
                             :name "_name"
                             :placeholder ""}]]
                   [:label
                    "Email Address"
                    [:input {:type "text"
                             :name "_replyto"
                             :placeholder ""}]]
                   [:label
                    "Subject"
                    [:input {:type "text"
                             :name "_subject"
                             :placeholder ""}]]
                   [:label
                    "Message"
                    [:textarea {:name "_message"
                                :placeholder "I'd like to inquire about..."}]]
                   [:button {:type "submit"} "Send Message &rarr;"]
                   ]]
                 ]
                [:div.column
                 [:h3.subtitle
                  [:small
                   [:i.fas.fa-phone]
                   "&nbsp;&nbsp;"
                   [:i.fas.fa-file-alt]]
                  "&nbsp;&nbsp;"
                  "Phone/Fax"]
                 [:h4.subtitle.is-6 "Phone"]
                 [:p.contact__instructions "Phone availability is between 9am and 9pm, Monday through Saturdays, not including holidays, except in cases of emergency."]
                 [:div.contact__number "+1 (415) 488-7192"]
                 [:h4.subtitle.is-6 "Fax"]
                 [:p.contact__instructions "Fax availability is 24 hours a day."]
                 [:div.contact__number "+1 (415) 221-8222"]
                 ]
                [:div.column
                 [:h3.subtitle
                  [:small [:i.fas.fa-envelope]]
                  "&nbsp;&nbsp;"
                  "Mailing Address"]
                 [:div
                  [:div "Young Kim Accounting Solutions"]
                  [:div "550 6th Ave"]
                  [:div "San Francisco, CA 94118"]
                  [:div "United States of America"]]
                 ]]]]
             ]})
