package com.example.android.sealsys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ValveAutomation_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valve_automation_);

        TextView valve_rot = (TextView) findViewById(R.id.rotary);

// Set a click listener on that View
        valve_rot.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(ValveAutomation_Activity.this, RotatoryActuature_Activity.class);
                startActivity(colorsIntent);
            }
        });

        TextView valve_actuater = (TextView) findViewById(R.id.actuated);

// Set a click listener on that View
        valve_actuater.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(ValveAutomation_Activity.this, Actuated_ball_value.class);
                startActivity(colorsIntent);
            }
        });

        TextView valve_actuater_screwed = (TextView) findViewById(R.id.actuated_screwed);

// Set a click listener on that View
        valve_actuater_screwed.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(ValveAutomation_Activity.this, actuated_ball_valve_screwed.class);
                startActivity(colorsIntent);
            }
        });


        TextView butterfly = (TextView) findViewById(R.id.butterfly);

// Set a click listener on that View
        butterfly.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(ValveAutomation_Activity.this, Actuated_butteryfly_valve.class);
                startActivity(colorsIntent);
            }
        });

        TextView knife_gate = (TextView) findViewById(R.id.gate_valve);

// Set a click listener on that View
        knife_gate.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(ValveAutomation_Activity.this, Actuated_knife_gate_valve.class);
                startActivity(colorsIntent);
            }
        });

        TextView pneumatic_control = (TextView) findViewById(R.id.pneumatic_control);

// Set a click listener on that View
        pneumatic_control.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(ValveAutomation_Activity.this, pneumatic_control_valve.class);
                startActivity(colorsIntent);
            }
        });



    }
}
