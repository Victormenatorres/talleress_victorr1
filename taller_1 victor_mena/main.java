import java.util.Scanner;
public class main   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Libro
        System.out.println("Ingrese los detalles del libro:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Libro libro = new Libro();

        // Crear un objeto CuentaBancaria
        System.out.println("\nIngrese los detalles de la cuenta bancaria:");
        System.out.print("Número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        // Crear un objeto Estudiante
        System.out.println("\nIngrese los detalles del estudiante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        // Mostrar detalles de los objetos usando toString()
        System.out.println("\nDetalles del libro:");
        System.out.println(libro.toString());

        System.out.println("\nDetalles de la cuenta bancaria:");
        System.out.println(cuenta.toString());

        System.out.println("\nDetalles del estudiante:");
        System.out.println(estudiante.toString());

        scanner.close();
    }
}