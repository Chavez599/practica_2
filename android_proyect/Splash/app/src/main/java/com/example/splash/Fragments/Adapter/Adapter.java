package com.example.splash.Fragments.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splash.Fragments.Models.contact;
import com.example.splash.R;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.VH> implements View.OnClickListener {

    List<contact> contactos;

    public Adapter(List<contact> contactos) {
        this.contactos = contactos;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        VH vh = new VH(view);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {

        String name = contactos.get( position ).getName();
        int img = contactos.get( position ).getImg();

        holder.nombre.setText(name);
        holder.perfil.setImageResource( img );

    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    @Override
    public void onClick(View view) {

    }

    public class VH extends RecyclerView.ViewHolder {
        TextView nombre;
        ImageView perfil;

        public VH(@NonNull View v) {
            super( v );
            nombre  = v.findViewById( R.id.nameUser );
            perfil = v.findViewById( R.id.profile );
        }
    }
}
