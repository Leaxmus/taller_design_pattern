package com.grupo4.notificaciones;

public class NotificacionTelegram extends NotificacionDecorator {
    public NotificacionTelegram(INotificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando Telegram: " + mensaje);
    }
}
