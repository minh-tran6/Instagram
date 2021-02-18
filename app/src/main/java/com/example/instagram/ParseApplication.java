package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    //Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KmyMFCkyzVDl1tXaRgglSvgrYev4zJdSENQO2Cru")
                .clientKey("h0xtkYeHl94cDQwC6RFpP6ZNNpzLTFaSZqWovv8q")
                .server("https://parseapi.back4app.com")
                .build()
        );
    };
}
