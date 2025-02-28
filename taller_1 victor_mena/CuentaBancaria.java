public class CuentaBancaria {
   private String numeroCuenta;
   private double saldo;
   private String tipoCuenta;

   // Constructor por defecto
   public CuentaBancaria() {
       this.numeroCuenta = "Sin número";
       this.saldo = 0.0;
       this.tipoCuenta = "Sin tipo";
   }

   // Constructor parametrizado con dos parámetros
   public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
       this.numeroCuenta = numeroCuenta;
       this.tipoCuenta = tipoCuenta;
       this.saldo = 0.0; // Saldo predeterminado
   }

   // Constructor sobrecargado con tres parámetros
   public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
       this.numeroCuenta = numeroCuenta;
       this.saldo = saldo;
       this.tipoCuenta = tipoCuenta;
   }

   // Método toString
  
   public String toString() {
       return "CuentaBancaria [Número: " + numeroCuenta + ", Saldo: " + saldo + ", Tipo: " + tipoCuenta + "]";
   }
}