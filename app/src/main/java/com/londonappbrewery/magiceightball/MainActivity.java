package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView image_ball = findViewById(R.id.imageBall);
        Button button_ask = findViewById(R.id.buttonAsk);

        final int[] images = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        button_ask.setOnClickListener(new View.OnClickListener() {
            Random rng = new Random();

            @Override
            public void onClick(View v) {
                int number = rng.nextInt(5);
                image_ball.setImageResource(images[number]);
            }
        });
    }
}
