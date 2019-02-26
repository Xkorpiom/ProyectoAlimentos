package com.example.a16carlospr.proyectoalimentos;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    Button btnañadir, btnvalorar;
    ListView lv1;
    private String BDname;
    private int BDversion;
    Cursor result;
    private SQLiteDatabase BDAlimentos;
    String nombre;
    float azucar, grasas, sodio;
    final ArrayList<Alimentos2> alimentos2 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnañadir = (Button) findViewById(R.id.btnañadir);
        btnvalorar = (Button) findViewById(R.id.btnvalorar);
        lv1 = (ListView) findViewById(R.id.lv1);

        BDname = "BDAlimentos";
        BDversion = 1;
        BDHelper bdHelper = new BDHelper(this, BDname, null, BDversion);
        BDAlimentos = bdHelper.getWritableDatabase();


        Intent i = getIntent();
        String recuperado = i.getStringExtra("nombre");
        String recuperado2 = i.getStringExtra("tipo");

        if (recuperado != null) {

            Log.i("idk2", recuperado2);
            result = BDAlimentos.rawQuery("Select nombre, azucar, grasa, sodio from " + recuperado2 + " where nombre='" + recuperado + "'", null);
            Toast.makeText(Main3Activity.this, recuperado, Toast.LENGTH_SHORT).show();
            while (result.moveToNext()) {
                nombre = result.getString(0);
                azucar = result.getFloat(1);
                grasas = result.getFloat(2);
                sodio = result.getFloat(3);
            }
            alimentos2.add(new Alimentos2(R.drawable.cereales, nombre, azucar, grasas, sodio));

            AdaptadorPersonalizado2 ada = new AdaptadorPersonalizado2(Main3Activity.this, alimentos2);
            lv1.setAdapter(ada);
            result.close();

        }


        btnañadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(i);
            }
        });
    }
}
