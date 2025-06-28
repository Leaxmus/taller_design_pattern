package com.grupo4.notificaciones;

public class NotificacionSMS implements INotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
