package com.e.timepicker;

import androidx.appcompat.app.AppCompatActivity;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this is the set up to go to the next activity, where the sinner mode can be found.
        Button test2Button = findViewById(R.id.Test2);
        test2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent THScreenIntent = Test2.makeIntent(MainActivity.this);
                startActivity(THScreenIntent);
                finish();
            }
        });

        /*TODO 1.2 This is the set up for the TextView and the TimePicker
         * Use the IDs set up in the Layout file from 1.1*/

        final TextView time = findViewById(R.id.Time);
        TimePicker timePicker = findViewById(R.id.TimePicker);
        //This is to set a 24 hour clock, this means midnight is 00:00, and noon is 12:00
        timePicker.setIs24HourView(true);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            //This code is for the TimePicker itself. It will set the text within the Text view
            //to show the time selected for the TimePicker.
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // display a toast with changed values of time picker
                time.setText(String.format("%d : %d", hourOfDay, minute)); // set the current time in text view
            }
        });

    }
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView textView = findViewById(R.id.Time);
        textView.setText(String.format("%d : %d", hourOfDay, minute));
    }
    //This is code to handle the start of the the new activity.
    public static Intent makeIntent(Context context){
        return new Intent(context, MainActivity.class);
    }

}
