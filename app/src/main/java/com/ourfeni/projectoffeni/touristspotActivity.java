package com.ourfeni.projectoffeni;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class touristspotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touristspot);
        getSupportActionBar().setTitle("পর্যটনকেন্দ্র");
        View touristbtn1 =findViewById(R.id.bijoyspot_id);
        View touristbtn2 =findViewById(R.id.salamspot_id);
        View touristbtn3 =findViewById(R.id.muhurispot_id);
        View touristbtn4 =findViewById(R.id.paunchgachiaspot_id);
        View touristbtn5 =findViewById(R.id.somserspot_id);
        View touristbtn6 =findViewById(R.id.fenispot_id);
        View touristbtn7 =findViewById(R.id.chowdhuripark_id);

        touristbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://goo.gl/maps/fWos5fKkhvAFQH3m9");
                Intent webintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(webintent);
            }
        });
        touristbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://goo.gl/maps/c21yLn7pPyZ9vsGaA");
                Intent webintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(webintent);
            }
        });
        touristbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://goo.gl/maps/rPvquissmSk9owee8");
                Intent webintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(webintent);
            }
        });
        touristbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://goo.gl/maps/BamDuCvf5NmvaSTW9");
                Intent webintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(webintent);
            }
        });
        touristbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://goo.gl/maps/dohiCWm5C8JEBqX27");
                Intent webintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(webintent);
            }
        });
        touristbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://goo.gl/maps/aU4YaGnWJycxaQnj9");
                Intent webintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(webintent);
            }
        });
        touristbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://goo.gl/maps/ufYbKwzKSf54ZLvEA");
                Intent webintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(webintent);
            }
        });



    }





}
