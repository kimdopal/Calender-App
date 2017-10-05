package com.sumonandroid.mycalender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    Button Show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Show = (Button) findViewById(R.id.showHead);
        
        Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CalenderPage.class);
                startActivity(intent);

            }
        });


    }

}
