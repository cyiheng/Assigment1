package com.example.bjtuembedded.assigment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResearchTrainer extends AppCompatActivity {

    private ImageView aButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.research_trainer);

        aButton =(ImageView) findViewById(R.id.imageView1);

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vIntent = new Intent(ResearchTrainer.this, TrainerInfo.class);
                startActivity(vIntent);
            }
        });
    }
}
