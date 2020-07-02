package com.example.date;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;



public class MainActivity extends Activity{

    long now = System.currentTimeMillis();

    Date date = new Date(now);


    SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


    String formatDate = sdfNow.format(date);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textView = findViewById(R.id.textView);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                long now = System.currentTimeMillis();

                Date date = new Date(now);


                SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


                String formatDate = sdfNow.format(date);

                textView.setText(formatDate);

            }
        });
    }
}









