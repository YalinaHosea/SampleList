package com.example.samplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.samplelist.Adapter.MahasiswaAdapter;
import com.example.samplelist.Model.Mahasiswa;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ArrayList<Mahasiswa> mhsdata;
    ListView lstmahasiswa;
    private static MahasiswaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lstmahasiswa = findViewById(R.id.ListMahasiswa);
        mhsdata = new ArrayList<>();
        mhsdata.add(new Mahasiswa("72140003","Nando", "Pria","Bermain", "Pelukis", "Berakit-rakit ke hulu", R.drawable.weavile));
        mhsdata.add(new Mahasiswa("72170112","Yalina", "Wanita","Makan", "Insinyur", "Berakit-rakit ke hulu", R.drawable.torracat));
        mhsdata.add(new Mahasiswa("72189083","Bob", "Pria","Tidur", "Petarung", "Berakit-rakit ke hulu", R.drawable.pupitar));
        mhsdata.add(new Mahasiswa("72908373","Hosea", "Wanita","Belajar", "Youtuber", "Berakit-rakit ke hulu", R.drawable.gyarados));
        mhsdata.add(new Mahasiswa("72143303","Jon", "Pria","Bermain", "Pengusaha", "Berakit-rakit ke hulu", R.drawable.delibird));

        adapter = new MahasiswaAdapter(mhsdata, getApplicationContext());
        lstmahasiswa.setAdapter(adapter);

    }
}
