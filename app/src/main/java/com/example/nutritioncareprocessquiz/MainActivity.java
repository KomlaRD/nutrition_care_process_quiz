package com.example.nutritioncareprocessquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    // Global variable for the score of quiz
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

    // Question one method

    public void quizOneButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_one:
                if (checked) {
                    score = 0;
                }
                break;
            case R.id.answer_two:
                if (checked) {
                    score = 1;
                }
                break;
            case R.id.answer_three:
            case R.id.answer_four:
                if (checked){
                    score = 0;
                }
                break;
        }

    }

    // Question two method

    public void quizTwoButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_two_a:
                if (checked) {
                    score = 1;
                }
                break;
            case R.id.answer_one_a:
            case R.id.answer_three_a:
            case R.id.answer_four_a:
                if (checked){
                    score = 0;
                }
                break;
        }

    }

    // Quiz three method

    public void quizThreeButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_four_b:
                if (checked) {
                    score = 1;
                }
                break;
            case R.id.answer_one_b:
            case R.id.answer_two_b:
            case R.id.answer_three_b:
                if (checked){
                    score = 0;
                }
                break;
        }

    }

    // Quiz four method

    public void quizFourButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_four_c:
                if (checked) {
                    score = 1;
                }
                break;
            case R.id.answer_one_c:
            case R.id.answer_two_c:
            case R.id.answer_three_c:
                if (checked){
                    score = 0;
                }
                break;
        }

    }

    // Quiz five method

    public void quizFiveButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_one_d:
                if (checked) {
                    score = 1;
                }
                break;
            case R.id.answer_two_d:
            case R.id.answer_three_d:
            case R.id.answer_four_d:
                if (checked){
                    score = 0;
                }
                break;
        }

    }

    // Quiz six method

    public void quizSixButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_three_e:
                if (checked) {
                    score = 1;
                }
                break;
            case R.id.answer_one_e:
            case R.id.answer_two_e:
            case R.id.answer_four_e:
                if (checked){
                    score = 0;
                }
                break;
        }

    }

    // Quiz seven method

    public void quizSevenButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_four_f:
                if (checked) {
                    score = 1;
                }
                break;
            case R.id.answer_one_f:
            case R.id.answer_two_f:
            case R.id.answer_three_f:
                if (checked){
                    score = 0;
                }
                break;
        }

    }

    // Quiz eight method

    public void quizEightButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_one_g:
                if (checked) {
                    score = 1;
                }
                break;
            case R.id.answer_two_g:
            case R.id.answer_three_g:
            case R.id.answer_four_g:
                if (checked){
                    score = 0;
                }
                break;
        }

    }

    // Quiz nine method

    public void quizNineButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_three_h:
                if (checked) {
                    score = 1;
                }
                break;
            case R.id.answer_one_h:
            case R.id.answer_two_h:
            case R.id.answer_four_h:
                if (checked){
                    score = 0;
                }
                break;
        }

    }

    // Quiz ten method

    public void quizTenButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_four_i:
                if (checked) {
                    score = 1;
                }
                break;
            case R.id.answer_one_i:
            case R.id.answer_two_i:
            case R.id.answer_three_i:
                if (checked){
                    score = 0;
                }
                break;
        }

    }
}