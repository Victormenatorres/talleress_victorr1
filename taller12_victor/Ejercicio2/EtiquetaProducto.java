package Ejercicio2;

public class EtiquetaProducto{
    public void generarEtiqueta(Producto producto) {
        System.out.println("Etiqueta del Producto:");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio Base: " + producto.getPrecioBase());
        System.out.println("Impuesto: " + producto.getImpuesto());
    }
    
}