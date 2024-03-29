## Time_Picker
*__This is a very simple example app on two ways to implement a timepicker in your app using Java code. This is intended to get you started with the basic setup for the Time Picker widget.__*

## Table of Contents
* [TimePicker Introduction](#TimePickerIntroduction)
* [TimePicker Methods](#TimePickerMethods)
* [TimePicker XML Attributes](#TimePickerXMLAttributes)
* [Code](#Code)
* [Code Output](#CodeOutput)
* [References](#References)

## <a name="TimePickerIntroduction"> TimePicker Introduction </a>

In android, TimePicker was introduced into the java,Lang.Object library and extends FrameLayout, as seen in the image provided below.

![BACKGROUND_ATTRIBUTE](https://github.com/NicolasRojas-CENG/Time_Picker/blob/master/Images/lib.PNG?raw=true)

TimePicker is a widget for selecting the time of day, in either 24-hour or AM/PM mode. 
The displayed time consist of hours, minutes, and clock format, which can be in either 12 hour (AM/PM) or 24 hour mode.
Android provides this functionality through TimePicker class.
If we need to show this view as a Dialog then we have to use a TimePickerDialog class.
Although DialogFragment was first added to the platform in Android 3.0 (API level 11),
if your app supports versions of Android older than 3.0,even as low as Android 1.6, you can use the DialogFragment class that's 
available in the support library for backward compatibility.
This widget can be set in both clock mode or spinner mode. This example app will show both off.

## <a name="TimePickerMethods"> TimePicker Methods </a>

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

## <a name="TimePickerXMLAttributes"> TimePicker XML Attributes </a>

TimePiker also counts with some attributes for the xml file (the layout file).
1. __Id__: all components/widgets in android studio should have an id to distinguish it from other components. This id will be used to set the previous mentioned methods to the required TimePicker.

![ID_ATTRIBUTE](https://github.com/NicolasRojas-CENG/Time_Picker/blob/master/Images/id.PNG?raw=true)

1. __Height/Width__: all components in android studio should have a set height and width to them, it could be either 'wrap content', 'match parent', or any set amount you want (it is recomended you use dp for the measurment).

![BACKGROUND_ATTRIBUTE](https://github.com/NicolasRojas-CENG/Time_Picker/blob/master/Images/h_w.PNG?raw=true)

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
  
## <a name="Code"> Code </a>
Please follow the TODO comments, this will show you step by step on how to set up both the clock mode and the spinner mode of TimePicker. The TODO coments are devided into 1.# for the Clock mode of the TimePicker, and 2.# for the spinner mode of the TimePicker. There are supplementary coments within the code, these will help tu understand the code better. This example will be using the __setIs24HourView__ and __setOnTimeChangedListener__ methods for the TimPicker, along with the Calander class to get the time we need.

These code snippings are for your refrence.

__Step one:__ Add the TimePicker widget to the layoutfile.

__activity_main.xml__

```
<TimePicker
        android:id="@+id/TimePicker"
        android:layout_width="284dp"
        android:layout_height="380dp"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="184dp"
        android:background="#52B35A"
        android:headerBackground="#8FFF98"
        android:numbersBackgroundColor="#FF8FB6"
        android:numbersSelectorColor="#8FFF98"
        android:padding="20dp"
        android:timePickerMode="clock"
        app:layout_constraintBottom_toTopOf="@+id/Test2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.496"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/Time"
        app:layout_constraintVertical_bias="1.0" />
```

__Step two:__ Add the TextView to show the time, other than the TimePicker itself. This is to show that you can pass the time information to other activities. 

__activity_main.xml__

```
<TextView
        android:id="@+id/Time"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:layout_marginEnd="108dp"
        android:text="@string/time_selected"
        android:textAllCaps="false"
        android:textSize="30sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.982"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView">
```
__Step three:__

__MainActivity.java__ Add the code so the time can be passed from the TimePicker to the TextView. Careful with the IDs, use the same ones from the .xml file

```
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
```

This is for the clock mode of the TimePicker, if you want to use the spinner mode, just change the __android:timePickerMode="clock"__ to spinner, the rest can stay the same.

## <a name="CodeOutput"> Code Output </a>
![CLOCK_MODE](https://github.com/NicolasRojas-CENG/Time_Picker/blob/master/Images/activity1.jpg?raw=true)
![SPINNER_MODE](https://github.com/NicolasRojas-CENG/Time_Picker/blob/master/Images/activity2.jpg?raw=true)
  
## <a name="References"> References </a>
* [Tutlane](https://www.tutlane.com/tutorial/android/android-timepicker-with-examples)
* [Abhiandroid.com](https://abhiandroid.com/ui/timepicker)
* [Android Developer](https://developer.android.com/reference/android/widget/TimePicker)
* [Coding in Flow](https://www.youtube.com/watch?v=QMwaNN_aM3U)

