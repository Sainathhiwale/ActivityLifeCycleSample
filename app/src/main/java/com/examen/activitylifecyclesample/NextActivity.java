package com.examen.activitylifecyclesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.examen.activitylifecyclesample.databinding.ActivityNextBinding;

public class NextActivity extends AppCompatActivity {
   private ActivityNextBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNextBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initView();
    }

    private void initView() {
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        binding.textView.setText(name);
    }
}