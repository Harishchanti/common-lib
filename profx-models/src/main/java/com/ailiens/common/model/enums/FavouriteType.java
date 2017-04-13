package com.ailiens.common.model.enums;

/**
 * Created by vaibhav on 17/11/15.
 */
public enum FavouriteType {


    BLOG("blog"),
    STYLE("style"),
    BRAND("brand"),

    BLOGS("blogs"),
    PRODUCTS("products"),
    BRANDS("brands");


    private String favouriteType;

    FavouriteType(String favouriteType) {
        this.favouriteType = favouriteType;
    }
}
