package com.example.bjtuembedded.assigment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogIn extends AppCompatActivity {

    private Button aNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        aNewAccount = (Button)findViewById(R.id.log_create);
        aNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vIntent = new Intent(LogIn.this,Register.class);
                startActivity(vIntent);
            }
        });
    }
}
