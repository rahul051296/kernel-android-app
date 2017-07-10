package com.rahul0596.kernel;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class DepartmentHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView,dateView;
    Animation fadeIn;
    public DepartmentHolder(View itemView, Context context) {
        super(itemView);
        fadeIn = AnimationUtils.loadAnimation(context,R.anim.fade_in);
        imageView = itemView.findViewById(R.id.background_image);
        textView = itemView.findViewById(R.id.name);
        dateView = itemView.findViewById(R.id.date);
    }
}
