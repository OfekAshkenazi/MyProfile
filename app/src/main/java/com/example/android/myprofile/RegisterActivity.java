package com.example.android.myprofile;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    SharedPreferences preferences;
    EditText nameET,ageET;
    Button saveBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        preferences=getSharedPreferences("settings",MODE_PRIVATE);
        nameET= (EditText) findViewById(R.id.nameET);
        ageET= (EditText) findViewById(R.id.ageET);
        saveBtn= (Button) findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=nameET.getText().toString();
                int age=Integer.valueOf(ageET.getText().toString());
                preferences.edit().putString("name",name).putInt("age",age).putInt("isOnline",1).commit();
                finish();
            }
        });
    }
}
