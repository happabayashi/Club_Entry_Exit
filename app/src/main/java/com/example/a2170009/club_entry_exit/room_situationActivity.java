package com.example.a2170009.club_entry_exit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.view.View;

public class room_situationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.room_situation);

        Button buttonDetails = findViewById(R.id.buttonDetails);
        Button buttonReturn = findViewById(R.id.buttonReturn);
        TextView textView = findViewById(R.id.textViewManyPeople);

        buttonDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), room_detailsActivity.class);
                startActivity(intent);
            }
        });

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
