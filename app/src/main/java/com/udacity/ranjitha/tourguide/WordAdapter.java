package com.udacity.ranjitha.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> word){
              super(context,0, word);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentItem = getItem(position);

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentItem.getmImageResourceId());

        TextView mStateName = (TextView) listItemView.findViewById(R.id.state_name);

        if (currentItem.hasStateName()){
            mStateName.setText(currentItem.getmStateName());
            mStateName.setVisibility(View.VISIBLE);
        }
        else
            mStateName.setVisibility(View.GONE);

        TextView mCityName = (TextView) listItemView.findViewById(R.id.city_name);
        mCityName.setText(currentItem.getmCityName());

        return listItemView;
    }
}
