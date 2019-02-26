package com.example.a16carlospr.proyectoalimentos;

/**
 * Created by a16carlospr on 22/02/2019.
 */

public class Alimentos {
    private Integer foto;
    private String nombre;

    public Alimentos(Integer foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

