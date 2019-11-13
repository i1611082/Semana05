package com.example.yooo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume(){
        super.onResume();
        // en este punt ola aplicacion ya cargo.

        //this en un activity
        Toast.makeText(this,
                "Aplicacion inicida",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this,
                "Aplicacion stopeada",
                Toast.LENGTH_SHORT).show();
    }

}