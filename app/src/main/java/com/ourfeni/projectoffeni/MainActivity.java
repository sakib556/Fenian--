package com.ourfeni.projectoffeni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("ফেনীয়ান");
    }


    public void photosbtn(View view) {
        Intent photo = new Intent(MainActivity.this,photosActivity.class);
        startActivity(photo);

    }
    public void touristspotbtn(View view){

        Intent  touristspot   = new Intent(MainActivity.this,touristspotActivity.class);
        startActivity(touristspot);

    }
    public void institutesbtn(View view){

        Intent institutes    = new Intent(MainActivity.this,institutesActivity.class);
        startActivity(institutes);

    }



    public void feniemergencybtn(View view){

        Intent feniemergency    = new Intent(MainActivity.this,feniemergencyActivity.class);
        startActivity(feniemergency);

    }
    public void restaurantsbtn(View view){

        Intent  restaurants   = new Intent(MainActivity.this,restaurantsActivity.class);
        startActivity(restaurants);

    }
    public void aboutfenibtn(View view){

        Intent   aboutfeni  = new Intent(MainActivity.this,aboutfeniActivity.class);
        startActivity(aboutfeni);

    }
    public void aboutmebtn(View view){

        Intent     aboutme= new Intent(MainActivity.this,aboutmeActivity.class);
        startActivity(aboutme);

    }
    public void bloodbtn (View view){
        Intent blood =new Intent(MainActivity.this,blooddonationgroupe.class);
        startActivity(blood);
    }
    public void teastallbtn (View view){
        Intent teastall =new Intent(MainActivity.this,teastall.class);
        startActivity(teastall);
    }



}
