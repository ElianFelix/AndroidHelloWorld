package com.example.androidhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // User can tap a button to change the text color of the label
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the text color
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.orange));
            }
        });

        // User can tap a button to change the color of the background view
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.purple_700));
            }
        });

        // User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the text color
                ((TextView) findViewById(R.id.text)).setText("Android is AWESOME!!");
            }
        });

        // User can tap on the background view to reset all views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reset text
                ((TextView) findViewById(R.id.text)).setText("Hello from Elian!");

                // Reset background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.blue_bg));

                // Reset text color
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        // User can update the label text with custom text entered into the text field
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the text color
                String inputFieldText = ((TextView) findViewById(R.id.inputField)).getText().toString();

                // Set text to custom text, or if custom text is empty set to default hint
                if (inputFieldText.isEmpty()) {
                    ((TextView) findViewById(R.id.text)).setText("Enter your OWN text!");
                } else {
                    ((TextView) findViewById(R.id.text)).setText(inputFieldText);
                }
            }
        });
    }
}