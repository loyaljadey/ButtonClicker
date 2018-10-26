package com.example.buttonclicker;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private TextView textViewScore;
    private int score;
    private ConstraintLayout constraintLayoutMain;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //wires the widget: connects the XML to the JAVA
        textViewScore = findViewById(R.id.textview_main_score);

        constraintLayoutMain = findViewById(R.id.constraintlayout_main);

        score = 0;


    }


    //matches the name of the method in the button's on click attribute in the XML layout
    public void onGoalClick(View view)
    {
        //update the score
        score++;
        //update the textview displaying the score
        textViewScore.setText("Score: " + score);
        //change the color with each click
        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        textViewScore.setTextColor(Color.rgb(255-r,255-g,255-b));

        constraintLayoutMain.setBackgroundColor(Color.rgb(r,g,b));


        if(score == 20)
        {
            Toast.makeText(this, "Hooray!", Toast.LENGTH_SHORT).show();
        }

    }
}
