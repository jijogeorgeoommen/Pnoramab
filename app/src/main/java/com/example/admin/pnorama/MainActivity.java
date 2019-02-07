package com.example.admin.pnorama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class MainActivity extends AppCompatActivity {
    private EditText pswd;
    private GyroscopeObserver gyroscopeObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pswd=(EditText) findViewById(R.id.ppswd);
        PanoramaImageView panoramaImageView;
        panoramaImageView=findViewById(R.id.pano);
        gyroscopeObserver=new GyroscopeObserver();
        panoramaImageView.setGyroscopeObserver(gyroscopeObserver);

    }
    @Override
    protected void onResume() {
        super.onResume();
        gyroscopeObserver.register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gyroscopeObserver.unregister();
    }
}