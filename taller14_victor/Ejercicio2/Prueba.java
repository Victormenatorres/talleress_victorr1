package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaAhorros(1000, 0.02);
        cuenta.depositar(500);
        System.out.println("Saldo después del depósito: " + cuenta.getSaldo());
        cuenta.retirar(300);
        System.out.println("Saldo después del retiro: " + cuenta.getSaldo());
    }
}
