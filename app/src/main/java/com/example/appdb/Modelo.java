package com.example.appdb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class Modelo {

    // Método para obtener la conexión a la base de datos
    public SQLiteDatabase getconn(Context context) {
        // Crea una instancia de la clase de conexión SQLite
        ConexionSQLite conn = new ConexionSQLite(context, "dbusuarios", null, 1);
        // Obtiene una instancia de la base de datos en modo escritura
        SQLiteDatabase db = conn.getWritableDatabase();
        return db;
    }

    // Método para insertar un usuario en la base de datos
    int insertaUsuario(Context context, UsuariosDTO dto) {
        int res = 0;

        // Construye la sentencia SQL de inserción
        String sql = "INSERT INTO usuarios (id, nombre, propiedades) VALUES ('" + dto.getId() + "','" + dto.getNombre() + "','" + dto.getPropiedades() + "')";

        // Obtiene una instancia de la base de datos en modo escritura
        SQLiteDatabase db = this.getconn(context);

        try {
            // Ejecuta la sentencia SQL de inserción
            db.execSQL(sql);
            res = 1; // Indica que la inserción fue exitosa
        } catch (SQLiteException e) {
            // Maneja la excepción en caso de error durante la inserción
            e.printStackTrace();
            // Aquí podrías agregar manejo de errores más específico
        } finally {
            // Cierra la base de datos para liberar recursos
            db.close();
        }

        return res;
    }

    int modificaUsuario(Context context, UsuariosDTO dto) {
        int res = 0;

        // Construye la sentencia SQL de inserción
        String sql = "UPDATE usuarios SET nombre = '" + dto.getNombre() + "', propiedades = '" + dto.getPropiedades() + "' WHERE id = '" + dto.getId() + "'";

        // Obtiene una instancia de la base de datos en modo escritura
        SQLiteDatabase db = this.getconn(context);

        try {
            // Ejecuta la sentencia SQL de inserción
            db.execSQL(sql);
            res = 1; // Indica que la inserción fue exitosa
        } catch (SQLiteException e) {
            // Maneja la excepción en caso de error durante la inserción
            e.printStackTrace();
            // Aquí podrías agregar manejo de errores más específico
        } finally {
            // Cierra la base de datos para liberar recursos
            db.close();
        }

        return res;
    }

    public UsuariosDTO getUsuario(Context context, String id) {
        // Obtiene una instancia de la base de datos en modo escritura
        SQLiteDatabase db = this.getconn(context);

        // Realiza la consulta a la base de datos
        String query = "SELECT * FROM usuarios where id = " + id;
        Cursor cursor = db.rawQuery(query, null);

        UsuariosDTO resultado = null;
        if (cursor.moveToFirst()) {
            String nombre = cursor.getString(cursor.getColumnIndex("nombre"));
            String propiedades = cursor.getString(cursor.getColumnIndex("propiedades"));

            resultado = new UsuariosDTO();
            resultado.setId(id);
            resultado.setNombre(nombre);
            resultado.setPropiedades(propiedades);
        }
        cursor.close(); // Cierra el cursor cuando hayas terminado con él
        return resultado;
    }

    // Método para verificar si un usuario existe en la base de datos por su ID
    public boolean existeUsuario(Context context, String id) {
        boolean existe = false;

        // Construye la sentencia SQL para buscar el usuario por ID
        String sql = "SELECT id FROM usuarios WHERE id = '" + id + "'";

        // Obtiene una instancia de la base de datos en modo lectura
        SQLiteDatabase db = this.getconn(context);

        Cursor cursor = null;
        try {
            // Ejecuta la consulta
            cursor = db.rawQuery(sql, null);
            // Si el cursor tiene al menos un resultado, el usuario existe
            existe = cursor != null && cursor.getCount() > 0;
        } catch (SQLiteException e) {
            e.printStackTrace();
            // Manejo de errores
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            db.close();
        }

        return existe;
    }
}
