package com.example.android.abcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Alphabet.class);
                startActivity(i);
            }
        });

        ImageView image = findViewById(R.id.image);
        Button bt= findViewById(R.id.button1);
        Animation animation = new AlphaAnimation((float) 1.0,(float)0.8); // Change alpha from fully visible to invisible
        Animation an= new AlphaAnimation((float)1.0,(float)1.0);
        animation.setDuration(1200); // duration - half a second
        an.setDuration(800);
        animation.setInterpolator(new LinearInterpolator()); // do not alter
        // animation
        // rate
        an.setInterpolator( new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE); // Repeat animation
        // infinitely
        an.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE); // Reverse animation at the
        // end so the button will
        // fade back in
        an.setRepeatMode(Animation.RESTART);
        image.startAnimation(animation);
        bt.startAnimation(an);
    }

}
