package com.pythonanywhere.mybutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    Button button;
//    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button = findViewById(R.id.mybtn);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("TEST", "Clicked Button 1");
//            }
//        });

//        button2 = findViewById(R.id.mybtn2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("TEST2", "Clicked Button 2");
//            }
//        });

    }

    public void button1Pressed(View view){
//        Log.d("BUTTON2", "Button 1 clicked via method");

//        Context context = getApplicationContext();
//        CharSequence text = "Button 1 pressed.";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();

        Toast.makeText(getApplicationContext(), "Hello from button 1", Toast.LENGTH_SHORT).show();

    }

    public void button2Pressed(View view){
//        Log.d("BUTTON2", "Button 2 clicked via method");

//        Context context = getApplicationContext();
//        CharSequence text = "Button 2 pressed.";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();

//        Toast.makeText(getApplicationContext(), "Hello from button 2", Toast.LENGTH_SHORT).show();
        // both the above and below line works exactly same... (VVI)
        Toast.makeText(this, "Hello from button 2", Toast.LENGTH_SHORT).show();

    }

}
