package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
//        TextView DemoTextView = (TextView) findViewById(R.id.Demo);
//        DemoTextView.setText("This is Family Memeber TextView");

        String[] EnglishFamilyMemberNames = {"GrandFather", "GrandMother","Mother's Father","Mother's Mother",  "Mother", "Father", "Sister", "Sister's husband", "Elder Sister", "Brother", "Brother's Wife", "Elder Brother", "Cousin", "Father's\n younger brother", "Father's younger\n brother's wife", "Father's\n elder brother", "Father's elder\n brother's wife", "Father's sister", "Father's sister's\n husband", "Mother's brother", "Mother's brother's\n wife"  , "Mother's sister" , "Mother's sister's\n husband"                          };
        String[] HindiFamilyMemberNames = {"दादा", "दादी मा", "नाना ", "नानी", "मां", "पिता", "बहन", "जीजा", "दीदी", "भाई",  "भाभी", "बड़ा भाई", "चचेरा भाई", "चाचा", "चाची", "ताऊ", "ताई", "बुआ", "फूफा", "मामा", "मामी", "मौसी", "मौसा" };
        int[] sounds = {R.raw.grandfather ,R.raw.grandmother ,R.raw.mothersfather ,R.raw.mothersmother ,R.raw.mother ,R.raw.father ,R.raw.sister ,R.raw.sistershusband ,R.raw.eldersister ,R.raw.brother ,R.raw.brotherswife ,R.raw.elderbrother ,R.raw.cousin ,R.raw.fathersyoungerbrother ,R.raw.fathersyoungerbrotherswife ,R.raw.fatherselderbrother ,R.raw.fatherselderbrotherswife ,R.raw.fatherssister ,R.raw.fatherssistershusband ,R.raw.mothersbrother ,R.raw.mothersbrotherswife ,R.raw.motherssister ,R.raw.motherssistershusband };
        int[] FamilyImages = {R.drawable.family_grandfather, R.drawable.family_grandmother, R.drawable.family_grandfather, R.drawable.family_grandmother, R.drawable.family_mother, R.drawable.family_father, R.drawable.family_younger_sister, R.drawable.family_son, R.drawable.family_older_sister, R.drawable.family_younger_brother, R.drawable.family_daughter, R.drawable.family_older_brother, R.drawable.family_son, R.drawable.family_father, R.drawable.family_mother, R.drawable.family_father, R.drawable.family_mother, R.drawable.family_mother, R.drawable.family_father,R.drawable.family_father, R.drawable.family_mother, R.drawable.family_mother, R.drawable.family_father};



        ArrayList<FAMILYMEMBER> FamilyMemberList= new ArrayList<FAMILYMEMBER>();
        for (int i=0; i<EnglishFamilyMemberNames.length; i++){
            FAMILYMEMBER FamilyMember = new FAMILYMEMBER(EnglishFamilyMemberNames[i], HindiFamilyMemberNames[i], FamilyImages[i]);
            FamilyMember.addAudio(sounds[i]);
            FamilyMemberList.add(FamilyMember);
        }

        FamilyAdapter familyadapter = new FamilyAdapter(this, FamilyMemberList);
        GridView listView = (GridView) findViewById(R.id.activity_family);
        listView.setAdapter(familyadapter);
    }
}
