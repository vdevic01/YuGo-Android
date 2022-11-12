package com.example.uberapp.gui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.uberapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CreateRideSubfragment01#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CreateRideSubfragment01 extends Fragment {


    public CreateRideSubfragment01() {
        // Required empty public constructor
    }

    public static CreateRideSubfragment01 newInstance() {
        CreateRideSubfragment01 fragment = new CreateRideSubfragment01();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_create_ride_subfragment01, container, false);
    }
}