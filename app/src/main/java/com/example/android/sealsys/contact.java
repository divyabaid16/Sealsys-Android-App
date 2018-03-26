package com.example.android.sealsys;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static com.example.android.sealsys.R.id.image_map;
import static com.example.android.sealsys.R.id.img_email;
import static com.example.android.sealsys.R.id.img_ph;
import static com.example.android.sealsys.R.id.img_ph1;

/**
 * Created by Divya Baid on 18-10-2017.
 */

public class contact extends Fragment {


    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.contact,container,false);

        ImageView landline=(ImageView) myView.findViewById(img_ph);

        landline.setOnClickListener(new View.OnClickListener() {
             //The code in this method will be executed when the numbers View is clicked on.
           @Override
           public void onClick(View view) {
               String number = "912652422689";
               Uri call = Uri.parse("tel:" + number);
               Intent surf = new Intent(Intent.ACTION_DIAL, call);
               startActivity(surf);
              // Intent callIntent = new Intent(Intent.ACTION_CALL);
               //callIntent.setData(Uri.parse("tel:" + "919825020042"));
               //startActivity(callIntent);
         }
        });

        ImageView mobile=(ImageView) myView.findViewById(img_ph1);

        mobile.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                String number = "919825020042";
                Uri call = Uri.parse("tel:" + number);
                Intent surf = new Intent(Intent.ACTION_DIAL, call);
                startActivity(surf);
                // Intent callIntent = new Intent(Intent.ACTION_CALL);
                //callIntent.setData(Uri.parse("tel:" + "919825020042"));
                //startActivity(callIntent);
            }
        });


        ImageView address=(ImageView) myView.findViewById(image_map);

        address.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.co.in/maps/place/SEALING+SYSTEM+CORPORATION/@22.2965113,73.2043538,17z/data=!3m1!4b1!4m5!3m4!1s0x395fc58b4567d675:0xe369d1e13ea52693!8m2!3d22.2965064!4d73.2065425"));
                startActivity(intent);
            }
        });

        ImageView email=(ImageView) myView.findViewById(img_email);

        email.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                String[] TO = {"sealsys@gmail.com"};
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, TO);
               // intent.putExtra(Intent.EXTRA_SUBJECT, "Just java aap for");
                //intent.putExtra(Intent.EXTRA_TEXT, "priceMessage");
                startActivity(Intent.createChooser(intent, "Send mail..."));

            }
        });

        return myView;
    }
}
