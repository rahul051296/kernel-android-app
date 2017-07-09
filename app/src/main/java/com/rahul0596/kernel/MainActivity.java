package com.rahul0596.kernel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
RecyclerView recyclerView;
    String date1 = " Sept 9, 2017";
    String date2 = " Sept 23, 2017";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        final ArrayList<Department> department = new ArrayList<Department> ();
        department.add(new Department("Computer Science & Engineering",R.drawable.background_it, date1));
        department.add(new Department("Electronics & Electrical Engineering",R.drawable.background_eee, date2));
        department.add(new Department("Mechanical Engineering",R.drawable.background_mech, date1));
        department.add(new Department("Electronics & Communication Engineering",R.drawable.background_ece, date1));
        department.add(new Department("Information Technology",R.drawable.background_cse,date2));
        department.add(new Department("BioTechnology",R.drawable.background_biotech,date2));
        department.add(new Department("Chemical Engineering",R.drawable.background_chemical,date1));
        department.add(new Department("Civil Engineering",R.drawable.background_civil,date2));
        department.add(new Department("Electronics & Instrumentation Engineering",R.drawable.background_eie,date2));
        department.add(new Department("Instrumentation and Control Engineering",R.drawable.background_ice, date1));
        department.add(new Department("Master of Business Administration",R.drawable.background_mba,date2));
        department.add(new Department("Master of Computer Application",R.drawable.background_mca,date2));


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DepartmentAdapter departmentAdapter = new DepartmentAdapter(this,department);
        departmentAdapter.setHasStableIds(true);
        recyclerView.setAdapter(departmentAdapter);


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
        getMenuInflater().inflate(R.menu.website_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent webIntent;
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            webIntent = new Intent(Intent.ACTION_VIEW);
            webIntent.setData(Uri.parse("https://www.github.com/Rahul051296"));
            startActivity(webIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.about) {
            // Handle the about action
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
