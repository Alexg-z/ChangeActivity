package com.example.changeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.txt1);
    }

    // Method to change of activity
    public void cambiar (View view){
        Intent sig = new Intent(this,MainActivity2.class);
            sig.putExtra("dato",txt1.getText().toString());
        startActivity(sig);
    }
}