/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consumidor;

import kurokami.monitor.Orden;

/**
 *
 * @author Gilda
 */
public class Preparacion extends Thread {

    static int tiempo;
    static String nombre;
    static int id;

    public Preparacion(Orden orden) {
        this.tiempo = orden.getTiempoConsumo();
        this.nombre = orden.getNombre();
        this.id = orden.getID();
        
    }

}
