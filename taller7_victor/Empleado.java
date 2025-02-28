abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    
    public abstract double calcularSalario();

    
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario total: $" + String.format("%.2f", calcularSalario()));
    }
    public static void main(String[] args) {
        Gerente gerente = new Gerente("camilo", 100, 0);
        Vendedor vendedor = new Vendedor("carlos", 50, 2, 4);
            
        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
       
    }
}
