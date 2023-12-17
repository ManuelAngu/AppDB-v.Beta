package com.example.appdb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class ConexionSQLite extends SQLiteOpenHelper {

    // Definición de la sentencia SQL para crear la tabla de usuarios
    final String TBL_USER = "CREATE TABLE usuarios (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, propiedades TEXT)";

    public ConexionSQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Ejecuta la sentencia SQL para crear la tabla de usuarios
        db.execSQL(TBL_USER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // Sirve para actualizaciones de estructura utilizando versiones al crear la conexión
    }
}
