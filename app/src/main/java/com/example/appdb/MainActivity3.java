package com.example.appdb;

import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Referencias a los elementos de la interfaz de usuario (TextViews)
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);

        // Obtener datos extras del Intent
        Bundle extras = getIntent().getExtras();

        // Verificar si hay datos extras
        if (extras != null) {
            // Obtener el valor asociado a la clave "id" del Intent
            String value = extras.getString("id");

            // Mostrar en el log el valor recibido
            Log.e("esto es lo que llega", value);

            // Realizar una consulta a la base de datos utilizando el valor obtenido
            String query = "SELECT * FROM usuarios where id = " + value;
            SQLiteDatabase db = new ConexionSQLite(this, "dbusuarios", null, 1).getReadableDatabase();
            Cursor cursor = db.rawQuery(query, null);

            // StringBuilder para almacenar el texto a mostrar en la interfaz de usuario
            StringBuilder displayText = new StringBuilder();

            // Verificar si hay datos en el cursor
            if (cursor.moveToFirst()) {
                // Obtener los valores de las columnas del cursor
                String id = cursor.getString(cursor.getColumnIndex("id"));
                String nombre = cursor.getString(cursor.getColumnIndex("nombre"));
                String propiedades = cursor.getString(cursor.getColumnIndex("propiedades"));

                // Construir el texto a mostrar en la interfaz de usuario
                displayText.append("ID: ").append(id).append("\n");
                displayText.append("Nombre: ").append(nombre).append("\n");
                displayText.append("Propiedades: ").append(propiedades).append("\n\n");

                // Establecer el texto en los TextViews de la interfaz de usuario
                textView2.setText(nombre);
                textView3.setText(propiedades);
            } else {
                // El cursor está vacío, manejar este caso según tus necesidades
                displayText.append("No se encontraron datos.");
            }

            // Cerrar el cursor cuando ya no se necesite
            cursor.close();
        }
    }
}
