package com.example.android.miwok;

/**
 * Created by mudit on 15/3/17.
 */

public class FAMILYMEMBER {
    public String FamilyMemberNameEnglish;
    public String FamilyMemberNameHindi;
    public int MemberImage;
    public int Audionum;

    public FAMILYMEMBER(String e, String h, int n){
        FamilyMemberNameEnglish = e;
        FamilyMemberNameHindi = h;
        MemberImage = n;
    }
    public void addAudio(int n) { Audionum = n; }

}
