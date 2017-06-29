package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by mudit on 16/3/17.
 */

public class PhraseAdapter extends ArrayAdapter<PHRASE> {
    public PhraseAdapter(Activity context, ArrayList<PHRASE> phrase){
        super(context, 0, phrase);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.phrase_item, parent, false);
        }

        TextView HindiPhraseTextView = (TextView) listItemView.findViewById(R.id.HindiPhrase);
        TextView EnglishPhraseTextView = (TextView) listItemView.findViewById(R.id.EnglishPhrase);

        PHRASE phrase = getItem(position);

        HindiPhraseTextView.setText(phrase.PhraseInHindi);
        EnglishPhraseTextView.setText(phrase.PhraseInEnglish);

        return listItemView;
    }
}
