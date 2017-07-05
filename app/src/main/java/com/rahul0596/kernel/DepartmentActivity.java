package com.rahul0596.kernel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DepartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        final ArrayList<Department> department = new ArrayList<Department> ();
        department.add(new Department("Mechanical Engineering",R.drawable.background4, "Mechanical"));
        department.add(new Department("Electronics & Electrical Engineering",R.drawable.background3,"E.E.E"));
        department.add(new Department("Computer Science & Engineering",R.drawable.background2,"Cryptrix"));
        department.add(new Department("Electronics & Communication Engineering",R.drawable.background1,"E.C.E"));


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
    }


}
