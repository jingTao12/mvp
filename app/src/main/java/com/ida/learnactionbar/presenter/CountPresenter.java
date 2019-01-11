package com.ida.learnactionbar.presenter;

import com.ida.learnactionbar.model.CountDataBean;
import com.ida.learnactionbar.model.CountDataModel;
import com.ida.learnactionbar.view.CountView;

import java.util.ArrayList;

public class CountPresenter implements Presenter<CountView>, ICountPresenter {

    CountView countView;
    CountDataModel countDataModel;

    public CountPresenter(CountView countView) {
        this.countView = countView;
        countDataModel = new CountDataModel(this);
    }

    public void load() {
        countDataModel.loadData();
    }

    @Override
    public void attachView(CountView view) {
        this.countView = view;
    }

    @Override
    public void detachView() {
        this.countView = null;
    }

    @Override
    public void getDataSuccess(ArrayList<CountDataBean> list) {
        countView.showData(list);
    }

    @Override
    public void getDataFailed() {

    }
}
