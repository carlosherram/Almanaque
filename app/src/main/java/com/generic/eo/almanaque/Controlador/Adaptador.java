package com.generic.eo.almanaque.Controlador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.generic.eo.almanaque.Modelo.ListItem;
import com.generic.eo.almanaque.R;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    ArrayList<ListItem> lista;

    LayoutInflater inflater;

    public Adaptador(ArrayList<ListItem> listItems, LayoutInflater inflater) {

        lista = listItems;

        this.inflater = inflater;

    }

    @Override
    public int getCount() {

        return lista.size();

    }

    @Override
    public Object getItem(int position) {

        return lista.get(position);

    }

    @Override
    public long getItemId(int position) {

        return position;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            convertView = inflater.inflate(R.layout.list_item, null);

        }

        ((TextView) convertView.findViewById(R.id.tvNombre)).setText(
                lista.get(position).getNombre()
        );

        ((TextView) convertView.findViewById(R.id.tvValor)).setText(
                lista.get(position).getValor()
        );

        return convertView;

    }

}
