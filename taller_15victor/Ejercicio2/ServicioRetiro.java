package Ejercicio2;

public class ServicioRetiro implements Retiro{
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " realizado.");
    }
}
