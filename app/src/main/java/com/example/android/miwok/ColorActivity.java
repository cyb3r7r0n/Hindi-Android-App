package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

class COLOR{
    public String EnglishColor;
    public String HindiColor;
    public String ColorValue;
    public int Audionum;

    public COLOR(String e, String h, String v){
        EnglishColor = e;
        HindiColor = h;
        ColorValue = v;
    }

    public void addAudio(int n) { Audionum = n; }
}

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        String[] ListOfColorsEnglish = {"Red", "Pink", "Purple", "Deep Purple", "Indigo", "Blue", "Light Blue", "Cyan", "Teal", "Green", "Light Green", "Lime", "Yellow", "Amber", "Orange", "Deep Orange", "Brown", "Grey", "Blue Grey", "Black", "White"};
        String[] ListOfColorsHindi = {"लाल", "गुलाबी", "बैंगनी", "गहरा बैंगनी", "इंडिगो", "नीला", "हल्का नीला", "सियान", "टीला", "हरा", "हल्का हरा", "चूना", "पीला", "एम्बर", "नारंगी", "गहरी नारंगी", "भूरा", "ग्रे", "भूरे", "काली", "सफेद"};
        String[] ListofColors = {"#F44336", "#E91E63", "#9C27B0", "#673AB7", "#3F51B5", "#2196F3", "#03A9F4", "#00BCD4", "#009688", "#4CAF50", "#8BC34A", "#CDDC39", "#FFEB3B", "#FFC107", "#FF9800", "#FF5722", "#795548", "#9E9E9E", "#607D8B", "#000000", "#FFFFFF"};
       int[] Sounds = {R.raw.red ,R.raw.pink ,R.raw.purple ,R.raw.deeppurple ,R.raw.indigo ,R.raw.blue , R.raw.lightblue ,R.raw.cyan ,R.raw.teal ,R.raw.green ,R.raw.lightgreen ,R.raw.lime ,R.raw.yellow ,R.raw.amber ,R.raw.orange ,R.raw.deeporange ,R.raw.brown ,R.raw.grey ,R.raw.bluegrey ,R.raw.black ,R.raw.white };

        ArrayList<COLOR> ArrayListColor = new ArrayList<COLOR>();

        for(int i=0; i<ListofColors.length; i++){
            COLOR color = new COLOR(ListOfColorsEnglish[i], ListOfColorsHindi[i], ListofColors[i]);
            color.addAudio(Sounds[i]);
            ArrayListColor.add(color);
        }

        com.example.android.miwok.ColorAdapter itemsAdapter = new com.example.android.miwok.ColorAdapter(this, ArrayListColor);
        ListView listView = (ListView) findViewById(R.id.color_item);
        listView.setAdapter(itemsAdapter);
    }
}
