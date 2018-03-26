package com.example.android.sealsys;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.android.sealsys.R.id.valve;

/**
 * Created by Divya Baid on 25-10-2017.
 */

public class Home extends Fragment {

    View myView;
    @Nullable
    //@Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.content_navigation,container,false);
        TextView valve_auto=(TextView) myView.findViewById(valve);
        valve_auto.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(getActivity(), gridView.class);
                startActivity(colorsIntent);
            }
        });


        return myView;
    }
    }