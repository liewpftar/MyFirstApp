package com.taruc.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);   // *dit will overwrite by textview on fly

        //grab the intent
        Intent intent = getIntent();
        String msg = intent.getStringExtra("key");

        //create textView on the fly
        TextView textView = new TextView(this);
        textView.setText(msg);
        setContentView(textView);
    }

}
