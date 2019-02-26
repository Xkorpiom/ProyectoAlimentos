package com.example.a16carlospr.proyectoalimentos;

/**
 * Created by a16carlospr on 22/02/2019.
 */

public class Alimentos2 {
    private Integer foto;
    private String nombre;
    private float azucar, grasa, sodio;

    public Alimentos2(Integer foto, String nombre, float azucar, float grasa, float sodio) {
        this.foto = foto;
        this.nombre = nombre;
        this.azucar = azucar;
        this.grasa = grasa;
        this.sodio = sodio;
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

    public float getAzucar() {
        return azucar;
    }

    public void setAzucar(float azucar) {
        this.azucar = azucar;
    }

    public float getGrasa() {
        return grasa;
    }

    public void setGrasa(float grasa) {
        this.grasa = grasa;
    }

    public float getSodio() {
        return sodio;
    }

    public void setSodio(float sodio) {
        this.sodio = sodio;
    }
}

