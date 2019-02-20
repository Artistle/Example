package com.example.testexample;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.arellomobile.mvp.MvpActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.testexample.Adapters.RecyclerBannerAdapter;
import com.example.testexample.Adapters.TabsPagerFragmentAdapter;
import com.example.testexample.Presenter.Presenter;
import com.example.testexample.View.View;

import javax.inject.Inject;

public class MainActivity extends MvpActivity implements View {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private RecyclerView recyclerBanner;

    @InjectPresenter
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTollbar();
        initTabs();

        presenter.loadJson();

    }

    public void initTollbar(){
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Заглавие");
        //setSupportActionBar(toolbar);
    }

    public void initTabs(){
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);

        /*TabsPagerFragmentAdapter tabsPagerFragmentAdapter = new TabsPagerFragmentAdapter(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter(tabsPagerFragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);*/


    }

    public void initRecyclerViewBanners(){
        recyclerBanner = (RecyclerView)findViewById(R.id.recycler_view_banner);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerBanner.setLayoutManager(layoutManager);
    }

    @Override
    public void setAdapter(RecyclerBannerAdapter recyclerBannerAdapter) {
        recyclerBanner.setAdapter(recyclerBannerAdapter);
    }
}
