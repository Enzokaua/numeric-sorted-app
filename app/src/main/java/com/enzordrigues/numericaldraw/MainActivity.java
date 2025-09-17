package com.enzordrigues.numericaldraw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.enzordrigues.numericaldraw.actions.BottonActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomGenerateMethod(View view) {
        new BottonActivity().randomGenerateMethod(view, this);
    }
}
