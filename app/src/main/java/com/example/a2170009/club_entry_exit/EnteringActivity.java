package com.example.a2170009.club_entry_exit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnteringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entering);

        Button button1 = findViewById(R.id.Enterbutton);
        Button button2 = findViewById(R.id.Leavebutton);

        //入室処理
        // (変数名は後々書き直します)
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = getIntent();
                String name = intent.getStringExtra( "NAME1" );
                name = "安室さん";
                intent = new Intent(EnteringActivity.this, showActivity.class);
                intent.putExtra("NAME", name + "が入室しました。");
                startActivity(intent);
            }
        });

        //退室処理
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = getIntent();
                String name = intent.getStringExtra( "NAME" );
                name = "降谷さん";
                intent = new Intent(EnteringActivity.this, showActivity.class);
                intent.putExtra("NAME", name + "が退室しました。");
                startActivity(intent);
            }
        });
    }
}
