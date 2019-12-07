package com.e.timepicker;

import android.os.Bundle;
import android.app.Dialog;
import java.util.Calendar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.TimePickerDialog;
import android.text.format.DateFormat;
import androidx.fragment.app.DialogFragment;

/*TODO 1.4 This code handles the actual TimePicker. This code takes the time you set in the TimePicker.
* We are using Calander to get the time we need, in this case hours and minutes.*/
public class Time extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar calendar =  Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        return new TimePickerDialog(getActivity(), (TimePickerDialog.OnTimeSetListener)getActivity(), hour, minute, DateFormat.is24HourFormat(getActivity()));
    }
}
