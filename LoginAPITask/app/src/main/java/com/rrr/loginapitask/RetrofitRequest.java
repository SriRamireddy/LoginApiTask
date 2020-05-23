package com.rrr.loginapitask;

import com.rrr.loginapitask.model.LoginApi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitRequest
{
   @GET("users?page=1")
   Call<LoginApi> getData();
}
