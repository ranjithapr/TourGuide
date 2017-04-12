package com.udacity.ranjitha.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ChoiceAdapter extends FragmentPagerAdapter {


    private Context mContext;


    public ChoiceAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1) {
            return new HistoricalFragment();
        } else if (position == 2) {
            return new MythologyFragment();
        } else {
            return new StayFragment();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_city);
        } else if (position == 1) {
            return mContext.getString(R.string.category_historical);
        } else if (position == 2) {
            return mContext.getString(R.string.category_mythology);
        } else {
            return mContext.getString(R.string.category_stay);
        }
    }
}