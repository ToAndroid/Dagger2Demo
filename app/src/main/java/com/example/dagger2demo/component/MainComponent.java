package com.example.dagger2demo.component;

import com.example.dagger2demo.MainActivity;
import com.example.dagger2demo.MainApplication;
import com.example.dagger2demo.OtherActivity;
import com.example.dagger2demo.module.MainModule;
import com.example.dagger2demo.module.PoetryModule;
import com.example.dagger2demo.scope.PoetryScope;

import dagger.Component;

/**
 * Created by john on 2017/5/25.
 */
@PoetryScope
@Component(dependencies = ApplicationComponent.class, modules = {PoetryModule.class})
public abstract class MainComponent {
    public abstract void inject(MainActivity activity);

    public abstract void inject(OtherActivity activity);

    private static MainComponent sComponent;

    public static MainComponent getInstace() {
        if (sComponent == null) {
            sComponent = DaggerMainComponent.builder()
                    .applicationComponent(MainApplication.getInstace()
                            .getApplicationComponent()).build();
        }
        return sComponent;

    }
}
