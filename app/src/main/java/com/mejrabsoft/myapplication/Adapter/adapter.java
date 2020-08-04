package com.mejrabsoft.myapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mejrabsoft.myapplication.Model.GetCategory;
import com.mejrabsoft.myapplication.R;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.MyviewHolder> {


    List<GetCategory.MainCategory> list;

    public adapter(List<GetCategory.MainCategory> list) {
        this.list = list;
    }



    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);

        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.name.setText(list.get(position).categories.name);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {

        TextView name;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
        }
    }
}
