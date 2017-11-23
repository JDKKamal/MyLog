package com.jdkgroup.mylog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jdkgroup.customview.AppLog;

public class MyLogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log();
    }

    private void log() {
        Log.d("YOUR_TAG", "Simple log example 1");
        Log.d("YOUR_TAG", "Simple log example 2");
        Log.d("YOUR_TAG", "Simple log example 3");
        Log.d("YOUR_TAG", "Simple log example 4");
        Log.d("YOUR_TAG", "Simple log example 5");

        AppLog.d("===============================================================");
        AppLog.i("Empty 2");
        AppLog.w("Empty 3");
        AppLog.e("Empty 4");
        AppLog.d("===============================================================");

        AppLog.setTag("TAG");
        AppLog.i("Tag changed to NEW TAG");

        AppLog.d("===============================================================");

        AppLog.setPackageNameVisibility(true);
        AppLog.w("Show package");
        AppLog.w("enabled");
        AppLog.d("Empty 1");
        AppLog.i("Empty 2");
        AppLog.w("Empty 3");
        AppLog.e("Empty 4");
        AppLog.d("===============================================================");

        AppLog.setIsTimeVisible(false);
        AppLog.w("Show time");
        AppLog.w("enabled");
        AppLog.d("Empty 1");
        AppLog.i("Empty 2");
        AppLog.w("Empty 3");
        AppLog.e("Empty 4");
        AppLog.d("===============================================================");

        AppLog.w("Remove override");
        AppLog.w("disabled");
        AppLog.d("Empty 1");
        AppLog.i("Empty 2");
        AppLog.w("Empty 3");
        AppLog.e("Empty 4");
        AppLog.setIsRemoveOverride(false);
        AppLog.d("Empty 1");
        AppLog.i("Empty 2");
        AppLog.w("Empty 3");
        AppLog.e("Empty 4");
        AppLog.d("===============================================================");

        AppLog.setThreadIdVisibility(true);
        AppLog.w("Show thread is");
        AppLog.w("enabled");
        AppLog.d("Empty 1");
        AppLog.i("Empty 2");
        AppLog.w("Empty 3");
        AppLog.e("Empty 4");
        AppLog.d("===============================================================");
    }
}
