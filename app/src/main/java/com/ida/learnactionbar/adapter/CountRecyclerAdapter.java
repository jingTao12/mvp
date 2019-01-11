package com.ida.learnactionbar.adapter;

import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ida.learnactionbar.R;
import com.ida.learnactionbar.model.CountDataBean;
import com.ida.learnactionbar.model.NewsDataBean;

import java.util.ArrayList;

public class CountRecyclerAdapter extends RecyclerView.Adapter<CountRecyclerAdapter.CountViewHolder> {


    private ArrayList<CountDataBean> list;

    public CountRecyclerAdapter(ArrayList<CountDataBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.count_adapter_layout, viewGroup, false);
        return new CountViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder newsViewHolder, int i) {
        newsViewHolder.title.setText(list.get(i).getName());
        newsViewHolder.time.setText(list.get(i).getTime() + "");


    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    class CountViewHolder extends RecyclerView.ViewHolder {

        public final TextView title;
        public final TextView time;

        public CountViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.count_name);
            time = itemView.findViewById(R.id.count_time);


        }
    }

}
