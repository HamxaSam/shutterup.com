package com.example.hamza.shutterup.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hamza.shutterup.Form.Form;
import com.example.hamza.shutterup.R;
import com.example.hamza.shutterup.modals.Customer;
import java.util.ArrayList;

public class CustomBaseCustomerAdapter extends RecyclerView.Adapter<CustomBaseCustomerAdapter.MyViewHolder> {
    public Activity activity;
    public ArrayList<Customer> customerArrayList ;
    LayoutInflater inflater;
    LinearLayout customer_layout;
    public CustomBaseCustomerAdapter(Activity activity, ArrayList<Customer> customerArrayList ) {
        this.activity = activity;
        this.customerArrayList  = customerArrayList;
       inflater =activity.getLayoutInflater();

    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.customer_layout_second,parent,false);
        customer_layout =(LinearLayout)v.findViewById(R.id.customer_layout);
        return new MyViewHolder(v);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
            Customer customer = customerArrayList.get(position);
            holder.detail.setText(customer.getDetail());
            holder.image.setImageResource(customer.getImage());
        customer_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){
                    case 0:
                    //    Intent intent = new Intent(activity,)
                        Toast.makeText(activity,"clicked",Toast.LENGTH_SHORT).show();
                    case 1:

                        Toast.makeText(activity,"btn click",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:

                        Toast.makeText(activity,"click",Toast.LENGTH_SHORT).show();
                    case 3:
                        Intent intent = new Intent(activity, Form.class);
                        intent.putExtra("login","splash activity");
                        activity.startActivity(intent);
                        Toast.makeText(activity,"click",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });



    }
    @Override
    public int getItemCount() {
        return customerArrayList.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView detail;
        public MyViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.iamge_customer);
            detail = (TextView) itemView.findViewById(R.id.textView_customer_detail);
        }
    }
}
