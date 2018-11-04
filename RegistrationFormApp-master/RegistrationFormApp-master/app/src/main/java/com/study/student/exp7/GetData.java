package com.study.student.exp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GetData extends AppCompatActivity {
TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);
        txt=findViewById(R.id.text);
        Intent intent = getIntent();

        String fName = intent.getStringExtra("firstName");
        String lName = intent.getStringExtra("lastName");
        String email=intent.getStringExtra("email");
        String contact=intent.getStringExtra("contact");

        txt.setText("First Name: "+fName+"\nLast Name: "+lName+"\nEmail: "+email+"\nContact: "+contact);

    }
}
