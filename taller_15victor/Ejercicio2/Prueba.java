package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Transferencia transferencia = new ServicioTransferencia();
        Retiro retiro = new ServicioRetiro();
        PagoFactura pagoFactura = new ServicioFactura();
        
        transferencia.transferir(500.0, "123456789");
        retiro.retirar(200.0);
        pagoFactura.pagarFactura("Empresa X", 100.0);
    }
}
