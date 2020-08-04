package com.mejrabsoft.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.mejrabsoft.myapplication.Adapter.adapter;
import com.mejrabsoft.myapplication.Model.GetCategory;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    List<GetCategory.MainCategory> list;
    RecyclerView recyclerView;
    com.mejrabsoft.myapplication.Adapter.adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerview);





        getResponse();
    }


    private void getResponse() {




        RequestInterface requestInterface = RetrofitClient.getRetrofitInstance().create(RequestInterface.class);




        Call<GetCategory> call = requestInterface.getJson("d6ca7ee58290c43aa4e8cdadd529f586");

        call.enqueue(new Callback<GetCategory>() {
            @Override
            public void onResponse(Call<GetCategory> call, Response<GetCategory> response) {







                list = response.body().getCategories();
                adapter = new adapter(list);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(adapter);
                Toast.makeText(MainActivity.this,   "", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<GetCategory> call, Throwable t) {


                Toast.makeText(MainActivity.this,  "" + t, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
