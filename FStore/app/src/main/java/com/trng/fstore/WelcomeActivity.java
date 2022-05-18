package com.trng.fstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.trng.fstore.Adapters.PlateAdapter;
import com.trng.fstore.Models.PlateModel;

import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<PlateModel> plateModelList;
    private PlateAdapter plateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setKeepScreenOn(true);
        recyclerView.setHasFixedSize(true);

        plateModelList = new ArrayList<>();
        plateModelList.add(new PlateModel(R.drawable.cooking_oil1));
        plateModelList.add(new PlateModel(R.drawable.nes2));
        plateModelList.add(new PlateModel(R.drawable.nes3));
        plateModelList.add(new PlateModel(R.drawable.milk1));
        plateModelList.add(new PlateModel(R.drawable.vegetable1));
        plateModelList.add(new PlateModel(R.drawable.lays4));

        plateAdapter = new PlateAdapter(plateModelList, this);
        recyclerView.setAdapter(plateAdapter);
        plateAdapter.notifyDataSetChanged();

    }
}