package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Conducible auto = new Automovil();
        Conducible camion = new Camion();
        Transportador camionTransporte = new Camion();
        
        auto.conducir();
        camion.conducir();
        camionTransporte.cargarMercancia(1500.0);
    }
}
