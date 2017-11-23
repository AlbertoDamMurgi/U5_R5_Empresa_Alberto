package com.example.usuario.u5_r5_empresa_alberto.UI;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.usuario.u5_r5_empresa_alberto.Empresa.Empleado;
import com.example.usuario.u5_r5_empresa_alberto.Empresa.Jefe;
import com.example.usuario.u5_r5_empresa_alberto.Empresa.basedatos.Bd;
import com.example.usuario.u5_r5_empresa_alberto.R;

import java.util.ArrayList;


/**
 * Created by Farra on 24/11/2017.
 */

public class InsertarjefeFragment extends Fragment {

    public InsertarjefeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View aux = container;

        aux = inflater.inflate(R.layout.addemp,container,false);

        Button add = (Button) aux.findViewById(R.id.btn_add);
        final EditText dni = (EditText) aux.findViewById(R.id.et_dni);
        final EditText nombre = (EditText) aux.findViewById(R.id.ed_nombre);
        final EditText apellidos = (EditText) aux.findViewById(R.id.ed_ape);
        final EditText departamento = (EditText) aux.findViewById(R.id.et_puesto);
        final EditText funcion = (EditText) aux.findViewById(R.id.ed_funcion);

        funcion.setVisibility(View.GONE);

        departamento.setHint("Departamento");


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String DNI = dni.getText().toString().trim();
                final String NOMBRE = nombre.getText().toString().trim();
                final String APE = apellidos.getText().toString().trim();
                final String PUESTO = departamento.getText().toString().trim();


                if(DNI.equals("")||NOMBRE.equals("")||APE.equals("")||PUESTO.equals("")){
                    Toast.makeText(getActivity(),"Deben rellenarse todos los campos",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getActivity(), "Jefe añadido.", Toast.LENGTH_LONG).show();
                    Bd.addJefe(new Jefe(DNI, NOMBRE, APE,new ArrayList<Empleado>(), PUESTO));
                }

            }
        });

        return aux;


    }

}
