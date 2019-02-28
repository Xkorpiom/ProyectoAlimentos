package com.example.a16carlospr.proyectoalimentos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.Settings;
import android.util.Log;

/**
 * Created by a16carlospr on 08/02/2019.
 */

public class BDHelper extends SQLiteOpenHelper {

    private String BDname;
    private int BDversion;
    private SQLiteDatabase BDAlimentos;





    String SQLCrear1 = "CREATE TABLE if not exists Cereales (id Integer primary key, nombre VARCHAR(25), azucar float, grasa float, sodio float)";
    String SQLCrear2 = "CREATE TABLE if not exists Bebidas (id Integer primary key, nombre VARCHAR(25), azucar float, grasa float, sodio float)";
    String SQLCrear3 = "CREATE TABLE if not exists Fruta (id Integer primary key, nombre VARCHAR(25), azucar float, grasa float, sodio float)";
    String SQLCrear4 = "CREATE TABLE if not exists Legumbres (id Integer primary key, nombre VARCHAR(25), azucar float, grasa float, sodio float)";
    String SQLCrear5 = "CREATE TABLE if not exists Lacteos (id Integer primary key, nombre VARCHAR(25), azucar float, grasa float, sodio float)";
    String SQLCrear6 = "CREATE TABLE if not exists Huevos (id Integer primary key, nombre VARCHAR(25), azucar float, grasa float, sodio float)";
    String SQLCrear7 = "CREATE TABLE if not exists Semillas (id Integer primary key, nombre VARCHAR(25), azucar float, grasa float, sodio float)";
    String SQLCrear8 = "CREATE TABLE if not exists Verduras (id Integer primary key, nombre VARCHAR(25), azucar float, grasa float, sodio float)";


    static final int DB_VERSION = 1;


    public BDHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQLCrear1);
        db.execSQL(SQLCrear2);
        db.execSQL(SQLCrear3);
        db.execSQL(SQLCrear4);
        db.execSQL(SQLCrear5);
        db.execSQL(SQLCrear6);
        db.execSQL(SQLCrear7);
        db.execSQL(SQLCrear8);

        db.execSQL("INSERT INTO Cereales (id, nombre , azucar, grasa, sodio) VALUES (1, 'Arroz Blanco', 0.2, 0.21, 6)");
        db.execSQL("INSERT INTO Cereales (id, nombre , azucar, grasa, sodio) VALUES (2, 'Fideos', 35, 0, 5)");
        db.execSQL("INSERT INTO Cereales (id, nombre , azucar, grasa, sodio) VALUES (3, 'Galletas', 38, 0, 10.3)");

        db.execSQL("INSERT INTO Bebidas (id, nombre , azucar, grasa, sodio) VALUES (1, 'Agua', 0, 0, 0)");
        db.execSQL("INSERT INTO Bebidas (id, nombre , azucar, grasa, sodio) VALUES (2, 'Vodka', 0, 0, 1)");
        db.execSQL("INSERT INTO Bebidas (id, nombre , azucar, grasa, sodio) VALUES (3, 'Tonica', 9.5, 0, 2)");

        db.execSQL("INSERT INTO Fruta (id, nombre , azucar, grasa, sodio) VALUES (1, 'Platano', 12, 0.11, 1)");
        db.execSQL("INSERT INTO Fruta (id, nombre , azucar, grasa, sodio) VALUES (2, 'Pomelo', 2, 0, 1)");
        db.execSQL("INSERT INTO Fruta (id, nombre , azucar, grasa, sodio) VALUES (3, 'Manzana', 10, 0.2, 2)");

        db.execSQL("INSERT INTO Huevos (id, nombre , azucar, grasa, sodio) VALUES (1, 'Codorniz', 0.4, 3.6, 141)");
        db.execSQL("INSERT INTO Huevos (id, nombre , azucar, grasa, sodio) VALUES (2, 'Gallina clara cruda', 0.3, 0, 160)");
        db.execSQL("INSERT INTO Huevos (id, nombre , azucar, grasa, sodio) VALUES (3, 'Gallina yema cruda', 2.3, 0.4, 50)");

        db.execSQL("INSERT INTO Lacteos (id, nombre , azucar, grasa, sodio) VALUES (1, 'Cuajada', 6.6, 2.9, 64)");
        db.execSQL("INSERT INTO Lacteos (id, nombre , azucar, grasa, sodio) VALUES (2, 'Requeson', 3.3, 20.45, 230)");
        db.execSQL("INSERT INTO Lacteos (id, nombre , azucar, grasa, sodio) VALUES (3, 'Yogur griego', 5.4, 6.8, 71)");

        db.execSQL("INSERT INTO Legumbres (id, nombre , azucar, grasa, sodio) VALUES (1, 'Avellana', 4.34, 4.91, 6)");
        db.execSQL("INSERT INTO Legumbres (id, nombre , azucar, grasa, sodio) VALUES (2, 'Haba fresca', 0.4, 0.05, 120)");
        db.execSQL("INSERT INTO Legumbres (id, nombre , azucar, grasa, sodio) VALUES (3, 'Pipa de calabaza', 0, 8.84, 7)");

        db.execSQL("INSERT INTO Semillas (id, nombre , azucar, grasa, sodio) VALUES (1, 'Tofu', 0.3, 0.8, 7)");
        db.execSQL("INSERT INTO Semillas (id, nombre , azucar, grasa, sodio) VALUES (2, 'Chufa', 14.7, 4.01, 37.63)");
        db.execSQL("INSERT INTO Semillas (id, nombre , azucar, grasa, sodio) VALUES (3, 'Soja', 5.67, 0.79, 15)");

        db.execSQL("INSERT INTO Verduras (id, nombre , azucar, grasa, sodio) VALUES (1, 'Ajo', 2.21, 0.05, 19)");
        db.execSQL("INSERT INTO Verduras (id, nombre , azucar, grasa, sodio) VALUES (2, 'Acelgas', 1.1, 0, 213)");
        db.execSQL("INSERT INTO Verduras (id, nombre , azucar, grasa, sodio) VALUES (3, 'Grelo', 0.1, 0.05, 10)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}

