package com.jlubecki.madimagegallery.network.models;

import java.util.Arrays;

/**
 * Created by Jacob on 3/28/16.
 */
public class Image {
    public String id;
    public String description;
    public String added_date;
    public String media_type;
    public Contributor contributor;
    public double aspect;
    public String image_type;
    public boolean is_editorial;
    public boolean is_adult;
    public boolean is_illustration;
    public boolean has_model_release;
    public boolean has_property_release;
    public String[] releases;
    public Category[] categories;
    public String[] keywords;
    public ImageAssets assets;
    public Model[] models;

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", added_date='" + added_date + '\'' +
                ", media_type='" + media_type + '\'' +
                ", contributor=" + contributor +
                ", aspect=" + aspect +
                ", image_type='" + image_type + '\'' +
                ", is_editorial=" + is_editorial +
                ", is_adult=" + is_adult +
                ", is_illustration=" + is_illustration +
                ", has_model_release=" + has_model_release +
                ", has_property_release=" + has_property_release +
                ", releases=" + Arrays.toString(releases) +
                ", categories=" + Arrays.toString(categories) +
                ", keywords=" + Arrays.toString(keywords) +
                ", assets=" + assets +
                ", models=" + Arrays.toString(models) +
                '}';
    }
}
