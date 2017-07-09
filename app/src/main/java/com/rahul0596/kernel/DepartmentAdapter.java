package com.rahul0596.kernel;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class DepartmentAdapter extends RecyclerView.Adapter<DepartmentHolder>{

    Context context;
    private ArrayList<Department> deptList = new ArrayList<Department>();
    public DepartmentAdapter(Context context, ArrayList<Department> deptList)
    {
        this.context = context;
        this.deptList = deptList;
        setHasStableIds(true);
    }

    @Override
    public DepartmentHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.department_list,null);
        DepartmentHolder departmentHolder = new DepartmentHolder(view, context);

        return departmentHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    } @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public void onBindViewHolder(DepartmentHolder holder, final int position) {

        final Department dept = deptList.get(position);

        holder.textView.setText(dept.getDepName());
        Picasso.with(context)
                .load(dept.getImage())
                .config(Bitmap.Config.RGB_565)
                .into(holder.imageView);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("image", dept.getImage());
                intent.putExtra("deptName",dept.getDepName());
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return deptList.size();
    }
}
