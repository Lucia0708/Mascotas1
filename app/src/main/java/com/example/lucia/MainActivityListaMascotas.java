package com.example.lucia.mascotas;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivityListaMascotas extends AppCompatActivity {

    // Clase principal del Proyecto

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista_mascotas);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        agregarFAB();
        iraFavoritos();
        inicializarListaMascotas();
        inicializarAdaptador();
    }


    public void inicializarAdaptador() {
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.connor, "Connor", "0"));
        mascotas.add(new Mascota(R.drawable.bolita, "Bolita", "0"));
        mascotas.add(new Mascota(R.drawable.bunny, "Bunny", "0"));
        mascotas.add(new Mascota(R.drawable.paloma, "Paloma", "0"));
        mascotas.add(new Mascota(R.drawable.shuly, "Shuly", "0"));
    }

    public void agregarFAB (){
        FloatingActionButton miFAB = (FloatingActionButton) findViewById(R.id.fab);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent intent = new Intent(MainActivityListaMascotas.this, MascotasFavoritas.class );
              //  startActivity(intent);
            }
        });
    }
    public void iraFavoritos (){
        ImageButton misFavoritos = (ImageButton) findViewById(R.id.ib_favoritos);
        misFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaMascotas.this, MascotasFavoritas.class );
                startActivity(intent);
            }
        });
    }

}
