package com.ida.learnactionbar.model;

import android.util.Log;

import com.ida.learnactionbar.presenter.INewsPresenter;
import com.ida.learnactionbar.retrofit.GetNews;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsDataModel {
    private INewsPresenter presenter;
    private static final String TAG = "NewsDataModel";

    public NewsDataModel(INewsPresenter presenter) {
        this.presenter = presenter;
    }

    public void loadNetWorkData() {

        //创建retrofit对象
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://v.juhe.cn/toutiao/").addConverterFactory(GsonConverterFactory.create()).build();
        //创建网络请求接口的实例
        GetNews news = retrofit.create(GetNews.class);
        Call<ResultBean> call = news.getCall();
        call.enqueue(new Callback<ResultBean>() {
            @Override
            public void onResponse(Call<ResultBean> call, Response<ResultBean> response) {
                Log.d(TAG, "onResponse() returned: " + response.body().toString());

                presenter.getDataSuccess(response.body().getResult().getData());
            }

            @Override
            public void onFailure(Call<ResultBean> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.toString());
                presenter.getDataFailed();
            }
        });
    }
}
