package com.example.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowdataActivity extends AppCompatActivity {

    TextView text,text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);
        text=findViewById(R.id.text);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);

        Intent intent=getIntent();
        int a=intent.getIntExtra("intval",0);
        Log.d("gjdfk", "onCreate: "+a);
        text.setText(String.valueOf(a));

        Intent b=getIntent();
        float f=b.getFloatExtra("floatval",0);
        text1.setText(String.valueOf(f));
        Log.d("gjufu", "onCreate: "+f);

        Intent c=getIntent();
        String s=c.getStringExtra("stringval");
        Log.d("gifdiu", "onCreate: "+s);
        text2.setText(s);
    }
}