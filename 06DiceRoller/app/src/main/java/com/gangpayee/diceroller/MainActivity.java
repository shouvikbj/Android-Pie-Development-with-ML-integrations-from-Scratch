package com.gangpayee.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button rollDice;
    private ImageView imageViewDice1;
    private ImageView imageViewDice2;
    private Random myRandomNumber1 = new Random();
    private Random myRandomNumber2 = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollDice = findViewById(R.id.button);
        imageViewDice1 = findViewById(R.id.imageView);
        imageViewDice2 = findViewById(R.id.imageView2);

        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollOurDice1();
                rollOurDice2();
            }
        });

    }

    private void rollOurDice1(){
        int myRanNumber1 = myRandomNumber1.nextInt(6) + 1;

        switch (myRanNumber1){
            case 1:
                imageViewDice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice1.setImageResource(R.drawable.dice6);
                break;
        }
    }

    private void rollOurDice2(){
        int myRanNumber2 = myRandomNumber2.nextInt(6) + 1;

        switch (myRanNumber2){
            case 1:
                imageViewDice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice2.setImageResource(R.drawable.dice6);
                break;
        }
    }

}
