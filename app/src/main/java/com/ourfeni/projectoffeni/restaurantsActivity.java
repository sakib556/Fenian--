package com.ourfeni.projectoffeni;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class restaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        getSupportActionBar().setTitle("রেস্টুরেন্ট");
        final View callbtn1 = findViewById(R.id.thefeniancallid);
        final View callbtn2 = findViewById(R.id.stateoffoodscallid);
        final View callbtn3 = findViewById(R.id.tastenbestcallid);
        final View callbtn4 = findViewById(R.id.redixcallid);
        final View callbtn5 = findViewById(R.id.bestinncallid);

     callbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01772718106"));
                startActivity(a);
            }
        });
        callbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01825594949"));
                startActivity(b);
            }
        });
        callbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01740701701"));
                startActivity(c);
            }
        });
       callbtn4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent d = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01748235245"));
               startActivity(d);
           }
       });
      callbtn5.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent e = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01847291111"));
              startActivity(e);
          }
      });
    }
}
