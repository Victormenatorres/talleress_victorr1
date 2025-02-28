class Vendedor extends Empleado {
    private double comision;
    private int ventas;

    public Vendedor(String nombre, double salarioBase, double comision, int ventas) {
        super(nombre, salarioBase);
        this.comision = comision;
        this.ventas = ventas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (comision * ventas);
    }
}