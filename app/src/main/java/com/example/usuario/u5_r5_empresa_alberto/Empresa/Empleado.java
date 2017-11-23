package com.example.usuario.u5_r5_empresa_alberto.Empresa;

/**
 * Created by usuario on 20/11/17.
 */

public class Empleado extends Persona {

    public String puesto;
    public String funcion;

    public Empleado(String dni, String nombre, String apellidos, String puesto, String funcion) {
        super(dni, nombre, apellidos);
        this.puesto = puesto;
        this.funcion = funcion;
    }

    @Override
    public String saludar() {
        return super.saludar()+" mi puesto es "+puesto+" y mi funcion es: "+funcion ;
    }
}
