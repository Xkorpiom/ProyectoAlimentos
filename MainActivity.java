package com.example.a16carlospr.proyectoalimentos;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    private String BDname;
    private int BDversion;
    private SQLiteDatabase BDAlimentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BDname ="BDAlimentos";
        BDversion =1;
        BDHelper bdHelper = new BDHelper(this, BDname, null , BDversion);
        BDAlimentos=bdHelper.getWritableDatabase();

        //BDAlimentos.execSQL("INSERT INTO Cereales (nombre , azucar, grasa, sodio) VALUES ('Arroz Blanco', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Cereales (nombre , azucar, grasa, sodio) VALUES ('Fideos', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Cereales (nombre , azucar, grasa, sodio) VALUES ('Galletas', 2, 4, 6)");

        //BDAlimentos.execSQL("INSERT INTO Bebidas (nombre , azucar, grasa, sodio) VALUES ('Agua', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Bebidas (nombre , azucar, grasa, sodio) VALUES ('Alcohol', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Bebidas (nombre , azucar, grasa, sodio) VALUES ('Kas Naranja', 2, 4, 6)");

        //BDAlimentos.execSQL("INSERT INTO Frutas (nombre , azucar, grasa, sodio) VALUES ('Platano', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Frutas (nombre , azucar, grasa, sodio) VALUES ('Fruta', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Frutas (nombre , azucar, grasa, sodio) VALUES ('Manzana', 2, 4, 6)");

        //BDAlimentos.execSQL("INSERT INTO Huevos (nombre , azucar, grasa, sodio) VALUES ('Gallina', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Huevos (nombre , azucar, grasa, sodio) VALUES ('Pato', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Huevos (nombre , azucar, grasa, sodio) VALUES ('Avestruz', 2, 4, 6)");

        //BDAlimentos.execSQL("INSERT INTO Lacteos (nombre , azucar, grasa, sodio) VALUES ('Yogur', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Lacteos (nombre , azucar, grasa, sodio) VALUES ('Leche', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Lacteos (nombre , azucar, grasa, sodio) VALUES ('Natillas', 2, 4, 6)");

        //BDAlimentos.execSQL("INSERT INTO Legumbres (nombre , azucar, grasa, sodio) VALUES ('Soja', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Legumbres (nombre , azucar, grasa, sodio) VALUES ('Lenteja', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Legumbres (nombre , azucar, grasa, sodio) VALUES ('Garbanzo', 2, 4, 6)");

        //BDAlimentos.execSQL("INSERT INTO Semillas (nombre , azucar, grasa, sodio) VALUES ('Pipas de calabaza', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Semillas (nombre , azucar, grasa, sodio) VALUES ('Pipas de girasol', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Semillas (nombre , azucar, grasa, sodio) VALUES ('Semillas de chia', 2, 4, 6)");

        //BDAlimentos.execSQL("INSERT INTO Verduras (nombre , azucar, grasa, sodio) VALUES ('Canónigos', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Verduras (nombre , azucar, grasa, sodio) VALUES ('Acelgas', 2, 4, 6)");
        //BDAlimentos.execSQL("INSERT INTO Verduras (nombre , azucar, grasa, sodio) VALUES ('Coles', 2, 4, 6)");

        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(i);
            }
        });
    }
}
