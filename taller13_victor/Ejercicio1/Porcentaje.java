package Ejercicio1;

public class Porcentaje extends Descuento {
    private double porcentaje;

    public Porcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - (precio * porcentaje / 100);
    }
}
