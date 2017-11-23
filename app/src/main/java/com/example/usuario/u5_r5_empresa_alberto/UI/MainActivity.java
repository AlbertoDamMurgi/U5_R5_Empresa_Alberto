package com.example.usuario.u5_r5_empresa_alberto.UI;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.usuario.u5_r5_empresa_alberto.Empresa.Empleado;
import com.example.usuario.u5_r5_empresa_alberto.Empresa.Jefe;
import com.example.usuario.u5_r5_empresa_alberto.Empresa.basedatos.Bd;
import com.example.usuario.u5_r5_empresa_alberto.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);




        if(savedInstanceState==null) {


            rellenarDatos();


        }

            ViewPager pager = (ViewPager) findViewById(R.id.pager);

            PagerAdapter adapter = new EmpresaPageAdapter(getApplicationContext(), getSupportFragmentManager());

            pager.setAdapter(adapter);

            TabLayout layout = (TabLayout) findViewById(R.id.tab_layout);

            layout.setupWithViewPager(pager);









    }



    public void rellenarDatos(){

        Bd.addEmpleado(new Empleado("178461234","pepe","alferez","fantasma","aguila"));
        Bd.addEmpleado(new Empleado("122589635","juan","fernandez","pelochofake","toc"));
        Bd.addEmpleado(new Empleado("123211336","santi","fatter","gordo","masterchef"));
        Bd.addEmpleado(new Empleado("123987737","jef","chef","asdasd","asdasdad"));
        Bd.addEmpleado(new Empleado("126543338","joaquin","gokin","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("123756759","daniel","ruido","scout","nudos"));
        Bd.addEmpleado(new Empleado("123141231","juanma","main","thread","seo"));
        Bd.addEmpleado(new Empleado("123212312","ronald","cuba","gerente","inspeccion"));


        Bd.addJefe(new Jefe("1784234","jefe1","alferez", new ArrayList<Empleado>(),"fantasma"));
        Bd.addJefe(new Jefe("1229635","jefe2","fernandez",new ArrayList<Empleado>(),"toc"));
        Bd.addJefe(new Jefe("1232336","jefe3","fatter",new ArrayList<Empleado>(),"masterchef"));
        Bd.addJefe(new Jefe("1987737","jefe4","chef",new ArrayList<Empleado>(),"asdasdad"));
        Bd.addJefe(new Jefe("1543338","jefe5","gokin",new ArrayList<Empleado>(),"inspeccion"));
        Bd.addJefe(new Jefe("3141231","jefe6","main",new ArrayList<Empleado>(),"seo"));
        Bd.addJefe(new Jefe("1212312","jefe7","cuba",new ArrayList<Empleado>(),"inspeccion"));
        Bd.getJefes().get(1).addEmpleado(Bd.getEmpleados().get(1));

    }


}
