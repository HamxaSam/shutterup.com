package com.example.hamza.shutterup.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Hamza on 3/4/2017.
 */
public class CustomViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<String> arrayListTitles =new ArrayList<>();
    ArrayList<Fragment> arrayListFragments =new ArrayList<>();

    public CustomViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }




    @Override
    public int getCount() {
        return arrayListFragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return arrayListFragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int postion) {

        return  arrayListTitles.get(postion);
    }
    public void addFragment(Fragment fragment, String title) {
        arrayListFragments.add(fragment);
        arrayListTitles.add(title);
    }
}
