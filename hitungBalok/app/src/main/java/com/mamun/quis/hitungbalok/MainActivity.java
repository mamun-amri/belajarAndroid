package com.mamun.quis.hitungbalok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    property
    private EditText edtWidth, edtHeight, edtLength;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      kelas MainActivity akan menampilkan tampilan yang berasal dari layout activity_main.xml
        setContentView(R.layout.activity_main);

        edtHeight = findViewById(R.id.edt_height);
        edtLength = findViewById(R.id.edt_length);
        edtWidth = findViewById(R.id.edt_width);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(this);

        if (savedInstanceState != null){
            String result = savedInstanceState.getString(STATE_RESULT);
            tvResult.setText(result);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_calculate){
            String inputLength = edtLength.getText().toString().trim();
            String inputHeight = edtHeight.getText().toString().trim();
            String inputWidth = edtWidth.getText().toString().trim();

            boolean isEmptyFields = false;
            boolean isInvalidDouble = false;

            if (TextUtils.isEmpty(inputLength)){
                isEmptyFields = true;
                edtLength.setError("Field tidak boleh kosong!");
            }

            if (TextUtils.isEmpty(inputHeight)){
                isEmptyFields = true;
                edtHeight.setError("Field tidak boleh kosong!");
            }

            if (TextUtils.isEmpty(inputWidth)){
                isEmptyFields = true;
                edtWidth.setError("Field tidak boleh kosong!");
            }

            Double length = toDouble(inputLength);
            Double height = toDouble(inputHeight);
            Double width = toDouble(inputWidth);

            if (length == null){
                isInvalidDouble = true;
                edtLength.setError("Field ini harus diisi dengan angka!");
            }

            if (height == null){
                isInvalidDouble=true;
                edtHeight.setError("Field ini harus diisi dengan angka!");
            }

            if (width == null){
                isInvalidDouble=true;
                edtWidth.setError("Field ini harus diisi dengan angka!");
            }

            if (!isEmptyFields && !isInvalidDouble){
                double volume = length * width * height;
                tvResult.setText(String.valueOf(volume));
            }

        }


    }

    private Double toDouble(String str) {
        try{
            return Double.valueOf(str);
        }catch (NumberFormatException e){
            return null;
        }
    }

    private static final String STATE_RESULT = "state_result";
//  ketika landscape ke potret layarnya, maka data yang sudah dihitung tidak hilang
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString(STATE_RESULT,tvResult.getText().toString());
    }

}

