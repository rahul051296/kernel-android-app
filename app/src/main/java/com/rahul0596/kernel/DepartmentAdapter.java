package com.rahul0596.kernel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class DepartmentAdapter extends ArrayAdapter<Department>{

    public DepartmentAdapter(Context context, ArrayList<Department> dept)
    {
       super(context, 0 ,dept);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.department_list, parent, false);
        Department dept = getItem ( position );

        TextView mtextView = (TextView) listItemView.findViewById ( R.id.name );
        mtextView.setText ( dept.getDepName () );


        ImageView mImageView = (ImageView) listItemView.findViewById(R.id.background_image);
        mImageView.setImageResource(dept.getImage());

        return listItemView;
     }
}
