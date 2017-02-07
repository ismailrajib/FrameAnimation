package com.example.mohammedismail.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
        ImageView player;
    AnimationDrawable frameanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player=(ImageView)findViewById(R.id.imageView);

        player.setImageResource((R.drawable.frameanimation));

        frameanimation=(AnimationDrawable)player.getDrawable();

        frameanimation.start();

    }
}
