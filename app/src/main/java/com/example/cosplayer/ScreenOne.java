package com.example.cosplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;


public class ScreenOne extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_choose);
        Bundle args = getIntent().getExtras();
        String name = args.getString("name");
        // убираем полоску состояния
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        System.out.println("name ==" + name);
        TextView quest = findViewById(R.id.quest);

        quest.setText("Hello " + name + ", what kind of cinematic you would like to cosplay?");

        ImageButton series = findViewById(R.id.series);
        series.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("series");
                Intent int_ser = new Intent(ScreenOne.this, Series.class);
                ScreenOne.this.startActivity(int_ser);
            }
        });

        //обработчик нажатия кнопки movies
        ImageButton movies = findViewById(R.id.movies);
        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_mov = new Intent(ScreenOne.this, Movies.class);
                ScreenOne.this.startActivity(int_mov);
            }
        });

         // обработчик нажатия кнопки animated movies
        ImageButton anim = findViewById(R.id.anim);
        anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_anim = new Intent(ScreenOne.this, Animated.class);
                ScreenOne.this.startActivity(int_anim);
            }
        });

        // обработчик нажатия кнопки games
        ImageButton games = findViewById(R.id.games);
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_game = new Intent(ScreenOne.this, Games.class);
                ScreenOne.this.startActivity(int_game);
            }
        });

    }
}
