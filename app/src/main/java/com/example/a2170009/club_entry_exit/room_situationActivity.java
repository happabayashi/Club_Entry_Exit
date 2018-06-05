package com.example.a2170009.club_entry_exit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class room_situationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_situation);
        Button buttonDetails = findViewById(R.id.buttonDetails);
        Button buttonRetuln = findViewById(R.id.buttonRetuln);
    }
}
