package com.example.wordquizgame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button playGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playGameButton = (Button) findViewById(R.id.playGameButton);
        playGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("เลือกระดับความยาก");
                dialog.setItems(
                        new String[]{"ง่าย", "ปานกลาง", "ยาก"},
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Log.i(TAG, "ผู้ใช้เลือก " + which);
                            }
                        }
                );
                dialog.show();
            }
        });
    }
}
