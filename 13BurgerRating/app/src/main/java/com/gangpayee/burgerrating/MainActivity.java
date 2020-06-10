package com.gangpayee.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView2;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

    }

    public void submit(View view){
        float ratingValue = ratingBar.getRating();

        if(ratingValue < 2){
            textView.setText("Sorry for your inconvenience!");
            textView2.setText("Rating: " + ratingValue);
        }
        else if(ratingValue <=3 && ratingValue >=2){
            textView.setText("We are trying to get better.");
            textView2.setText("Rating: " + ratingValue);
        }
        else if(ratingValue <=4 && ratingValue >=3){
            textView.setText("We are trying for the best.");
            textView2.setText("Rating: " + ratingValue);
        }
        else if(ratingValue <=5 && ratingValue >=4){
            textView.setText("Woohho!! We are thrilled as you!!");
            textView2.setText("Rating: " + ratingValue);
        }

    }

}
