package com.example.recycler.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler.R;
import com.example.recycler.models.contact;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.VH> {

    List<contact> contactos;

    public Adapter(List<contact> contactos) {
        this.contactos = contactos;
    }



    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.item,parent, false );
        VH vh = new VH (view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
     String name = contactos.get( position ).getName();
     int img = contactos.get( position ).getImg();
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        public VH(@NonNull View itemView) {
            super( itemView );
        }
    }
}
