package com.ida.learnactionbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;

import com.ida.learnactionbar.adapter.DeskAdapter;
import com.ida.learnactionbar.ui.CountDownFragment;
import com.ida.learnactionbar.ui.NewsFragment;
import com.ida.learnactionbar.ui.PictureFragment;
import com.ida.learnactionbar.ui.WeatherFragment;

import java.util.ArrayList;
/*
  1.遇到的问题 tabLayout与Viewpager关联后不显示的问题
 */

public class MainActivityJava extends AppCompatActivity {

    private Toolbar bar;
    private TabLayout tabLayout;
    private ViewPager desk_pager;

    private ArrayList<Fragment> list = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initData();
        initView();

    }

    private void initView() {
        bar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tabs);
        setSupportActionBar(bar);
        TabLayout.Tab tab1 = tabLayout.newTab();//.setText("A").setIcon(R.drawable.tabbar_icon_back_press);
        TabLayout.Tab tab2 = tabLayout.newTab();//.setText("B").setIcon(R.drawable.tabbar_health_normal);
        TabLayout.Tab tab3 = tabLayout.newTab();//.setText("C").setIcon(R.drawable.tabbar_watch_press);
        TabLayout.Tab tab4 = tabLayout.newTab();//.setText("D").setIcon(R.drawable.phone);
        tabLayout.addTab(tab1);
        tabLayout.addTab(tab2);
        tabLayout.addTab(tab3);
        tabLayout.addTab(tab4);
        desk_pager = findViewById(R.id.desk_pager);
        DeskAdapter adapter = new DeskAdapter(getSupportFragmentManager(), list);
        desk_pager.setOffscreenPageLimit(1);
        desk_pager.setAdapter(adapter);
        tabLayout.setupWithViewPager(desk_pager);//tabLayout 与ViewPager关联
        tabLayout.getTabAt(0).setText("A").setIcon(R.drawable.tabbar_icon_back_press);
        tabLayout.getTabAt(1).setText("B").setIcon(R.drawable.tabbar_health_normal);
        tabLayout.getTabAt(2).setText("C").setIcon(R.drawable.tabbar_watch_press);
        tabLayout.getTabAt(3).setText("D").setIcon(R.drawable.phone);

    }

    private void initData() {
        NewsFragment newsFragment = new NewsFragment();
        PictureFragment pictureFragment = new PictureFragment();
        WeatherFragment weatherFragment = new WeatherFragment();
        CountDownFragment countDownFragment = new CountDownFragment();
        list.add(newsFragment);
        list.add(pictureFragment);
        list.add(weatherFragment);
        list.add(countDownFragment);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
