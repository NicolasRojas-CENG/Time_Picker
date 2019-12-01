package com.e.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Test2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final TextView time;
        TimePicker simpleTimePicker;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        Button test1Button = findViewById(R.id.Test1);
        test1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent THScreenIntent = MainActivity.makeIntent(Test2.this);
                startActivity(THScreenIntent);
                finish();
            }
        });

        time = (TextView) findViewById(R.id.time);
        simpleTimePicker = (TimePicker) findViewById(R.id.simpleTimePicker);
        simpleTimePicker.setIs24HourView(false);
        simpleTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // display a toast with changed values of time picker
                Toast.makeText(getApplicationContext(), hourOfDay + "  " + minute, Toast.LENGTH_SHORT).show();
                time.setText(hourOfDay + " : " + minute); // set the current time in text view
            }
        });

    }

    public static Intent makeIntent(Context context){
        return new Intent(context, Test2.class);
    }

}
