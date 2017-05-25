package com.example.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.dagger2demo.component.MainComponent;
import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Poetry mPoetry;

    @Inject
    Gson mGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainComponent.getInstace().inject(this);
        initView();
    }

    private void initView() {
        TextView tv = (TextView) findViewById(R.id.tv_text);
        String json = mGson.toJson(mPoetry);
        tv.setText(json+" ,mPoetry : " +mPoetry);
        findViewById(R.id.bt_open).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AActivity.class));
        });
    }
}
