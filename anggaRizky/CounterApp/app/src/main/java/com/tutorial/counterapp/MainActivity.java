package com.tutorial.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCounter;
    TextView txtCounter;
    Integer i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i=0;
        btnCounter  = (Button) findViewById(R.id.btn_counter);
        txtCounter  = (TextView) findViewById(R.id.txt_counter);

        btnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                txtCounter.setText(i +"");
            }
        });
    }
}
