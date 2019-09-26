package com.example.samplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        String nama = getIntent().getStringExtra("nama");

        TextView txtnama = findViewById(R.id.TxtNamaEdit);
        txtnama.setText(nama);

    }
}
