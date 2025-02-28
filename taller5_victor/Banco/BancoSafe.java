package Banco;

class BancoSafe {
    private double saldo;

    public BancoSafe(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("Error: El saldo inicial no puede ser negativo.");
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: No se puede depositar una cantidad negativa.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: Fondos insuficientes o cantidad no válida.");
        }
    }
}