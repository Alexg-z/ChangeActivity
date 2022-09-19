package com.example.changeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private Button bt3;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv2 = (TextView) findViewById(R.id.tv2);

        tv2 = (TextView) findViewById(R.id.tv2);
            String resultado = getIntent().getStringExtra("resultado");
        tv2.setText("Resultado: " + resultado);
    }

    public void regresar (View view){
        Intent ant = new Intent(this,MainActivity2.class);
        startActivity(ant);
    }
}