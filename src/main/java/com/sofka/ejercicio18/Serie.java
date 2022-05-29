package com.sofka.ejercicio18;

/**
 * Serie va a representar un contenido audiovisual
 * En los ejemplos se usarán 5 series.
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Serie implements Entregable{
    private String title;
    private int numberOfSeasons;
    private boolean delivered;
    private String gender;
    private String creator;
    /**
     * Crea una serie con todos sus atributos inicializados por default
     */
    public Serie(){
        this.title = "";
        this.numberOfSeasons = 3;
        this.delivered = false;
        this.gender = "";
        this.creator = "";
    }
    /**
     * Crea una serie que recibe como parámetros el título y el creador de la serie
     *
     * @param title título de la serie
     * @param creator creador de la serie
     */
    public Serie(String title, String creator){
        this.title = title;
        this.numberOfSeasons = 3;
        this.delivered = false;
        this.gender = "";
        this.creator = creator;
    }
    /**
     * Crea una serie que recibe como parámetros el título, la cantidad de temporadas, el género y el creator de la serie
     *
     * @param title título de la serie
     * @param numberOfSeasons cantidad de temporadas de la serie
     * @param gender género de la serie
     * @param creator creador de la serie
     */
    public Serie(String title, int numberOfSeasons, String gender, String creator){
        this.title = title;
        this.numberOfSeasons = numberOfSeasons;
        this.delivered = false;
        this.gender = gender;
        this.creator = creator;
    }
    /**
     * Retorna el título de la serie
     *
     * @return devuelve el título de esa serie
     */
    public String getTitulo() {
        return this.title;
    }
    /**
     * Retorna la cantidad de temporadas de la serie
     *
     * @return devuelve la cantidad de tempodas de la serie
     */
    public int getCantidadTemporadas() {
        return this.numberOfSeasons;
    }
    /**
     * Retorna el género de la serie
     *
     * @return devuelve el género de la serie
     */
    public String getGender() {
        return this.gender;
    }
    /**
     * Retorna el creador de la serie
     *
     * @return devuelve el creator de la serie
     */
    public String getCreator() {
        return this.creator;
    }
    /**
     * Modifica el título de la serie
     *
     * @param title recibe el nuevo valor a asignar al título de la serie
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Modifica la cantidad de temporadas de la serie
     *
     * @param numberOfSeasons recibe el nuevo valor a asignar a la cantidad de temporadas de la serie
     */
    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }
    /**
     * Modifica el género de la serie
     *
     * @param gender recibe el nuevo valor a asignar al género de la serie
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Modifica el creador de la serie
     *
     * @param creator recibe el nuevo valor a asignar al creador de la serie
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
    /**
     * Sobreescribe el método toString
     *
     * @return devuelve los atributos de la serie
     */
    @Override
    public String toString(){
        return "Titulo: " + this.title + ", Cantidad de Temporadas: "+ this.numberOfSeasons + ", Entregado: "
                + this.delivered + ", Género: " + this.gender + ", Creador: " + this.creator;
    }
    /**
     * La serie cambia su estado a entregado
     */
    @Override
    public void deliver() {
        this.delivered = true;
    }
    /**
     * La serie cambia su estado a NO entregado
     */
    @Override
    public void sendBack() {
        this.delivered = false;
    }
    /**
     * Retorna si la serie está entregada o no
     *
     * @return devuelve el estado de entrega de la serie
     */
    @Override
    public boolean isDelivered() {
        return this.delivered;
    }
    /**
     * Compara la cantidad de temporadas de dos series y devuelve 1 si la primera serie tiene más temporadas,
     * 0 si tienen las mismas temporadas y -1 si la primera serie tiene menos temporadas
     *
     * @param object recibe la serie que se va a comparar
     *
     * @return Devuelve 1 si la primera serie tiene más temporadas, 0 si tienen las mismas temporadas
     * y -1 si la primera serie tiene menos temporadas
     */
    @Override
    public int compareTo(Object object) {
        Serie serie = (Serie) object;
        int status = -1;
        if(this.numberOfSeasons == serie.getCantidadTemporadas()){
            status = 0;
        } else if (this.numberOfSeasons > serie.getCantidadTemporadas()) {
            status = 1;
        }
        return status;
    }
}
