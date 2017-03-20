package com.ailiens.common.model;

/**
 * Created by vaibhav on 4/11/15.
 */
public class FavouriteBlog extends FavouriteBase {


    String url;

    public FavouriteBlog(String url) {
        this.url = url;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
