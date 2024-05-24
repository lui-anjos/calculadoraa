package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    Usuario usuario;
    FirebaseAuth autenticacao;
    EditText campoLogin, campoSenha, campoNome;
    Button botaoCadastrar;

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
        campoLogin = findViewById(R.id.email);
        campoSenha = findViewById(R.id.senha);
        campoNome = findViewById(R.id.nome);
        botaoCadastrar = findViewById(R.id.nome);
    }

    public void validarCampos(View view){
        String nome = campoNome.getText().toString();
        String email = campoLogin.getText().toString();
        String senha = campoSenha.getText().toString();

        if (!nome.isEmpty()) {
            if (!email.isEmpty()){
                if (!senha.isEmpty())
            }
        }
    }
}