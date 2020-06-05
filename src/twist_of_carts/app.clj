 (ns twist-of-carts.app
  (:require [twist-of-carts.util :refer [slug-path]]
            [clojure.string :as str]
            [clojure.data.csv :as csv]
            [clojure.data.xml :as xml]
            [clojure.java.io :as io]
            [endophile.hiccup :refer [to-hiccup]]
            [frontmatter.core :as fm]
            [twist-of-carts.layout :refer [page-layout bare-layout]]
            [twist-of-carts.views.about-ykas :refer [about-ykas]]
            [twist-of-carts.views.about-young-kim :refer [about-young-kim]]
            [twist-of-carts.views.blog-post :as bp]
            [twist-of-carts.views.international-tax-services :refer [international-tax-services]]
            [twist-of-carts.views.korean-city :refer [korean-city]]
            [twist-of-carts.views.marin-location :refer [marin-location]]
            [twist-of-carts.views.business-tax-planning :refer [business-tax-planning]]
            [twist-of-carts.views.contact :refer [contact]]
            [twist-of-carts.views.personal-tax-return :refer [personal-tax-return]]
            [twist-of-carts.views.personal-tax-planning :refer [personal-tax-planning]]
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

(def marin-data
  (with-open [reader (-> "marin-locations.csv" io/resource io/reader)]
    (-> reader
        csv/read-csv
        doall
        csv-data->maps)))

(defn- korean-city-to-sitemap-row [{:keys [place] :as korean-city-options}]
  [(str "/us-accountant-" (str/lower-case place) "/")
   (fn [_] (page-layout (korean-city korean-city-options)))
   0.9])

(defn- marin-location-to-sitemap-row [{:keys [place] :as marin-location-options}]
  (let [place-slug (-> place
                       str/lower-case
                       str/trim
                       (str/replace " " "-"))]
    [(str "/tax-accountant-" place-slug "/")
     (fn [_] (page-layout (marin-location marin-location-options)))
     0.9]))

(def korean-city-routes
  (map korean-city-to-sitemap-row korean-city-data))

(def marin-routes
  (map marin-location-to-sitemap-row marin-data))

(def pagerows
  (->> [["/" (page-layout (i/home)) 1.0]
        ["/about/" (page-layout (about-ykas)) 0.2]
        ["/about-young-shin-kim/" (page-layout (about-young-kim)) 0.2]
        ["/international-tax-services/" (page-layout (international-tax-services)) 0.2]
        ["/business-tax-planning/" (page-layout (business-tax-planning)) 0.2]
        ["/personal-tax-return-preparation/" (page-layout (personal-tax-return)) 0.2]
        ["/personal-tax-planning/" (page-layout (personal-tax-planning)) 0.2]
        ["/contact/" (bare-layout (contact)) 0.2]]
       (apply conj korean-city-routes)
       (apply conj marin-routes)))

(defn pagerow->sitemap-url [[path _ priority]]
  [:url
   [:loc (str "https://youngshinkim.com" path)]
   [:priority priority]])

(def sitemap
  (xml/emit-str
   (xml/sexp-as-element
      [:urlset (map pagerow->sitemap-url pagerows)])))

(defn get-pages
  "Get routes for this blog."
  []
  (->> pagerows
       (map #(take 2 %))
       (map vec)
       (into {"/sitemap.xml" sitemap})))
