package com.example.samplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] items= {"lorem", "ipsum", "dolor", "sit", "amet",
                "consectetuer", "adipiscing", "elit", "morbi", "vel",
                "ligula", "vitae", "arcu", "aliquet", "mollis",
                "etiam", "vel", "erat", "placerat", "ante",
                "portitor", "sodales", "pellentesque", "augue", "purus"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = findViewById(R.id.List);
        Button btnadd = findViewById(R.id.BtnAdd);
        lv.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, items));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, "Anda memilih " + items[position], Toast.LENGTH_SHORT).show();
                Intent inten = new Intent(MainActivity.this, EditActivity.class);
                inten.putExtra("nama", items[position]);
                startActivity(inten);
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(MainActivity.this, AddActivity.class);
                startActivity(inten);
            }
        });

    }
}
