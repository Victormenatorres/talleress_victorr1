package Ejercicio3;

public class Push extends Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando notificación push a " + destinatario + ": " + mensaje);
    }
}
