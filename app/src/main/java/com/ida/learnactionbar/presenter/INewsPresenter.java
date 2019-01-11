package com.ida.learnactionbar.presenter;

import com.ida.learnactionbar.model.NewsDataBean;

import java.util.ArrayList;

public interface INewsPresenter {

    void getDataSuccess(ArrayList<NewsDataBean> list);

    void getDataFailed();
}
