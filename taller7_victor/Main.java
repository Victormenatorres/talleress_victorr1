public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("  Alvaro", 3000); // Error
        empleado.mostrarDetalles();
    }
}

abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        throw new UnsupportedOperationException("Este método debe ser sobrescrito en la subclase.");
    }
}



