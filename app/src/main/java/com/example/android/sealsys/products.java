package com.example.android.sealsys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class products extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);



        TextView valve_auto = (TextView) findViewById(R.id.valve_automation);

// Set a click listener on that View
        valve_auto.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(products.this, gridView.class);
                startActivity(colorsIntent);
            }
        });
    }
}
