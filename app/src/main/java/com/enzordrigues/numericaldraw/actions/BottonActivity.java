package com.enzordrigues.numericaldraw.actions;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.enzordrigues.numericaldraw.R;
import com.enzordrigues.numericaldraw.utils.Utils;

public class BottonActivity {

    private Utils utils = new Utils();

    public EditText findButtonRangeOne(AppCompatActivity activity){
        return activity.findViewById(R.id.rangeOne);
    }

    public EditText findButtonRangeOTwo(AppCompatActivity activity){
        return activity.findViewById(R.id.rangeTwo);
    }

    public TextView findButtonResponse(AppCompatActivity activity){
        return activity.findViewById(R.id.returnValued);
    }

    public void randomGenerateMethod(View view, AppCompatActivity activity){
        String val1 = findButtonRangeOne(activity).getText().toString().trim();
        String val2 = findButtonRangeOTwo(activity).getText().toString().trim();

        if (val1.isEmpty() || val2.isEmpty()) {
            findButtonResponse(activity).setVisibility(View.VISIBLE);
            findButtonResponse(activity).setText("FIELDS EMPTY!!!");
            return;
        }

        findButtonResponse(activity).setVisibility(View.VISIBLE);
        findButtonResponse(activity).setText(utils.randomGenerate(Integer.parseInt(val1), Integer.parseInt(val2)));
    }
}
