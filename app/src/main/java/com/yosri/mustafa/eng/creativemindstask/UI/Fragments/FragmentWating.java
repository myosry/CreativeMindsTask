package com.yosri.mustafa.eng.creativemindstask.UI.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yosri.mustafa.eng.creativemindstask.R;

/**
 * Created by DELL on 5/30/2018.
 */

 public class FragmentWating extends Fragment {

    public static FragmentWating newInstance() {
        Bundle args = new Bundle();
        FragmentWating fragment = new FragmentWating();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_wating, container, false);
        return v;
    }
}