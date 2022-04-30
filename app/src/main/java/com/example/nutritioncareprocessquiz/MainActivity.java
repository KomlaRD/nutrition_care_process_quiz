package com.example.nutritioncareprocessquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Global variable for the score of quiz one
    int score;

    // Global variable for the score of quiz two
    int score_two;

    // Global variable for the score of quiz three
    int score_three;

    // Global variable for the score of quiz four
    int score_four;

    //  Global variable for the score of quiz five
    int score_five;

    // Global variable for the score of quiz six
    int score_six;

    // Global variable for the score of quiz seven
    int score_seven;

    // Global variable for the score of quiz eight
    int score_eight;

    // Global variable for the score of quiz nine
    int score_nine;

    // Global variable for the score of quiz ten
    int score_ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitButton(View view){
        // Display total score on the quiz
        displayScore(score + score_two + score_three + score_four + score_five + score_six + score_seven
        + score_eight + score_nine + score_ten);
    }

    // Question one method

    @SuppressLint("NonConstantResourceId")
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
                if (checked) {
                    score = 0;
                }
                break;
        }

    }

    // Question two method

    @SuppressLint("NonConstantResourceId")
    public void quizTwoButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_two_a:
                if (checked) {
                    score_two = 1;
                }
                break;
            case R.id.answer_one_a:
            case R.id.answer_three_a:
            case R.id.answer_four_a:
                if (checked){
                    score_two = 0;
                }
                break;
        }

    }

    // Quiz three method

    @SuppressLint("NonConstantResourceId")
    public void quizThreeButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_three_b:
                if (checked) {
                    score_three = 1;
                }
                break;
            case R.id.answer_one_b:
            case R.id.answer_two_b:
            case R.id.answer_four_b:
                if (checked){
                    score_three = 0;
                }
                break;
        }

    }

    // Quiz four method

    @SuppressLint("NonConstantResourceId")
    public void quizFourButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_four_c:
                if (checked) {
                    score_four = 1;
                }
                break;
            case R.id.answer_one_c:
            case R.id.answer_two_c:
            case R.id.answer_three_c:
                if (checked){
                    score_four = 0;
                }
                break;
        }

    }

    // Quiz five method

    @SuppressLint("NonConstantResourceId")
    public void quizFiveButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_one_d:
                if (checked) {
                    score_five = 1;
                }
                break;
            case R.id.answer_two_d:
            case R.id.answer_three_d:
            case R.id.answer_four_d:
                if (checked){
                    score_five = 0;
                }
                break;
        }

    }

    // Quiz six method

    @SuppressLint("NonConstantResourceId")
    public void quizSixButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_three_e:
                if (checked) {
                    score_six = 1;
                }
                break;
            case R.id.answer_one_e:
            case R.id.answer_two_e:
            case R.id.answer_four_e:
                if (checked){
                    score_six = 0;
                }
                break;
        }

    }

    // Quiz seven method

    @SuppressLint("NonConstantResourceId")
    public void quizSevenButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_four_f:
                if (checked) {
                    score_seven = 1;
                }
                break;
            case R.id.answer_one_f:
            case R.id.answer_two_f:
            case R.id.answer_three_f:
                if (checked){
                    score_seven = 0;
                }
                break;
        }

    }

    // Quiz eight method

    @SuppressLint("NonConstantResourceId")
    public void quizEightButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_one_g:
                if (checked) {
                    score_eight = 1;
                }
                break;
            case R.id.answer_two_g:
            case R.id.answer_three_g:
            case R.id.answer_four_g:
                if (checked){
                    score_eight = 0;
                }
                break;
        }

    }

    // Quiz nine method

    @SuppressLint("NonConstantResourceId")
    public void quizNineButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_three_h:
                if (checked) {
                    score_nine = 1;
                }
                break;
            case R.id.answer_one_h:
            case R.id.answer_two_h:
            case R.id.answer_four_h:
                if (checked){
                    score_nine = 0;
                }
                break;
        }

    }

    // Quiz ten method

    @SuppressLint("NonConstantResourceId")
    public void quizTenButton(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch(view.getId()){
            case R.id.answer_four_i:
                if (checked) {
                    score_ten = 1;
                }
                break;
            case R.id.answer_one_i:
            case R.id.answer_two_i:
            case R.id.answer_three_i:
                if (checked){
                    score_ten = 0;
                }
                break;
        }

    }

    // Display score of question one
    @SuppressLint("SetTextI18n")
    public void displayScore(int score){
        TextView scoreView = (TextView) findViewById(R.id.total_score);
        scoreView.setText(" " + score);

    }

    // Method for reset button
    public void resetButton(View view){
        // Use this to reset quiz
    }


}