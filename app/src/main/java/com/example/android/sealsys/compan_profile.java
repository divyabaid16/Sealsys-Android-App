package com.example.android.sealsys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Divya Baid on 18-10-2017.
 */

public class compan_profile extends Fragment {

    View myView;
    @Nullable
    //@Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.company_profile,container,false);
        return myView;
    }
}
