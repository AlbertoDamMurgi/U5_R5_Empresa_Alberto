package com.example.usuario.u5_r5_empresa_alberto.UI;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.usuario.u5_r5_empresa_alberto.Empresa.Empleado;
import com.example.usuario.u5_r5_empresa_alberto.Empresa.basedatos.Bd;
import com.example.usuario.u5_r5_empresa_alberto.R;

import java.util.ArrayList;


/**
 * Created by usuario on 21/11/17.
 */

public class EmpleadosAdapter extends ArrayAdapter<Empleado> {

    private Context context;
    private ArrayList<Empleado> datos;

    public EmpleadosAdapter(@NonNull Context context, @NonNull ArrayList<Empleado> datos) {
        super(context, 0, datos);
        this.context=context;
        this.datos=datos;
    }





    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View aux = convertView;

        EmpleadoHolder holder;

        if (aux == null) {



            aux = LayoutInflater.from(context).inflate(R.layout.celda_empleado,parent,false);

            holder = new EmpleadoHolder();
            holder.dni = (TextView) aux.findViewById(R.id.tv_dni_emp);
            holder.nombre = (TextView) aux.findViewById(R.id.tv_nombre_emp);
            holder.apellidos = (TextView) aux.findViewById(R.id.tv_apellidos_emp);
            holder.puesto = (TextView) aux.findViewById(R.id.tv_puesto_emp);
            holder.funcion = (TextView) aux.findViewById(R.id.tv_funcion_emp);

            aux.setTag(holder);

        }

        holder = (EmpleadoHolder) aux.getTag();

        holder.dni.setText("DNI: "+datos.get(position).dni);
        holder.apellidos.setText(datos.get(position).apellidos);
        holder.nombre.setText(datos.get(position).nombre);
        holder.puesto.setText(datos.get(position).puesto);
        holder.funcion.setText(datos.get(position).funcion);

        return aux;
    }
}
