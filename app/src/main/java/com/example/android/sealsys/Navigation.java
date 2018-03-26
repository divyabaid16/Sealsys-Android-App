package com.example.android.sealsys;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);


        TextView valve_auto = (TextView) findViewById(R.id.valve);

// Set a click listener on that View
        valve_auto.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(Navigation.this, gridView.class);
                startActivity(colorsIntent);
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager=getSupportFragmentManager();

        if (id == R.id.nav_company) {
            // Handle the camera action
            fragmentManager.beginTransaction().
                    replace(R.id.frame, new compan_profile()).commit();
        }
        else if (id == R.id.nav_valve_automation) {
            Intent intent = new Intent(this,gridView.class);
            startActivity(intent);

        }
        else if (id == R.id.contact) {
            fragmentManager.beginTransaction().
                    replace(R.id.frame, new contact()).commit();

        }

        else if (id == R.id.nav_home) {

            fragmentManager.beginTransaction().
                    replace(R.id.frame, new Home()).commit();


        }

        else if (id == R.id.inq) {
            fragmentManager.beginTransaction().
                    replace(R.id.frame, new Inquiry()).commit();

        }

        else if (id == R.id.call) {

            String number = "919825020042";
            Uri call = Uri.parse("tel:" + number);
            Intent surf = new Intent(Intent.ACTION_DIAL, call);
            startActivity(surf);
        }

        else if (id == R.id.mail) {

            String[] TO = {"sealsys@gmail.com"};
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_EMAIL, TO);
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
