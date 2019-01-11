package com.ida.learnactionbar.presenter;

import com.ida.learnactionbar.model.CountDataBean;
import com.ida.learnactionbar.model.NewsDataBean;

import java.util.ArrayList;

public interface ICountPresenter {

    void getDataSuccess(ArrayList<CountDataBean> list);

    void getDataFailed();
}
