package com.ourfeni.projectoffeni;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class blooddonationgroupe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blooddonationgroupe);
        final View fcibdgweb1 = findViewById(R.id.fcibdgweb);
        getSupportActionBar().setTitle("রক্তের ব্যবস্থা");
        fcibdgweb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com/FCIbdg/");
                Intent fcibdgwebintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(fcibdgwebintent);
            }
        });
        final View bdcbweb1 = findViewById(R.id.bdcbweb);
        bdcbweb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.blooddonorsbd.com/m/feni/?p=1");
                Intent bdcbwebintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(bdcbwebintent);
            }
        });
        final View bloodcall = findViewById(R.id.bloodcall_id);

        bloodcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bloodcallintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01640854413"));
                startActivity(bloodcallintent);

            }
        });


    }
}
