package com.record.record;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.database.ContentObserver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View v) {
        Context context = this;
        Intent pushIntent = new Intent(context, BackgroundRecorder.class);
        context.startService(pushIntent);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        int action = event.getAction();
        Log.i("MAIN", ((Integer)action).toString());
        if (action == KeyEvent.KEYCODE_POWER || action == KeyEvent.KEYCODE_HOME) {
            Context context = this;
            Intent pushIntent = new Intent(context, BackgroundRecorder.class);
            context.startService(pushIntent);
        }
        return super.dispatchKeyEvent(event);
    }
}
