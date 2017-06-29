package com.example.android.miwok;

import android.app.Activity;
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

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by mudit on 15/3/17.
 */

public class FamilyAdapter extends ArrayAdapter<FAMILYMEMBER>{
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.family_item, parent, false);
        }

        TextView HindiNameTextView = (TextView) listItemView.findViewById(R.id.HindiFamilyMemberName);
        final FAMILYMEMBER FamilyMember = getItem(position);
        HindiNameTextView.setText(FamilyMember.FamilyMemberNameHindi);

        TextView EnglishNameTextView = (TextView) listItemView.findViewById(R.id.EngishFamilyMemberName);
        EnglishNameTextView.setText(FamilyMember.FamilyMemberNameEnglish);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img);
        imageView.setImageResource(FamilyMember.MemberImage);

        RelativeLayout relativeLayout = (RelativeLayout) listItemView.findViewById(R.id.complete_family);

        assert FamilyMember != null;
        final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), FamilyMember.Audionum);
        relativeLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getContext(), FamilyMember.FamilyMemberNameEnglish, Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        return listItemView;
    }

    public FamilyAdapter(Activity context, ArrayList<FAMILYMEMBER> FamilyMemberList){
        super(context, 0, FamilyMemberList);
    }
}
