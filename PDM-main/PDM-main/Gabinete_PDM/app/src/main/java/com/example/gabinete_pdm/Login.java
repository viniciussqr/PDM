package com.example.gabinete_pdm;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    Intent intent;
    Button button = findViewById(R.id.button_entrar_login);
    Button button_cadastrar = findViewById(R.id.button_cadastrar);

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Login.this, Home.class);
                startActivity(intent);

            }
        });

        button_cadastrar.setBackgroundColor(Color.TRANSPARENT);
        button_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Login.this, Cadastro.class);
                startActivity(intent);
            }
        });
    }

}
