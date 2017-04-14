package com.example.hamza.shutterup.listOptionSelect;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hamza.shutterup.R;
import com.example.hamza.shutterup.adapters.CustomBaseCustomerAdapter;
import com.example.hamza.shutterup.modals.Customer;
import java.util.ArrayList;
public class customer extends Fragment   {
    RecyclerView recyclerView_customer;
    CustomBaseCustomerAdapter adapter;
    ArrayList<Customer> ArrayListCustomer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_customer,container,false);
        recyclerView_customer= (RecyclerView)v.findViewById(R.id.recyclerView_customer);
        ArrayListCustomer = new ArrayList<>();

        Customer customer = new Customer(R.drawable.photographer,"Photographer List");
        ArrayListCustomer.add(customer);
        customer = new Customer(R.drawable.gallery,"Gallery");
        ArrayListCustomer.add(customer);
        customer = new Customer(R.drawable.events,"Completed Events");
        ArrayListCustomer.add(customer);
        customer = new Customer(R.drawable.cart,"Add To Carts");
        ArrayListCustomer.add(customer);

        adapter = new  CustomBaseCustomerAdapter(getActivity(),ArrayListCustomer);
        RecyclerView.LayoutManager manager = new GridLayoutManager(getActivity(),2);
        recyclerView_customer.setLayoutManager(manager);
        recyclerView_customer.setItemAnimator(new DefaultItemAnimator());
        recyclerView_customer.setAdapter(adapter);

        return v;
    }
}
