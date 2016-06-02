package com.example.nik.myapphome07a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textVievFirst);

        Intent intent = getIntent();
        String mString = intent.getStringExtra("KeyResA");
        if(mString != null) {
            textView.setText(mString);
        }

        Intent intentR = new Intent();
        intentR.putExtra("Result_A", "Hello World this is Activity-A");
        setResult(RESULT_OK, intentR);
        finish();
    }
}
