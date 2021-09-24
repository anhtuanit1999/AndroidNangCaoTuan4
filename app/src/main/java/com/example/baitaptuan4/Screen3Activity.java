package com.example.baitaptuan4;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Screen3Activity extends AppCompatActivity {
    private ImageView img_taylor;
    private ImageView img_music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        img_taylor = findViewById(R.id.imageView2);
        img_music = findViewById(R.id.imageView13);
        Animation animation =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.anirotate);

        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.anirotate);

        img_taylor.startAnimation(animation);
        img_music.startAnimation(animation1);
    }
}