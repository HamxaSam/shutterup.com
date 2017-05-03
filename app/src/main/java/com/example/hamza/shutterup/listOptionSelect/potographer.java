package com.example.hamza.shutterup.listOptionSelect;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hamza.shutterup.R;
import com.example.hamza.shutterup.adapters.CustomBaseCustomerAdapter;
import com.example.hamza.shutterup.adapters.CustomBasePhotographerAdapter;
import com.example.hamza.shutterup.modals.Photographer;

import java.util.ArrayList;

public class potographer extends Fragment {
    RecyclerView recyclerView_photographer;
    CustomBasePhotographerAdapter adapter;
    ArrayList<Photographer> ArrayListPhotographer;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_potographer,container,false);
        recyclerView_photographer = (RecyclerView)v.findViewById(R.id.recyclerView_photographer);
        ArrayListPhotographer = new ArrayList<>();

        Photographer photographer = new Photographer("Photographer List",R.drawable.photographer);
        ArrayListPhotographer.add(photographer);
        photographer = new Photographer("Gallery",R.drawable.gallery);
        ArrayListPhotographer.add(photographer);
        photographer = new Photographer("Completed Events",R.drawable.events);
        ArrayListPhotographer.add(photographer);
        photographer= new Photographer("Event Carts",R.drawable.cart);
        ArrayListPhotographer.add(photographer);

        adapter = new CustomBasePhotographerAdapter(getActivity(),ArrayListPhotographer);
        RecyclerView.LayoutManager manager = new GridLayoutManager(getActivity(),2);
        recyclerView_photographer.setLayoutManager(manager);
        recyclerView_photographer.setItemAnimator(new DefaultItemAnimator());
        recyclerView_photographer.setAdapter(adapter);

       recyclerView_photographer.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getContext(),"item clicked",Toast.LENGTH_SHORT).show();
           }
       });
        return v;
    }
}

