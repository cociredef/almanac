package com.google.android.almanac;

import android.app.Activity;
import android.os.Bundle;

public class Almanac extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}