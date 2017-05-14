package com.example.lucia.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;

    // Actividad para mostrar las mascotas favoritas


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarfav);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasfav);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();

        inicializarAdaptador();
    }
    public void inicializarAdaptador() {
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.shuly, "Shuly", "1"));
        mascotas.add(new Mascota(R.drawable.paloma, "Paloma", "1"));
        mascotas.add(new Mascota(R.drawable.bolita, "Bolita", "1"));
        mascotas.add(new Mascota(R.drawable.bunny, "Bunny", "1"));
        mascotas.add(new Mascota(R.drawable.connor, "Connor", "1"));
    }
}
