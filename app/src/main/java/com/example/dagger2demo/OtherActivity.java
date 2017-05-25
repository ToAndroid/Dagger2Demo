package com.example.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dagger2demo.component.MainComponent;
import com.google.gson.Gson;

import javax.inject.Inject;

import dagger.Component;

public class OtherActivity extends AppCompatActivity {

    @Inject
    Poetry mPoetry;

    @Inject
    Gson mGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        MainComponent.getInstace().inject(this);
        initView();
    }

    private void initView() {
        TextView tv = (TextView) findViewById(R.id.textView);
        String json = mGson.toJson(mPoetry);
        tv.setText(json+" ,mPoetry : " +mPoetry);
    }
}
