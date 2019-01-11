package com.ida.learnactionbar.model;

import com.ida.learnactionbar.presenter.ICountPresenter;

import java.util.ArrayList;

public class CountDataModel {


    private ICountPresenter iCountPresenter;

    public CountDataModel(ICountPresenter iCountPresenter) {
        this.iCountPresenter = iCountPresenter;
    }


    public void loadData() {

        ArrayList<CountDataBean> list = new ArrayList<>();

        list.add(new CountDataBean("图书1", 9600000));
        list.add(new CountDataBean("图书2", 1080000));
        list.add(new CountDataBean("图书3", 900000));
        list.add(new CountDataBean("图书4", 1020000));
        list.add(new CountDataBean("图书5", 540000));

        if (list.size() > 0) {
            iCountPresenter.getDataSuccess(list);
        } else {
            iCountPresenter.getDataFailed();
        }
    }

}
