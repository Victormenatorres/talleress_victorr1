package Ejercicio2;

class ServicioTransferencia implements Transferencia {
    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transferencia de $" + monto + " a la cuenta " + cuentaDestino);
    }
}