package com.example.dagger2demo.component;

import com.example.dagger2demo.module.AModule;
import com.example.dagger2demo.module.ApplicationModule;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by john on 2017/5/25.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Gson getGson();

    AComponent plus(AModule module);
}
