package com.example.android.sealsys;

/**
 * Created by Divya Baid on 02-09-2017.
 */

public class listView {

        private String name;
        private String description;

    public listView(String nm, String desc){
        name=nm;
        description=desc;
    }

    public String getName(){ return name;}
    public String getDescription(){return description;}
}
