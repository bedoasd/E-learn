package com.example.e_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView mVideoView;
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.corse_details);


        MediaController mediaController=new MediaController(this);
        final VideoView videoView=(VideoView) findViewById(R.id.video_view2);
        //https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4

    /*  String path="D:/ODC/E-learn/app/src/main/res/raw/videosview.MOV";
        Uri u = Uri.parse(path);*/

        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

       videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
            }
        });
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

            }
        });
       /* String u="https://www.pexels.com/video/a-woman-looking-through-the-microscope-5752729/";
        mVideoView.setVideoURI(Uri.parse(u));
       // videoView.setVideoPath("https://www.pexels.com/video/a-woman-looking-through-the-microscope-5752729/");
        videoView.start();*/

       mediaController = new MediaController(this);
        mVideoView = findViewById(R.id.video_view2);
        mediaController.setAnchorView(mVideoView);
        Uri localUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v3);

        mVideoView.setVideoURI(localUri);
        mVideoView.setMediaController(mediaController);

        mVideoView.start();



    }


}

