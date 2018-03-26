package com.example.android.sealsys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class pneumatic_control_valve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pneumatic_control_valve);


        final ArrayList<listView> item=new ArrayList<listView>();
        item.add(new listView("Type:","Single Acting Normally Close / Open"));
        item.add(new listView("Body:","SS-304 / SS- 316"));
        item.add(new listView("Trims:","SS-304 / SS-316"));
        item.add(new listView("Seat:","Metal to Metal / PTFE"));
        item.add(new listView("End Connection:","Screwed / Flanged"));
        item.add(new listView("Pressure:","0 – 16 Bar"));


        ListViewAdapter adapter = new ListViewAdapter(this, item);

        ListView lv = (ListView) findViewById(R.id.list);

        lv.setAdapter(adapter);


    }
}
