package com.record.record;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Currently Pressed     0 Times");

        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(handleClick);
    }

    private View.OnClickListener handleClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            counter++;
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.format("Currently Pressed %5d time%s.", counter, counter == 1 ? "" : "s"));
        }
    };
}
