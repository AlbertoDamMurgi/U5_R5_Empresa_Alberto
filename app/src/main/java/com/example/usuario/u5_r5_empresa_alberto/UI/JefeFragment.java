package com.example.usuario.u5_r5_empresa_alberto.UI;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.usuario.u5_r5_empresa_alberto.Empresa.basedatos.Bd;
import com.example.usuario.u5_r5_empresa_alberto.R;

import java.util.ArrayList;

/**
 * Created by Farra on 23/11/2017.
 */

public class JefeFragment extends Fragment {


    public JefeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View aux = container;

        if(aux!=null){

            aux = inflater.inflate(R.layout.lista,container,false);

            View vista = inflater.inflate(R.layout.celda_empleado,container,false);

          // final Button boton =(Button) vista.findViewById(R.id.btn_addtojefe);
          //  boton.setVisibility(View.VISIBLE);

            final Button volver =(Button) aux.findViewById(R.id.volver);

            final ListView lista = (ListView) aux.findViewById(R.id.lista);



            JefesAdapter adapter = new JefesAdapter(getActivity(), Bd.getJefes());

            lista.setAdapter(adapter);

            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                    if(Bd.getJefes().get(position).getEmpleados().size()==0){

                        Toast.makeText(getActivity(),"añade empleados a ese jefe",Toast.LENGTH_LONG).show();
                        EmpleadosAdapter adapter = new EmpleadosAdapter(getActivity(), Bd.getEmpleados());

                        lista.setAdapter(adapter);
                        volver.setVisibility(View.VISIBLE);
                        volver.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                volver.setVisibility(View.GONE);
                                JefesAdapter adapter = new JefesAdapter(getActivity(), Bd.getJefes());
                                Bd.getJefes().get(position).setEmpleados(EmpleadosAdapter.empledejefe);
                                EmpleadosAdapter.empledejefe = null;
                                EmpleadosAdapter.empledejefe= new ArrayList<>();
                                lista.setAdapter(adapter);
                            }
                        });

                    }else{
                        Toast.makeText(getActivity(),"Mostrando empleados del jefe.",Toast.LENGTH_LONG).show();
                        EmpleadosAdapter adapter = new EmpleadosAdapter(getActivity(), Bd.getJefes().get(position).getEmpleados());
                        volver.setVisibility(View.VISIBLE);
                        volver.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                volver.setVisibility(View.GONE);
                                JefesAdapter adapter = new JefesAdapter(getActivity(), Bd.getJefes());
                                lista.setAdapter(adapter);
                            }
                        });
                        lista.setAdapter(adapter);

                    }


                }
            });




        }

        return aux;
    }
}
