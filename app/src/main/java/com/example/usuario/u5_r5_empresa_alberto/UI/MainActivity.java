package com.example.usuario.u5_r5_empresa_alberto.UI;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.usuario.u5_r5_empresa_alberto.Empresa.Empleado;
import com.example.usuario.u5_r5_empresa_alberto.Empresa.basedatos.Bd;
import com.example.usuario.u5_r5_empresa_alberto.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        rellenarDatos();


        ViewPager pager = (ViewPager) findViewById(R.id.pager);

        EmpresaPageAdapter adapter = new EmpresaPageAdapter(getApplicationContext(),getSupportFragmentManager());

        pager.setAdapter(adapter);

        TabLayout layout = (TabLayout) findViewById(R.id.tab_layout);

        layout.setupWithViewPager(pager);



    }

    public void rellenarDatos(){

        Bd.addEmpleado(new Empleado("1234","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("1235","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("12336","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("12337","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("12338","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("1239","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("1231","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("1232","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("12333","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("1234","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("1235","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("12336","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("1237","pepe","alferez","gerente","inspeccion"));
        Bd.addEmpleado(new Empleado("12338","pepe","alferez","gerente","inspeccion"));



    }


}
