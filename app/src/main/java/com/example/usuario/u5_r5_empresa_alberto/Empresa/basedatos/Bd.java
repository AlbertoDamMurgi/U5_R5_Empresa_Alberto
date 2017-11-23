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






    public  static  ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public static ArrayList<Jefe> getJefes() {
        return jefes;
    }

    public static void addEmpleado(Empleado empleado){

        empleados.add(empleado);

    }

    public static void addJefe(Jefe jefe){

        jefes.add(jefe);

    }

}
