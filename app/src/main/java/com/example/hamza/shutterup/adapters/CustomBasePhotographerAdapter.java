package com.example.hamza.shutterup.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import com.example.hamza.shutterup.Form.Form;
import com.example.hamza.shutterup.R;
import com.example.hamza.shutterup.adapters.CustomBaseCustomerAdapter;
import com.example.hamza.shutterup.modals.Customer;
import com.example.hamza.shutterup.modals.Photographer;

import java.util.ArrayList;
/**
 * Created by Hamza on 4/9/2017.
 */
public class CustomBasePhotographerAdapter extends RecyclerView.Adapter<CustomBasePhotographerAdapter.MyViewHolder>   {
    public Activity activity;
    public ArrayList<Photographer> PhotoArrayList ;
    LayoutInflater inflater;
    LinearLayout layout_photographer;

    public CustomBasePhotographerAdapter(Activity activity, ArrayList<Photographer> photoArrayList) {
        this.activity = activity;
        PhotoArrayList = photoArrayList;
       inflater = activity.getLayoutInflater();
    }
    @Override
    public CustomBasePhotographerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.photographer_second_layout, parent, false);
        layout_photographer = (LinearLayout)v.findViewById(R.id.layout_photographer);
        return new CustomBasePhotographerAdapter.MyViewHolder(v);
    }
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        Photographer customer =  PhotoArrayList.get(position);
        holder.details.setText(customer.getDetail());
        holder.images.setImageResource(customer.getImage());
        layout_photographer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){
                    case 0:
                        Toast.makeText(activity,"click",Toast.LENGTH_SHORT).show();
                    case 1:
                        Toast.makeText(activity,"click",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(activity,"click",Toast.LENGTH_SHORT).show();
                    case 3:
                        Toast.makeText(activity,"click",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return PhotoArrayList.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {
        public ImageView images;
        public TextView details;
        public MyViewHolder(View itemView) {
            super(itemView);

            images =(ImageView)itemView.findViewById(R.id.image_photographer);
            details =(TextView)itemView.findViewById(R.id.textView_photographer_detail);
        }
    }
}