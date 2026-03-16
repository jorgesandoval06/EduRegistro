package com.example.eduregistro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registro_Activity extends AppCompatActivity {

    EditText nombre, correo, edad;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = findViewById(R.id.txtNombre);
        correo = findViewById(R.id.txtCorreo);
        edad = findViewById(R.id.txtEdad);
        enviar = findViewById(R.id.btnEnviar);

        enviar.setOnClickListener(v -> {

            Intent i = new Intent(Registro_Activity.this, Confirmacion_Activity.class);

            i.putExtra("nombre", nombre.getText().toString());
            i.putExtra("correo", correo.getText().toString());
            i.putExtra("edad", edad.getText().toString());

            startActivity(i);
        });
    }
}