package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new Porcentaje(10); // 10% de descuento
        Descuento descuentoFijo = new DescuentoFijo(50); // Descuento de 50 unidades

        double precioOriginal = 500;
        System.out.println("Precio con descuento porcentual: " + descuentoPorcentaje.aplicarDescuento(precioOriginal));
        System.out.println("Precio con descuento fijo: " + descuentoFijo.aplicarDescuento(precioOriginal));
    
    }
    
}
