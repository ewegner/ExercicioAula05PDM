package com.example.exercicioaula05pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ColorActivity extends AppCompatActivity {
    String[] cores = {"Selecione uma cor", "Preto", "Branco", "Vermelho", "Verde", "Azul", "Amarelo", "Laranja", "Roxo", "Marrom"};

    Integer[] hexas = {R.color.white, R.color.black, R.color.white, R.color.red, R.color.green, R.color.blue, R.color.yellow, R.color.orange, R.color.purple, R.color.brown};

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        spinner = findViewById(R.id.colorSpinner);

        spinner.setAdapter(new SpinnerAdapter(this, R.layout.spinner_item, cores));
    }

    public class SpinnerAdapter extends ArrayAdapter {
        public SpinnerAdapter(Context ctx, int textViewResourceId, String[] objects) {
            super(ctx, textViewResourceId, objects);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.spinner_item, parent, false);
            TextView cor = (TextView) layout.findViewById(R.id.spinnerItem);
            cor.setBackgroundColor(getResources().getColor(hexas[position]));
            cor.setText(cores[position]);
            cor.setTextColor(Color.rgb(255,255,255));

            if(position == 0) {
                cor.setTextSize(20f);
                cor.setTextColor(Color.BLACK);
            }
            if(position == 2 || position == 6) {
                cor.setTextColor(Color.BLACK);
            }

            return layout;
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
}