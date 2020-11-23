package com.example.chattesting.data;

import java.util.List;

public class HomeData {
    private List<SliderItem> slider;
    private List<CategoryItem> all_category_sections;
    private List<SuperDealItem> super_deal_sections;

    public List<SliderItem> getSlider() {
        return slider;
    }

    public List<CategoryItem> getAll_category_sections() {
        return all_category_sections;
    }

    public List<SuperDealItem> getSuper_deal_sections() {
        return super_deal_sections;
    }

    @Override
    public String toString() {
        return "HomeData{" +
                "slider=" + slider +
                ", all_category_sections=" + all_category_sections +
                ", super_deal_sections=" + super_deal_sections +
                '}';
    }

    public class SliderItem{
        private String image;
        private String alter;
        private String link;


        @Override
        public String toString() {
            return "SliderItem{" +
                    "image='" + image + '\'' +
                    ", alter='" + alter + '\'' +
                    ", link='" + link + '\'' +
                    '}';
        }
    }
    public class CategoryItem{
        private String image_url;
        private String category_id;
        private String slug;
        private String title;

        @Override
        public String toString() {
            return "CategoryItem{" +
                    "image_url='" + image_url + '\'' +
                    ", category_id='" + category_id + '\'' +
                    ", slug='" + slug + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }
    }
    public class SuperDealItem{
        private String icon_url;
        private String title;
        private String category_id;
        private List<ProductItem> products;

        @Override
        public String toString() {
            return "SuperDealItem{" +
                    "icon_url='" + icon_url + '\'' +
                    ", title='" + title + '\'' +
                    ", category_id='" + category_id + '\'' +
                    ", products=" + products +
                    '}';
        }

        public class ProductItem{
            private String _id;
            private String product_id;
            private String category_id;
            private String title;
            private String image;
            private float regular_price;
            private float sale_price;
            private int discount;
            private String rating;
            private int sold;
            private String section_name;
            private ProductData data;
            private Seo seo;
            //private List<CategoryIdModel> category_id;


            @Override
            public String toString() {
                return "ProductItem{" +
                        "_id='" + _id + '\'' +
                        ", product_id='" + product_id + '\'' +
                        ", category_id='" + category_id + '\'' +
                        ", title='" + title + '\'' +
                        ", image='" + image + '\'' +
                        ", regular_price=" + regular_price +
                        ", sale_price=" + sale_price +
                        ", discount=" + discount +
                        ", rating='" + rating + '\'' +
                        ", sold=" + sold +
                        ", section_name='" + section_name + '\'' +
                        ", data=" + data +
                        ", seo=" + seo +
                        '}';
            }

            public class Seo{
                private String description;
                private String imagePath;
                private String keywords;

                @Override
                public String toString() {
                    return "Seo{" +
                            "description='" + description + '\'' +
                            ", imagePath='" + imagePath + '\'' +
                            ", keywords='" + keywords + '\'' +
                            '}';
                }
            }
            public class CategoryIdModel{
                private int cateId;
                private String name;
                private String remark;
                private String url;

            }
            public class Tab{




                public class Ratings{
                    private String averageStar;
                    private String averageStarRage;
                    private boolean display;
                    private String evarageStar;
                    private String evarageStarRage;
                    private int fiveStarNum;
                    private String fiveStarRate;
                    private int fourStarNum;
                    private String fourStarRate;
                    private int oneStarNum;
                    private String oneStarRate;
                    private String positiveRate;
                    private int threeStarNum;
                    private String threeStarRate;
                    private int totalValidNum;
                    private int trialReviewNum;
                    private int twoStarNum;
                    private String twoStarRate;


                    @Override
                    public String toString() {
                        return "Ratings{" +
                                "averageStar='" + averageStar + '\'' +
                                ", averageStarRage='" + averageStarRage + '\'' +
                                ", display=" + display +
                                ", evarageStar='" + evarageStar + '\'' +
                                ", evarageStarRage='" + evarageStarRage + '\'' +
                                ", fiveStarNum=" + fiveStarNum +
                                ", fiveStarRate='" + fiveStarRate + '\'' +
                                ", fourStarNum=" + fourStarNum +
                                ", fourStarRate='" + fourStarRate + '\'' +
                                ", oneStarNum=" + oneStarNum +
                                ", oneStarRate='" + oneStarRate + '\'' +
                                ", positiveRate='" + positiveRate + '\'' +
                                ", threeStarNum=" + threeStarNum +
                                ", threeStarRate='" + threeStarRate + '\'' +
                                ", totalValidNum=" + totalValidNum +
                                ", trialReviewNum=" + trialReviewNum +
                                ", twoStarNum=" + twoStarNum +
                                ", twoStarRate='" + twoStarRate + '\'' +
                                '}';
                    }
                }

                public class Specification{
                    private String name;
                    private String value;

                    @Override
                    public String toString() {
                        return "Specification{" +
                                "name='" + name + '\'' +
                                ", value='" + value + '\'' +
                                '}';
                    }
                }
            }



            public class ProductData{
                private int vendor;
                private ImageData images;
                private int category;
                private float id;
                private String keyword;
                private Description description;

                @Override
                public String toString() {
                    return "ProductData{" +
                            "vendor=" + vendor +
                            ", images=" + images +
                            ", category=" + category +
                            ", id=" + id +
                            ", keyword='" + keyword + '\'' +
                            ", description=" + description +
                            '}';
                }

                public class Description{
                    private String title;
                    private Price price;
                    private int tradeCount;
                    private String tradeCountUnit;
                    private Ratings rating;

