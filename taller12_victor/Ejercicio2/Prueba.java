package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000, 0.15);
        EtiquetaProducto etiqueta = new EtiquetaProducto();
        CalcularPrecio calculadora = new CalcularPrecio();
        
        etiqueta.generarEtiqueta(producto);
        System.out.println("Precio Final: " + calculadora.calcularPrecioFinal(producto));
    }
}
