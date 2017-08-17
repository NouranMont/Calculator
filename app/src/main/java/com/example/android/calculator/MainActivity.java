package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.text.TextUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sub(View view) {
        TextView textView = (TextView) findViewById(R.id.res);
        EditText edit = (EditText) findViewById(R.id.ed);
        String data = edit.getText().toString();
        if (data.matches("")) {
            textView.setVisibility(View.INVISIBLE);
            Toast.makeText(this, "Please Enter a valid 2 Numbers First", Toast.LENGTH_SHORT).show();
        } else {
            try {
                String[] numParts = data.split(" ");
                double num1 = Double.parseDouble(numParts[0]), num2 = Double.parseDouble(numParts[1]);
                if (numParts.length > 2) {
                    textView.setVisibility(View.INVISIBLE);
                    Toast.makeText(this, "Please Enter 2 Numbers Only", Toast.LENGTH_SHORT).show();
                } else {
                    textView.setVisibility(View.VISIBLE);
                    display(num1 - num2);
                }
            } catch (NumberFormatException e) {
                textView.setVisibility(View.INVISIBLE);
                Toast.makeText(this, "Please Enter a valid 2 Numbers First", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void plus(View view) {
        TextView textView = (TextView) findViewById(R.id.res);
        EditText edit = (EditText) findViewById(R.id.ed);
        String data = edit.getText().toString();
        if (data.matches("")) {
            textView.setVisibility(View.INVISIBLE);
            Toast.makeText(this, "Please Enter a valid 2 Numbers First", Toast.LENGTH_SHORT).show();
        } else {
            try {
                String[] numParts = data.split(" ");
                double num1 = Double.parseDouble(numParts[0]), num2 = Double.parseDouble(numParts[1]);
                if (numParts.length > 2) {
                    textView.setVisibility(View.INVISIBLE);
                    Toast.makeText(this, "Please Enter 2 Numbers Only", Toast.LENGTH_SHORT).show();
                } else {
                    double r;
                    r = num1 + num2;
                    textView.setVisibility(View.VISIBLE);
                    display(r);
                }
            } catch (NumberFormatException e) {
                textView.setVisibility(View.INVISIBLE);
                Toast.makeText(this, "Please Enter a valid 2 Numbers First", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void mu(View view) {
        TextView textView = (TextView) findViewById(R.id.res);
        EditText edit = (EditText) findViewById(R.id.ed);
        String data = edit.getText().toString();
        if (data.matches("")) {
            textView.setVisibility(View.INVISIBLE);
            Toast.makeText(this, "Please Enter a valid 2 Numbers First", Toast.LENGTH_SHORT).show();
        } else {
            try {
                String[] numParts = data.split(" ");
                double num1 = Double.parseDouble(numParts[0]), num2 = Double.parseDouble(numParts[1]);
                if (numParts.length > 2) {
                    textView.setVisibility(View.INVISIBLE);
                    Toast.makeText(this, "Please Enter 2 Numbers Only", Toast.LENGTH_SHORT).show();
                } else {
                    double r;
                    if (num1 > 9999999 || num2 > 9999999) {
                        textView.setVisibility(View.INVISIBLE);
                        Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
                    } else {
                        textView.setVisibility(View.VISIBLE);
                        r = num1 * num2;
                        display(r);
                    }
                }
            } catch (NumberFormatException e) {
                textView.setVisibility(View.INVISIBLE);
                Toast.makeText(this, "Please Enter a valid 2 Numbers First", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void div(View view) {
        TextView textView = (TextView) findViewById(R.id.res);
        EditText edit = (EditText) findViewById(R.id.ed);
        String data = edit.getText().toString();
        if (data.matches("")) {
            textView.setVisibility(View.INVISIBLE);
            Toast.makeText(this, "Please Enter a valid 2 Numbers First", Toast.LENGTH_SHORT).show();
        } else {
            try {
                String[] numParts = data.split(" ");
                double num1 = Double.parseDouble(numParts[0]), num2 = Double.parseDouble(numParts[1]);
                if (numParts.length > 2) {
                    textView.setVisibility(View.INVISIBLE);
                    Toast.makeText(this, "Please Enter 2 Numbers Only", Toast.LENGTH_SHORT).show();
                } else {
                    if (num2 == 0 || num1 > 9999999 || num2 > 9999999) {
                        textView.setVisibility(View.INVISIBLE);
                        Toast.makeText(this, "Please Enter a valid number", Toast.LENGTH_SHORT).show();
                    } else {
                        textView.setVisibility(View.VISIBLE);
                        double r;
                        r = num1 / num2;
                        display(r);
                    }
                }
            } catch (NumberFormatException e) {
                textView.setVisibility(View.INVISIBLE);
                Toast.makeText(this, "Please Enter a valid 2 Numbers First", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void display(double result) {
        TextView textView = (TextView) findViewById(R.id.res);
        textView.setText("" + result);
    }
}
