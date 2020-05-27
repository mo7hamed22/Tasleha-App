package com.example.android.singnin.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUser {
    private static final String BASE_URL = "https://tasle7a.000webhostapp.com/api/";
    private static RetrofitUser mInstance;
    private Retrofit retrofit;

    private RetrofitUser() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitUser getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitUser();
        }
        return mInstance;
    }

    public Api getApi(){
        return retrofit.create(Api.class);
    }
}