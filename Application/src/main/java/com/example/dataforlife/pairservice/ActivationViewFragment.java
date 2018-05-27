package com.example.dataforlife.pairservice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dataforlife.R;

public class ActivationViewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.activation_view_pager, container, false);
        ((PairPagerActivity)getActivity()).executeInsideFragment();
        return rootView;
    }

}