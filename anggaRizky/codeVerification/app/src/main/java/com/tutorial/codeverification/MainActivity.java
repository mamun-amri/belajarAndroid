package com.tutorial.codeverification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Toast;

import com.raycoarana.codeinputview.CodeInputView;

public class MainActivity extends AppCompatActivity {

    Button submit;
    CodeInputView code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit  = (Button) findViewById(R.id.btn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"Berhasil",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
