package com.example.ameen.testunit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //New Commit

    public double division(double n1, double n2){
        double x = n1/n2;
        return x;
    }
}
