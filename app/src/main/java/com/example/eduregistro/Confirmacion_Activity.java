package com.example.eduregistro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Confirmacion_Activity extends AppCompatActivity {
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        resultado = findViewById(R.id.txtResultado);

        Intent i = getIntent();

        String nombre = i.getStringExtra("nombre");
        String correo = i.getStringExtra("correo");
        String edad = i.getStringExtra("edad");

        resultado.setText("Inscripción realizada\n\nNombre: " + nombre +
                "\nCorreo: " + correo +
                "\nEdad: " + edad);
    }

}