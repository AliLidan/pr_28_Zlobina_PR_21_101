package com.example.pr_28_zlobina_pr_21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        ImageView clockImageView = findViewById(R.id.clock);
        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_rise);
        clockImageView.startAnimation(clockTurnAnimation);

        ImageView hourImageView = findViewById(R.id.hour_hand);
        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_hand_turn);
        hourImageView.startAnimation(hourTurnAnimation);


    }
}