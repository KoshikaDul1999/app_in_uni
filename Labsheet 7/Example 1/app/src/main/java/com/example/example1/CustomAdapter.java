package com.example.example1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int animals[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, int[] animals) {
        this.context = applicationContext;
        this.animals = animals;
        this.inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_gidview, null);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        icon.setImageResource(animals[i]);
        return view;
    }
}
