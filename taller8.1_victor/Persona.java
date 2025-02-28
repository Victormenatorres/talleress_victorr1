public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }

    public static void main(String[] args) {

        Persona persona = new Persona("Carlos", 30);
        Empleado empleado = new Empleado("Ana", 40, "Recursos Humanos");

        System.out.println("Detalles de la Persona:");
        persona.mostrarDetalles();

        System.out.println("\nDetalles del Empleado:");
        empleado.mostrarDetalles();
    }
}
