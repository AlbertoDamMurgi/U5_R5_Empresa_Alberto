package com.example.usuario.u5_r5_empresa_alberto.UI;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

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
                return new EmpleadosFragment();



        }
        return null;
    }


    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Ver Empleados";
            case 1:
                return "empleados 2";
        }

        return null;

    }
}
