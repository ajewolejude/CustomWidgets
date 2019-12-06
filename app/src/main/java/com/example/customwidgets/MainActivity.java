package com.example.customwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customwidgets.customviews.EnhancedTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EnhancedTextView enhancedTextView = (EnhancedTextView) findViewById(R.id.enhancedTextView1);
        enhancedTextView.setStrikeThrough(true);
    }
}
