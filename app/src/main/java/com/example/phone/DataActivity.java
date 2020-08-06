package com.example.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DataActivity extends AppCompatActivity {

    Button submit;
    int a=10;
    float b=12.5f;
    String s="ankit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(DataActivity.this,ShowdataActivity.class);
                intent.putExtra("intval",a);
                intent.putExtra("floatval",b);
                intent.putExtra("stringval",s);
                startActivity(intent);
            }
        });
    }
}