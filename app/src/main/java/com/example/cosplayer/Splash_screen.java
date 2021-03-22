package com.example.cosplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splash_screen extends Activity {
    private final int SPLASH_DISPLAY_LENGTH = 5000; //отображается 5 сек

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        //убираем полоску состояния
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Splash_screen.this, MainActivity.class);
                Splash_screen.this.startActivity(mainIntent);
                Splash_screen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}