package com.example.splash.Fragments.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splash.Fragments.Models.contact;
import com.example.splash.R;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.VH>  {

    List<contact> contactos;

    public Adapter(List<contact> contactos) {
        this.contactos = contactos;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      /*  View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.i);
        VH vh = new VH(view);*/
        return null;

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.VH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class VH extends RecyclerView.ViewHolder {
        public VH(@NonNull View itemView) {
            super( itemView );
        }
    }
}
