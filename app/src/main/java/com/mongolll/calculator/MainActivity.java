package com.mongolll.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        EditText el1 = findViewById(R.id.num1);
        EditText el2 = findViewById(R.id.num2);
        TextView resText = findViewById(R.id.Result);
        resText.setText(getParsedSum(el1, el2));
    }

    private String getParsedSum(EditText et1, EditText et2) {
        try {
            int num1 = Integer.parseInt(et1.getText().toString());
            int num2 = Integer.parseInt(et2.getText().toString());
            return Integer.toString(num1 + num2);
        } catch (Throwable e) {
            return "";
        }
    }
}
