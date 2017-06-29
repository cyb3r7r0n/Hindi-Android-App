package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberFragment extends Fragment {


    public NumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        ArrayList<Number> ListOfNumber = new ArrayList<Number>();
        String[] English = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen"};
        String[] Hindi = {"एक", "दो", "तीन", "चार", "पंज", "छह", "सात", "आठ", "नौ", "दस", "ग्यारह", "बारह", "तेरह", "चौदह", "पन्द्रह"};
//        int[] imaages = {(R.drawable.1), R.drawable.2, R.drawable.3, R.drawable.4, R.drawable.5, R.drawable.6, R.drawable.7, R.drawable.8, R.drawable.9, R.drawable.10, R.drawable.11, R.drawable.12, R.drawable.13, R.drawable.14, R.drawable.1};
        int[] images = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.ten, R.drawable.eleven, R.drawable.twelve, R.drawable.thirteen, R.drawable.fourteen, R.drawable.fifteen};
        int[] sound = {R.raw.one, R.raw.two , R.raw.three , R.raw.four , R.raw.five , R.raw.six , R.raw.seven , R.raw.eight , R.raw.nine , R.raw.ten , R.raw.eleven , R.raw.twelve , R.raw.thirteen , R.raw.fourteen , R.raw.fifteen };

        for (int i=0; i<15; i++){
            Number NUMBER = new Number(English[i], Hindi[i]);
            NUMBER.AddImage(images[i]);
            NUMBER.addAudio(sound[i]);
            ListOfNumber.add(NUMBER);
        }

//        WordAdapter itemsAdapter = new WordAdapter(this, ListOfNumber);

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), ListOfNumber);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
