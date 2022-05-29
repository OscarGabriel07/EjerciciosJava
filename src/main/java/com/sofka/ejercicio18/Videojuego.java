package com.sofka.ejercicio18;

/**
 * Videojuego va a representar un contenido de juego de video
 * En los ejemplos se usarán 5 videojuegos.
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Videojuego implements Entregable{
    private String title;
    private double estimatedHours;
    private boolean delivered;
    private String gender;
    private String campaign;
    /**
     * Crea un videojuego con todos sus atributos inicializados por default
     */
    public Videojuego(){
        this.title = "";
        this.estimatedHours = 10;
        this.delivered = false;
        this.gender = "";
        this.campaign = "";
    }
    /**
     * Crea un videojuego que recibe como parámetros el título y las horas estimadas de juego
     *
     * @param title título del videojuego
     * @param estimatedHours horas estimadas para el juego
     */
    public Videojuego(String title, double estimatedHours){
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.delivered = false;
        this.gender = "";
        this.campaign = "";
    }
    /**
     * Crea un videojuego que recibe como parámetros el título, las horas estimadas de juego, el género y
     * la campaña
     *
     * @param title título del videojuego
     * @param estimatedHours horas estimadas para el videojuego
     * @param gender género en que se encuentra catalogado el videojuego
     * @param campaign campaña de lanzamiento del videojuego
     */
    public Videojuego(String title, double estimatedHours, String gender, String campaign){
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.delivered = false;
        this.gender = gender;
        this.campaign = campaign;
    }
    /**
     * Retorna el título del videojuego
     *
     * @return devuelve el título del videojuego
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * Retorna las horas estimadas que dura el videojuego
     *
     * @return devuelve las horas estimadas que dura el videojuego
     */
    public double getEstimatedHours() {
        return this.estimatedHours;
    }
    /**
     * Retorna el género del videojuego
     *
     * @return devuelve el género catalogado para el videojuego
     */
    public String getGender() {
        return this.gender;
    }
    /**
     * Retorna la campaña del videojuego
     *
     * @return devuelve la campaña del videojuego
     */
    public String getCampaign() {
        return this.campaign;
    }
    /**
     * Modifica el título del videojuego
     *
     * @param title recibe el nuevo valor a asignar al título del videojuego
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Modifica las horas estimadas del videojuego
     *
     * @param estimatedHours recibe el nuevo valor a asignar a las horas estimadas del videojuego
     */
    public void setEstimatedHours(double estimatedHours) {
        this.estimatedHours = estimatedHours;
    }
    /**
     * Modifica el género del videojuego
     *
     * @param gender recibe el nuevo valor a asignar al género del videojuego
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Modifica la campaña del videojuego
     *
     * @param campaign recibe el nuevo valor a asignar a la campaña del videojuego
     */
    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }
    /**
     * retorna todos los atributos del videojuego
     *
     * @return devuelve los atributos del videojuego
     */
    @Override
    public String toString(){
        return "Titulo: " + this.title + ", Horas Estimadas: "+ this.estimatedHours + ", Entregado: "
                + this.delivered + ", Género: " + this.gender + ", Campania: " + this.campaign;
    }
    /**
     * El videojuego cambia su estado a entregado
     */
    @Override
    public void deliver() {
        this.delivered = true;
    }
    /**
     * El videojuego cambia su estado a NO entregado
     */
    @Override
    public void sendBack() {
        this.delivered = false;
    }
    /**
     * Retorna si el videojuego está entregado o no
     *
     * @return devuelve el estado de entrega del videojuego
     */
    @Override
    public boolean isDelivered() {
        return this.delivered;
    }
    /**
     * Compara las horas estimadas de dos videojuegos y devuelve 1 si la primera serie tiene más horas estimadas,
     * 0 si tienen las mismas horas estimadas y -1 si la primera serie tiene menos horas estimadas
     *
     * @param object recibe el videojuego que se va a comparar
     * @return
     */
    @Override
    public int compareTo(Object object) {
        Videojuego videojuego = (Videojuego) object;
        int status = -1;
        if(this.estimatedHours == videojuego.getEstimatedHours()){
            status = 0;
        } else if (this.estimatedHours > videojuego.getEstimatedHours()) {
            status = 1;
        }
        return status;
    }
}
