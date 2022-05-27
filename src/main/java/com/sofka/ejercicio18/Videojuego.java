package com.sofka.ejercicio18;

public class Videojuego implements Entregable{
    private String titulo;
    private double horasEstimadas;
    private boolean entregado;
    private String genero;
    private String campania;

    public Videojuego(){
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.campania = "";
    }

    public Videojuego(String titulo, double horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.campania = "";
    }

    public Videojuego(String titulo, double horasEstimadas, String genero, String campania){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.campania = campania;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public double getHorasEstimadas() {
        return this.horasEstimadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getCampania() {
        return this.campania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCampania(String campania) {
        this.campania = campania;
    }

    @Override
    public String toString(){
        return "Titulo: " + this.titulo + ", Horas Estimadas: "+ this.horasEstimadas + ", Entregado: "
                + this.entregado + ", Género: " + this.genero + ", Campania: " + this.campania;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean estaEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object object) {
        Videojuego videojuego = (Videojuego) object;
        int estado = -1;
        if(this.horasEstimadas == videojuego.getHorasEstimadas()){
            estado = 0;
        } else if (this.horasEstimadas > videojuego.getHorasEstimadas()) {
            estado = 1;
        }
        return estado;
    }
}
