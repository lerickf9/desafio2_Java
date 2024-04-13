package com.erickfbcode.radioalura.modelos;

public class Audio {

    private String titulo;
    private int totalDeProducciones;
    private int totalMeGusta;
    private int clasificacion;

    public void meGusta(){
        this.totalMeGusta++;
    }

    public void reproduce(){
        this.totalDeProducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeProducciones() {
        return totalDeProducciones;
    }

    public void setTotalDeProducciones(int totalDeProducciones) {
        this.totalDeProducciones = totalDeProducciones;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void setTotalMeGusta(int totalMeGusta) {
        this.totalMeGusta = totalMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
