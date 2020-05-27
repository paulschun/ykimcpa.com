(ns twist-of-carts.components.green-checklist)

(defn green-check [s]
  [:li
   [:span.green-check
    [:i.fas.fa-check]]
   "&nbsp;&nbsp;&nbsp;"
   s])

(defn green-checklist [strings]
  [:ul
   (map green-check strings)])
