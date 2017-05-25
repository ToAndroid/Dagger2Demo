package com.example.dagger2demo;

import android.app.Application;

import com.example.dagger2demo.component.AComponent;
import com.example.dagger2demo.component.ApplicationComponent;
import com.example.dagger2demo.component.DaggerApplicationComponent;
import com.example.dagger2demo.module.AModule;

/**
 * Created by john on 2017/5/25.
 */

public class MainApplication extends Application {
    private static MainApplication sApplication;
    private ApplicationComponent mApplicationComponent;
    private AComponent mAComponent;

    public static MainApplication getInstace() {
        return sApplication;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
        mApplicationComponent = DaggerApplicationComponent.builder().build();

    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    public AComponent getAComponent() {
        if (mAComponent == null) {
            mAComponent = mApplicationComponent.plus(new AModule());
        }
        return mAComponent;
    }
}
