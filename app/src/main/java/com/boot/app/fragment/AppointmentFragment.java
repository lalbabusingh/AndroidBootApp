package com.boot.app.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.boot.app.R;

/**
 * Created by LAL on 6/11/2016.
 */
public class AppointmentFragment extends Fragment implements View.OnClickListener {

    public AppointmentFragment() {
        // Required empty public constructor
    }

    private LinearLayout hospitalLayout,doctorLayout,labLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.appoitment_layout, container, false);


        return view;
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }

    }
}