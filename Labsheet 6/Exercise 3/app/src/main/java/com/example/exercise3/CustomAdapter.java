package com.example.exercise3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<ListItem> {
    private Context context;
    private List<ListItem> itemList;

    public CustomAdapter(Context context, List<ListItem> itemList) {
        super(context, 0, itemList);
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.itemImageView);
        TextView textView = convertView.findViewById(R.id.itemTextView);

        ListItem currentItem = getItem(position);

        if (currentItem != null) {
            imageView.setImageResource(currentItem.getImageResourceId());
            textView.setText(currentItem.getName());
        }

        return convertView;
    }

}
