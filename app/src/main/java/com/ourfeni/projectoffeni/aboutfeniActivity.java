package com.ourfeni.projectoffeni;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class aboutfeniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutfeni);
        getSupportActionBar().setTitle("ফেনী");
        View webbuttonfeni =findViewById(R.id.feniweb_id);

        webbuttonfeni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.feni.gov.bd");
                Intent fwebintent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(fwebintent);
            }
        });
    }


}
