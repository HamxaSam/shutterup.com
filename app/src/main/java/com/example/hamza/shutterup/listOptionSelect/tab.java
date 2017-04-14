package com.example.hamza.shutterup.listOptionSelect;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.hamza.shutterup.R;
import com.example.hamza.shutterup.adapters.CustomViewPagerAdapter;

public class tab extends AppCompatActivity {
    CoordinatorLayout coordinatorLayout;
    AppBarLayout appbar;
    TabLayout tablayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        getSupportActionBar();


        tablayout = (TabLayout)findViewById(R.id.tablayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        CustomViewPagerAdapter adapter = new CustomViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new customer(),"Customer");
        adapter.addFragment(new potographer(),"Photographer");

        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
    //    tablayout.getTabAt(0).setIcon(R.drawable.ic_action_user).getPosition();
    //    tablayout.getTabAt(1).setIcon(R.drawable.ic_camera_enhance).getPosition();






}
}