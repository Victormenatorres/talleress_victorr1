class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos López", 2500);
        Gerente gerente = new Gerente("Ana Rodríguez", 5000, "Ventas");

        System.out.println("Detalles del Empleado:");
        empleado.mostrarDetalles();

        System.out.println("\nDetalles del Gerente:");
        gerente.mostrarDetalles();
    }
}
