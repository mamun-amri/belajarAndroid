package com.mamun.quis.myintenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        Button btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
        Button btnDialPhone = findViewById(R.id.btn_dial_number);
//        Button btnDataReceived = findViewById(R.id.btn_data_received);
//        Button btnThisIsMoveActivity = findViewById(R.id.btn_this_is_moveactivity);

        btnMoveActivity.setOnClickListener(this);
        btnMoveWithDataActivity.setOnClickListener(this);
        btnDialPhone.setOnClickListener(this);
//        btnDataReceived.setOnClickListener(this);

//        btnThisIsMoveActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataActivity = new Intent(MainActivity.this,MoveWithDataActivity.class);
                moveWithDataActivity.putExtra(MoveWithDataActivity.EXTRA_NAME,"Ma'mun Amri");
                moveWithDataActivity.putExtra(MoveWithDataActivity.EXTRA_AGE,20);
                startActivity(moveWithDataActivity);
                break;
            case R.id.btn_dial_number:
                String phoneNumber = "083875530005";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
