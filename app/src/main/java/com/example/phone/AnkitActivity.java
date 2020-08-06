package com.example.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnkitActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankit);

        Intent intent = getIntent();
        float name = intent.getFloatExtra("name",0); //data nikal liya
        Log.d("dfgkg", "onCreate: "+name);  //data check kiya aya ki nHI

        text =findViewById(R.id.text);
       text.setText(String.valueOf(name));  //data set kiya

    }
}