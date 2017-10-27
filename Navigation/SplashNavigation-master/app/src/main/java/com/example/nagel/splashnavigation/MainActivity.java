package com.example.nagel.splashnavigation;
//Todo:need to add the imports Intent and Handler to fix code
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Todo:add following code 4000 milliseconds= 4 seconds of the splash screen displaying before the "HomeActivity" is displayed
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Todo: add new handler that will delay the HomeActivity being displayed
        new Handler().postDelayed(new Runnable(){
            @Override
            //Todo:overrites the task by giving it new -> to open HomeActivity
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
