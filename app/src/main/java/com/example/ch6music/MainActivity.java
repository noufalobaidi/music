package com.example.ch6music;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    MediaPlayer mpFirstSong,mpSecondSong;
    int playing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);

        mpFirstSong= new MediaPlayer();
        mpSecondSong= new MediaPlayer();

        mpFirstSong=MediaPlayer.create(this, R.raw.track2);
        mpSecondSong=MediaPlayer.create(this, R.raw.track3);

        playing=0;

        button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        switch(playing){
            case 0:
                mpFirstSong.start();
                playing=1;
                button1.setText("pause first song");
                break;
            case 1:
                mpFirstSong.pause();
                playing=0;
                button1.setText("start second song");
                break;
        }

    }

});
button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        switch(playing){
            case 0:

                mpSecondSong.start();
                playing=1;
                button2.setText("pause first song");
                break;
            case 1:
                mpSecondSong.pause();
                playing=0;
                button2.setText("start second song");
                break;
        }


    }
});
    }
}