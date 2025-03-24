package Ejercicio3;

public class Camion implements Conducible, Transportador{
    @Override
    public void conducir() {
        System.out.println("El camión está en movimiento.");
    }
    
    @Override
    public void cargarMercancia(double peso) {
        System.out.println("Cargando mercancía con un peso de " + peso + " kg.");
    }
}
