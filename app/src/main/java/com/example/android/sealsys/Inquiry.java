package com.example.android.sealsys;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.sealsys.R.id.comments;
import static com.example.android.sealsys.R.id.comp_name;
import static com.example.android.sealsys.R.id.name;
import static com.example.android.sealsys.R.id.ph_no;
import static com.example.android.sealsys.R.id.submit;

public class Inquiry extends Fragment {

    View myView;
    @Nullable
    //@Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.activity_inquiry,container,false);



        TextView sub=(TextView) myView.findViewById(submit);

        sub.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {

                 EditText nm= (EditText)myView.findViewById(name);
                String Name=nm.getText().toString();

                 EditText cname= (EditText)myView.findViewById(comp_name);
                String CName=cname.getText().toString();


                 EditText no= (EditText)myView.findViewById(ph_no);
                String No=no.getText().toString();

                 EditText cm= (EditText)myView.findViewById(comments);
                String comm=cm.getText().toString();

                String[] TO = {"sealsys@gmail.com"};
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, TO);
                 intent.putExtra(Intent.EXTRA_SUBJECT, "Inquiry sent through app");
                intent.putExtra(Intent.EXTRA_TEXT, "Name: "+ Name+"\n\nCompany Name: "+CName+"\n\nPhone No :"+No+"\n\n My Inquiey: "+comm);

                startActivity(Intent.createChooser(intent, "Send mail..."));

            }
        });


        return myView;
    }
}
