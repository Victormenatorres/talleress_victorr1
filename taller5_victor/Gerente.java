class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }
    public class Main {
        public static void main(String[] args) {
            Gerente gerente = new Gerente("Alvaro Muoñoz", 2.500000, "Tecnología");
            gerente.mostrarInformacion();
        }
    }
}