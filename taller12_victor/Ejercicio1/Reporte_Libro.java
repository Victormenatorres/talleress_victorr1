package Ejercicio1;

public class Reporte_Libro{

    public void generarReporte(Libro libro) {
        System.out.println("Reporte del Libro:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de Publicación: " + libro.getAnioPublicacion());
    }
}