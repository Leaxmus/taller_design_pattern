package com.grupo4.sistema_virtual;

public class AtencionVirtual {
    private SubMovil movil;
    private SubTelefonico telefonico;
    private SubWeb web;

    public AtencionVirtual() {
        this.movil = new SubMovil();
        this.telefonico = new SubTelefonico();
        this.web = new SubWeb();
    }

    public void atenderMovil() {
        movil.procesar();
    }

    public void atenderTelefonico() {
        telefonico.procesar();
    }

    public void atenderWeb() {
        web.procesar();
    }    
}
