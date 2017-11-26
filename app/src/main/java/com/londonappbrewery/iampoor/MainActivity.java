package com.londonappbrewery.iampoor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPoor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPoor = (Button) findViewById(R.id.btnPoor);

        btnPoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent poorActivity = new Intent(MainActivity.this, Reach.class);
                startActivity(poorActivity);
            }
        });


    }
}
