## Time_Picker
*__This is a example app on two ways to implement a timepicker in your app using Java code.__*

In android, TimePicker is a widget for selecting the time of day, in either 24-hour or AM/PM mode. 
The displayed time consist of hours, minutes, and clock format, which can be in either 12 hour (AM/PM) or 24 hour mode.
Android provides this functionality through TimePicker class.
If we need to show this view as a Dialog then we have to use a TimePickerDialog class.
Although DialogFragment was first added to the platform in Android 3.0 (API level 11),
if your app supports versions of Android older than 3.0,even as low as Android 1.6, you can use the DialogFragment class that's 
available in the support library for backward compatibility.
This widget can be set in both clock mode or spinner mode. This example app will show both off.

## TimePicker Methods

The following are a list of some common methods of a time picker; these can be used to configure a time picker in an app.

1. The __setCurrentHour__, this method takes (Integer currentHour). This method is used to set the hour to the TimePicker.

1. The __setHour__, for API level 23 and above, this method takes (Integer hour). This method is the same as setCurrentHour, but for API
leves 23 and above, since setCurrentHour has been deprecated in the API level 23.

1. The __setCurrentMinute__, this method takes (Integer currentMinute). This method is used to set the minute to the TimePicker.

1. The __setMinute__, for API level 23 and above, this method takes (Integer minute). This method is the same as setCurrentMinute, but for API
leves 23 and above, since setCurrentHour has been deprecated in the API level 23.

1. The __getCurrentHour__, this method does not take any parameters, but does return an integer value. This method is used to get the current 
hours from the TimePicker.

1. The __getHour__, for API level 23 and above, this method does not take any parameters, but does return an integer value. This method is the
same as getCurrentHour, but for API leves 23 and above, since getCurrentHour has been deprecated in the API level 23.

1. The __getCurrentMinute__, this method does not take any parameters, but does return an integer value. This method is used to get the current
minute from the TimePicker.

1. The __getMinute__, for API level 23 and above, this method does not take any parameters, but does return an integer value. This method is 
the same as getCurrentMinute, but for API leves 23 and above, since getCurrentMinute has been deprecated in the API level 23.

1. The __setIs24HourView__, this method takes (Boolean is24HourView). This method is used to set the mode of the clock to AM/PM or 24 hour. 
You can set the Boolean value to true for 24 hour mode or false for AM/PM mode.

1. The __is24HourView__, this method does not take any parameters. This method is used to check the current mode of the clock(if it si set to AM/PM or 24 hour). It will return true if the mode is 24hour, and false if it is set AM/AP mode.

1. The __setOnTimeChange__, this method takes (TimePickerOnTimeChangedListener onTimeChangedListener. This method is used to set the call back, which indicates that the user has made a change to the time. This method counts with an override function onTimeChange(TimePicker view, int hourOfDay, int munute). the first parameter is for the timePicker, the second parameter is for getting the hour of the day after a cjange has been made, and the third paramater id for getting the minute after a change has been made.

## XML Attributes

TimePiker also counts with some attributes for the xml file (the layout file).
1. __Id__: all components/widgets in android studio should have an id to distinguish it from other components. This id will be used to set the previous mentioned methods to the required TimePicker.

![ID_ATTRIBUTE](https://github.com/NicolasRojas-CENG/Time_Picker/blob/master/Images/id.PNG?raw=true)

1. __timePickerMode__: this attribute is used to set the mode of the TimePicker, either for clock mode or spinner mode. The default value of the TimePicker is the clock mode, but after api level 21, you must use spinner mode.

![BACKGROUND_ATTRIBUTE](https://github.com/NicolasRojas-CENG/Time_Picker/blob/master/Images/mode.PNG?raw=true)

1. __background__: this attribute is used to change the colour of the background.

![BACKGROUND_ATTRIBUTE](https://github.com/NicolasRojas-CENG/Time_Picker/blob/master/Images/bg.PNG?raw=true)

1. __padding__: this attribute is used to set padding around the TimePicker, it is recommended to used dp as the measurment for the distance. This attribute come with four options: 
  * __paddingRight__: this is used to set the padding from the right side.
  * __paddingLeft__: this is used to set the padding from the left side.
  * __paddingTop__: this is used to set the padding from the upper side.
  * __paddingBottom__: this is used to set the padding from the lower side.
  * __Padding__: this is used to set the padding for sll the sides.
  
![BACKGROUND_ATTRIBUTE](https://github.com/NicolasRojas-CENG/Time_Picker/blob/master/Images/pad.PNG?raw=true)
  
## Code
Please follow the TODO comments, this will show you step by step on how to set up both the clock mode and the spinner mode of TimePicker.
  
## Refrences
* [Tutlane](https://www.tutlane.com/tutorial/android/android-timepicker-with-examples)
* [Abhiandroid.com](https://abhiandroid.com/ui/timepicker)
* [Android Developer](https://developer.android.com/reference/android/widget/TimePicker)

