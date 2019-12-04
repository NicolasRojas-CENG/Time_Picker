## Time_Picker
This is a example app on two ways to implement a timepicker in your app

In android, TimePicker is a widget for selecting the time of day, in either 24-hour or AM/PM mode. 
The displayed time consist of hours, minutes, and clock format, which can be in either 12 hour (AM/PM) or 24 hour mode.
Android provides this functionality through TimePicker class.
If we need to show this view as a Dialog then we have to use a TimePickerDialog class.
Although DialogFragment was first added to the platform in Android 3.0 (API level 11),
if your app supports versions of Android older than 3.0,even as low as Android 1.6, you can use the DialogFragment class that's 
available in the support library for backward compatibility.
This widget can be set in both clock mode or spinner mode. This example app will show both off.

The following are a list of some common methods of a time picker; these can be used to configure a time picker in an app.
1. The setCurrentHour, this method takes (Integer currentHour). This method is used to set the hour to the TimePicker.

2. The setHour, for API level 23 and above, this method takes (Integer hour). This method is the same as setCurrentHour, but for API
leves 23 and above, since setCurrentHour has been deprecated in the API level 23.

3. The setCurrentMinute, this method takes (Integer currentMinute). This method is used to set the minute to the TimePicker.

4. The setMinute, for API level 23 and above, this method takes (Integer minute). This method is the same as setCurrentMinute, but for API
leves 23 and above, since setCurrentHour has been deprecated in the API level 23.

5. The getCurrentHour, this method does not take any parameters, but does return an integer value. This method is used to get the current 
hours from the TimePicker.

6. The getHour, for API level 23 and above, this method does not take any parameters, but does return an integer value. This method is the
same as getCurrentHour, but for API leves 23 and above, since getCurrentHour has been deprecated in the API level 23.

7. The getCurrentMinute, this method does not take any parameters, but does return an integer value. This method is used to get the current
minute from the TimePicker.

8. The getMinute, for API level 23 and above, this method does not take any parameters, but does return an integer value. This method is 
the same as getCurrentMinute, but for API leves 23 and above, since getCurrentMinute has been deprecated in the API level 23.

9. The setIs24HourView, this method takes (Boolean is24HourView). This method is used to set the mode of the clock to AM/PM or 24 hour. 
You can set the Boolean value to true for 24 hour mode or false for AM/PM mode.
