package com.chenhuiyeh.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = findViewById(R.id.ROLL_button);

        final ImageView leftDice = findViewById(R.id.left_dice);
        final ImageView rightDice = findViewById(R.id.right_dice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Dicee", "The Button has been pressed!");

                Random randomGenerator = new Random();

                int num1 = randomGenerator.nextInt(6);
                int num2 = randomGenerator.nextInt(6);

                Log.d("Dicee", "The left random number is: "+ num1);
                Log.d("Dicee", "The right random number is: "+ num2);

                leftDice.setImageResource(diceArray[num1]);

                rightDice.setImageResource(diceArray[num2]);
            }
        });

        int myNumber;
    }
}
