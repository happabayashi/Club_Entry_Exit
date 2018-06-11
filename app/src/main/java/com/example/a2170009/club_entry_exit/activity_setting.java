package com.example.a2170009.club_entry_exit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_setting extends AppCompatActivity {

    Button storageButton;
    TextView nameText;
    EditText edit;
    //名前を格納する変数
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_menue);

        final SharedPreferences nameData = getSharedPreferences("SaveData", Context.MODE_PRIVATE);
        name = nameData.getString("userName", "NoName");

        //名前入力画面のインスタンス
        edit = (EditText)findViewById(R.id.editText);

        nameText = (TextView)findViewById(R.id.nowNameTextView);
        nameText.setText(name);

        //保存ボタンの設定
        storageButton = (Button) findViewById(R.id.storageButton);
        storageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameText.setText(name);
                storageButton.setEnabled(false);
                //トーストの表示
                Toast.makeText(activity_setting.this, "保存しました", Toast.LENGTH_LONG).show();

                //書き換えを行うためのインスタンス
                SharedPreferences.Editor nEdit = nameData.edit();
                //書き換え
                nEdit.putString("userName", name);
                nEdit.commit();
            }
        });

        //戻るボタンの設定
        Button returnButton = (Button)findViewById(R.id.returnButton);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                //インテントのインスタンス作成
//                Intent setName = new Intent();
//                //インテントにnameをセット
//                setName.putExtra("userName", name);
//                //結果を設定
//                setResult(Activity.RESULT_OK, setName);
                //設定画面の終了
                finish();
            }
        });

        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                if(TextUtils.isEmpty(editable.toString())){
                    storageButton.setEnabled(false);
                }
                else {
                    storageButton.setEnabled(true);
                }
                name = edit.getText().toString();

            }
        });




    }
}
