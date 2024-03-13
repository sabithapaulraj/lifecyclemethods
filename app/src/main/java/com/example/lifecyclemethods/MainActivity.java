package com.example.mobileapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(), "OnCreate Called", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void onStart() {
        // It will show a message on the screen
        // then onStart is invoked
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "OnStart Called", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void onRestart() {
        // It will show a message on the screen
        // then onRestart is invoked
        super.onRestart();
        Toast toast = Toast.makeText(getApplicationContext(), "OnRestart Called", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void onResume() {
        // It will show a message on the screen
        // then onResume is invoked
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext(), "OnResume Called", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void onPause() {
        // It will show a message on the screen
        // then onPause is invoked
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext(), "OnPause Called", Toast.LENGTH_LONG);
        toast.show();

    }
    protected void onStop() {
        // It will show a message on the screen
        // then onStop is invoked
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext(), "OnStop Called", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void onDestroy() {
        // It will show a message on the screen
        // then onDestroy is invoked
        super.onDestroy();
        Toast toast = Toast.makeText(getApplicationContext(), "onDestroy Called", Toast.LENGTH_LONG);
        toast.show();
    }
}
