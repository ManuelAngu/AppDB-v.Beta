package com.example.appdb;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Contacto_Activity extends AppCompatActivity {

    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        btnEnviar = findViewById(R.id.btnEnviar);

        // Dirección de correo electrónico predefinida
        final String direccionPredefinida = "walkherbcompany@gmail.com";

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mandarMail(direccionPredefinida);
            }

            private void mandarMail(String direccion) {
                // Crear un Intent para abrir la aplicación de Gmail
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + direccion));

                // Abre la aplicación de Gmail
                startActivity(emailIntent);
            }
        });
    }
}
