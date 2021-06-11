package com.example.audioplay;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnstart, btnpaush, btnstop;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart = findViewById(R.id.btnstart);
        btnpaush = findViewById(R.id.btnpaush);
        btnstop = findViewById(R.id.btnstop);

        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.android);

        btnstart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnstart:
                mediaPlayer.start();
                break;

            case R.id.btnpaush:
                mediaPlayer.pause();
                break;

            case R.id.btnstop:
                mediaPlayer.stop();
                break;
        }
    }
}