package com.example.exercicioaula05pdm;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;


import java.util.List;
import java.util.Map;

public class MeuAdaptador extends SimpleAdapter {
    public MeuAdaptador(Context ctx, List<Map<String, Object>> lista, int umaLinha, String[] de, int[] para) {
        super(ctx, lista, umaLinha, de, para);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = super.getView(position, convertView, parent);
        TextView clube = (TextView) v.findViewById(R.id.txtClube);
        TextView vitorias = (TextView) v.findViewById(R.id.txtVitorias);
        TextView jogos = (TextView) v.findViewById(R.id.txtJogos);
        TextView empates = (TextView) v.findViewById(R.id.txtEmpates);
        TextView pts = (TextView) v.findViewById(R.id.txtPts);
        TextView derrotas = (TextView) v.findViewById(R.id.txtDerrotas);
        if (position % 2 == 0) {
            v.setBackgroundColor(Color.parseColor("#17980C"));

            clube.setTextColor(Color.parseColor("#FFFFFF"));
            vitorias.setTextColor(Color.parseColor("#FFFFFF"));
            jogos.setTextColor(Color.parseColor("#FFFFFF"));
            empates.setTextColor(Color.parseColor("#FFFFFF"));
            pts.setTextColor(Color.parseColor("#FFFFFF"));
            derrotas.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            v.setBackgroundColor(Color.parseColor("#FFF200"));

            clube.setTextColor(Color.parseColor("#000000"));
            vitorias.setTextColor(Color.parseColor("#000000"));
            jogos.setTextColor(Color.parseColor("#000000"));
            empates.setTextColor(Color.parseColor("#000000"));
            pts.setTextColor(Color.parseColor("#000000"));
            derrotas.setTextColor(Color.parseColor("#000000"));
        }

        return v;
    }
}
