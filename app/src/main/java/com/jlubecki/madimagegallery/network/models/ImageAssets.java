package com.jlubecki.madimagegallery.network.models;

/**
 * Created by Jacob on 3/28/16.
 */
public class ImageAssets {
    public ImageSizeDetails small_jpg;
    public ImageSizeDetails medium_jpg;
    public ImageSizeDetails huge_jpg;
    public ImageSizeDetails supersize_jpg;
    public ImageSizeDetails huge_tiff;
    public ImageSizeDetails supersize_tiff;
    public ImageSizeDetails vector_eps;
    public Thumbnail small_thumb;
    public Thumbnail large_thumb;
    public Thumbnail preview;
    public Thumbnail preview_1000;

    @Override
    public String toString() {
        return "ImageAssets{" +
                "small_jpg=" + small_jpg +
                ", medium_jpg=" + medium_jpg +
                ", huge_jpg=" + huge_jpg +
                ", supersize_jpg=" + supersize_jpg +
                ", huge_tiff=" + huge_tiff +
                ", supersize_tiff=" + supersize_tiff +
                ", vector_eps=" + vector_eps +
                ", small_thumb=" + small_thumb +
                ", large_thumb=" + large_thumb +
                ", preview=" + preview +
                ", preview_1000=" + preview_1000 +
                '}';
    }
}
