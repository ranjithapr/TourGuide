package com.udacity.ranjitha.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class StayFragment extends Fragment {


    public StayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Arraylist for intializing data

        ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word(R.string.hotel_mahindra,R.drawable.mahi));
        word.add(new Word(R.string.hotel_malligi, R.drawable.malligi));
        word.add(new Word(R.string.hotel_leela, R.drawable.leela));
        word.add(new Word(R.string.hotel_taj, R.drawable.taj));
        word.add(new Word(R.string.hotel_ratnavilas, R.drawable.ratna));



        //create custome adapter of the WordAdapter
        //WordAdapter wordAdapter = new WordAdapter(this,word);
        WordAdapter wordAdapter = new WordAdapter(getActivity(), word);
        //create listView
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //set WordAdapter on listView
        listView.setAdapter(wordAdapter);

        return rootView;
    }
}
