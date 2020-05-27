package com.example.android.singnin.api;

import com.example.android.singnin.Model.LoginResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {
    @FormUrlEncoded
    //put here realtive url from where u want data
    @POST("register")

    //if u dont know what u get back use ResponseBody
   // Call<DefaultResponse> createUser(
    Call<ResponseBody> createUser(
            @Field("email") String email,
            @Field("password") String password,
            @Field("name") String name
    );
    @FormUrlEncoded
    @POST("login")
    Call<ResponseBody> userLogin(
            @Field("email") String email,
            @Field("password") String password
    );
    @FormUrlEncoded
    @POST("distance")
    Call<ResponseBody> getlocation(
            @Query("lang") String lang,
            @Query("lat") String lat,
            @Query("id") int id
    );



}
