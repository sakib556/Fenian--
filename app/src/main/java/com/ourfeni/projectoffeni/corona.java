package com.ourfeni.projectoffeni;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class corona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona);
        getSupportActionBar().setTitle("করোনা ভাইরাস");
        final View callbtncorona =findViewById (R.id.coronaviruscall_id);
        final View callbtncorona2 =findViewById (R.id.coronaviruscall2_id);
        final View callbtncorona3 =findViewById (R.id.coronaviruscall3_id);
        final View coronaweb = findViewById(R.id.coronaweb_id);
        callbtncorona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coronaintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "9898691"));
                startActivity(coronaintent);
            }
        });
        callbtncorona2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent corona2intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "16263"));
                startActivity(corona2intent);
            }
        });

        callbtncorona3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent corona3intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "333"));
                startActivity(corona3intent);
            }
        });
        coronaweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.corona.gov.bd");
               Intent coronawebintent = new Intent(Intent.ACTION_VIEW,uri);
               startActivity(coronawebintent);
            }
        });
        }

    }

