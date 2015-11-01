package com.example.wordquizgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.playGameButton);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast t1 = Toast.makeText(
                MainActivity.this,
                "Hello",
                Toast.LENGTH_SHORT
        );

        t1.show();
    }
}
