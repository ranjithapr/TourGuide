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
public class CityFragment extends Fragment {


    public CityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Arraylist for intializing data

        ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word(R.string.city_bellary, R.string.state_karnataka, R.drawable.bel));
        word.add(new Word(R.string.city_hampi, R.string.state_karnataka, R.drawable.hampi));
        word.add(new Word(R.string.city_harihara, R.string.state_karnataka, R.drawable.harih));
        word.add(new Word(R.string.city_bangalore, R.string.state_karnataka, R.drawable.bang));
        word.add(new Word(R.string.city_hospet, R.string.state_karnataka, R.drawable.hos));


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
