package com.ida.learnactionbar.presenter;

public interface Presenter<V> {

    void attachView(V view);

    void detachView();
}
