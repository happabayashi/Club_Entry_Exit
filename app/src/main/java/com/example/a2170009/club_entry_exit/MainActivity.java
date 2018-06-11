package com.example.a2170009.club_entry_exit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final int requestCode = 1001;

    Button settingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //デバイス内にNameを保存
        SharedPreferences nameData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
        SharedPreferences.Editor nameEditor = nameData.edit();
        nameEditor.putString("userName", "noName");
        nameEditor.apply();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //設定ボタンの有効化、画面遷移
        settingButton = findViewById(R.id.settingButton);
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), activity_setting.class);
//                intent.putExtra("name", requestCode);
//                startActivityForResult(intent, requestCode);
                startActivity(intent);
            }
        });
    }
    //設定画面から戻ってきたときに値(名前)を受け取る
//    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
//        if(requestCode == 1001){
//            if(resultCode == Activity.RESULT_OK){
//                name = intent.getStringExtra("userName");
//                settingButton.setText(name);
//            }
//        }
//    }

}
