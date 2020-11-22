package com.example.chattesting.data;

import java.util.List;

public class HomeData {
    private List<SliderItem> slider;
    private List<CategoryItem> all_category_sections;
    private List<SuperDealItem> super_deal_sections;


    public class SliderItem{
        private String image;
        private String alter;
        private String link;

    }
    public class CategoryItem{
        private String image_url;
        private String category_id;
        private String slug;
        private String title;
    }
    public class SuperDealItem{
        private String icon_url;
        private String title;
        private String category_id;
        private List<ProductItem> products;

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


            public class Seo{
                private String description;
                private String imagePath;
                private String keywords;
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
                    private float fiveStarNum;
                    private String fiveStarRate;
                    private float fourStarNum;
                    private String fourStarRate;
                    private float oneStarNum;
                    private String oneStarRate;
                    private String positiveRate;
                    private float threeStarNum;
                    private String threeStarRate;
                    private float totalValidNum;
                    private float trialReviewNum;
                    private float twoStarNum;
                    private String twoStarRate;
                }
            }



            public class ProductData{
                private int vendor;
                private ImageData images;
                private int category;
                private int id;
                private String keyword;
                private Description description;

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

                    public class AttributeItem{
                        private boolean isShowTypeColor;
                        private int order;
                        private String showType;
                        private boolean showTypeColor;
                        private int skuPropertyId;
                        private String skuPropertyName;
                        private List<SkuPropertyModel> skuPropertyValues;

                        public class SkuPropertyModel{
                            private String propertyValueDefinitionName;
                            private String propertyValueDisplayName;
                            private int propertyValueId;
                            private int propertyValueIdLong;
                            private String propertyValueName;
                            private String skuColorValue;
                            private String skuPropertyImagePath;
                            private String skuPropertyImageSummPath;
                            private String skuPropertyTips;
                            private int skuPropertyValueShowOrder;
                            private String skuPropertyValueTips;
                        }
                    }

                    public class SkuItem{
                        private String skuPropIds;
                        private double skuActivityAmount;
                        private int availQuantity;
                        private double skuAmount;
                    }


                    public class Ratings{
                        private String averageRating;
                        public int totalRating;
                    }



                    public class Price{
                        private PriceCategory regular;
                        private PriceCategory sale;
                        private int discount;


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
                        }
                    }
                }

                public class ImageData{
                    private String image_url;
                    private List<Image> imageGellay;
                    private List<Image> smallImage;


                    public class Image {
                        private String image;

                        public String getImage() {
                            return image;
                        }
                    }
                }


            }
        }
    }
}
