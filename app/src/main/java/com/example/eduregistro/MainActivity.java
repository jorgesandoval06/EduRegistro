package com.example.eduregistro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciar = findViewById(R.id.btnIniciar);

        iniciar.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, Registro_Activity.class);
            startActivity(i);
        });
    }
}