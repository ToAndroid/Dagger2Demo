package com.example.dagger2demo.component;

import com.example.dagger2demo.AActivity;
import com.example.dagger2demo.module.AModule;
import com.example.dagger2demo.scope.AScope;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by john on 2017/5/25.
 */
@AScope
@Subcomponent(modules = AModule.class)
public interface AComponent {
    void inject(AActivity activity);
}
