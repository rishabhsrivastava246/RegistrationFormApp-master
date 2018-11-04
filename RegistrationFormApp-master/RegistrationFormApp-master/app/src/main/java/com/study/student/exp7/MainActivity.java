package com.study.student.exp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText f_name,l_name,email,contact,password;
String fname,lname,email_add,con,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f_name=findViewById(R.id.fname);
        l_name=findViewById(R.id.lname);
        email=findViewById(R.id.email);
        contact=findViewById(R.id.contact);
        password=findViewById(R.id.password);

    }

    public void submit(View view) {
        fname=f_name.getText().toString();
        lname=l_name.getText().toString();
        email_add=email.getText().toString();
        con=contact.getText().toString();
        pass=password.getText().toString();
        Intent myIntent = new Intent(this, GetData.class);
        myIntent.putExtra("firstName", fname);
        myIntent.putExtra("lastName", lname);
        myIntent.putExtra("email",email_add);
        myIntent.putExtra("contact",con);
        startActivity(myIntent);

    }
}
