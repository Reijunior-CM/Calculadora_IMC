package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button3;
    private EditText editTextTextPersonName;
    private EditText editTextTextPersonName2;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView4 = findViewById(R.id.textView4);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        button3 = findViewById(R.id.button3);
    }

    public void resultadoIMC(View view) {
         double peso = Double.parseDouble(editTextTextPersonName.getText().toString());
         double altura = Double.parseDouble(editTextTextPersonName2.getText().toString());
         double resultado = peso / (altura * altura);

         if (resultado < 19 ){
            textView4.setText("Abaixo do peso");
         }else if(resultado <19 || resultado < 25){
             textView4.setText("Peso normal");
         } else if (resultado <= 25 || resultado < 30) {
             textView4.setText("Sobre peso");

         }

    }

}