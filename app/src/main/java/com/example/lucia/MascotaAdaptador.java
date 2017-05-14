package com.example.lucia.mascotas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Lucia on 12/05/2017.
 */
// Adaptador entre el RecyclerWiew y el CardView

public class MascotaAdaptador extends RecyclerView.Adapter <MascotaAdaptador.MascotaViewHolder> {
    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }
    //Inflar el layout y lo pasará al viewholder para el obtenga los views

    @Override
    public  MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }
    // asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombrecv.setText(mascota.getNombre());
        mascotaViewHolder.tvraitingcv.setText(mascota.getRaiting());



        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i;
             //   Toast.makeText(activity, "Diste like a " + mascota.getNombre() + mascota.getRaiting(), Toast.LENGTH_SHORT).show();
                i = Integer.parseInt(mascota.getRaiting());
                i = i + 1;
                mascota.setRaiting(String.valueOf(i));
            }
        });

        mascotaViewHolder.btnMuestraRaiting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvmuestraRaiting;
                int i;
                i = Integer.parseInt(mascota.getRaiting());
                mascotaViewHolder.tvraitingcv.setText(mascota.getRaiting());
            }
        });

    //   mascotaViewHolder.imgFoto.setOnClickListener(new View.OnClickListener() {
    //    @Override
    //    public void onClick(View v) {
    //        Intent intent = new Intent(activity, MascotasFavoritas.class );
    //         intent.putExtra("foto", mascota.getFoto());
    //        intent.putExtra ("nombre", mascota.getNombre());
    //       intent.putExtra("raiting", mascota.getRaiting());
    //      activity.startActivity(intent);
    //            }
    //      });
    }

    @Override
    public int getItemCount() {//cantidad de elementos que contiene mi lista de contactos
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFoto;
        private TextView tvNombrecv;
        private TextView  tvraitingcv;
        private ImageButton btnLike;
        private ImageButton btnMuestraRaiting;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto     = (ImageView) itemView.findViewById(R.id.imgMascotacv);
            tvNombrecv  = (TextView) itemView.findViewById(R.id.tvNombreMascotacv);
            tvraitingcv = (TextView) itemView.findViewById(R.id.tvTotRatingcv);
            btnLike     = (ImageButton) itemView.findViewById(R.id.hueso_blancocv);
            btnMuestraRaiting =(ImageButton) itemView.findViewById(R.id.hueso_amarillocv);
        }
    }
}
