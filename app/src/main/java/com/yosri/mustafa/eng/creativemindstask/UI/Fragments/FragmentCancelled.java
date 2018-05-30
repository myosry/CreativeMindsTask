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

public class FragmentCancelled  extends Fragment {

    public static FragmentCancelled newInstance() {
        Bundle args = new Bundle();
        FragmentCancelled fragment = new FragmentCancelled();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cancel, container, false);
        return v;
    }
}