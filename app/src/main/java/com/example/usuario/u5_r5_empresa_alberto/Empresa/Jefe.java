package com.example.usuario.u5_r5_empresa_alberto.Empresa;

import java.util.ArrayList;



/**
 * Created by usuario on 20/11/17.
 */

public class Jefe extends Persona {
    public ArrayList<Empleado> empleados;
    public String departamento;

    public Jefe(String dni, String nombre, String apellidos, ArrayList<Empleado> empleados, String departamento) {
        super(dni, nombre, apellidos);
        this.empleados = empleados;
        this.departamento = departamento;
    }

    @Override
    public String saludar() {
        return super.saludar()+" y mi departamento es "+departamento;
    }


    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void addEmpleado(Empleado empleado){

        empleados.add(empleado);

    }

}
