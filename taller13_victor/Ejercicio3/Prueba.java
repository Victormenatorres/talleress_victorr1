package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Mensajero email = new Email();
        Mensajero sms = new SMS();
        Mensajero push = new Push();

        email.enviarMensaje("usuario@example.com", "Hola, este es un correo electrónico.");
        sms.enviarMensaje("+123456789", "Hola, este es un SMS.");
        push.enviarMensaje("usuario123", "Hola, esta es una notificación push.");
    }
}
