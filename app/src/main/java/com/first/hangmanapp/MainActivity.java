package com.first.hangmanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String strBlank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar numLetterSeekBar = (SeekBar) findViewById(R.id.numLetterSeekBar);
        numLetterSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                TextView numLetterTextView = (TextView) findViewById(R.id.numLetterTextView);
                TextView wordBlankTextView = (TextView) findViewById(R.id.wordBlankTextView);

                int numLetter = 4 + numLetterSeekBar.getProgress();
                numLetterTextView.setText(numLetter + " Letters");

                strBlank = " ";
                for (int i = 0; i <= numLetter; i++) {
                    if (i!= numLetter)
                            strBlank = strBlank + "_ ";
                }
                wordBlankTextView.setText(strBlank);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
