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

    public void NovaSenha(View view) {
        Intent in = new Intent(login.this, nova_senha.class);
        startActivity(in);
    }

    public void Calc(View view) {
        Intent in = new Intent(login.this, calc.class);
        startActivity(in);

    }
}