package com.grupo4.notificaciones;

public class NotificacionWhatsApp extends NotificacionDecorator {
    public NotificacionWhatsApp(INotificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando WhatsApp: " + mensaje);
    }
}
