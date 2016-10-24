package com.nbs.app.restoran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String data = bundle.getString("titleMember");
        String data1 = bundle.getString("desctriptionMember");
        TextView textView = (TextView) findViewById(R.id.titleMember);
        textView.setText(""+data);
        TextView textView1 = (TextView) findViewById(R.id.desctriptionMember);
        textView1.setText(""+data1);


    }
}
