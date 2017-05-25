package com.example.dagger2demo.module;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by john on 2017/5/25.
 */
@Module
public class ApplicationModule {

    @Singleton
    @Provides
    public Gson provideGson() {
        return new Gson();
    }

}
