package com.gaurav.recydlervieweample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyNewAdapter extends RecyclerView.Adapter<MyNewAdapter.ViewHolder> {

    String list[];
    Context context;
    MyNewAdapter.ViewHolder holder;

    MyNewAdapter(String listData[], Context context){
        list = listData;
        this.context = context;
    }

    @NonNull
    @Override
    public MyNewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        holder = new MyNewAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyNewAdapter.ViewHolder holder, int position) {
        holder.name.setText(list[position]);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.naame);
        }

        @Override
        public void onClick(View view) {

        }
    }

}
