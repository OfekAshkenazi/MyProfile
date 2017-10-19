package com.example.android.myprofile;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nameTV,ageTV;
    Button editBtn;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences=getSharedPreferences("settings",MODE_PRIVATE);
        setViews();
        if (preferences.getInt("isOnline",0)==0){
            Intent intent=new Intent(this,RegisterActivity.class);
            startActivity(intent);
        }
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        initUser();
    }

    private void initUser() {
        String name=preferences.getString("name","");
        int age=preferences.getInt("age",-1);
        if (!name.equals(""))
            nameTV.setText(name);
        if (age>=0)
            ageTV.setText(""+age);
    }

    private void setViews() {
        nameTV= (TextView) findViewById(R.id.nameTV);
        ageTV= (TextView) findViewById(R.id.ageTV);
        editBtn= (Button) findViewById(R.id.editBtn);
    }
}
