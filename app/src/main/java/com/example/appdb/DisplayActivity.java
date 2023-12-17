package com.example.appdb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        // Obtén referencia al TextView desde el diseño
        TextView txtDisplay = findViewById(R.id.txtDisplay);

        // Realiza la consulta a la base de datos
        String query = "SELECT * FROM usuarios";
        SQLiteDatabase db = new ConexionSQLite(this, "dbusuarios", null, 1).getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        // Procesa los resultados y muestra los datos en el TextView
        StringBuilder displayText = new StringBuilder();
        while (cursor.moveToNext()) {
            String id = cursor.getString(cursor.getColumnIndex("id"));
            String nombre = cursor.getString(cursor.getColumnIndex("nombre"));
            String propiedades = cursor.getString(cursor.getColumnIndex("propiedades"));
            displayText.append("ID: ").append(id).append("\n");
            displayText.append("Nombre: ").append(nombre).append("\n");
            displayText.append("Propiedades: ").append(propiedades).append("\n\n");
        }

        // Cierra el cursor y la base de datos
        cursor.close();
        db.close();

        // Establece el texto en el TextView
        txtDisplay.setText(displayText.toString());
    }
}
