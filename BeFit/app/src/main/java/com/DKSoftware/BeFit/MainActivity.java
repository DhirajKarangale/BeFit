package com.DKSoftware.BeFit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonBeginnerStart,buttonAdvanceStart;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBeginnerStart = findViewById(R.id.ButtonBeginnerStart);
        buttonAdvanceStart = findViewById(R.id.ButtonAdvanceStart);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        buttonBeginnerStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,Beginner.class);
                startActivity(intent);
            }
        });

        buttonAdvanceStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,Advance.class);
                startActivity(intent);
            }
        });
    }

    public void Beginner(View view)
    {
        Intent intent = new Intent(MainActivity.this,Beginner.class);
        startActivity(intent);
    }

    public void Advance(View view)
    {
        Intent intent = new Intent(MainActivity.this,Advance.class);
        startActivity(intent);
    }

    public void Tips(View view)
    {
        Intent intent = new Intent(MainActivity.this,Tips.class);
        startActivity(intent);
    }
}