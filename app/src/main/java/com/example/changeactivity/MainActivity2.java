package com.example.changeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv1;
    private EditText txtnum1, txtnum2;
    private RadioButton rbtn1, rbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView) findViewById(R.id.tv1);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Hola, "+ dato);

        txtnum1 = (EditText) findViewById(R.id.txtnum1);
        txtnum2 = (EditText) findViewById(R.id.txtnum2);
        rbtn1 = (RadioButton) findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton) findViewById(R.id.rbtn2);

    }

    public void calcular (View view){
        String valor1_string = txtnum1.getText().toString();
        String valor2_string = txtnum2.getText().toString();

        int valor1 = Integer.parseInt(valor1_string);
        int valor2 = Integer.parseInt(valor2_string);

        // Implementation of radio button.
        if(rbtn1.isChecked() == true){
            int suma =  valor1 + valor2;
            String res = String.valueOf(suma);
            //tv1.setText(res);

            Intent calcular = new Intent(this,MainActivity3.class);
            calcular.putExtra("resultado",res);
            startActivity(calcular);

        } else if(rbtn2.isChecked() == true){
            int resta = valor1 - valor2;
            String res = String.valueOf(resta);
            //tv1.setText(res);

            Intent calcular = new Intent(this,MainActivity3.class);
            calcular.putExtra("resultado",res);
            startActivity(calcular);
        }
    }

    public void regresar (View view){
        Intent ant = new Intent(this,MainActivity.class);
        startActivity(ant);
    }
}