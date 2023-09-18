package com.example.exercicioaula05pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CampActivity extends AppCompatActivity {

    private ListView listView;
    int[] img = {R.drawable.fla,R.drawable.inter,R.drawable.cam,R.drawable.sao,R.drawable.flu,R.drawable.gre,R.drawable.pal,R.drawable.frz,R.drawable.cap,R.drawable.cea,R.drawable.san,R.drawable.ago,R.drawable.rbr,R.drawable.cor,R.drawable.bah,R.drawable.spt,R.drawable.ame,R.drawable.cha,R.drawable.cui,R.drawable.juv};
    String[] times = {"Flamengo","Internacional","Atlético Mineiro","São Paulo","Fluminense","Grêmio","Palmeiras","Fortaleza","Athletico Paranaense","Ceará","Santos","Atlético Goianiense","Bragantino","Corinthians","Bahia","Sport","América Mineiro","Chapecoense","Cuiabá","Juventude"};
    int[] numeroJogos = {38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38};
    int[] saldoGols = {36,29,41,-6,6,-19,10,-9,30,3,-12,4,12,-14,-6,-12,9,-15,-21,-17};
    int[] vitorias = {21,20,20,16,17,8,13,11,24,15,12,13,11,9,12,12,15,9,8,7};
    int[] empates = {10,14,8,10,8,14,12,11,7,11,17,14,14,8,11,11,4,11,14,17};
    int[] derrotas = {7,4,10,12,13,16,13,16,7,12,9,11,13,21,15,15,19,18,16,14};
    int[] golsPro = {61,53,64,46,45,27,47,40,68,45,34,45,48,29,44,42,58,40,32,29};
    int[] golsContra = {25,24,45,59,45,46,37,49,47,51,44,45,50,48,55,54,53,54,56,46};
    int[] pontuacao = {25,24,45,59,45,46,37,49,47,51,44,45,50,48,55,54,53,54,56,46};

    List<Map<String,Object>> lista;

    String [] de = {"img", "nome", "pts", "vit", "emp", "der", "jgs"};
    int [] para = {R.id.imgClube, R.id.txtClube, R.id.txtPts, R.id.txtVitorias, R.id.txtEmpates, R.id.txtDerrotas, R.id.txtJogos};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp);

        listView = findViewById(R.id.listView);
        SimpleAdapter adapter;

        lista = new ArrayList<>();
        for (int i = 0; i < times.length; i++) {
            Map<String,Object> mapa = new HashMap<>();
            mapa.put(de[0], img[i]);
            mapa.put(de[1], times[i]);
            mapa.put(de[2], pontuacao[i]);
            mapa.put(de[3], vitorias[i]);
            mapa.put(de[4], empates[i]);
            mapa.put(de[5], derrotas[i]);
            mapa.put(de[6], numeroJogos[i]);
            lista.add(mapa);
        }

        adapter = new MeuAdaptador(this, lista, R.layout.uma_linha, de, para);
        listView.setAdapter(adapter);

    }
}