public class GerenteEjemplos extends EmpleadoEjemplo {
    private String departamento;

    public GerenteEjemplos(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}
