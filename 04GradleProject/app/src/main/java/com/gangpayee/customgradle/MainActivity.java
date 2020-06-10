package com.gangpayee.customgradle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view){
        switch(view.getId()){
            case R.id.errorButton:
                Toasty.error(this, "Login Failed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.successButton:
                Toasty.success(this, "Login Successful", Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoButton:
                Toasty.info(this, "Some Information", Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningButton:
                Toasty.warning(this, "Oops!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton:
                Toasty.normal(this, " Back Up Complete", Toast.LENGTH_SHORT, ContextCompat.getDrawable(this, R.drawable.ic_cloud)).show();
                break;
        }
    }
}
