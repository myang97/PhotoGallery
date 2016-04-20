package com.jlubecki.madimagegallery.network.models;

/**
 * Created by Jacob on 3/28/16.
 */
public class Thumbnail {
    public String url;
    public int height;
    public int width;

    @Override
    public String toString() {
        return "Thumbnail{" +
                "url='" + url + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
