package com.example.laresbryan.magicalmoney;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by laresbryan on 5/16/15.
 */
public class CustomerAdapter extends ArrayAdapter<CustomObject> {
    Context context;
    int layoutResourceId;
    //CustomObject data[] = null;
    ArrayList<CustomObject> data = null;

    public CustomerAdapter(Context context, int layoutResourceId, ArrayList<CustomObject> data){
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        CustomObjectHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new CustomObjectHolder();
            holder.textEntry = (TextView)row.findViewById(R.id.textRowName);
            holder.textAmount = (TextView)row.findViewById(R.id.textRowAmount);

            row.setTag(holder);
        }
        else
        {
            holder = (CustomObjectHolder)row.getTag();
        }

        CustomObject object = data.get(position);
        holder.textEntry.setText(object.entry);
        holder.textAmount.setText(object.amount);

        return row;
    }

    static class CustomObjectHolder
    {
        TextView textEntry;
        TextView textAmount;
    }

}
