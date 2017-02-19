package com.record.record;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class BackgroundRecorder extends IntentService {
    private static final String TAG = "TESTING";


    public BackgroundRecorder() {
        super("BackgroundRecorder");
    }
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public BackgroundRecorder(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "onHandleIntent");
        
    }
}
