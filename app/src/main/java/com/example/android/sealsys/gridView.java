package com.example.android.sealsys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class gridView extends AppCompatActivity {


    GridView androidGridView;

    String[] gridViewString = {
            "Pneumatic Rotary Actuator","Actuated Ball Valve Flanged Edges","Actuated ball valve Screwd/Socketweld",
            "Actuated Butterfly Valve","Actuated Knife Gate Valve","Pneumatic Control Valve"

    } ;
    int[] gridViewImageId = {
            R.drawable.rotatory,R.drawable.actuated_ball_valve_flanged_ends,R.drawable.actuated_ball_valve_screwed,
            R.drawable.actuated_butterfly_valve, R.drawable.actuated_knife_gate_valve,R.drawable.pneumatic_control_valve
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);


        gridViewadapter adapterViewAndroid = new gridViewadapter(gridView.this, gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.grid);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                {
                    if (position == 0) {
                        Intent myIntent = new Intent(view.getContext(), RotatoryActuature_Activity.class);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 1) {
                        Intent myIntent = new Intent(view.getContext(), Actuated_ball_value.class);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 2) {
                        Intent myIntent = new Intent(view.getContext(), actuated_ball_valve_screwed.class);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 3) {
                        Intent myIntent = new Intent(view.getContext(), Actuated_butteryfly_valve.class);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 4) {
                        Intent myIntent = new Intent(view.getContext(), Actuated_knife_gate_valve.class);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 5) {
                        Intent myIntent = new Intent(view.getContext(), pneumatic_control_valve.class);
                        startActivityForResult(myIntent, 0);
                    }

                }

            }
        });


    }
}
