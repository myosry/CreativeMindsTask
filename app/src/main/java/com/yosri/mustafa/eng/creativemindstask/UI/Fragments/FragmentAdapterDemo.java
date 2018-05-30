package com.yosri.mustafa.eng.creativemindstask.UI.Fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.athbk.ultimatetablayout.IFTabAdapter;

/**
 * Created by DELL on 3/27/2018.
 */

public class FragmentAdapterDemo extends FragmentPagerAdapter implements IFTabAdapter {


    public static final String WATING = "قيد الإنتظار ";
    public static final String ACCCEPTED = "تم القبول ";
    public static final String CANCELLED = "تم الإلغاء ";

    public FragmentAdapterDemo(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return FragmentWating.newInstance();
        } else if (position == 1) {
            return FragmentAccepted.newInstance();
        } else  {
            return FragmentCancelled.newInstance();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    String wating_title = WATING;
    String accpted_title = ACCCEPTED;
    String cancelled_title = CANCELLED;
    String default_tab = WATING;

    @Override
    public String getTitle(int position) {
        if (position == 0) {
            return wating_title;
        }
        if (position == 1) {
            return accpted_title;
        }
        if (position == 2) {
            return cancelled_title;
        }

        return default_tab + position;
    }

    @Override
    public int getIcon(int position) {
        if (position == 0) {
        }
        if (position == 1) {
        }
        if (position == 2) {
        }
        return 0;
    }
}