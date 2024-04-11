package com.example.gabinetemedico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonAtendimento = findViewById(R.id.buttonAtendimento);

        buttonAtendimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, Atendimentos.class);
                startActivity(intent);
            }
        });

        Button buttonEstoque = findViewById(R.id.buttonEstoque);

        buttonEstoque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, Estoque.class);
                startActivity(intent);
            }
        });

    }
}