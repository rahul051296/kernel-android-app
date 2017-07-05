package com.rahul0596.kernel;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DepartmentActivity extends AppCompatActivity {
ImageView websiteButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        final ArrayList<Department> department = new ArrayList<Department> ();
        department.add(new Department("Computer Science & Engineering",R.drawable.background_it,"Cryptrix"));
        department.add(new Department("Electronics & Electrical Engineering",R.drawable.background_eee,"E.E.E"));
        department.add(new Department("Mechanical Engineering",R.drawable.background_mech, "Mechanical"));
        department.add(new Department("Electronics & Communication Engineering",R.drawable.background_ece,"E.C.E"));
        department.add(new Department("Information Technology",R.drawable.background_cse,"I.T"));
        department.add(new Department("BioTechnology",R.drawable.background_biotech,"BioTech"));
        department.add(new Department("Chemical Engineering",R.drawable.background_chemical,"Chemical"));


        final DepartmentAdapter deptAdapter =
                new DepartmentAdapter(this, department);
        ListView listView = (ListView) findViewById ( R.id.listView );
        listView.setAdapter ( deptAdapter );
        listView.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Department department = deptAdapter.getItem(position);
                Intent intent = new Intent(DepartmentActivity.this, ScrollingActivity.class);
                intent.putExtra("image", department.getImage());
                intent.putExtra("deptName", department.getDepNameShort());
                startActivity(intent);
            }
        } );

       websiteButton = (ImageView) findViewById(R.id.website);
        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserOpen = new Intent(Intent.ACTION_VIEW);
                browserOpen.setData(Uri.parse("github.com/Rahul051296"));
            }
        });

    }


}
