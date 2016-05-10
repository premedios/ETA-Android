package com.pedroremedios.eta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.InputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputStream inputStream = getApplicationContext().getResources().openRawResource(R.raw.codigos_de_paragem);
        BusStopsFile busStopsFile = new BusStopsFile(inputStream);

    }
}
