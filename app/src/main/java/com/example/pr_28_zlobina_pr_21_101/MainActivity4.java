package com.example.pr_28_zlobina_pr_21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity{

    ImageView closk_view_big, new_language, new_zig;
    Button btn;
    boolean new_anim = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btn = findViewById(R.id.tic_tak);


        // Получим ссылку на солнце
        closk_view_big = findViewById(R.id.language1);
        // Анимация для восхода солнца
        Animation lang = AnimationUtils.loadAnimation(this, R.anim.bid_clock_run);
        // Подключаем анимацию к нужному View
        closk_view_big.startAnimation(lang);

        new_language = findViewById(R.id.language);
        // Анимация для восхода солнца
        Animation lang1 = AnimationUtils.loadAnimation(this, R.anim.big_clock_language);
        // Подключаем анимацию к нужному View
        new_language.startAnimation(lang1);
    }

    public void onAnim(View view)
    {
        if(view.getId() == R.id.tic_tak) {
            new_language = findViewById(R.id.language);
            // Анимация для восхода солнца
            Animation lang2 = AnimationUtils.loadAnimation(this, R.anim.zig);
            // Подключаем анимацию к нужному View
            new_language.startAnimation(lang2);

            closk_view_big = findViewById(R.id.language1);
            // Анимация для восхода солнца
            Animation lang3 = AnimationUtils.loadAnimation(this, R.anim.zig2);
            // Подключаем анимацию к нужному View
            closk_view_big.startAnimation(lang3);


            // Получим ссылку на солнце
            new_zig = findViewById(R.id.small_clock);
            // Анимация для восхода солнца
            Animation lang4 = AnimationUtils.loadAnimation(this, R.anim.clock_rise);
            // Подключаем анимацию к нужному View
            new_zig.startAnimation(lang4);
        }
    }
}