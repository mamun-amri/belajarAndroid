package com.tutorial.switchlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchListener;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout myLayout;
    DayNightSwitch dayNightSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout        = (ConstraintLayout) findViewById(R.id.my_layout);
        dayNightSwitch  = (DayNightSwitch) findViewById(R.id.day_night_switch);

        dayNightSwitch.setListener(new DayNightSwitchListener() {
            @Override
            public void onSwitch(boolean is_night) {
                if(is_night){
                    Toast.makeText(MainActivity.this,"Now is Night",Toast.LENGTH_SHORT).show();
                    myLayout.setBackgroundColor(Color.parseColor("#34495e"));
                }else{
                    Toast.makeText(MainActivity.this,"Now is to Day",Toast.LENGTH_SHORT).show();
                    myLayout.setBackgroundColor(Color.parseColor("#3498db"));
                }
            }
        });
    }
}
