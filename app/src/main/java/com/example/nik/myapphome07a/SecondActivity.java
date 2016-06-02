package com.example.nik.myapphome07a;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    String mStrHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        textView = (TextView) findViewById(R.id.textVievSecond);

        Intent intent = getIntent();
        String mString = intent.getStringExtra("KeyResB");
        if(mString != null) {
            textView.setText(mString);
        }


        if(getBaseContext().checkCallingPermission(Manifest.permission.PERMPROTECT) !=
              PackageManager.PERMISSION_GRANTED){
            mStrHello = "Hello World this is Activity-B";
        }else {
            mStrHello = "-Granted-";
        }

        Intent intentR = new Intent();
        intentR.putExtra("Result_B", mStrHello);
        setResult(RESULT_OK, intentR);
        finish();

    }
}
