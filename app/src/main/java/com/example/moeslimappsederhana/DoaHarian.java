package com.example.moeslimappsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class DoaHarian extends AppCompatActivity {

    //Data-Data yang Akan dimasukan Pada ListView
    private String[] doa = {"Doa Sebelum Tidur","Doa Bangun Tidur","Doa Masuk Kamar Mandi","Doa Keluar Kamar Mandi","Doa Sebelum Makan","Doa Sesudah Makan","Doa Setelah Wudhu"};

    //ArrayList digunakan untuk menampung Data doa
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_harian);

        ListView listView = findViewById(R.id.listitem);
        data = new ArrayList<>();
        getData();
        //ArrayAdapter digunakan untuk mengatur, bagaimana item pada ListView akan tampil
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, R.layout.support_simple_spinner_dropdown_item,data);
        listView.setAdapter(adapter);

        //Menambahkan Listener, untuk menangani kejadian saat salah satu item listView di klik
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Menambahkan Nama pada salah satu item yang diklik, berdasarkan posisinya
                String getName = data.get(position);

                //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
                Intent sendData = new Intent(DoaHarian.this, DataDoa.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });
    }

    private void getData() {
        //Memasukan Semua Data ayat kedalam ArrayList
        Collections.addAll(data, doa);
    }
}
