package com.tom.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tom.luckynumber.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    public void DrawNumber(View v){
        TextView luckyNumber=findViewById(R.id.luckyNumber);
        Random rnd=new Random(100);
        int rd=rnd.nextInt(100)+1;
        luckyNumber.setText(String.valueOf(rd));
    }
}
