package com.example.testexample.Presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.testexample.Adapters.RecyclerBannerAdapter;
import com.example.testexample.Models.BanerModel;
import com.example.testexample.Retrofit.Banners;
import com.example.testexample.Retrofit.RetrofitDI;
import com.example.testexample.View.View;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

@InjectViewState
public class Presenter extends MvpPresenter<View> {
    private CompositeDisposable compositeDisposable;
    private RecyclerBannerAdapter recyclerBannerAdapter;
    private ArrayList<BanerModel> banerModels;

    @Inject
    RetrofitDI retrofitDI = new RetrofitDI();

    public void loadJson(){
        compositeDisposable.add(retrofitDI.banners().banner()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this:: handlerResponse, this::handlerError));
    }

    private void handlerError(Throwable throwable) {
    }

    private void handlerResponse(BanerModel banerModel){
        Adapter(banerModel);
    }

    public void Adapter(BanerModel banerModel){
        recyclerBannerAdapter = new RecyclerBannerAdapter(banerModels);
        recyclerBannerAdapter.notifyDataSetChanged();

        getViewState().setAdapter(recyclerBannerAdapter);
    }
}
