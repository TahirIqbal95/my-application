package com.mejrabsoft.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.mejrabsoft.myapplication.Model.RootCollection;
import com.mejrabsoft.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class CollectionAdapter extends RecyclerView.Adapter<CollectionAdapter.MyViewHolder> {


    List<RootCollection.Collection> collection_list;
    Context context;

    public CollectionAdapter(List<RootCollection.Collection> collection_list) {
        this.collection_list = collection_list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.collection_layout,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {



            Picasso.get().load(collection_list.get(position).getCollection().getImageUrl()).into(holder.imageView);
            holder.name.setText(collection_list.get(position).getCollection().getTitle());
            holder.des.setText(collection_list.get(position).getCollection().getDescription());
            holder.count.setText(String.valueOf(collection_list.get(position).getCollection().getResCount()));
            holder.link.setText(collection_list.get(position).getCollection().getShareUrl());






    }

    @Override
    public int getItemCount() {
        return collection_list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,des,count,link;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            imageView = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.title);
            des= itemView.findViewById(R.id.description);
            count= itemView.findViewById(R.id.count);
            link = itemView.findViewById(R.id.link);
        }
    }
}
