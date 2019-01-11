package com.ida.learnactionbar.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ida.learnactionbar.R;
import com.ida.learnactionbar.model.NewsDataBean;

import java.util.ArrayList;

public class NewsRecyclerAdapter extends RecyclerView.Adapter<NewsRecyclerAdapter.NewsViewHolder> {


    private ArrayList<NewsDataBean> list;

    public NewsRecyclerAdapter(ArrayList<NewsDataBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_layout, viewGroup, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int i) {
        newsViewHolder.title.setText(list.get(i).getTitle());
        newsViewHolder.author.setText(list.get(i).getAuthor_name());
        newsViewHolder.time.setText(list.get(i).getDate());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder {

        public final TextView title;
        public final TextView author;
        public final TextView time;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.rv_title);
            author = itemView.findViewById(R.id.rv_author);
            time = itemView.findViewById(R.id.rv_time);
        }

    }

}
