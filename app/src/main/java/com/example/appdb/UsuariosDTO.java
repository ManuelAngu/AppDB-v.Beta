package com.example.appdb;

public class UsuariosDTO {

    // Atributos de la clase
    private String id;
    private String nombre;
    private String propiedades;

    // Método para obtener el ID
    public String getId() {
        return id;
    }

    // Método para establecer el ID
    public void setId(String id) {
        this.id = id;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener las propiedades
    public String getPropiedades() {
        return propiedades;
    }

    // Método para establecer las propiedades
    public void setPropiedades(String propiedades) {
        this.propiedades = propiedades;
    }
}
