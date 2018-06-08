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

        Button enterbutton = findViewById(R.id.Enterbutton);
        Button exitbutton = findViewById(R.id.Exitbutton);

        //入室処理
        enterbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = getIntent();
                String name = intent.getStringExtra( "aaa" ); //mainActivityから受け取る予定(だから名前は適当)
                name = "安室さん";  //表示用にとりあえずベタ打ちで入れただけ
                intent = new Intent(EnteringActivity.this, showActivity.class);

                //分岐せずに1つのインテント(EntryAndExit)で作ってみた
                intent.putExtra("EntryAndExit", name + "が入室しました。");
                startActivity(intent);  //showActivityへ
            }
        });

        //退室処理
        exitbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = getIntent();
                String name = intent.getStringExtra( "aaa" );
                name = "降谷さん";
                intent = new Intent(EnteringActivity.this, showActivity.class);

                intent.putExtra("EntryAndExit", name + "が退室しました。");
                startActivity(intent);
            }
        });
    }
}
