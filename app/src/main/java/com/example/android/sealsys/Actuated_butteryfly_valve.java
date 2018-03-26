package com.example.android.sealsys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Actuated_butteryfly_valve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actuated_butteryfly_valve);


        final ArrayList<listView> item=new ArrayList<listView>();
        item.add(new listView("Double Acting:","Air to Open. Air to Close\n" +
                "Fail Safe : Stay put"));
        item.add(new listView("Single Acting:","Air to Open Spring to Close\n" +
                "Fail Safe : Fail to Close"));
        item.add(new listView("Actuator Size:","DA 40 to DA 300"));




        ListViewAdapter adapter = new ListViewAdapter(this, item);

        ListView lv = (ListView) findViewById(R.id.list1);

        lv.setAdapter(adapter);


        final ArrayList<listView> item2=new ArrayList<listView>();
        item2.add(new listView("Body:","CI/ SS-304 / SS- 316 / WCB"));
        item2.add(new listView("Disc:","SS-304 / SS-316 / DI"));
        item2.add(new listView("Seat:","PTFE / NBR / EPDM"));
        item2.add(new listView("Valve Size:","50NB to 600NB"));
        item2.add(new listView("Design:","Wafer / Lug / Flanged"));




        ListViewAdapter adapter2 = new ListViewAdapter(this, item2);

        ListView lv2 = (ListView) findViewById(R.id.list2);

        lv2.setAdapter(adapter2);



    }
}
