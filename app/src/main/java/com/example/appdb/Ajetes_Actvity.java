package com.example.appdb;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Ajetes_Actvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajetes_actvity);
        TextView textView28 = findViewById(R.id.textView28);
        TextView textView29 = findViewById(R.id.textView29);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String value = extras.getString("id");
            Log.e("esto es lo que llega", value);

            // Realiza la consulta a la base de datos
            String query = "SELECT * FROM usuarios where id = " + value;
            SQLiteDatabase db = new ConexionSQLite(this, "dbusuarios", null, 1).getReadableDatabase();
            Cursor cursor = db.rawQuery(query, null);

            StringBuilder displayText = new StringBuilder();

            if (cursor.moveToFirst()) {
                String id = cursor.getString(cursor.getColumnIndex("id"));
                String nombre = cursor.getString(cursor.getColumnIndex("nombre"));
                String propiedades = cursor.getString(cursor.getColumnIndex("propiedades"));
                displayText.append("ID: ").append(id).append("\n");
                displayText.append("Nombre: ").append(nombre).append("\n");
                displayText.append("Propiedades: ").append(propiedades).append("\n\n");


                textView28.setText(nombre);
                textView29.setText(propiedades);
            } else {
                // El cursor está vacío, manejar este caso según tus necesidades
                displayText.append("No se encontraron datos.");
            }

            cursor.close(); // Cierra el cursor cuando hayas terminado con él
        }
    }
}


