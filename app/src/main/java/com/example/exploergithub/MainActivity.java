package com.example.exploergithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inItViews();
        setContentView(R.layout.activity_main);
    }

    private void inItViews(){
        textView= findViewById(R.id.textView);
        textView.setText(getString(R.string.text));
        Log.e("eren","versionConflict");
        Log.e("eren2","version1");
        Log.e("eren2","git fetch");
    }


}