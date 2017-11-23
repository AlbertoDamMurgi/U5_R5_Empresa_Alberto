package com.example.usuario.u5_r5_empresa_alberto.UI;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.usuario.u5_r5_empresa_alberto.Empresa.basedatos.Bd;

/**
 * Created by usuario on 23/11/17.
 */

public class EmpresaPageAdapter extends FragmentPagerAdapter {

    private Context context;

    public EmpresaPageAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:

                return new EmpleadosFragment();
            case 1:
                return new JefeFragment();

            case 2:
                return new InsertarPersonaFragment();



        }
        return null;
    }



    @Override
    public int getCount() {
        return 3;
    }




    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Ver Empleados("+ Bd.getEmpleados().size()+")";
            case 1:
                return "Ver jefes("+Bd.getJefes().size()+")";
            case 2:
                return "Insertar Empleado";
        }

        return null;

    }
}
