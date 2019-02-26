package com.example.a16carlospr.proyectoalimentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class Main3Activity extends AppCompatActivity {

    Button btnañadir, btnvalorar;
    ListView lv1;
    String nombre;
    float azucar, grasas, sodio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnañadir = (Button)findViewById(R.id.btnañadir);
        btnvalorar = (Button)findViewById(R.id.btnvalorar);
        lv1 = (ListView) findViewById(R.id.lv1);


        Bundle parametros = this.getIntent().getExtras();
        nombre = parametros.getString("nombre");
        azucar = parametros.getFloat("azucar");
        grasas = parametros.getFloat("grasas");
        sodio = parametros.getFloat("sodio");
        tv2.setText(datos);

        btnañadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(i);
            }
        });
    }
}
