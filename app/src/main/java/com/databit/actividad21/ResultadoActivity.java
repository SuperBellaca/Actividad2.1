package com.databit.actividad21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();
        if (intent != null) {
            String stNombre = intent.getStringExtra("STNombre");

            // Encuentra el TextView en el layout
            TextView textView = findViewById(R.id.txtViewResultado);

            // Verifica si el TextView existe y establece el valor recibido
            if (textView != null) {
                textView.setText(stNombre);
            }
        }
    }
}