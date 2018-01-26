package com.example.giovanne.atmempresaconsultoria;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;
    private ImageView logoImage;
    private Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logoImage = (ImageView) findViewById(R.id.imageView);
        anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        logoImage.setAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
