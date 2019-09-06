package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
    protected void onStart(){
        super.onStart();
        Toast.makeText(context: this, text: "App on start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(context: this, text: "App on Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Tost.makeText (context: this, text: "App on Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Tost.makeText (context: this, text: "App on Resume", Toast.LENGTH_SHORT).show();

        @Override
        protected void onPause(){
            super.onPause();
            Tost.makeText (context: this, text: "App on Pause", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onDestroy(){
            super.onDestroyt();
            Tost.makeText (context: this, text: "App on Destroy", Toast.LENGTH_SHORT).show();
        }
