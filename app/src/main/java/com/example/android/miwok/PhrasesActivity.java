package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

class PHRASE {
    String PhraseInEnglish;
    String PhraseInHindi;

    public PHRASE(String e, String h){
        PhraseInEnglish = e;
        PhraseInHindi = h;
    }
}

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<PHRASE> ListOfPhrases = new ArrayList<PHRASE>();

        String[] EnglishPhrase = {"Where are you going?", "What is your name?", "My name is...", "How are you feeling?", "I’m feeling good.", "Are you coming?", "Yes, I’m coming.", "I’m coming.", "Let’s go.", "Come here."};
        String[] HindiPhrase = {"तुम कहाँ जा रहे हो?", "आपका नाम क्या है?", "मेरा नाम है...", "आप कैसा महसूस कर रहे हैं?", "मैं अच्छा महसूस कर रहा हूँ।", "क्या तुम आ रहे हो?", "हाँ, आ रहा हूं।", "मैं आ रहा हूँ।", "चलिए चलते हैं।", "यहाँ आओ।"};

        for(int i=0; i<EnglishPhrase.length; i++){
            PHRASE phrase = new PHRASE(EnglishPhrase[i], HindiPhrase[i]);
            ListOfPhrases.add(phrase);
        }

        PhraseAdapter phraseAdapter = new PhraseAdapter(this, ListOfPhrases);
        GridView gridview = (GridView) findViewById(R.id.activity_phrases);
        gridview.setAdapter(phraseAdapter);

    }

    /**
     * Created by mudit on 15/3/17.
     */
}
