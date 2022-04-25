package com.example.nutritioncareprocessquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    int score;

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

    public void quizOneButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_one:
                if (checked) {
                    score = 1;
                }
                break;
            case R.id.answer_two:
            case R.id.answer_three:
            case R.id.answer_four:
                if (checked){
                    score = 0;
                }
                break;
        }

    }
}