package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.result_field);
    }

    //Sum method
    public void sumMethod(View view){
        String v1 = et1.getText().toString();
        String v2 = et2.getText().toString();

        int n1 =  Integer.parseInt(v1);
        int n2 = Integer.parseInt(v2);
        int suma = n1 + n2;

        String result = String.valueOf(suma);
        tv1.setText(result) ;
    }
}
