package com.example.gmailinterfazingrid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PrincipalFragment extends Fragment {

    ArrayList<Principal> listaprincipal;
    private RecyclerView recyclerPrincipal;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_principal,container,false);

        listaprincipal=new ArrayList<>();
        recyclerPrincipal=(RecyclerView) view.findViewById(R.id.PrincipalRecycler);
        recyclerPrincipal.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarPrincipal();
        AdaptadorPrincipal adapter= new AdaptadorPrincipal(listaprincipal);
        recyclerPrincipal.setAdapter(adapter);
        return view;
    }

    public void llenarPrincipal(){
        //this.nombre = nombre;
      //  Titulo = titulo;
       // Mnesaje = mnesaje;
      //  Hora = hora;
      //  this.foto = foto;
        listaprincipal.add(new Principal("German Alvarez","Avance Proyecto","Adjunto el avance que se me solicito del proyecto","25 jul.", R.drawable.german_alvarez));
        listaprincipal.add(new Principal("Cristhian Briones","Capitulo 120 HunterxHunter","Cristhian Briones ha enviado un archivo mp4","24 jul.", R.drawable.cristhian_briones));
        listaprincipal.add(new Principal("Jose Cordero","Pi 8vo Grupo 1 App Comida","Jose Cordero ha resuelto comentarios al siguie...","23 jul.", R.drawable.jose_cordero));
        listaprincipal.add(new Principal("Paola Morales","Pi 8vo Grupo 1 App Comida","Paola Morales ha resuelto comentarios al siguie...","23 jul.", R.drawable.paola_morales));
        listaprincipal.add(new Principal("Suanny Tigselema","Actividades Formativas S7","sunny.tigselema2016@uteq.edu.ec te ha invitado...","22 jul.", R.drawable.suanny_tigselema));
        listaprincipal.add(new Principal("Joselyn Vergara","Acta de calificación","Adjunto el formato de las actas de calificación para...","21 jul.", R.drawable.joselyn));
        listaprincipal.add(new Principal("Karina Ordoñez","Acta de calificación","Adjunto el formato de las actas de calificación para...","20 jul.", R.drawable.karina));
        listaprincipal.add(new Principal("Manuel Celi","En este momento: Manuel Celi te acaba de invitar...","Manuel Celi te ha invitado a unirte a una video...","19 jul.", R.drawable.kike));

    }
}
