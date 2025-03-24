package Ejercicio1;

public class DescuentoFijo extends Descuento{
    private double cantidadFija;

    public DescuentoFijo(double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return Math.max(0, precio - cantidadFija);
    }
}
