package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private EditText editA;
    private EditText editB;
    private EditText editC;
    private Button btn;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editA = findViewById(R.id.editTextA);
        editB = findViewById(R.id.editTextB);
        editC = findViewById(R.id.editTextC);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.tv);
    }

    public void doSolve(View v)
    {
        String str_a = editA.getText().toString();
        String str_b = editB.getText().toString();
        String str_c = editC.getText().toString();
        int a = Integer.parseInt(str_a);
        int b = Integer.parseInt(str_b);
        int c = Integer.parseInt(str_c);
        int d = b * b - 4 * a * c;
        if (d == 0)
        {
            double x = -b / (2 * a);
            if (x - Math.floor(x) == 0)
            {
                tv.setText("x = " + x);
            } else
            {
                tv.setText("x = " + (-b) + " / " + (2 * a));
            }
        } else if (d > 0)
        {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (x1 - Math.floor(x1) != 0 && x2 - Math.floor(x2) != 0)
            {
                tv.setText("x1 = " + (-b) + " + √" + d + " / " + (2*a) + "\n" + "x2 = " + (-b) + " - √" + d + " / " + (2*a));
            } else if (x1 - Math.floor(x1) != 0)
            {
                tv.setText("x1 = " + (-b) + " + √" + d + " / " + (2*a) + "\n" + " x2 = " + x2);
            } else if (x2 - Math.floor(x2) != 0)
            {
                tv.setText("x1 = " + x1 + "\n" + "x2 = " + (-b) + " - √" + d + " / " + (2*a));
            }
            else
            {
                tv.setText("x1 = " + x1 + "\n" + " x2 = " + x2);
            }
        } else
        {
            tv.setText("Ты гений? Корень из отрицательного числа?");
        }
    }
}