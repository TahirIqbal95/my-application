package com.mejrabsoft.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.mejrabsoft.myapplication.Adapter.CollectionAdapter;
import com.mejrabsoft.myapplication.Model.RootCollection;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CollectionActivity extends AppCompatActivity {

    CollectionAdapter collectionAdapter;
    RecyclerView recyclerViewcoll;
    List<RootCollection.Collection> collection_list;

    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);


        id = getIntent().getExtras().getInt("ID");
        recyclerViewcoll = findViewById(R.id.recyclerview_collection);


        RequestInterface requestInterface = RetrofitClient.getRetrofitInstance().create(RequestInterface.class);
        Call<RootCollection> call = requestInterface.getCollection("d6ca7ee58290c43aa4e8cdadd529f586", id);

        call.enqueue(new Callback<RootCollection>() {
            @Override
            public void onResponse(Call<RootCollection> call, Response<RootCollection> response) {

                collection_list = response.body().getCollections();


                if (response.code() == 200) {

                    if (collection_list != null) {

                        collectionAdapter = new CollectionAdapter(collection_list);
                        recyclerViewcoll.setLayoutManager(new LinearLayoutManager(CollectionActivity.this));
                        recyclerViewcoll.setAdapter(collectionAdapter);

                    }
                    Toast.makeText(CollectionActivity.this, "Empty", Toast.LENGTH_SHORT).show();


                }


            }

            @Override
            public void onFailure(Call<RootCollection> call, Throwable t) {

                Toast.makeText(CollectionActivity.this, "failed", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
