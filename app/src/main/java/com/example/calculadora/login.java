package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    TextView txtRegister = (TextView) findViewById(R.id.txtRegister);
txtRegister .setOnClickListener(new OnClickListener() {

        public void onClick(View view) {
            your codes here
        }
    });

    public void Calc(View view) {
        Intent in = new Intent(login.this, calc.class);
        startActivity(in);

    }
}