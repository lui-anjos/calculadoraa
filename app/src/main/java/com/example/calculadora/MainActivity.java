package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Usuario usuario;
    FirebaseAuth autenticacao;
    EditText campoLogin, campoSenha, campoNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Teladois(View view) {
        Intent in = new Intent(MainActivity.this, login.class);
        startActivity(in);
    }

    public void cadastro() {
        campoLogin =
        campoSenha =
        campoNome =

    }
}