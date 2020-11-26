package com.example.beatbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class BeatBoxActivity extends AppCompatActivity {

    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beat_box);

        if(savedInstanceState == null) {
            if(findViewById(R.id.fragment_container) != null) {
                BeatBoxFragment fragment = (BeatBoxFragment) createFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.fragment_container,fragment)
                        .commit();
            }
        }
    }
}