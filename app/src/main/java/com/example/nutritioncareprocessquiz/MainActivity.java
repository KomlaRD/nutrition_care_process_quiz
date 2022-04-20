package com.example.nutritioncareprocessquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitButton(View view){
        //Send explicit intent to quiz summary activity
        Intent i = new Intent(this, QuizSummary.class);
        startActivity(i);
    }
}