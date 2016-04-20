package com.jlubecki.madimagegallery.network.api;

import com.jlubecki.madimagegallery.network.models.ImageResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Jacob on 3/25/16.
 */
public interface PhotoService {

    @GET("search")
    Call<ImageResponse> search(@Query("query") String query);
}
