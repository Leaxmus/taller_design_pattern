package com.grupo4.notificaciones;

public abstract class NotificacionDecorator implements INotificacion {
    protected INotificacion envoltorio;

    public NotificacionDecorator(INotificacion notificacion) {
        this.envoltorio = notificacion;
    }

    @Override
    public void enviar(String mensaje) {
        envoltorio.enviar(mensaje);
    }
}
