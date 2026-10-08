package com.example.demoproject;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityLifecycleex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lifecycleex);

        Log.d("Activity Lifecycle:","OnCreate() called");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Activity Lifecycle:","OnStart() called");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Activity Lifecycle:","OnResume() called");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Activity Lifecycle:","OnPause() called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Activity Lifecycle:","OnStop() called");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Activity Lifecycle:","onDestroy() called");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Activity Lifecycle:","onRestart() called");
    }
}