package Ejercicio2;

public abstract class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public abstract boolean retirar(double monto);
    
    public double getSaldo() {
        return saldo;
    }
}
