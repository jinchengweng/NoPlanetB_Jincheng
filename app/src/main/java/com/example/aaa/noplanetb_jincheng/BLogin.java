package com.example.aaa.noplanetb_jincheng;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blogin);
    }
    public void onClick(View v){
        Intent intent = new Intent(this, BMain.class);
        startActivity(intent);
    }
}
