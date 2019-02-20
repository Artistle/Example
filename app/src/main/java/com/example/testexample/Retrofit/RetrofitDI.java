package com.example.testexample.Retrofit;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RetrofitDI {
    @Provides
    @Singleton
    public Banners banners(){
        Banners banners = new Retrofit.Builder()
                .baseUrl("https://s3.eu-central-1.amazonaws.com/sl.files/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(Banners.class);
        return banners;
    }
}
