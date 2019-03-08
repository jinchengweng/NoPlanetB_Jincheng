package com.example.aaa.noplanetb_jincheng;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BSplash extends AppCompatActivity {
    private ImageView img;
    private Animation drop_item;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsplash);
        img = findViewById(R.id.roketsplash);
        texto = findViewById(R.id.tvNombre);




        Animation scale = AnimationUtils.loadAnimation(
                this, R.anim.drop_item);
        img.setAnimation(scale);


        Thread tiempo = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(BSplash.this,BLogin.class);
                    startActivity(intent);
                }
            }
        };
        tiempo.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}