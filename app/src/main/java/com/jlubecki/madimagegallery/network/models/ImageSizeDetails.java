package com.jlubecki.madimagegallery.network.models;

/**
 * Created by Jacob on 3/28/16.
 */
public class ImageSizeDetails {
    public int height;
    public int width;
    public int file_size;
    public String display_name;
    public int dpi;
    public String format;
    public boolean is_licensable;


    @Override
    public String toString() {
        return "ImageSizeDetails{" +
                "height=" + height +
                ", width=" + width +
                ", file_size=" + file_size +
                ", display_name='" + display_name + '\'' +
                ", dpi=" + dpi +
                ", format='" + format + '\'' +
                ", is_licensable=" + is_licensable +
                '}';
    }
}
