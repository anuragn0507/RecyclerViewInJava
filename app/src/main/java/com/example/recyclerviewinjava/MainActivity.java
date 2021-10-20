package com.example.recyclerviewinjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Object RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programminglist = (RecyclerView) findViewById(R.id.programminglist);
        programminglist.setLayoutManager(new LinearLayoutManager(this));
        String[] languages = {"Java", "JavaScript","c#","php","c","c++","Python"};
        programminglist.setAdapter(new ProgrammingAdapter(languages));
    }
}