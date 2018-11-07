package com.example.bjtuembedded.assigment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResearchTrainer extends AppCompatActivity {

    private Button aButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.research_trainer);

        aButton =(Button)findViewById(R.id.button2);

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vIntent = new Intent(ResearchTrainer.this, TrainerInfo.class);
                startActivity(vIntent);
            }
        });
    }
}
