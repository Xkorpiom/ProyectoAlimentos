package com.example.a16carlospr.proyectoalimentos;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    ListView lv1;
    private String BDname;
    private int BDversion;
    private SQLiteDatabase BDAlimentos;
    String nombre;
    Cursor result;
    final ArrayList<Alimentos> alimentos = new ArrayList<>();
    Integer elegir;
    AutoCompleteTextView actv1;
    float azucar, grasas, sodio;
    String cereales = "Cereales";
    String bebidas = "Bebidas";
    final ArrayList<String> alimentos2 = new ArrayList<>();
    Object items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        BDname ="BDAlimentos";
        BDversion =1;
        BDHelper bdHelper = new BDHelper(this, BDname, null , BDversion);
        BDAlimentos=bdHelper.getWritableDatabase();


        actv1 = (AutoCompleteTextView) findViewById(R.id.actv1);




        lv1 = (ListView) findViewById(R.id.lv1);
        actv1 = (AutoCompleteTextView)findViewById(R.id.actv1);

        elegir = getIntent().getExtras().getInt("numero");
        if (elegir==1) {

            result = BDAlimentos.rawQuery("Select nombre from Cereales", null);
            while (result.moveToNext()) {
                nombre = result.getString(0);
                alimentos.add(new Alimentos(R.drawable.cereales, nombre));
            }
            result.close();
            AdaptadorPersonalizado ada = new AdaptadorPersonalizado(Main4Activity.this, alimentos);
            lv1.setAdapter(ada);



            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    position = position+1;
                    result = BDAlimentos.rawQuery("Select nombre, azucar, grasa, sodio from Cereales where id='" + position + "'", null);
                    while (result.moveToNext()) {
                        nombre = result.getString(0);
                        azucar = result.getFloat(1);
                        grasas = result.getFloat(2);
                        sodio = result.getFloat(3);
                    }

                    result.close();

                    AlertDialog.Builder ventana = new AlertDialog.Builder(Main4Activity.this);
                    ventana.setTitle("Información de: "+nombre);
                    ventana.setMessage("Azucar:"+azucar+"  Grasa:"+grasas+ "  Sodio:"+sodio);
                    ventana.setIcon(R.drawable.bebida);
                    ventana.setCancelable(false);
                    ventana.setPositiveButton("Añadir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle parametros = new Bundle();
                            parametros.putString("nombre", nombre);
                            parametros.putString("tipo", cereales);
                            Intent i = new Intent(Main4Activity.this, Main3Activity.class);
                            i.putExtras(parametros);
                            startActivity(i);
                        }
                    });
                    ventana.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.show();
                }
            });


        }
        if (elegir==2) {
            result = BDAlimentos.rawQuery("Select nombre from Bebidas", null);
            while (result.moveToNext()) {
                nombre = result.getString(0);
                alimentos.add(new Alimentos(R.drawable.bebida, nombre));
            }
            result.close();
            AdaptadorPersonalizado ada = new AdaptadorPersonalizado(Main4Activity.this, alimentos);
            lv1.setAdapter(ada);

            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    position = position+1;
                    result = BDAlimentos.rawQuery("Select nombre, azucar, grasa, sodio from Bebidas where id='" + position + "'", null);
                    while (result.moveToNext()) {
                        nombre = result.getString(0);
                        azucar = result.getFloat(1);
                        grasas = result.getFloat(2);
                        sodio = result.getFloat(3);
                    }
                    result.close();

                    AlertDialog.Builder ventana = new AlertDialog.Builder(Main4Activity.this);
                    ventana.setTitle("Información de: "+nombre);
                    ventana.setMessage("Azucar:"+azucar+"  Grasa:"+grasas+ "  Sodio:"+sodio);
                    ventana.setIcon(R.drawable.bebida);
                    ventana.setCancelable(false);
                    ventana.setPositiveButton("Añadir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle parametros = new Bundle();
                            parametros.putString("nombre", nombre);
                            parametros.putString("tipo", bebidas);
                            Intent i = new Intent(Main4Activity.this, Main3Activity.class);
                            i.putExtras(parametros);
                            startActivity(i);
                        }
                    });
                    ventana.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.show();
                }
            });
        }
        if (elegir==3) {
            result = BDAlimentos.rawQuery("Select nombre from Legumbres", null);
            while (result.moveToNext()) {
                nombre = result.getString(0);
                alimentos.add(new Alimentos(R.drawable.legumbres, nombre));
            }
            result.close();
            AdaptadorPersonalizado ada = new AdaptadorPersonalizado(Main4Activity.this, alimentos);
            lv1.setAdapter(ada);

            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    position = position+1;
                    result = BDAlimentos.rawQuery("Select nombre, azucar, grasa, sodio from Legumbres where id='" + position + "'", null);
                    while (result.moveToNext()) {
                        nombre = result.getString(0);
                        azucar = result.getFloat(1);
                        grasas = result.getFloat(2);
                        sodio = result.getFloat(3);
                    }
                    result.close();

                    AlertDialog.Builder ventana = new AlertDialog.Builder(Main4Activity.this);
                    ventana.setTitle("Información de: "+nombre);
                    ventana.setMessage("Azucar:"+azucar+"  Grasa:"+grasas+ "  Sodio:"+sodio);
                    ventana.setIcon(R.drawable.bebida);
                    ventana.setCancelable(false);
                    ventana.setPositiveButton("Añadir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.show();
                }
            });
        }
        if (elegir==4) {
            result = BDAlimentos.rawQuery("Select nombre from Lacteos", null);
            while (result.moveToNext()) {
                nombre = result.getString(0);
                alimentos.add(new Alimentos(R.drawable.lacteos, nombre));
            }
            result.close();
            AdaptadorPersonalizado ada = new AdaptadorPersonalizado(Main4Activity.this, alimentos);
            lv1.setAdapter(ada);

            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    position = position+1;
                    result = BDAlimentos.rawQuery("Select nombre, azucar, grasa, sodio from Lacteos where id='" + position + "'", null);
                    while (result.moveToNext()) {
                        nombre = result.getString(0);
                        azucar = result.getFloat(1);
                        grasas = result.getFloat(2);
                        sodio = result.getFloat(3);
                    }
                    result.close();

                    AlertDialog.Builder ventana = new AlertDialog.Builder(Main4Activity.this);
                    ventana.setTitle("Información de: "+nombre);
                    ventana.setMessage("Azucar:"+azucar+"  Grasa:"+grasas+ "  Sodio:"+sodio);
                    ventana.setIcon(R.drawable.bebida);
                    ventana.setCancelable(false);
                    ventana.setPositiveButton("Añadir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.show();
                }
            });
        }
        if (elegir==5) {
            result = BDAlimentos.rawQuery("Select nombre from Verduras", null);
            while (result.moveToNext()) {
                nombre = result.getString(0);
                alimentos.add(new Alimentos(R.drawable.verduras, nombre));
            }
            result.close();
            AdaptadorPersonalizado ada = new AdaptadorPersonalizado(Main4Activity.this, alimentos);
            lv1.setAdapter(ada);

            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    position = position+1;
                    result = BDAlimentos.rawQuery("Select nombre, azucar, grasa, sodio from Verduras where id='" + position + "'", null);
                    while (result.moveToNext()) {
                        nombre = result.getString(0);
                        azucar = result.getFloat(1);
                        grasas = result.getFloat(2);
                        sodio = result.getFloat(3);
                    }
                    result.close();

                    AlertDialog.Builder ventana = new AlertDialog.Builder(Main4Activity.this);
                    ventana.setTitle("Información de: "+nombre);
                    ventana.setMessage("Azucar:"+azucar+"  Grasa:"+grasas+ "  Sodio:"+sodio);
                    ventana.setIcon(R.drawable.bebida);
                    ventana.setCancelable(false);
                    ventana.setPositiveButton("Añadir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.show();
                }
            });
        }
        if (elegir==6) {
            result = BDAlimentos.rawQuery("Select nombre from Semillas", null);
            while (result.moveToNext()) {
                nombre = result.getString(0);
                alimentos.add(new Alimentos(R.drawable.semillas, nombre));
            }
            result.close();
            AdaptadorPersonalizado ada = new AdaptadorPersonalizado(Main4Activity.this, alimentos);
            lv1.setAdapter(ada);

            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    position = position+1;
                    result = BDAlimentos.rawQuery("Select nombre, azucar, grasa, sodio from Semillas where id='" + position + "'", null);
                    while (result.moveToNext()) {
                        nombre = result.getString(0);
                        azucar = result.getFloat(1);
                        grasas = result.getFloat(2);
                        sodio = result.getFloat(3);
                    }
                    result.close();

                    AlertDialog.Builder ventana = new AlertDialog.Builder(Main4Activity.this);
                    ventana.setTitle("Información de: "+nombre);
                    ventana.setMessage("Azucar:"+azucar+"  Grasa:"+grasas+ "  Sodio:"+sodio);
                    ventana.setIcon(R.drawable.bebida);
                    ventana.setCancelable(false);
                    ventana.setPositiveButton("Añadir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.show();
                }
            });
        }
        if (elegir==7) {
            result = BDAlimentos.rawQuery("Select nombre from Fruta", null);
            while (result.moveToNext()) {
                nombre = result.getString(0);
                alimentos.add(new Alimentos(R.drawable.frutas, nombre));
            }
            result.close();
            AdaptadorPersonalizado ada = new AdaptadorPersonalizado(Main4Activity.this, alimentos);
            lv1.setAdapter(ada);

            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    position = position+1;
                    result = BDAlimentos.rawQuery("Select nombre, azucar, grasa, sodio from Fruta where id='" + position + "'", null);
                    while (result.moveToNext()) {
                        nombre = result.getString(0);
                        azucar = result.getFloat(1);
                        grasas = result.getFloat(2);
                        sodio = result.getFloat(3);
                    }
                    result.close();

                    AlertDialog.Builder ventana = new AlertDialog.Builder(Main4Activity.this);
                    ventana.setTitle("Información de: "+nombre);
                    ventana.setMessage("Azucar:"+azucar+"  Grasa:"+grasas+ "  Sodio:"+sodio);
                    ventana.setIcon(R.drawable.bebida);
                    ventana.setCancelable(false);
                    ventana.setPositiveButton("Añadir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.show();
                }
            });
        }
        if (elegir==8) {
            result = BDAlimentos.rawQuery("Select nombre from Huevos", null);
            while (result.moveToNext()) {
                nombre = result.getString(0);
                alimentos.add(new Alimentos(R.drawable.huevos, nombre));
            }
            result.close();
            AdaptadorPersonalizado ada = new AdaptadorPersonalizado(Main4Activity.this, alimentos);
            lv1.setAdapter(ada);

            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    position = position+1;
                    result = BDAlimentos.rawQuery("Select nombre, azucar, grasa, sodio from Huevos where id='" + position + "'", null);
                    while (result.moveToNext()) {
                        nombre = result.getString(0);
                        azucar = result.getFloat(1);
                        grasas = result.getFloat(2);
                        sodio = result.getFloat(3);
                    }
                    result.close();

                    AlertDialog.Builder ventana = new AlertDialog.Builder(Main4Activity.this);
                    ventana.setTitle("Información de: "+nombre);
                    ventana.setMessage("Azucar:"+azucar+"  Grasa:"+grasas+ "  Sodio:"+sodio);
                    ventana.setIcon(R.drawable.bebida);
                    ventana.setCancelable(false);
                    ventana.setPositiveButton("Añadir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    ventana.show();
                }
            });
        }
    }
}
