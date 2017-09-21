package com.bill.music;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bntStart , btnStop;

    MediaPlayer m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bntStart = (Button) findViewById(R.id.btn1);
        btnStop = (Button) findViewById(R.id.btn2);



        bntStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m = MediaPlayer.create(getApplicationContext(),R.raw.treat);
                m.start();

            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m.stop();

            }
        });

    }
}
