package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private static int splashTimer = 2500;
    TextView to_do_text;
    ImageView to_do_icon;
    Animation sideAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        to_do_icon = findViewById(R.id.to_do_icon);
        to_do_text = findViewById(R.id.to_do_text);

        sideAnim = AnimationUtils.loadAnimation(this, R.anim.side_anim);

        to_do_icon.setAnimation(sideAnim);
        to_do_text.setAnimation(sideAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(intent);
                finish();
            }
        }, splashTimer);
    }
}