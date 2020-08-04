package com.mejrabsoft.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.mejrabsoft.myapplication.CollectionActivity;
import com.mejrabsoft.myapplication.MainActivity;
import com.mejrabsoft.myapplication.Model.GetCities;
import com.mejrabsoft.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.MyViewHolder> {

    List<GetCities.LocationSuggestion> list;
    private int pos,id;
    Context context;

    public CityAdapter(List<GetCities.LocationSuggestion> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_layout, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {


        holder.city_name.setText(list.get(position).getName());
        holder.country_name.setText(list.get(position).getCountryName());

        Picasso.get().load(list.get(position).getCountryFlagUrl()).into(holder.countryflag);


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                pos =  position;
                id =  list.get(pos).getId();

                if(list == null){

                    Toast.makeText(context, "empty", Toast.LENGTH_SHORT).show();
                }

                Intent intent = new Intent(v.getContext(), CollectionActivity.class);
                    intent.putExtra("ID",id);
                    v.getContext().startActivity(intent);







            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView city_name, country_name;
        ImageView countryflag;
        LinearLayout linearLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            city_name = itemView.findViewById(R.id.city_name);
            country_name = itemView.findViewById(R.id.country_name);
            countryflag = itemView.findViewById(R.id.flag);
            linearLayout = itemView.findViewById(R.id.linear);



        }


    }
}
