package com.grupo4.notificaciones;

public class NotificacionEmail implements INotificacion {
    private INotificacion notificacion;

    // Constructor para recibir la notificación a decorar
    public NotificacionEmail(INotificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviar(String mensaje) {
        if (notificacion != null) {
            notificacion.enviar(mensaje);
        }
        System.out.println("Enviando Email: " + mensaje);
    }
}