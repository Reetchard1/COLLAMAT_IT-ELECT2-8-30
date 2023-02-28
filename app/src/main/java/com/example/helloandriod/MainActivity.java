package com.example.helloandriod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG,"hello world");
        Log.d(TAG,"hello world");
        Log.i(TAG,"hello world");
        Log.w(TAG,"hello world");
        Log.e(TAG,"hello world");

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void setIntent(Intent intent) {
                this.intent = intent;
            }

            @Override
            public void onClick(View v) {
                Log.i(TAG, " Button Clicked");
            }
                Intent intent = new Intent (MainActivity.this, MainActivity2.class);
        });
        {
    }
}}