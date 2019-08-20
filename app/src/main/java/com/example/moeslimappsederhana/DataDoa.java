package com.example.moeslimappsederhana;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataDoa extends AppCompatActivity {

    //Deklarasi Variable
    private TextView Getdoa, Getarab, Getbaca, Getarti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_doa);

        getSupportActionBar().setTitle("Doa Harian");
        Getdoa = findViewById(R.id.getdoa);
        Getarab = findViewById(R.id.getarab);
        Getbaca = findViewById(R.id.getbaca);
        Getarti = findViewById(R.id.getarti);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData() {
        //Mendapatkan Nama Doa dari Activity sebelumnya
        String doa = getIntent().getExtras().getString("MyName");

        //Menentukan identitas yang ditampilkan berdasarkan doa yang dipilih
        switch (doa){
            case "Doa Sebelum Tidur":
                Getdoa.setText("Doa Sebelum Tidur");
                Getarab.setText("اللَّهُمَّ بِاسْمِكَ أَحْيَا وَأَمُوتُ");
                Getbaca.setText("Alloohumma bismika ahyaa wa amuut");
                Getarti.setText("Artinya: Ya Allah, dengan namaMu aku hidup dan aku mat");
                break;

            case "Doa Bangun Tidur":
                Getdoa.setText("Doa Bangun Tidur");
                Getarab.setText("الْحَمْدُ لِلَّهِ الَّذِى أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ");
                Getbaca.setText("Alhamdulillaahil ladzii ahyaanaa ba’da maa amaatanaa wa ilaihin nusyuur");
                Getarti.setText("Artinya: Segala puji bagi Allah yang telah menghidupkan kami setelah Dia mematikan kami. Dan kepadaNyalah kami kembali");
                break;

            case "Doa Masuk Kamar Mandi":
                Getdoa.setText("Doa Masuk Kamar Mandi");
                Getarab.setText("اللَّهُمَّ إِنِّى أَعُوذُ بِكَ مِنَ الْخُبُثِ وَالْخَبَائِثِ");
                Getbaca.setText("Alloohumma innii a’uudzubika minal khubutsu wal khobaa-its");
                Getarti.setText("Artinya: Ya Allah, sesungguhnya aku berlindung kepadaMu dari setan laki-laki dan setan perempuan");
                break;

            case "Doa Keluar Kamar Mandi":
                Getdoa.setText("Doa Keluar Kamar Mandi");
                Getarab.setText("غُفْرَانَكَ");
                Getbaca.setText("Ghufroonak");
                Getarti.setText("Artinya: Aku mohon ampunanMu ya Allah");
                break;

            case "Doa Sebelum Makan":
                Getdoa.setText("Doa Sebelum Makan");
                Getarab.setText("اللَّهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ");
                Getbaca.setText("Alloohumma baariklanaa fiimaa rozaqtanaa wa qinaa ‘adzaaban naar");
                Getarti.setText("Artinya: Ya Allah, berkahilah kami dalam apa-apa yang Engkau rezekikan kepada kami dan hindarkan kami dari siksa neraka");
                break;

            case "Doa Sesudah Makan":
                Getdoa.setText("Doa Sesudah Makan");
                Getarab.setText("الْحَمْدُ لِلَّهِ الَّذِى أَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِينَ");
                Getbaca.setText("Alhamdulillaahil ladzii ath’amanaa wasaqoonaa waja’alanaa muslimiin");
                Getarti.setText("Artinya: Segala puji bagi Allah yang telah memberi makan dan minum kepada kami dan menjadikan kami orang-orang muslim");
                break;

            case "Doa Setelah Wudhu":
                Getdoa.setText("Doa Setelah Wudhu");
                Getarab.setText("أَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ وَحْدَهُ لاَ شَرِيكَ لَهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ");
                Getbaca.setText("Asyhadu an laa ilaaha illallooh, wahdahu laa syariikalah. Wa asyhadu anna Muhammadan ‘abduhu warosuuluh");
                Getarti.setText("Artinya: Aku bersaksi bahwa tiada tuhan selain Allah Yang Maha Esa, tiada sekutu bagiNya. Dan aku bersaksi bahwa Muhammad adalah hamba dan utusanNya");

        }
    }
}

