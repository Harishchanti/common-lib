package com.ailiens.common.model;

/**
 * Created by vaibhav on 4/11/15.
 */
public class FavouriteBrand extends FavouriteBase {


    String brand;

    public FavouriteBrand(String brand) {
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }
}
