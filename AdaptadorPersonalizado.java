package com.example.a16carlospr.proyectoalimentos;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by a16carlospr on 15/01/2019.
 */

public class AdaptadorPersonalizado extends ArrayAdapter {
    private Activity context;
    private ArrayList<Alimentos> alimentos;

    public AdaptadorPersonalizado(Activity context, ArrayList<Alimentos> alimentos) {
        super(context, R.layout.fila_layout, alimentos);
        this.context = context;
        this.alimentos = alimentos;
    }



    public View getView (int pos, View view, ViewGroup parent) {
        LayoutInflater layoutinflater = context.getLayoutInflater();
        View fila = layoutinflater.inflate(R.layout.fila_layout, null);

        ImageView imgAlimento = (ImageView) fila.findViewById(R.id.imgAlimento);
        TextView tvAlimento = (TextView) fila.findViewById(R.id.tvAlimento);

        imgAlimento.setImageResource(alimentos.get(pos).getFoto());
        tvAlimento.setText(alimentos.get(pos).getNombre());

        return fila;
    }

}
