package com.sumonandroid.mycalender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class CalenderPage extends AppCompatActivity {

    TextView see, holyday;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_page);

        see = (TextView) findViewById(R.id.textView1);
        holyday = (TextView) findViewById(R.id.textView2);
        datePicker = (DatePicker) findViewById(R.id.date);

        holyday.setText("Break day");
        see.setText(currentdate());


        //int a = datePicker.getMonth();

    }

    String currentdate() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Current Date : ");
        stringBuilder.append(datePicker.getDayOfMonth() + "/");
        stringBuilder.append(datePicker.getMonth() + 1 + "/");
        stringBuilder.append(datePicker.getYear());
        return stringBuilder.toString();

    }

//    public void holyday() {
//
//        int a = datePicker.getMonth();
//
//        switch (a) {
//            case 1:
//                holyday.setText("sumon");
//                break;
//            case 2:
//                holyday.setText("khair");
//                break;
//            case 3:
//                holyday.setText("Raaju vi");
//                break;
//            default:
//                holyday.setText("try again !!!");
//        }

}
