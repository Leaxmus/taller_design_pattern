package com.grupo4;

public class Main {
    public static void main(String[] args) {
        //Facade
        Facade fachadaAtencion = new Facade();
        fachadaAtencion.atenderVirtual("movil");
        //fachadaAtencion.atenderPrensencial();
    }
}