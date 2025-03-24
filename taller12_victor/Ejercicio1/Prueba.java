package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Libro libro = new Libro("1984", "George Orwell", 1949);
        Reporte_Libro reporte = new Reporte_Libro();
        Persistencia persistencia = new Persistencia();
        
        reporte.generarReporte(libro);
        persistencia.guardarLibro(libro);
    }
}
