package com.example.gmailinterfazingrid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPrincipal extends RecyclerView.Adapter<AdaptadorPrincipal.ViewHolderPrincipal> {

    ArrayList<Principal> listamensajesprincipal;

    public AdaptadorPrincipal(ArrayList<Principal> listamensajesprincipal) {
        this.listamensajesprincipal = listamensajesprincipal;
    }


    @Override
    public ViewHolderPrincipal onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.filarecibido,null,false);
        return new ViewHolderPrincipal(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderPrincipal holder, int position) {
        holder.txtNombre.setText(listamensajesprincipal.get(position).getNombre());
        holder.txtTitulo.setText(listamensajesprincipal.get(position).getTitulo());
        holder.txtMensaje.setText(listamensajesprincipal.get(position).getMnesaje());
        holder.txtHora.setText(listamensajesprincipal.get(position).getHora());
        holder.foto.setImageResource(listamensajesprincipal.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listamensajesprincipal.size();
    }

    public class ViewHolderPrincipal extends RecyclerView.ViewHolder {
        TextView txtNombre, txtTitulo, txtMensaje, txtHora;
        ImageView foto;
        public ViewHolderPrincipal( View itemView) {
            super(itemView);
            txtNombre=(TextView)itemView.findViewById(R.id.PrinNombre);
            txtTitulo=(TextView)itemView.findViewById(R.id.PrinTitulo);
            txtMensaje=(TextView)itemView.findViewById(R.id.PrinMensaje);
            txtHora=(TextView)itemView.findViewById(R.id.PrinHora);
            foto=(ImageView) itemView.findViewById(R.id.imgFotoPrin);
        }
    }
}
