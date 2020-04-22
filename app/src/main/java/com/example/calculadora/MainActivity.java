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
        //Widget de ingreso de texto
        et1 = (EditText)findViewById(R.id.txt_num1);
        //Variable de tipo input - Casting si es un input - Encontrar elemento por su id - R refiere al archivo res
        //Clase R => Clase que sirve como comunicacion entre parte logica y parte grafica. 
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.result_field);
    }

    //Sum method
    //View permite dibujar dentro de la app de nuestros componentes
    public void sumMethod(View view){
        //Obtener texto del elemento et1 y parsearlo a String
        String v1 = et1.getText().toString();
        String v2 = et2.getText().toString();

        int n1 =  Integer.parseInt(v1);
        int n2 = Integer.parseInt(v2);
        int suma = n1 + n2;

        //Si quiero mostrar el resultado de un textView, debo pasar mi valor de int a String para el textView
        String result = String.valueOf(suma);
        tv1.setText(result) ;
    }
}
