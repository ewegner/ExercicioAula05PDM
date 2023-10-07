package com.example.exercicioaula05pdm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class SpinnerAdapter extends ArrayAdapter {
    public SpinnerAdapter(Context ctx, int textViewResourceId, String[] objects) {
        super(ctx, textViewResourceId, objects);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = getLayoutInflater();
    }


    @Override
    public View getDropDownView (int position, View convertView, ViewGroup parent) {
        return getCustomView (position, convertView, parent);
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        return getCustomView (position, convertView, parent);
    }
}
