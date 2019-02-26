package com.example.a16carlospr.proyectoalimentos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by a16carlospr on 08/02/2019.
 */

public class BDHelper extends SQLiteOpenHelper {

    String SQLCrear1 = "CREATE TABLE if not exists Cereales (nombre VARCHAR(25) primary key, azucar float, grasa float, sodio float)";
    String SQLCrear2 = "CREATE TABLE if not exists Bebidas (nombre VARCHAR(25) primary key, azucar float, grasa float, sodio float)";
    String SQLCrear3 = "CREATE TABLE if not exists Frutas (nombre VARCHAR(25) primary key, azucar float, grasa float, sodio float)";
    String SQLCrear4 = "CREATE TABLE if not exists Legumbres (nombre VARCHAR(25) primary key, azucar float, grasa float, sodio float)";
    String SQLCrear5 = "CREATE TABLE if not exists Lacteos (nombre VARCHAR(25) primary key, azucar float, grasa float, sodio float)";
    String SQLCrear6 = "CREATE TABLE if not exists Huevos (nombre VARCHAR(25) primary key, azucar float, grasa float, sodio float)";
    String SQLCrear7 = "CREATE TABLE if not exists Semillas (nombre VARCHAR(25) primary key, azucar float, grasa float, sodio float)";
    String SQLCrear8 = "CREATE TABLE if not exists Verduras (nombre VARCHAR(25) primary key, azucar float, grasa float, sodio float)";


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
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}

