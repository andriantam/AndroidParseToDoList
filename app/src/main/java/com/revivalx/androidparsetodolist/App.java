package com.revivalx.androidparsetodolist;

/**
 * Created by MNurdin on 6/9/15.
 */

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "YDZgECavMfJAvVZ8tOLHXAU9EU45eBKNkWLt4naN", "45Ff4UbS46qZ9Z3yT4TRgfeHKtxV3yAUT9a0T4nb"); // Your Application ID and Client Key are defined elsewhere
    }
}
