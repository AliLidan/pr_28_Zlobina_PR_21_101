package com.example.pr_28_zlobina_pr_21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView sumImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //sumImageView = findViewById(R.id.sun);
        //Animation sunRiseAmination = AnimationUnit;

        // Получим ссылку на солнце
        sumImageView = findViewById(R.id.sun);
        // Анимация для восхода солнца
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        // Подключаем анимацию к нужному View
        sumImageView.startAnimation(sunRiseAnimation);
    }
}