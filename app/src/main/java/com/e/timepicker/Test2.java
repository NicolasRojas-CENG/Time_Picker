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

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        //This code is to handle the button that takes us to the first screen/activity.
        Button test1Button = findViewById(R.id.Test1);
        test1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent THScreenIntent = MainActivity.makeIntent(Test2.this);
                startActivity(THScreenIntent);
                finish();
            }
        });

        /* TODO 2.3 Now set up the TextView from 2.2 to change with the TimePicker. */
        final TextView time = findViewById(R.id.Time);
        TimePicker timePicker = findViewById(R.id.TimePicker);
        timePicker.setIs24HourView(true);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            //This code is for the TimePicker itself. It will set the text within the Text view
            //to show the time selected for the TimePicker.
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // display a toast with changed values of time picker
                Toast.makeText(getApplicationContext(), hourOfDay + "  " + minute, Toast.LENGTH_SHORT).show();
                time.setText(String.format("%d : %d", hourOfDay, minute)); // set the current time in text view
            }
        });

    }

    //This code is just to handle the change between activities.
    public static Intent makeIntent(Context context){
        return new Intent(context, Test2.class);
    }

}
