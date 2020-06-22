package com.example.facebookprep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Caren", "Button Clicked");
                ((TextView)findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String newtext = ((EditText)findViewById(R.id.editText)).getText().toString();
               if(!TextUtils.isEmpty(newtext)) {
                   ((TextView) findViewById(R.id.textView)).setText(newtext);
               }
               else{
                   ((TextView) findViewById(R.id.textView)).setText("Hello from Pryce");
               }
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        });
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.some));
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.blue));
            }
        });

    }

}
