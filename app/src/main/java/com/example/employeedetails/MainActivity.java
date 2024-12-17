package com.example.workmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.employeedetails.R;
import com.example.employeedetails.menuActivity;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        b1 =(Button) findViewById(R.id.log);
        e1 =(EditText) findViewById(R.id.unam);
        e2 =(EditText) findViewById(R.id.pass);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = e1.getText().toString().trim();
                String s2 = e2.getText().toString().trim();


                if (s1.equals("admin") && s2.equals("1234")) {
                    Intent i = new Intent(getApplicationContext(), menuActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}