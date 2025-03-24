package Ejercicio2;

public class ServicioFactura implements PagoFactura {
    @Override
    public void pagarFactura(String empresa, double monto) {
        System.out.println("Pago de factura de $" + monto + " a " + empresa + " realizado.");
    }
}
