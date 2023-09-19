package com.example.exercicioaula05pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ColorActivity extends AppCompatActivity {
    String[] cores = {"Selecione uma cor", "Preto", "Branco", "Vermelho", "Verde", "Azul", "Amarelo", "Laranja", "Roxo", "Marrom"};

    int[] hexas = {R.color.black, R.color.white};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
    }
}