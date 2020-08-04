package com.mejrabsoft.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mejrabsoft.myapplication.Adapter.CityAdapter;
import com.mejrabsoft.myapplication.Model.GetCities;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CityActivity extends AppCompatActivity {

    CityAdapter cityAdapter;
    RecyclerView recyclerViewcity;
    List<GetCities.LocationSuggestion> list;

    EditText searchCity;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        recyclerViewcity = findViewById(R.id.recyclerview_city);
        searchCity = findViewById(R.id.edt_search);
        search= findViewById(R.id.btn_search);


        getResponse();

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getResponse();
            }
        });

    }


    private void getResponse() {


        RequestInterface requestInterface = RetrofitClient.getRetrofitInstance().create(RequestInterface.class);

        Call<GetCities> call = requestInterface.getcity("d6ca7ee58290c43aa4e8cdadd529f586",searchCity.getText().toString());

        call.enqueue(new Callback<GetCities>() {
            @Override
            public void onResponse(Call<GetCities> call, final Response<GetCities> response) {








                        list = response.body().getLocationSuggestions();
                        cityAdapter = new CityAdapter(list);
                        recyclerViewcity.setLayoutManager(new LinearLayoutManager(CityActivity.this));
                        recyclerViewcity.setAdapter(cityAdapter);
                        Toast.makeText(CityActivity.this,   "", Toast.LENGTH_SHORT).show();



            }

            @Override
            public void onFailure(Call<GetCities> call, Throwable t) {

                Toast.makeText(CityActivity.this,    t.getMessage() , Toast.LENGTH_SHORT).show();


            }
        });



    }
}