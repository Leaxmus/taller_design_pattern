package com.grupo4;
import com.grupo4.notificaciones.*;

public class Main {
    public static void main(String[] args) {
        //Facade
        Facade fachadaAtencion = new Facade();
        fachadaAtencion.atenderVirtual("movil");
        //fachadaAtencion.atenderPrensencial();
    
    // Parte tuya: notificación simple con Decorator y Adapter
        INotificacion notificacion = new NotificacionSMS();               // Notificación base (obligatoria)
        notificacion = new NotificacionEmail(notificacion);               // Agrega Email (obligatorio)
        notificacion = new NotificacionWhatsApp(notificacion);            // Agrega WhatsApp (opcional)
        notificacion = new SignalAdapter(notificacion);                   // Agrega Signal (adaptador)

        notificacion.enviar("Recuerde pagar su tarjeta antes del 5 de julio.");
    
    }
}