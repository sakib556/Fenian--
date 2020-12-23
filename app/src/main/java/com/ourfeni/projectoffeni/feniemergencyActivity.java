package com.ourfeni.projectoffeni;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class feniemergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feniemergency);
        getSupportActionBar().setTitle("ইমার্জেন্সি");
        final View callbuttonfire = findViewById(R.id.fireservicecall_id);
        final View callbuttonambulance = findViewById(R.id.ambulancecall_id);
        final View callbuttonfenisadarhospital = findViewById(R.id.fenisadarhospitalcall_id);
        final View callbuttonfenithanaoc = findViewById(R.id.fenithanaoccall_id);
        final View callbuttonfenithanadc = findViewById(R.id.fenithanadccall_id);
        final View callbuttonnationalemergencyservice = findViewById(R.id.nationalemergencycall_id);
        final View callbuttondudok = findViewById(R.id.dudokcall_id);
        final View callbuttondengu = findViewById(R.id.dengucall_id);
        final View callbuttondurjog = findViewById(R.id.durjogcall_id);
        callbuttonfire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fireintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "033174744"));
                startActivity(fireintent);
            }
        });

        callbuttonambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ambulanceintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01876077777"));
                startActivity(ambulanceintent);
            }
        });
        callbuttonfenisadarhospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fenisadarhospitalintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "033174866"));
                startActivity(fenisadarhospitalintent);
            }

        });
        callbuttonfenithanaoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fenithanaocintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01713373778"));
                startActivity(fenithanaocintent);
            }

        });
        callbuttonfenithanadc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fenithanadcintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01797077700"));
                startActivity(fenithanadcintent);
            }

        });

        callbuttonnationalemergencyservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nationalemergencyintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "999"));
                startActivity(nationalemergencyintent);
            }
        });
        callbuttondudok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dudokintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "106"));
                startActivity(dudokintent);
            }

        });
        callbuttondengu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent denguintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "16263"));
                startActivity(denguintent);
            }
        });
        callbuttondurjog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent durjogintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "1090"));
                startActivity(durjogintent);
            }
        });
    }
    public void coronavirusbtn(View view) {
        Intent corona = new Intent(feniemergencyActivity.this,corona.class);
        startActivity(corona);

}}
