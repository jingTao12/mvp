package com.ida.learnactionbar.ui;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.LoginFilter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ida.learnactionbar.R;
import com.ida.learnactionbar.adapter.CountRecyclerAdapter;
import com.ida.learnactionbar.adapter.NewsRecyclerAdapter;
import com.ida.learnactionbar.model.CountDataBean;
import com.ida.learnactionbar.presenter.CountPresenter;
import com.ida.learnactionbar.presenter.NewsPresenter;
import com.ida.learnactionbar.view.CountView;

import java.util.ArrayList;

public class CountDownFragment extends BaseFragment implements CountView {

    private View view;
    private RecyclerView rv;
    private static final String TAG = "CountDownFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_layout, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        rv = view.findViewById(R.id.rv);
        CountPresenter presenter = new CountPresenter(this);
        presenter.load();
    }

    @Override
    public void showData(ArrayList<CountDataBean> list) {
        Log.e(TAG, "showData: " + list.size());
        CountRecyclerAdapter recyclerAdapter = new CountRecyclerAdapter(list);
        if (rv != null) {
            Log.e(TAG, "showData: rv!=null");
        }
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(recyclerAdapter);
    }

}
