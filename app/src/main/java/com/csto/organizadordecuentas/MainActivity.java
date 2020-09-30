package com.csto.organizadordecuentas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView Asignaturas;
    ArrayList<String> as=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Asignaturas=(ListView)findViewById(R.id.ListaA);

        as.add("Internet de las cosas");
        as.add("Ingles");
        as.add("Programacion en android");
        as.add("Taller de preparacion laboral");
        as.add("Arquitectura de sistemas");
        as.add("Administracion para el emprendimiento");

        ArrayAdapter<String>Adaptador=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,as);
        Asignaturas.setAdapter(Adaptador);
        Asignaturas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Asignar=Asignaturas.getItemAtPosition(position).toString();
                if(Asignar=="Internet de las cosas"){
                    Intent I=new Intent(getApplicationContext(),Internet_de_las_Cosas.class);
                    startActivity(I);
                }
                if(Asignar=="Ingles"){
                    Intent I=new Intent(getApplicationContext(),Ingles_2.class);
                    startActivity(I);
                }
                if(Asignar=="Programacion en android"){
                    Intent I=new Intent(getApplicationContext(),Programacion_Android.class);
                    startActivity(I);
                }
                if(Asignar=="Taller de preparacion laboral"){
                    Intent I=new Intent(getApplicationContext(),Preparacion_Laboral.class);
                    startActivity(I);
                }
                if(Asignar=="Arquitectura de sistemas"){
                    Intent I=new Intent(getApplicationContext(),Arquitectura_Sistemas.class);
                    startActivity(I);
                }
                if(Asignar=="Administracion para el emprendimiento"){
                    Intent I=new Intent(getApplicationContext(),Adiministracion_Emprendimiento.class);
                    startActivity(I);
                }
            }
        });





    }
}
