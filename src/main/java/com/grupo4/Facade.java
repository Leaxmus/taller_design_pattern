package com.grupo4;

import com.grupo4.sistema_presencial.AtencionPresencial;
import com.grupo4.sistema_virtual.AtencionVirtual;

public class Facade {
    public void atenderVirtual(String tipo) {
        AtencionVirtual virtual = new AtencionVirtual();
        switch (tipo) {
            case "movil":
                virtual.atenderMovil();
                break;
            case "web":
                virtual.atenderWeb();
                break;
            case "telefonico":
                virtual.atenderTelefonico();
                break;
            default:
                break;
        }
    }

    public void atenderPrensencial() {
        AtencionPresencial presencial = new AtencionPresencial();
        presencial.procesar();
    }
}
