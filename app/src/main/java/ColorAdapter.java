package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by mudit on 15/3/17.
 */

public class ColorAdapter extends ArrayAdapter<COLOR> {

    public  ColorAdapter(Activity context, ArrayList<COLOR> colors){
        super(context, 0, colors);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.color_item, parent, false);
        }

//        LinearLayout ColorLayout = (LinearLayout) listItemView.findViewById(R.id.color);
        TextView HindiTextView = (TextView) listItemView.findViewById(R.id.HindiColor);
        TextView EnglishTextView = (TextView) listItemView.findViewById(R.id.EnglishColor);

        final COLOR currentColor = getItem(position);
        RelativeLayout relativeLayout = (RelativeLayout) listItemView.findViewById(R.id.complete_color);

        assert currentColor != null;
        final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), currentColor.Audionum);
        relativeLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getContext(), currentColor.EnglishColor, Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        if(!currentColor.ColorValue.equals("#FFFFFF")) {

            HindiTextView.setText(currentColor.HindiColor);
            HindiTextView.setBackgroundColor(Color.parseColor(currentColor.ColorValue));
            EnglishTextView.setText(currentColor.EnglishColor);
            EnglishTextView.setBackgroundColor(Color.parseColor(currentColor.ColorValue));
            HindiTextView.setTextColor(Color.parseColor("#FFFFFF"));
            EnglishTextView.setTextColor(Color.parseColor("#FFFFFF"));
//        ColorLayout.setBackgroundColor(Color.parseColor(currentColor.ColorValue));
        }
        else{
            HindiTextView.setText(currentColor.HindiColor);
            HindiTextView.setBackgroundColor(Color.parseColor(currentColor.ColorValue));
            EnglishTextView.setText(currentColor.EnglishColor);
            EnglishTextView.setBackgroundColor(Color.parseColor(currentColor.ColorValue));
            HindiTextView.setTextColor(Color.parseColor("#000000"));
            EnglishTextView.setTextColor(Color.parseColor("#000000"));
        }
        return listItemView;
    }
}
