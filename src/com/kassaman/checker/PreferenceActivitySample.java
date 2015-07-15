package com.kassaman.checker;

import com.kassaman.checker.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class PreferenceActivitySample extends PreferenceActivity{
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO 自動生成されたメソッド・スタブ
        super.onCreate(savedInstanceState);
   addPreferencesFromResource(R.xml.pref);
    }

}
