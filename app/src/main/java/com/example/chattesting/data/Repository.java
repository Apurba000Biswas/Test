package com.example.chattesting.data;

import android.util.Log;

import java.time.LocalDate;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Repository {

    private Repository(){}

    private static final String LOG_TAG = Repository.class.getSimpleName();



    public static final String BASE_URL = "http://10.10.0.237";
    private static final Object LOCK = new Object();
    private static Repository sInstance;
    private static Retrofit retrofit;

    public static  Repository getInstance(){
        return new Repository();
    }



    private static Retrofit getRetrofit(){
        if (retrofit == null) {
            synchronized (LOCK) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
        }
        return retrofit;
    }
    private static api getRestApi(){
        Retrofit retrofit = Repository.getRetrofit();
        return retrofit.create(api.class);
    }

    public void makeHomeDataRequest(){
        Call<HomeData> call = Repository.getRestApi().getHomeData();
        call.enqueue(new Callback<HomeData>() {
            @Override
            public void onResponse(Call<HomeData> call, Response<HomeData> response) {
                Log.d(LOG_TAG, " ****** response code :  " + response.body().toString());

            }

            @Override
            public void onFailure(Call<HomeData> call, Throwable t) {
                Log.d(LOG_TAG, " ****** Fail:  " + t);
            }
        });
    }


}
