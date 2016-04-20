package com.jlubecki.madimagegallery.network.api;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by Jacob on 3/25/16.
 */
public final class PhotoAPI {

    private static final String BASE_URL = "https://api.shutterstock.com/v2/images/";
    private static final String AUTH_HEADER = "Authorization";

    // Bad practice, only for demo purposes
    private static final String AUTH_KEY = "Basic OTg0MWEzNGJiOTVkN2VhMDMyMjk6MjUyOTJhOTA1YWI0NGQ1MWY1ZDkyZDUxYjY5NGVlMmNmZTk0ZmQ2MA==";

    private static volatile PhotoAPI instance;

    private PhotoService service;

    private PhotoAPI() {

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new AuthInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(PhotoService.class);
    }

    public static PhotoAPI getInstance() {
        if(instance == null) {
            instance = new PhotoAPI();
        }

        return instance;
    }

    public PhotoService getService() {
        return service;
    }

    private class AuthInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request newRequest = chain.request().newBuilder()
                    .addHeader(AUTH_HEADER, AUTH_KEY)
                    .build();

            return chain.proceed(newRequest);
        }
    }
}
