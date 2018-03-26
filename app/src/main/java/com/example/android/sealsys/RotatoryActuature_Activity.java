package com.example.android.sealsys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RotatoryActuature_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotatory_actuature_);


       /* ArrayList<String> words=new ArrayList<String>();

        words.add("Design: \tDual Rack & Pinion");
        words.add("Type: \tDouble Acting & Single Acting");
        words.add("Body: \tExtruded Aluminium, Hard Anodized");
        words.add("Pinion: \tExtruded Aluminium, Hard Anodized");
        words.add("Seal: \tBuna N/ Silicone/ Viton");
        words.add("Bearing: \tMetal DU Bush");
        words.add("Torque: \t1900 Nm maximum at 8 bar air pressure");
        words.add("Temperature: \t(-)40°C to (+)180°C");
        words.add("Supply: \tAir Pressure 3 bar minimum, 8 bar maximum");
        words.add("Features: \tStroke adjustment ± 5°, both ways");
        words.add("Mounting: \tISO 5211 mounting/ Namur interface");
        words.add("Life: \t1 Million Cycles");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        */

        final ArrayList<listView> item=new ArrayList<listView>();
        item.add(new listView("Design:","Dual Rack & Pinion"));
        item.add(new listView("Type:","Double Acting & Single Acting"));
        item.add(new listView("Body:","Extruded Aluminium, Hard Anodized"));
        item.add(new listView("Pinion:","Extruded Aluminium, Hard Anodized"));
        item.add(new listView("Seal:","Buna N/ Silicone/ Viton"));
        item.add(new listView("Bearing:","Metal DU Bush"));
        item.add(new listView("Torque:","1900 Nm maximum at 8 bar air pressure"));
        item.add(new listView("Temperature:","(-)40°C to (+)180°C"));
        item.add(new listView("Supply:","Air Pressure 3 bar minimum, 8 bar maximum"));
        item.add(new listView("Features:","Stroke adjustment ± 5°, both ways"));
        item.add(new listView("Mounting:","ISO 5211 mounting/ Namur interface"));
        item.add(new listView("Life:","1 Million Cycles"));


        ListViewAdapter adapter = new ListViewAdapter(this, item);

        ListView lv = (ListView) findViewById(R.id.list);

        lv.setAdapter(adapter);


    }


}
