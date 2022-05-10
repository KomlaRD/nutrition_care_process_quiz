package com.example.nutritioncareprocessquiz;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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

    public void submitButton(View view) {
        // Display total score on the quiz
        checkQuizOneAnswer();
        displayScore(score + score_two + score_three + score_four + score_five + score_six + score_seven
                + score_eight + score_nine + score_ten);
        int totalScore = score + score_two + score_three + score_four + score_five + score_six + score_seven
                + score_eight + score_nine + score_ten;
        Toast.makeText(view.getContext(), "You scored " + totalScore + " out of 10",
                LENGTH_SHORT).show();
    }

    // Question one methods
    @SuppressLint("NonConstantResourceId")
    private String quizOne() {
        EditText quizOneAnswer = findViewById(R.id.edit_one);
        return quizOneAnswer.getText().toString();
    }

    public void checkQuizOneAnswer() {
        String answer = quizOne();
        if (answer.equalsIgnoreCase("Nutrition assessment")) {
            score = 1;
        } else {
            score = 0;
        }
    }

    // Question two method
    @SuppressLint("NonConstantResourceId")
    public void quizTwoButton(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch (view.getId()) {
            case R.id.answer_two_a_radio:
                if (checked) {
                    score_two = 1;
                }
                break;
            case R.id.answer_one_a_radio:
            case R.id.answer_three_a_radio:
            case R.id.answer_four_a_radio:
                if (checked) {
                    score_two = 0;
                }
                break;
        }
    }

    // Quiz three method
    @SuppressLint("NonConstantResourceId")
    public void quizThreeButton(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch (view.getId()) {
            case R.id.answer_three_b_radio:
                if (checked) {
                    score_three = 1;
                }
                break;
            case R.id.answer_one_b_radio:
            case R.id.answer_two_b_radio:
            case R.id.answer_four_b_radio:
                if (checked) {
                    score_three = 0;
                }
                break;
        }
    }

    // Quiz four method
    @SuppressLint("NonConstantResourceId")
    public void quizFourButton(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch (view.getId()) {
            case R.id.answer_four_c_radio:
                if (checked) {
                    score_four = 1;
                }
                break;
            case R.id.answer_one_c_radio:
            case R.id.answer_two_c_radio:
            case R.id.answer_three_c_radio:
                if (checked) {
                    score_four = 0;
                }
                break;
        }
    }

    // Quiz five method
    @SuppressLint("NonConstantResourceId")
    public void quizFiveButton(View view) {
        // Get CheckBox View IDs and assign them to a variable
        CheckBox checkBoxOne = findViewById(R.id.answer_one_d_checkbox);
        CheckBox checkBoxTwo = findViewById(R.id.answer_two_d_checkbox);
        CheckBox checkBoxThree = findViewById(R.id.answer_three_d_checkbox);
        CheckBox checkBoxFour = findViewById(R.id.answer_four_d_checkbox);
        // Check which answer has been checked and give a score
        if (checkBoxOne.isChecked() && checkBoxFour.isChecked() &&
        !checkBoxTwo.isChecked() && !checkBoxThree.isChecked()) {
            score_five = 1;
        }
        else {
            score_five = 0;
        }
    }

    // Quiz six method
    @SuppressLint("NonConstantResourceId")
    public void quizSixButton(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch (view.getId()) {
            case R.id.answer_three_e_radio:
                if (checked) {
                    score_six = 1;
                }
                break;
            case R.id.answer_one_e_radio:
            case R.id.answer_two_e_radio:
            case R.id.answer_four_e_radio:
                if (checked) {
                    score_six = 0;
                }
                break;
        }
    }

    // Quiz seven method
    @SuppressLint("NonConstantResourceId")
    public void quizSevenButton(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch (view.getId()) {
            case R.id.answer_four_f_radio:
                if (checked) {
                    score_seven = 1;
                }
                break;
            case R.id.answer_one_f_radio:
            case R.id.answer_two_f_radio:
            case R.id.answer_three_f_radio:
                if (checked) {
                    score_seven = 0;
                }
                break;
        }
    }

    // Quiz eight method
    @SuppressLint("NonConstantResourceId")
    public void quizEightButton(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch (view.getId()) {
            case R.id.answer_one_g_radio:
                if (checked) {
                    score_eight = 1;
                }
                break;
            case R.id.answer_two_g_radio:
            case R.id.answer_three_g_radio:
            case R.id.answer_four_g_radio:
                if (checked) {
                    score_eight = 0;
                }
                break;
        }
    }

    // Quiz nine method
    @SuppressLint("NonConstantResourceId")
    public void quizNineButton(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch (view.getId()) {
            case R.id.answer_three_h_radio:
                if (checked) {
                    score_nine = 1;
                }
                break;
            case R.id.answer_one_h_radio:
            case R.id.answer_two_h_radio:
            case R.id.answer_four_h_radio:
                if (checked) {
                    score_nine = 0;
                }
                break;
        }
    }

    // Quiz ten method
    @SuppressLint("NonConstantResourceId")
    public void quizTenButton(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which answer has been checked
        switch (view.getId()) {
            case R.id.answer_four_i_radio:
                if (checked) {
                    score_ten = 1;
                }
                break;
            case R.id.answer_one_i_radio:
            case R.id.answer_two_i_radio:
            case R.id.answer_three_i_radio:
                if (checked) {
                    score_ten = 0;
                }
                break;
        }
    }

    // Display total score when submit button is clicked
    @SuppressLint("SetTextI18n")
    public void displayScore(int score) {
        TextView scoreView = findViewById(R.id.total_score);
        scoreView.setText(" " + score);
    }

    // Method to reset quiz responses
    public void resetButton(View view) {
        // Reset name of participant
        EditText resetName = findViewById(R.id.name);
        resetName.setText("");

        //Reset edit text question
        EditText resetText = findViewById(R.id.edit_one);
        resetText.setText("");

        // Reset radio groups
        RadioGroup radio = findViewById(R.id.radio_group_one);
        radio.clearCheck();

        radio = findViewById(R.id.radio_group_two);
        radio.clearCheck();

        radio = findViewById(R.id.radio_group_three);
        radio.clearCheck();

        radio = findViewById(R.id.radio_group_four);
        radio.clearCheck();

        radio = findViewById(R.id.radio_group_five);
        radio.clearCheck();

        radio = findViewById(R.id.radio_group_six);
        radio.clearCheck();

        radio = findViewById(R.id.radio_group_seven);
        radio.clearCheck();

        radio = findViewById(R.id.radio_group_eight);
        radio.clearCheck();

        // Reset checkboxes
        CheckBox resetCheckBox = findViewById(R.id.answer_one_d_checkbox);
        resetCheckBox.setChecked(false);

        resetCheckBox = findViewById(R.id.answer_two_d_checkbox);
        resetCheckBox.setChecked(false);

        resetCheckBox = findViewById(R.id.answer_three_d_checkbox);
        resetCheckBox.setChecked(false);

        resetCheckBox = findViewById(R.id.answer_four_d_checkbox);
        resetCheckBox.setChecked(false);

        // Reset total score
        score = 0;
        score_two = 0;
        score_three = 0;
        score_four = 0;
        score_five = 0;
        score_six = 0;
        score_seven = 0;
        score_eight = 0;
        score_nine = 0;
        score_ten = 0;
        TextView resetQuiz = findViewById(R.id.total_score);
        resetQuiz.setText("0");
    }

}