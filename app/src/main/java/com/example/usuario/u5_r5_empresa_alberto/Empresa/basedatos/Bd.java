package com.example.usuario.u5_r5_empresa_alberto.Empresa.basedatos;

import com.example.usuario.u5_r5_empresa_alberto.Empresa.Empleado;
import com.example.usuario.u5_r5_empresa_alberto.Empresa.Jefe;

import java.util.ArrayList;


/**
 * Created by usuario on 20/11/17.
 */

public class Bd {

    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static ArrayList<Jefe> jefes = new ArrayList<>();






    public  ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public  ArrayList<Jefe> getJefes() {
        return jefes;
    }

    public void addEmpleado(Empleado empleado){

        empleados.add(empleado);

    }

    public  void addJefe(Jefe jefe){

        jefes.add(jefe);

    }

}
