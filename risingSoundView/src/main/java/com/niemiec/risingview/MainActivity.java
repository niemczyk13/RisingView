package com.niemiec.risingview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.niemiec.risingview.model.RisingSound;
import com.niemiec.risingview.view.RisingSoundValue;
import com.niemiec.risingview.view.RisingSoundView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RisingSoundView view = findViewById(R.id.rising_sound_view);

        RisingSound risingSound = new RisingSound(RisingSoundValue.SECOND.getValue());
        view.initialize(risingSound);
    }
}