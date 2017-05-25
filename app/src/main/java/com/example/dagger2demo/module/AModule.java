package com.example.dagger2demo.module;

import com.example.dagger2demo.Poetry;
import com.example.dagger2demo.scope.AScope;
import com.example.dagger2demo.scope.PoetryQualifier;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by john on 2017/5/25.
 */

@Module
public class AModule {
    @PoetryQualifier("A")
    @AScope
    @Provides
    public Poetry getPoetry() {
        return new Poetry("万物美好");
    }
    @Named("B")
    @AScope
    @Provides
    public Poetry getOtherPoetry() {
        return new Poetry("我在中间");
    }
}
