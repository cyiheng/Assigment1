package com.example.bjtuembedded.assigment1;

import android.content.Intent;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button aLog;
    private ImageButton aNews;
    private ImageButton aResearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aLog = (Button)findViewById(R.id.log_done);
        aNews = (ImageButton)findViewById(R.id.news);
        aResearch = (ImageButton)findViewById(R.id.book);

        aLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vIntent = new Intent(MainActivity.this,LogIn.class);
                startActivity(vIntent);
            }
        });

        aNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vIntent = new Intent(MainActivity.this,News.class);
                startActivity(vIntent);
            }
        });

        aResearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vIntent = new Intent(MainActivity.this,ResearchTrainer.class);
                startActivity(vIntent);
            }
        });

    }


}
