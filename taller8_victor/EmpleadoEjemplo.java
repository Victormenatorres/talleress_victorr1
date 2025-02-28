public class EmpleadoEjemplo {
    protected String nombre;
    protected double salario;

    public EmpleadoEjemplo(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}

