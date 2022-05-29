package com.sofka.ejercicio18;

/**
 * Entregable es la interface que define los métodos que pueden ser implementados en otras clases
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public interface Entregable {

    public void deliver();

    public void sendBack();

    public boolean isDelivered();

    public int compareTo(Object object);
}
