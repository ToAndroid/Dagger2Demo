package com.example.dagger2demo;

import javax.inject.Inject;

/**
 * Created by john on 2017/5/25.
 */

public class Poetry {
    private String mPomes;
    private int mPage;
    @Inject
    public Poetry() {
        mPomes = "生活就像海绵";
    }
    public Poetry(String poems){
        mPomes=poems;
    }
    public Poetry(int page){
        mPage=page;
    }

    public String getPomes() {
        return mPomes;
    }
}
