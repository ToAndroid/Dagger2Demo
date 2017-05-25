package com.example.dagger2demo.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by john on 2017/5/25.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface AScope {
}
