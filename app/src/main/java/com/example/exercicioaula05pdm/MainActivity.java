package com.example.exercicioaula05pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verTabela(View view) {
        Intent intent = new Intent(this, CampActivity.class);
        startActivity(intent);
    }

    public void verCores(View view) {
        Intent intent = new Intent(this, ColorActivity.class);
        startActivity(intent);
    }
}