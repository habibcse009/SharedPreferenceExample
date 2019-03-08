package com.habibcse009.imageloading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.img);
        Glide.with(MainActivity.this)
                .load("https://odishasuntimes.com/wp-content/uploads/2017/06/iron-man.jpg")
                .placeholder(R.drawable.imgloading)
                .error(R.drawable.imgnotfound)
                .into(imageView);
    }
}
