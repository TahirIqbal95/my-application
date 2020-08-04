package com.mejrabsoft.myapplication;

import com.mejrabsoft.myapplication.Model.RootCollection;
import com.mejrabsoft.myapplication.Model.GetCategory;
import com.mejrabsoft.myapplication.Model.GetCities;


import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Header;
import retrofit2.http.Query;

interface RequestInterface {



    @GET("categories")
    Call<GetCategory> getJson(@Header("user-key") String key);

    @GET("cities")
    Call<GetCities> getcity(@Header("user-key") String key,
    @Query("q") String city);

    @GET("collections")
    Call<RootCollection> getCollection(@Header("user-key") String key,
                                       @Query("city_id") int city_id);
}
