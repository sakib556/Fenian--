package com.ourfeni.projectoffeni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class institutesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institutes);
        getSupportActionBar().setTitle("প্রতিষ্ঠান");
    }

    public void governmentbtn(View view) {
        Intent govt = new Intent(institutesActivity.this,governmentinstituteActivity.class);
        startActivity(govt);

    }

    public void nongovernmentbtn(View view) {
        Intent nongovt = new Intent(institutesActivity.this,nongovernmentinstitutesActivity.class);
        startActivity(nongovt);
    }
}
