package com.tutorial.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText username,password;
    private Object Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username    = (EditText) findViewById(R.id.et_username);
        password    = (EditText) findViewById(R.id.et_password);
        btnLogin    = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){
                    Intent i = new Intent(MainActivity.this,HomePage.class);
                    startActivity(i);
                }
            }
        });
    }
    
    public boolean validate(){
        if((username.getText().toString().equals("mamun")) && (password.getText().toString().equals("123"))){
            return true;
        }

        Toast.makeText(MainActivity.this,"Username or Password Wrong!",Toast.LENGTH_SHORT).show();
        return false;
    }
}
