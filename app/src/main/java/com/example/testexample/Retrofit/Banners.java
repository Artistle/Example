package com.example.testexample.Retrofit;

import com.example.testexample.Models.BanerModel;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Banners {
    @GET("banners.json")
    Observable<BanerModel> banner();
}
