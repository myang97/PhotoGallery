package com.jlubecki.madimagegallery.network.models;

import java.util.Arrays;

/**
 * Created by Jacob on 3/28/16.
 */
public class ImageResponse {
    public Image[] data;
    public int page;
    public int per_page;
    public int total_count;
    public String search_id;
    public String message;

    @Override
    public String toString() {
        return "ImageResponse{" +
                "data=" + Arrays.toString(data) +
                ", page=" + page +
                ", per_page=" + per_page +
                ", total_count=" + total_count +
                ", search_id='" + search_id + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}