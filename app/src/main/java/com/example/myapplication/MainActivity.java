package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show();
        // View image = view.getResources().getIdentifier("image", "Button", );
    }

    public void imageClicked(View view) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    SystemClock.sleep(1000);
                }
            }
        }).start();

        //for (int i = 0; i < 5; i++) {
            //SystemClock.sleep(1000);
            ImageView imageView = (ImageView) view;
            imageView.setX(imageView.getX() + 10);
    }
}