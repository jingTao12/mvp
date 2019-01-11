package com.ida.learnactionbar.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ida.learnactionbar.R;
import com.ida.learnactionbar.adapter.NewsRecyclerAdapter;
import com.ida.learnactionbar.model.NewsDataBean;
import com.ida.learnactionbar.presenter.NewsPresenter;
import com.ida.learnactionbar.view.NewsView;

import java.util.ArrayList;

public class NewsFragment extends BaseFragment implements NewsView {


    private View view;
    private RecyclerView rv;

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
        NewsPresenter presenter = new NewsPresenter(this);
        presenter.getData();

    }

    @Override
    public void showData(ArrayList<NewsDataBean> list) {

        Log.e("NewsFragment", list.size() + "请求返回的数据");
        NewsRecyclerAdapter recyclerAdapter = new NewsRecyclerAdapter(list);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(recyclerAdapter);
    }


}
