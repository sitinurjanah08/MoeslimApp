package com.example.moeslimappsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_shalat;
    private Button btn_produk;
    private Button btn_doa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_shalat = (Button) findViewById(R.id.btn_jadwal_shalat);
        btn_produk = (Button) findViewById(R.id.btn_produk_halal);
        btn_doa = (Button) findViewById(R.id.btn_doa_harian);

        btn_shalat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, shalatok.class);
                startActivity(intent);
            }
        });

        btn_doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DoaHarian.class);
                startActivity(intent);
            }
        });

        btn_produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Produkok.class);
                startActivity(intent);
            }
        });
    }
}
