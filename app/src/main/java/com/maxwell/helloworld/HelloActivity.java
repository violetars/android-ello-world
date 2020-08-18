package com.maxwell.helloworld;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        String msg = getIntent().getStringExtra("msgHello");

        TextView tvHello = findViewById(R.id.tvHello);

        Log.e("debug", msg);

        tvHello.setText(msg);
    }
}
