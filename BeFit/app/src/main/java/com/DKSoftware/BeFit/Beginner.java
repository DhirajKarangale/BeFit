package com.DKSoftware.BeFit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class Beginner extends AppCompatActivity {

    private int arr[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        arr = new int[]
        {
                R.id.bowPose,R.id.bridgePose,R.id.chairPose,R.id.childPose,R.id.cobblerPose,R.id.cowPose,R.id.playjiPose,R.id.pausejiPose,R.id.plankPose
                ,R.id.crunchesPose,R.id.situpPose,R.id.rotationPose,R.id.twistPose,R.id.legupPose,R.id.windmillPose,
        };
    }

    public void ImageButtonClick(View view)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(view.getId() == arr[i])
            {
                int val = i+1;
                Log.i("FIRST",String.valueOf(val));
                Intent intent = new Intent(Beginner.this,Exercise.class);
                intent.putExtra("value",String.valueOf(val));
                startActivity(intent);
            }
        }
    }
}