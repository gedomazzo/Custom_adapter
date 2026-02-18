package com.example.custom_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CostumeAdapter extends ArrayAdapter<Costumes> {

    public CostumeAdapter(Context context, Costumes[] costumes) {
        super(context, R.layout.list_item, costumes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Costumes currentCostume = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText("name " + currentCostume.getName());

        TextView levelTextView = (TextView) listItemView.findViewById(R.id.level);
        levelTextView.setText("difficulty " + String.valueOf(currentCostume.getLevel()));

        TextView categoryTextView = (TextView) listItemView.findViewById(R.id.category);
        categoryTextView.setText("category " + currentCostume.getCategory());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img);
        imageView.setImageResource(currentCostume.getImage());

        return listItemView;
    }
}
