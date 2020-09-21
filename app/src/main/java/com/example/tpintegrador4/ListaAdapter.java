package com.example.tpintegrador4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListaAdapter extends ArrayAdapter<Inmueble> {

    private Context context;
    private List<Inmueble> inmuebles;
    private LayoutInflater layoutInflater;
    public ListaAdapter(@NonNull Context context, int resource, @NonNull List<Inmueble> objects, LayoutInflater layoutInflater) {
        super(context, resource, objects);
        this.context = context;
        this.inmuebles = objects;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View inmuebleView = convertView;
        if (inmuebleView == null) {
            inmuebleView = layoutInflater.inflate(R.layout.inmueble, parent, false);
        }
        Inmueble inmueble = inmuebles.get(position);

        ImageView ivFoto = inmuebleView.findViewById(R.id.ivFoto);
        ivFoto.setImageResource(inmueble.getFoto());

        TextView tvDireccion = inmuebleView.findViewById(R.id.tvDireccion);
        tvDireccion.setText(inmueble.getDireccion());

        TextView tvPrecio = inmuebleView.findViewById(R.id.tvPrecio);
        tvPrecio.setText(inmueble.getPrecio() + "");

        return inmuebleView;
    }
}
