package com.example.exercise3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class CourseAdapter extends ArrayAdapter<Course> {

    private ArrayList<Course> courseList;
    private int resourceLayout;
    private Context mContext;

    public CourseAdapter(Context context, int resource, ArrayList<Course> items) {
        super(context, resource, items);
        this.courseList = items;
        this.resourceLayout = resource;
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(mContext);
            v = vi.inflate(resourceLayout, null);
        }

        Course course = getItem(position);

        if (course != null) {
            TextView courseCodeTextView = v.findViewById(R.id.courseCodeTextView);


            if (courseCodeTextView != null) {
                courseCodeTextView.setText(course.getCourseCode());
            }
        }

        return v;
    }
}

