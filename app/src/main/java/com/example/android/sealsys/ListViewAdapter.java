package com.example.android.sealsys;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Divya Baid on 02-09-2017.
 */

public class ListViewAdapter extends ArrayAdapter<listView> {


    public ListViewAdapter(Activity context, ArrayList<listView> item) {
        super(context, 0,item);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        listView currentWord = getItem(position);

        TextView nm = (TextView) listItemView.findViewById(R.id.name);
        nm.setText(currentWord.getName());

        TextView desc = (TextView) listItemView.findViewById(R.id.desc);
        desc.setText(currentWord.getDescription());


        return listItemView;


    }
}