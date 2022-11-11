package com.example.uberapp.inbox;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com.example.uberapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PassengerInboxFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PassengerInboxFragment extends Fragment {


    public PassengerInboxFragment() {
        // Required empty public constructor
    }


    public static PassengerInboxFragment newInstance(String param1, String param2) {
        PassengerInboxFragment fragment = new PassengerInboxFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_passenger_inbox, container, false);
    }

}