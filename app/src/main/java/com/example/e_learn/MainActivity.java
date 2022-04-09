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

        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

       /* String u="https://web.law.duke.edu/cspd/contest/videos/Framed-Contest_Documentaries-and-You.mp4";
//       mVideoView.setVideoURI(Uri.parse(u));
       // videoView.setVideoPath("https://www.pexels.com/video/a-woman-looking-through-the-microscope-5752729/");
        videoView.setVideoPath(u);
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

