package com.example.recycler.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler.R;
import com.example.recycler.models.contact;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.VH> implements View.OnClickListener{

    List<contact> contactos;
    Context context;
    private View.OnClickListener listener;

    public Adapter(List<contact> contactos, Context context) {
        this.contactos = contactos;
        this.context = context;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        view.setOnClickListener( this );
        VH vh = new VH(view);
        return vh;
    }

    public void setOnClicklistener (View.OnClickListener listener) {
        this.listener = listener;
    }


    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {

        String name = contactos.get(position).getName();
        int    img  = contactos.get(position).getImg();


        holder.nombre.setText(name);
        holder.perfil.setImageResource(img);


    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    @Override
    public void onClick(View view) {
     listener.onClick( view );
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView nombre;
        ImageView perfil;
        public VH(@NonNull View v) {
            super(v);

            nombre = v.findViewById(R.id.nameUser);
            perfil = v.findViewById(R.id.profile);
        }
    }
}
