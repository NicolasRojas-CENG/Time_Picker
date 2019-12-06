package com.e.timepicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TODO 1.2 This is the set up for the button that opens the TimePicker.
        * Use the IDs set up in the Layout file from 1.1*/
        Button button = findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment time = new Time();
                time.show(getSupportFragmentManager(), "time picker");
            }
        });

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

    }
    /*TODO 1.3 This code is set the time you choose to the TextView mentioned in the layout file.
    * Be sure you are using the correct ID for the TextView.*/
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView textView = findViewById(R.id.Time);
        textView.setText(hourOfDay + " : " + minute);
    }
    //This is code to handle the start of the the new activity.
    public static Intent makeIntent(Context context){
        return new Intent(context, MainActivity.class);
    }

}
