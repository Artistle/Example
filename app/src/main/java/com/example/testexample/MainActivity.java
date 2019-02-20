package com.example.testexample;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.testexample.Adapters.TabsPagerFragmentAdapter;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTollbar();
        initTabs();


    }

    public void initTollbar(){
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Заглавие");
        setSupportActionBar(toolbar);
    }

    public void initTabs(){
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);

        TabsPagerFragmentAdapter tabsPagerFragmentAdapter = new TabsPagerFragmentAdapter(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter(tabsPagerFragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
