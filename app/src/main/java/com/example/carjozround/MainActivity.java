package com.example.carjozround;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout food;
    private RelativeLayout retail;
    private RelativeLayout travel;
    private RelativeLayout sport;
    private RelativeLayout entertainment;
    private TextView next;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food=(RelativeLayout)findViewById(R.id.food);
        retail=(RelativeLayout)findViewById(R.id.retail);
        travel=(RelativeLayout)findViewById(R.id.travel);
        sport=(RelativeLayout)findViewById(R.id.sport);
        entertainment=(RelativeLayout)findViewById(R.id.entertainment);
        next = (TextView) findViewById(R.id.next);
        img=(ImageView)findViewById(R.id.img_arrow);

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                food.setBackgroundResource(R.drawable.corners2);
            }
        });

        retail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retail.setBackgroundResource(R.drawable.corners);
            }
        });

        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                travel.setBackgroundResource(R.drawable.corners);
            }
        });

        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sport.setBackgroundResource(R.drawable.corners2);
            }
        });

        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entertainment.setBackgroundResource(R.drawable.corners);
            }
        });
        next.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Dashboard.class);
                startActivity(i);
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Dashboard.class);
                startActivity(i);
            }
        });
    }
}
