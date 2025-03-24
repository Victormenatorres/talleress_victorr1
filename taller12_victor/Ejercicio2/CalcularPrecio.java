package Ejercicio2;

public class CalcularPrecio {
    public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * producto.getImpuesto());
    }
}
