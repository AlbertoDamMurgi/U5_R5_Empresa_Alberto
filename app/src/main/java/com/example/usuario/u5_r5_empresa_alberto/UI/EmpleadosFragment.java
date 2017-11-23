package com.example.usuario.u5_r5_empresa_alberto.UI;
import com.example.usuario.u5_r5_empresa_alberto.Empresa.Empleado;
import com.example.usuario.u5_r5_empresa_alberto.Empresa.basedatos.Bd;
import com.example.usuario.u5_r5_empresa_alberto.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by usuario on 22/11/17.
 */

public class EmpleadosFragment extends Fragment {

    public EmpleadosFragment() {
    }




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        View aux = inflater.inflate(R.layout.lista,container,false);



        EmpleadosAdapter adapter = new EmpleadosAdapter(getActivity(),Bd.getEmpleados());

        ListView lista = (ListView) aux.findViewById(R.id.lista);

        lista.setAdapter(adapter);


        return aux;


    }


}
