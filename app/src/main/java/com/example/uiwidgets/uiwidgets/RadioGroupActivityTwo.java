package com.example.uiwidgets.uiwidgets;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Activity demonstrating use of Activity as listener
 */
public class RadioGroupActivityTwo extends Activity implements View.OnClickListener {

    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiogroup);

        tv = (TextView) findViewById(R.id.textView);

        // Define a generic listener for all three RadioButtons in the RadioGroup
//        final View.OnClickListener radioListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                RadioButton rb = (RadioButton) v;
//                tv.setText(rb.getText() + " chosen");
//            }
//        };

        final RadioButton choice1 = (RadioButton) findViewById(R.id.choice1);
        // Called when RadioButton choice1 is clicked
        //choice1.setOnClickListener(radioListener);
        choice1.setOnClickListener(this);

        final RadioButton choice2 = (RadioButton) findViewById(R.id.choice2);
        // Called when RadioButton choice2 is clicked
        //choice2.setOnClickListener(radioListener);
        choice2.setOnClickListener(this);

        final RadioButton choice3 = (RadioButton) findViewById(R.id.choice3);
        // Called when RadioButton choice3 is clicked
        //choice3.setOnClickListener(radioListener);
        choice3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        RadioButton rb = (RadioButton) v;
        tv.setText(rb.getText() + " chosen");
    }

} // class