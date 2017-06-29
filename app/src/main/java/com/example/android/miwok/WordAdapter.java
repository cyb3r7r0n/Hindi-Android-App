package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by mudit on 15/3/17.
 */

public class WordAdapter extends ArrayAdapter<Number> {

    public  WordAdapter(Activity context, ArrayList<Number> numbers){
        super(context, 0, numbers);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView HindiTextView = (TextView) listItemView.findViewById(R.id.Hindi);
        TextView EnglishTextView = (TextView) listItemView.findViewById(R.id.English);
        ImageView image = (ImageView) listItemView.findViewById(R.id.img);
        RelativeLayout relativeLayout = (RelativeLayout) listItemView.findViewById(R.id.complete_number);

        final Number currentNumber = getItem(position);

        assert currentNumber != null;
        final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), currentNumber.Audionum);
        relativeLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getContext(), currentNumber.NumberInEnglish, Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        HindiTextView.setText(currentNumber.NumberInHindi);
        EnglishTextView.setText(currentNumber.NumberInEnglish);
        image.setImageResource(currentNumber.Imagenum);

        return listItemView;
    }
}
