package com.Deepak_pandey.labexp_7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.Deepak_pandey.labexp_7.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}