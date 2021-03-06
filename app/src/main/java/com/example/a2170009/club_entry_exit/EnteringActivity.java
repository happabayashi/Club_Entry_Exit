package com.example.a2170009.club_entry_exit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnteringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entering);

        Button enterbutton = findViewById(R.id.Enterbutton);
        Button exitbutton = findViewById(R.id.Exitbutton);

        //入室処理
        enterbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = getIntent();
                final SharedPreferences nameData = getSharedPreferences("SaveData", Context.MODE_PRIVATE);
                String name = nameData.getString("userName", "NoName");
                intent = new Intent(EnteringActivity.this, showActivity.class);

                //分岐せずに1つのインテント(EntryAndExit)で作ってみた
                intent.putExtra("EntryAndExit", name + "が入室しました。");
                startActivity(intent);  //showActivityへ(Enterと違って先頭のsは半角です ごめん)
            }
        });

        //退室処理
        exitbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = getIntent();
                final SharedPreferences nameData = getSharedPreferences("SaveData", Context.MODE_PRIVATE);
                String name = nameData.getString("userName", "NoName");
                intent = new Intent(EnteringActivity.this, showActivity.class);

                intent.putExtra("EntryAndExit", name + "が退室しました。");
                startActivity(intent);
            }
        });
    }
}
