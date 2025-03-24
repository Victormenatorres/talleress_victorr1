package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Almacenamiento local = new AlmacenamientoLocal();
        Almacenamiento nube = new AlmacenamientoNube();
        
        Gestor gestorLocal = new Gestor(local);
        Gestor gestorNube = new Gestor(nube);
        
        gestorLocal.guardar("documento.txt", "Contenido del archivo local");
        gestorNube.guardar("documento.txt", "Contenido del archivo en la nube");
        
        System.out.println(gestorLocal.recuperar("documento.txt"));
        System.out.println(gestorNube.recuperar("documento.txt"));
    }
}
