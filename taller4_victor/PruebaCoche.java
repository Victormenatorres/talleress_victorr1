public class PruebaCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 180);
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Velocidad Máxima: " + coche1.getVelocidadMaxima());
        
        coche1.acelerar(20);
        System.out.println("Nueva Velocidad Máxima: " + coche1.getVelocidadMaxima());
    }
}
class IncorrectoPrivate {
    private int datoPrivado = 10;
}

class OtraClase {
    public static void main(String[] args) {
        IncorrectoPrivate obj = new IncorrectoPrivate();
        // System.out.println(obj.datoPrivado); // Esto causará un error de compilación
    }
}

class SinGetSet {
    private String secreto = "Dato confidencial";
}

class PruebaSinGetSet {
    public static void main(String[] args) {
        SinGetSet obj = new SinGetSet();
        // No se puede acceder a 'secreto' porque no hay métodos get/set
    }
}

