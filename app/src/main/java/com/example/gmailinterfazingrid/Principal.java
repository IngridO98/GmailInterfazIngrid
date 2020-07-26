package com.example.gmailinterfazingrid;

public class Principal {
    private String nombre;
    private String Titulo;
    private String Mnesaje;
    private String Hora;
    private int foto;

    public Principal(){

    }

    public Principal(String nombre, String titulo, String mnesaje, String hora, int foto) {
        this.nombre = nombre;
        Titulo = titulo;
        Mnesaje = mnesaje;
        Hora = hora;
        this.foto = foto;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getMnesaje() {
        return Mnesaje;
    }

    public void setMnesaje(String mnesaje) {
        Mnesaje = mnesaje;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
