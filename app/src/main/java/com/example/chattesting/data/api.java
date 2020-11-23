package com.example.chattesting.data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface api {

    @GET("/zdrop/api/dashboard/home-page-mobile")
    Call<HomeData> getHomeData();

}
