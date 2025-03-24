package Ejercicio2;

public class Gestor {
    private Almacenamiento almacenamiento;
    
    public Gestor(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    public void guardar(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }
    
    public String recuperar(String nombre) {
        return almacenamiento.recuperarArchivo(nombre);
    }
}
