package com.sofka.ejercicio18;

public class Serie implements Entregable{
    private String titulo;
    private int cantidadTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(){
        this.titulo = "";
        this.cantidadTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.cantidadTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }

    public Serie(String titulo, int cantidadTemporadas, String genero, String creador){
        this.titulo = titulo;
        this.cantidadTemporadas = cantidadTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getCantidadTemporadas() {
        return this.cantidadTemporadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getCreador() {
        return this.creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCantidadTemporadas(int cantidadTemporadas) {
        this.cantidadTemporadas = cantidadTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString(){
        return "Titulo: " + this.titulo + ", Cantidad de Temporadas: "+ this.cantidadTemporadas + ", Entregado: "
                + this.entregado + ", Género: " + this.genero + ", Creador: " + this.creador;
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
        Serie serie = (Serie) object;
        int estado = -1;
        if(this.cantidadTemporadas == serie.getCantidadTemporadas()){
            estado = 0;
        } else if (this.cantidadTemporadas > serie.getCantidadTemporadas()) {
            estado = 1;
        }
        return estado;
    }
}
