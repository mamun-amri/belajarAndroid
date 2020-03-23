package com.tutorial.searchfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView searchFoods;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchFoods = (ListView) findViewById(R.id.search_foods);

        ArrayList<String> arrayFood = new ArrayList<>();
        arrayFood.addAll(Arrays.asList(getResources().getStringArray(R.array.my_foods)));

        adapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayFood
        );

        searchFoods.setAdapter(adapter);

    }
}
