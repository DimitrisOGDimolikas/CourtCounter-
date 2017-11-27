package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsA = 0;
    int foulsB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /*Three Points Button*/
    public void addThreeForTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /*Two Points Button*/
    public void addTwoForTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /*Free Throw Button*/
    public void addFreeThrowForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /*Three Points Button*/
    public void addThreeForTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /*Two Points Button*/
    public void addTwoForTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /*Free Throw Button*/
    public void addFreeThrowForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     *Reset Button, 0-0
     */
    public void Reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsA = 0;
        foulsB = 0;
        ForTeamA("Fouls : 0");
        ForTeamB("Fouls : 0");
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /*Fouls methods*/
    public void ForTeamA(String fouls) {
        TextView scoreView = (TextView) findViewById(R.id.FoulsTA);
        scoreView.setText(String.valueOf(fouls));
    }
    public void ForTeamB(String fouls) {
        TextView scoreView = (TextView) findViewById(R.id.FoulsTB);
        scoreView.setText(String.valueOf(fouls));
    }
    public void FoulsTeamA(View view){
        foulsA = foulsA + 1;
        ForTeamA("Fouls : " + foulsA);
    }
    public void FoulsTeamB(View view){
        foulsB = foulsB + 1;
        ForTeamB("Fouls : " + foulsB);
    }
}
