package com.example.usuario.u5_r5_empresa_alberto.UI;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.usuario.u5_r5_empresa_alberto.Empresa.Empleado;
import com.example.usuario.u5_r5_empresa_alberto.Empresa.Jefe;
import com.example.usuario.u5_r5_empresa_alberto.R;

import java.util.ArrayList;

/**
 * Created by Farra on 23/11/2017.
 */

public class JefesAdapter extends ArrayAdapter<Jefe> {


    private Context context;
    private ArrayList<Jefe> datos;



    public JefesAdapter(@NonNull Context context, @NonNull ArrayList<Jefe> datos) {
        super(context, 0, datos);
        this.context=context;
        this.datos=datos;
    }





    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View aux = convertView;

        JefesHolder holder;

        if (aux == null) {



            aux = LayoutInflater.from(context).inflate(R.layout.celda_empleado,parent,false);

            holder = new JefesHolder();
            holder.dni = (TextView) aux.findViewById(R.id.tv_dni_emp);
            holder.nombre = (TextView) aux.findViewById(R.id.tv_nombre_emp);
            holder.apellidos = (TextView) aux.findViewById(R.id.tv_apellidos_emp);
            holder.departamento = (TextView) aux.findViewById(R.id.tv_puesto_emp);
            holder.aux = (TextView)aux.findViewById(R.id.tv_funcion_emp);
            holder.etiqueta = (TextView) aux.findViewById(R.id.tv_etiquetafuncion);
            aux.setTag(holder);

        }

        holder = (JefesHolder) aux.getTag();

        holder.dni.setText(datos.get(position).dni);
        holder.apellidos.setText(datos.get(position).apellidos);
        holder.nombre.setText(datos.get(position).nombre);
        holder.departamento.setText(datos.get(position).departamento);
        holder.aux.setVisibility(View.GONE);
        holder.etiqueta.setVisibility(View.GONE);




        return aux;
    }
}
