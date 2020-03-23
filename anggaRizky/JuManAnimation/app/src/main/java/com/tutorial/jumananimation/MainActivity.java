package com.tutorial.jumananimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FloatingActionButton btnAdd,btnSearch;
        final CoordinatorLayout myLayout;

        btnAdd      = (FloatingActionButton) findViewById(R.id.btn_add);
        btnSearch   = (FloatingActionButton) findViewById(R.id.btn_search);
        myLayout    = (CoordinatorLayout) findViewById(R.id.my_layout);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(myLayout);
                btnSearch.setVisibility(View.VISIBLE);
            }
        });

        myLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(myLayout);
                btnSearch.setVisibility(View.GONE);
            }
        });
    }
}
