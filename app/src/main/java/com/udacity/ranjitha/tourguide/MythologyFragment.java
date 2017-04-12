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
public class MythologyFragment extends Fragment {


    public MythologyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Arraylist for intializing data

        ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word(R.string.mythology_malyavanta, R.drawable.maly));
        word.add(new Word(R.string.mythology_kurugodu, R.drawable.kuru));
        word.add(new Word(R.string.mythology_kanaviraya, R.drawable.kan));
        word.add(new Word(R.string.mythology_jambunatha, R.drawable.jamb));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), word);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
        return rootView;
    }
}

