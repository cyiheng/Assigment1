package com.example.bjtuembedded.assigment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrainerInfo extends AppCompatActivity {
    private Button aBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trainer_info);

        aBook = (Button)findViewById(R.id.trainer_book);
        aBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vIntent = new Intent(TrainerInfo.this,BookingScreen.class);
                startActivity(vIntent);
            }
        });
    }
}
