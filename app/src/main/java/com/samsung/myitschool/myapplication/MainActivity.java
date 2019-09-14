package com.samsung.myitschool.myapplication;

import android.graphics.Color;

import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textView1);
        tv.setText(R.string.app_name);
    }

    public void changeBackground(View v) {
        ConstraintLayout r = findViewById(R.id.root);
        //r.setBackgroundColor(Color.RED);
        r.setBackgroundColor(Color.parseColor("#ff0000"));
        MediaPlayer mp = MediaPlayer.create(this,R.raw.mocart);
        mp.start();
    }

}
