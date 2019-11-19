package com.mustiko.belajar.mylistviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // todo 2
    // membuat array yang digunakan untuk data di tampilan list view nantinya
    private String[] dataName = {"Cut Nyak Dien","Ki Hajar Dewantara","Moh Yamin","Patimura","R A Kartini","Sukarno"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // todo 3
        // mengatur agar data dari array untuk dapat di tampilkan di listview
        ListView listView = findViewById(R.id.lv_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, dataName);
        listView.setAdapter(adapter);
    }
}
