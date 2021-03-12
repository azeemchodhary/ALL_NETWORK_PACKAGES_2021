package com.crossbug.allnetworkpackages2021.ui.main;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.crossbug.allnetworkpackages2021.Jazz;
import com.crossbug.allnetworkpackages2021.R;
import com.crossbug.allnetworkpackages2021.Telenor;
import com.crossbug.allnetworkpackages2021.Ufone;
import com.crossbug.allnetworkpackages2021.Warid;
import com.crossbug.allnetworkpackages2021.Zong;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static final String[] TAB_TITLES = new String[]{"Hybrid", "Data","Calls","Sms"};
    private final Context mContext;

    String network;

    public SectionsPagerAdapter(Context context, FragmentManager fm,String network) {
        super(fm);
        mContext = context;
        this.network = network;
    }

    @Override
    public Fragment getItem(int position)
    {
        if(network.equals("telenor"))
        {
            Telenor tel = new Telenor();
            Bundle obj = new Bundle();
            obj.putString("tab",TAB_TITLES[position]);
            tel.setArguments(obj);
            return  tel;
        }
        if(network.equals("jazz"))
        {
            Jazz tel = new Jazz();
            Bundle obj = new Bundle();
            obj.putString("tab",TAB_TITLES[position]);
            tel.setArguments(obj);
            return tel;
        }
        if(network.equals("zong"))
        {
            Zong tel = new Zong();
            Bundle obj = new Bundle();
            obj.putString("tab",TAB_TITLES[position]);
            tel.setArguments(obj);
            return tel;
        }
        if(network.equals("warid"))
        {
            Warid tel = new Warid();
            Bundle obj = new Bundle();
            obj.putString("tab",TAB_TITLES[position]);
            tel.setArguments(obj);
            return tel;
        }
        if(network.equals("ufone"))
        {
            Ufone tel = new Ufone();
            Bundle obj = new Bundle();
            obj.putString("tab",TAB_TITLES[position]);
            tel.setArguments(obj);
            return tel;
        }

        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TAB_TITLES[position];
    }

    @Override
    public int getCount() {
        return TAB_TITLES.length;
    }
}