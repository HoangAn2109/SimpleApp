package com.example.simpleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.simpleapp.adapters.HomeHorAdapter;
import com.example.simpleapp.adapters.HomeVerAdapter;
import com.example.simpleapp.models.HomeHorModel;
import com.example.simpleapp.models.HomeVerModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    RecyclerView homeHorrec, homeVerrec;
    HomeHorAdapter homeHorAdapter;
    HomeVerAdapter homeVerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);


        List<HomeHorModel> list = new ArrayList<>();
        list.add(new HomeHorModel(R.drawable.hcmc_tag, "Ho Chi Minh City", "Vietnam", "From 500$"));
        list.add(new HomeHorModel(R.drawable.italy_tag, "Venice", "Italy", "From 800$"));
        list.add(new HomeHorModel(R.drawable.japan_tag, "Kyoto", "Japan", "From 600$"));
        list.add(new HomeHorModel(R.drawable.france_tag, "Paris", "France", "From 700$"));

        setHomeHorrec(list);

        List<HomeVerModel> list1 = new ArrayList<>();
        list1.add(new HomeVerModel(R.drawable.gnpark, "Glacier National Park"));
        list1.add(new HomeVerModel(R.drawable.mal, "Maldives"));
        list1.add(new HomeVerModel(R.drawable.rome, "Rome"));
        list1.add(new HomeVerModel(R.drawable.halong, "Halong Bay"));


        setHomeVerrec(list1);
    }

    private void setHomeHorrec(List<HomeHorModel> list){
        homeHorrec = findViewById(R.id.home_hor_rec);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        homeHorrec.setLayoutManager(layoutManager);
        homeHorAdapter = new HomeHorAdapter(this, list);
        homeHorrec.setAdapter(homeHorAdapter);
    }

    public void setHomeVerrec(List<HomeVerModel> list1){
        homeVerrec = findViewById(R.id.home_ver_rec);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        homeVerrec.setLayoutManager(layoutManager);
        homeVerAdapter = new HomeVerAdapter(this, list1);
        homeVerrec.setAdapter(homeVerAdapter);
    }
}