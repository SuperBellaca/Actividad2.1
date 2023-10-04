package com.databit.actividad21;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button BTAceptar = (Button) findViewById(R.id.BTAceptar);
        BTAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ETNombre = (EditText) findViewById(R.id.ETNombreFoto);
                String StNombre = ETNombre.getText().toString();


                Intent sIntent = new Intent(MainActivity.this, ResultadoActivity.class);
                sIntent.putExtra("STNombre", StNombre);
                startActivity(sIntent);
            }
        });
    }
}
