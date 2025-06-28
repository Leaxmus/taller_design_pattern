package com.grupo4;

import com.grupo4.sistema_presencial.AtencionPresencial;
import com.grupo4.sistema_virtual.AtencionVirtual;

public class Facade {
    private AtencionVirtual virtual;
    private AtencionPresencial presencial;

    public Facade() {
        virtual = new AtencionVirtual();
        presencial = new AtencionPresencial();
    }

    public void atenderVirtual(String tipo) {
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
        presencial.procesar();
    }
}
