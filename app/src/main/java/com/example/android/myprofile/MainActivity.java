package com.example.android.myprofile;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nameTV,ageTV;
    Button saveBtn;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences=getSharedPreferences("settings",MODE_PRIVATE);
        setViews();
        if (preferences.getInt("isOnline",0)==0){
            //go to login mode
        }
        initUser();
    }

    private void initUser() {

    }

    private void setViews() {
        nameTV= (TextView) findViewById(R.id.nameTV);
        ageTV= (TextView) findViewById(R.id.ageTV);
        saveBtn= (Button) findViewById(R.id.saveBtn);
    }
}