                    private List<SkuItem> skuPrice;
                    private String brand;
                    private String origin;
                    private List<AttributeItem> attribute;
                    private int stock;
                    private int order;
                    private int api_product;
                    private boolean is_wishlist;
                    private String wishlist_item_id;


                    @Override
                    public String toString() {
                        return "Description{" +
                                "title='" + title + '\'' +
                                ", price=" + price +
                                ", tradeCount=" + tradeCount +
                                ", tradeCountUnit='" + tradeCountUnit + '\'' +
                                ", rating=" + rating +
                                ", skuPrice=" + skuPrice +
                                ", brand='" + brand + '\'' +
                                ", origin='" + origin + '\'' +
                                ", attribute=" + attribute +
                                ", stock=" + stock +
                                ", order=" + order +
                                ", api_product=" + api_product +
                                ", is_wishlist=" + is_wishlist +
                                ", wishlist_item_id='" + wishlist_item_id + '\'' +
                                '}';
                    }

                    public class AttributeItem{
                        private boolean isShowTypeColor;
                        private int order;
                        private String showType;
                        private boolean showTypeColor;
                        private int skuPropertyId;
                        private String skuPropertyName;
                        private List<SkuPropertyModel> skuPropertyValues;

                        @Override
                        public String toString() {
                            return "AttributeItem{" +
                                    "isShowTypeColor=" + isShowTypeColor +
                                    ", order=" + order +
                                    ", showType='" + showType + '\'' +
                                    ", showTypeColor=" + showTypeColor +
                                    ", skuPropertyId=" + skuPropertyId +
                                    ", skuPropertyName='" + skuPropertyName + '\'' +
                                    ", skuPropertyValues=" + skuPropertyValues +
                                    '}';
                        }

                        public class SkuPropertyModel{
                            private String propertyValueDefinitionName;
                            private String propertyValueDisplayName;
                            private float propertyValueId;
                            private float propertyValueIdLong;
                            private String propertyValueName;
                            private String skuColorValue;
                            private String skuPropertyImagePath;
                            private String skuPropertyImageSummPath;
                            private String skuPropertyTips;
                            private float skuPropertyValueShowOrder;
                            private String skuPropertyValueTips;


                            @Override
                            public String toString() {
                                return "SkuPropertyModel{" +
                                        "propertyValueDefinitionName='" + propertyValueDefinitionName + '\'' +
                                        ", propertyValueDisplayName='" + propertyValueDisplayName + '\'' +
                                        ", propertyValueId=" + propertyValueId +
                                        ", propertyValueIdLong=" + propertyValueIdLong +
                                        ", propertyValueName='" + propertyValueName + '\'' +
                                        ", skuColorValue='" + skuColorValue + '\'' +
                                        ", skuPropertyImagePath='" + skuPropertyImagePath + '\'' +
                                        ", skuPropertyImageSummPath='" + skuPropertyImageSummPath + '\'' +
                                        ", skuPropertyTips='" + skuPropertyTips + '\'' +
                                        ", skuPropertyValueShowOrder=" + skuPropertyValueShowOrder +
                                        ", skuPropertyValueTips='" + skuPropertyValueTips + '\'' +
                                        '}';
                            }
                        }
                    }

                    public class SkuItem{
                        private String skuPropIds;
                        private double skuActivityAmount;
                        private int availQuantity;
                        private double skuAmount;

                        @Override
                        public String toString() {
                            return "SkuItem{" +
                                    "skuPropIds='" + skuPropIds + '\'' +
                                    ", skuActivityAmount=" + skuActivityAmount +
                                    ", availQuantity=" + availQuantity +
                                    ", skuAmount=" + skuAmount +
                                    '}';
                        }
                    }


                    public class Ratings{
                        private String averageRating;
                        public int totalRating;

                        @Override
                        public String toString() {
                            return "Ratings{" +
                                    "averageRating='" + averageRating + '\'' +
                                    ", totalRating=" + totalRating +
                                    '}';
                        }
                    }



                    public class Price{
                        private PriceCategory regular;
                        private PriceCategory sale;
                        private int discount;

                        @Override
                        public String toString() {
                            return "Price{" +
                                    "regular=" + regular +
                                    ", sale=" + sale +
                                    ", discount=" + discount +
                                    '}';
                        }

                        public PriceCategory getRegular() {
                            return regular;
                        }

                        public PriceCategory getSale() {
                            return sale;
                        }

                        public int getDiscount() {
                            return discount;
                        }

                        public class PriceCategory{
                            private float minAmount;
                            private float maxAmount;

                            public float getMinAmount() {
                                return minAmount;
                            }

                            public float getMaxAmount() {
                                return maxAmount;
                            }

                            @Override
                            public String toString() {
                                return "PriceCategory{" +
                                        "minAmount=" + minAmount +
                                        ", maxAmount=" + maxAmount +
                                        '}';
                            }
                        }
                    }
                }

                public class ImageData{
                    private String image_url;
                    private List<Image> imageGellay;
                    private List<Image> smallImage;

                    @Override
                    public String toString() {
                        return "ImageData{" +
                                "image_url='" + image_url + '\'' +
                                ", imageGellay=" + imageGellay +
                                ", smallImage=" + smallImage +
                                '}';
                    }

                    public class Image {
                        private String image;

                        public String getImage() {
                            return image;
                        }

                        @Override
                        public String toString() {
                            return "Image{" +
                                    "image='" + image + '\'' +
                                    '}';
                        }
                    }
                }


            }
        }
    }
}
