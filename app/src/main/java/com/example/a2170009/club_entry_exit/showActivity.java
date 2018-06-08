package com.example.a2170009.club_entry_exit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class showActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView textView = findViewById(R.id.ShowTextView);
        Intent intent = getIntent();

        // Enteringアクティビティから来たintentを変換して格納
        String message = intent.getStringExtra( "NAME" );
        textView.setText(message);
    }
}
