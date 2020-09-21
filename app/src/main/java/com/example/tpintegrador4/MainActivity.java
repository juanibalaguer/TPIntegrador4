package com.example.tpintegrador4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Inmueble> inmuebles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public void generarListView() {
        ArrayAdapter<Inmueble> adapter = new ListaAdapter(this, R.layout.inmueble, inmuebles, getLayoutInflater());
        ListView lvInmuebles = findViewById(R.id.lvInmuebles);
        lvInmuebles.setAdapter(adapter);
    }

    public void cargarDatos() {
        inmuebles.add(new Inmueble(R.drawable.casa1, "Juana Koslay", 80000));
        inmuebles.add(new Inmueble(R.drawable.casa2, "Potrero", 90000));
        inmuebles.add(new Inmueble(R.drawable.casa3, "El Trapiche", 85000));
    }
}