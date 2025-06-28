package com.grupo4.notificaciones;

public class SignalAdapter extends NotificacionDecorator {
    private SignalAPI signalAPI;

    public SignalAdapter(INotificacion notificacion) {
        super(notificacion);
        this.signalAPI = new SignalAPI();
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        signalAPI.sendSignalMessage(mensaje);
    }
}
