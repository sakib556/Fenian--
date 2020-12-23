package com.ourfeni.projectoffeni;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class teastall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teastall);
        getSupportActionBar().setTitle("সেরা চা");
    final View webbutton1 = findViewById(R.id.milkteaweb_id);
        webbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com/feninews.comlive/videos/782308778625048/");
                Intent teawebintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(teawebintent);
            }
        });
        final View webbutton2 = findViewById(R.id.redteaweb_id);
        webbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://goo.gl/maps/iPvPA35DeB475Mqs9");
                Intent redteawebintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(redteawebintent);
            }
        });

    }
}
