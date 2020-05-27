 (ns twist-of-carts.app
  (:require [twist-of-carts.util :refer [slug-path]]
            [clojure.string :as str]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]
            [endophile.hiccup :refer [to-hiccup]]
            [frontmatter.core :as fm]
            [twist-of-carts.layout :refer [page-layout bare-layout]]
            [twist-of-carts.views.about-ykas :refer [about-ykas]]
            [twist-of-carts.views.about-young-kim :refer [about-young-kim]]
            [twist-of-carts.views.blog-post :as bp]
            [twist-of-carts.views.international-tax-services :refer [international-tax-services]]
            [twist-of-carts.views.korean-city :refer [korean-city]]
            [twist-of-carts.views.contact :refer [contact]]
            [twist-of-carts.views.personal-tax-return :refer [personal-tax-return]]
            [twist-of-carts.views.professional-info :as pi]
            [twist-of-carts.views.index :as i]))

(defn csv-data->maps [csv-data]
  (map zipmap
       (->> (first csv-data) ;; First row is the header
            (map keyword) ;; Drop if you want string keys instead
            repeat)
       (rest csv-data)))

(def korean-city-data
  (with-open [reader (-> "korean-cities.csv" io/resource io/reader)]
    (-> reader
        csv/read-csv
        doall
        csv-data->maps)))

(defn- korean-city-to-key-value [{:keys [place] :as korean-city-options}]
  [(str "/us-accountant-" (str/lower-case place) "/")
   (fn [_] (page-layout (korean-city korean-city-options)))])

(def korean-city-routes
  (->> korean-city-data
       (map korean-city-to-key-value)
       (into {})))

(defn get-pages
  "Get routes for this blog."
  []
  (merge
   {"/" (page-layout (i/home))
    "/about/" (page-layout (about-ykas))
    "/about-young-shin-kim/" (page-layout (about-young-kim))
    "/international-tax-services/" (page-layout (international-tax-services))
    "/personal-tax-return-preparation/" (page-layout (personal-tax-return))
    "/contact/" (bare-layout (contact))}
   korean-city-routes))
