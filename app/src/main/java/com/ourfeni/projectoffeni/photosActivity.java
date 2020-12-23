package com.ourfeni.projectoffeni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class photosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);
        getSupportActionBar().setTitle("চিত্র");
    }
}
