package com.example.project1;

import android.app.Activity;
import android.os.Bundle;
//import android.widget.TextView;

import com.example.project1.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    //private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //mTextView = binding.text;
    }
}

