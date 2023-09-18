package com.example.exercicioaula05pdm;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

public class MeuAdaptador extends SimpleAdapter {
    public MeuAdaptador(Context ctx, List<Map<String, Object>> lista, int umaLinha, String[] de, int[] para) {
        super(ctx, lista, umaLinha, de, para);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = super.getView(position, convertView, parent);

        if (position % 2 == 0) {
            v.setBackgroundColor(Color.parseColor("#7F00FFFF"));
        } else {
            v.setBackgroundColor(Color.parseColor("#7FFF00FF"));
        }

        return v;
    }
}
