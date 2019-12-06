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
Method | Parameters | Use 
-------|------------|-----
1. The setCurrentHour| this method takes (Integer currentHour).| This method is used to set the hour to the TimePicker.

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

10. The is24HourView, this method does not take any parameters. This method is used to check the current mode of the clock(if it si set to AM/PM or 24 hour). It will return true if the mode is 24hour, and false if it is set AM/AP mode.

11. The setOnTimeChange, this method takes (TimePickerOnTimeChangedListener onTimeChangedListener. This method is used to set the call back, which indicates that the user has made a change to the time. This method counts with an override function onTimeChange(TimePicker view, int hourOfDay, int munute). the first parameter is for the timePicker, the second parameter is for getting the hour of the day after a cjange has been made, and the third paramater id for getting the minute after a change has been made.

TimePiker also counts with some attributes for the xml file (the layout file).
1. Id: all components/widgets in android studio should have an id to distinguish it from other components. This id will be used to set the previous mentioned methods to the required TimePicker.

2. timePickerMode: this attribute is used to set the mode of the TimePicker, either for clock mode or spinner mode. The default value of the TimePicker is the clock mode, but after api level 21, you must use spinner mode.

3. background: this attribute is used to change the colour of the background.

4. padding: this attribute is used to set padding around the TimePicker, it is recommended to used dp as the measurment for the distance. This attribute come with four options: 
  4.1 paddingRight: this is used to set the padding from the right side.
  4.2 paddingLeft: this is used to set the padding from the left side.
  4.3 paddingTop: this is used to set the padding from the upper side.
  4.4 paddingBottom: this is used to set the padding from the lower side.
  4.5 Padding: this is used to set the padding for sll the sides.
  

