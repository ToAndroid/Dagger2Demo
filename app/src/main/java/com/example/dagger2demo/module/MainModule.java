package com.example.dagger2demo.module;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * Created by john on 2017/5/25.
 */

@Module
public class MainModule {
    @Provides
    public Gson providesGson(){
        return  new Gson();
    }
}
