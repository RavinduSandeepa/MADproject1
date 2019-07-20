package com.example.student.usingstrings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView tv3,tv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        tv3 = findViewById(R.id.txtV3);
        tv3.setText(R.string.msg3);

        tv4 = findViewById(R.id.txtV4);
        tv4.setText(R.string.msg4);

        Log.i("LifeCycle","Inside OnCreate Mothod");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("LifeCycle","Inside OnResume Mothod");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("LifeCycle","Inside OnRestart Mothod");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("LifeCycle","Inside OnPause Mothod");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("LifeCycle","Inside OnStop Mothod");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("LifeCycle","Inside OnDestroy Mothod");
    }
}
