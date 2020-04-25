package com.example.user.quiz6;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    // Count number of tabs
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

// Returning the current tabs
        switch (position) {
            case 0:
                TabFragment1 Fragment1 = new TabFragment1();
                return Fragment1;
            case 1:
                TabFragment2 Fragement2 = new TabFragment2();
                return Fragement2;
            case 2:
                TabFragment3 Fragment3 = new TabFragment3();
                return Fragment3;
            case 3:
                TabFragment4 Fragment4 = new TabFragment4();
                return Fragment4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}

