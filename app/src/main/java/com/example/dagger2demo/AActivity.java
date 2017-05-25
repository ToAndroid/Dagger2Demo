package com.example.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dagger2demo.component.MainComponent;
import com.example.dagger2demo.scope.PoetryQualifier;
import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Named;

public class AActivity extends AppCompatActivity {

    @Inject
    Gson mGson;

    @Named("B")
    @Inject
    Poetry mPoetry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        MainApplication.getInstace().
                getAComponent().inject(this);
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(mPoetry.getPomes()+",mPoetry:"+mPoetry+(mGson == null ? "Gson没被注入" : "Gson已经被注入"));
    }
}
