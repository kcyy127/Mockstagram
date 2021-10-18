package com.example.mockstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zWNEtj4yeOHC8cvzpMAzEhbG88WMiAX2DiksjfVU")
                .clientKey("a8m03RKjyMfxwdgFNUng6NYmR0QoDSa3a3r8n16k")
                .server("https://mockstagram.b4a.io")
                .build()
        );
    }
}
