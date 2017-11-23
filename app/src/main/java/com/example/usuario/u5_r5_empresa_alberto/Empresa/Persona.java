package com.example.usuario.u5_r5_empresa_alberto.Empresa;

/**
 * Created by usuario on 20/11/17.
 */

public class Persona {

    public String dni;
    public String nombre;
    public String apellidos;

    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String saludar(){


        return "hola soy "+nombre+" "+apellidos;
    }

}
