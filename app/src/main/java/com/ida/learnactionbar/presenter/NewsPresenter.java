package com.ida.learnactionbar.presenter;

import com.ida.learnactionbar.model.NewsDataBean;
import com.ida.learnactionbar.model.NewsDataModel;
import com.ida.learnactionbar.view.NewsView;

import java.util.ArrayList;

public class NewsPresenter implements Presenter<NewsView>, INewsPresenter {


    NewsView newsView;
    NewsDataModel model;

    public NewsPresenter(NewsView newsView) {
        attachView(newsView);
        model = new NewsDataModel(this);
    }

    public void getData() {
        model.loadNetWorkData();
    }


    @Override
    public void getDataSuccess(ArrayList<NewsDataBean> list) {

        newsView.showData(list);

    }

    @Override
    public void getDataFailed() {

    }

    @Override
    public void attachView(NewsView view) {
        this.newsView = view;

    }

    @Override
    public void detachView() {
        this.newsView = null;

    }
}
