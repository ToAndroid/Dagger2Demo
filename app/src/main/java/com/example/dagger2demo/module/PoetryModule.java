package com.example.dagger2demo.module;

import com.example.dagger2demo.Poetry;
import com.example.dagger2demo.scope.PoetryScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by john on 2017/5/25.
 */
@Module
public class PoetryModule {

    @PoetryScope
    @Provides
    public Poetry providePoetry(String poems) {
        return new Poetry(poems);
    }

//    @Provides
//    public Poetry providePoetry12(int poems) {
//        return new Poetry(poems);
//    }

    @Provides
    public String providePoems() {
        return "只有意志坚强的人，才能达到彼岸";
    }

    @Provides
    public int providePoems12() {
        return 1111;
    }
}
