package com.daclink.gitdemo_4_6;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import io.github.muddz.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v){
        new StyleableToast
                .Builder(getApplicationContext())
                .text("Hello world!")
                .gravity(Gravity.TOP)
                .textColor(Color.WHITE)
                .backgroundColor(Color.BLUE)
                .show();
    }

}