package com.londonappbrewery.iampoor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reach extends AppCompatActivity {

    Button btnReach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reach);

        btnReach = (Button) findViewById(R.id.btnReach);

        btnReach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reachAcitivty = new Intent(Reach.this, MainActivity.class);
                startActivity(reachAcitivty);
            }
        });


    }
}
