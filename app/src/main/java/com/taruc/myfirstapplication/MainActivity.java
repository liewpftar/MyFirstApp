package com.taruc.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //declare
    private Button buttonSend;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize views
        buttonSend = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
    }


    public void sendMessage(View v){
        String message = editText.getText().toString();
        //use intent to communicate with other activity
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("key",message);
        startActivity(intent);
    }
}
