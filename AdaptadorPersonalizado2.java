package com.example.a16carlospr.proyectoalimentos;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by a16carlospr on 15/01/2019.
 */

public class AdaptadorPersonalizado2 extends ArrayAdapter {
    private Activity context;
    private ArrayList<Alimentos2> alimentos;


    public AdaptadorPersonalizado2(Activity context, ArrayList<Alimentos2> alimentos) {
        super(context, R.layout.fila_layout, alimentos);
        this.context = context;
        this.alimentos = alimentos;
    }



    public View getView (int pos, View view, ViewGroup parent) {
        LayoutInflater layoutinflater = context.getLayoutInflater();
        View fila = layoutinflater.inflate(R.layout.fila_layout2, null);

        ImageView imgAlimento = (ImageView) fila.findViewById(R.id.imgAlimento);
        TextView tvAlimento = (TextView) fila.findViewById(R.id.tvAlimento);
        TextView tvazucar = (TextView) fila.findViewById(R.id.tvazucar);
        TextView tvgrasa = (TextView) fila.findViewById(R.id.tvgrasa);
        TextView tvsodio = (TextView) fila.findViewById(R.id.tvsodio);

        imgAlimento.setImageResource(alimentos.get(pos).getFoto());
        tvAlimento.setText(alimentos.get(pos).getNombre());
        tvazucar.setText(String.valueOf(alimentos.get(pos).getAzucar()));
        tvgrasa.setText(String.valueOf(alimentos.get(pos).getGrasa()));
        tvsodio.setText(String.valueOf(alimentos.get(pos).getSodio()));

        return fila;
    }

}
