package com.example.testexample.View;

import com.arellomobile.mvp.MvpView;
import com.example.testexample.Adapters.RecyclerBannerAdapter;

public interface View extends MvpView {
    public void setAdapter(RecyclerBannerAdapter recyclerBannerAdapter);
}
