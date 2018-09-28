package com.example.yash.testmark1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button arth1;
    Button arth2;
    Button arth3;
    Button arth4;
    Button arth5;
    Button arth6;
    Button arth7;
    Button arth8;
    Button arth9;
    Button arth10;
    Button arth11;

    EditText et;

    int op1;
    int op2;

    char ch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);

        arth1 = (Button) findViewById(R.id.arth1);
        arth2 = (Button) findViewById(R.id.arth2);
        arth3 = (Button) findViewById(R.id.arth3);
        arth4 = (Button) findViewById(R.id.arth4);
        arth5 = (Button) findViewById(R.id.arth5);
        arth6 = (Button) findViewById(R.id.arth6);
        arth7 = (Button) findViewById(R.id.arth7);
        arth8 = (Button) findViewById(R.id.arth8);
        arth9 = (Button) findViewById(R.id.arth9);
        arth10 = (Button) findViewById(R.id.arth10);
        arth11 = (Button) findViewById(R.id.arth11);

        et = (EditText) findViewById(R.id.et);

    }

    public void click1(View v){
        et.append("1");
    }

    public void click2(View v)
    {
        et.append("2");
    }

    public void click3 (View v){
        et.append("3");
    }

    public void click4 (View v){
        et.append("4");
    }

    public void click5 (View v){
        et.append("5");
    }

    public void click6 (View v){
        et.append("6");
    }

    public void click7 (View v){
        et.append("7");
    }

    public void click8 (View v){
        et.append("8");
    }

    public void click9 (View v){
        et.append("9");
    }

    public void click0 (View v){
        et.append("0");
    }

    public void clickplus (View v)
    {
        if (et.getText().toString().equalsIgnoreCase(""))
        {
            Toast.makeText(getApplicationContext(), "Please enter an operator first", Toast.LENGTH_SHORT).show();
        }

        else
        {
            op1 = Integer.parseInt(et.getText().toString());
            ch = '+';
            et.setText("");
        }
    }

    public void clickminus (View v)
    {
        if (et.getText().toString().equalsIgnoreCase(""))
        {
            Toast.makeText(getApplicationContext(), "Please enter an operator first", Toast.LENGTH_SHORT).show();
        }

        else
        {
            op1 = Integer.parseInt(et.getText().toString());
            ch = '-';
            et.setText("");
        }
    }

    public void clickmultiply (View v)
    {
        if (et.getText().toString().equalsIgnoreCase(""))
        {
            Toast.makeText(getApplicationContext(), "Please enter an operator first", Toast.LENGTH_SHORT).show();
        }

        else
        {
            op1 =Integer.parseInt(et.getText().toString());
            ch = '*';
            et.setText("");
        }
    }

    public void clickdivide (View v)
    {
        if (et.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "Please enter an operator first", Toast.LENGTH_SHORT).show();
        }

        else
        {
            op1 = Integer.parseInt(et.getText().toString());
            ch = '/';
            et.setText("");
        }
    }

    public void clickC(View v)
    {
        et.setText("");
    }

    public void clickback(View v)
    {
        int a = et.getText().toString().length();
        String sub = et.getText().toString().substring(0,a-1);
        et.setText(sub);
    }

    public void clicksin(View v) {
        int a = Integer.parseInt(et.getText().toString());
        if (a == 0) {
            et.setText("Inf");
        }
        else {
            Double b = Math.sin(a);
            String sub = Double.toString(b);
            et.setText(sub);
        }
    }

    public void clickcos(View v)
    {
        int a = Integer.parseInt(et.getText().toString());
        Double b = Math.cos(a);
        String sub = Double.toString(b);
        et.setText(sub);
    }

    public void clicktan(View v)
    {
        Integer a = Integer.parseInt(et.getText().toString());
        Double b = Math.tan(a);
        String sub = Double.toString(b);
        et.setText(sub);
    }

    public void reciprocal(View v){
        int a = Integer.parseInt(et.getText().toString());
        float b = 1/a;
        String sub = Float.toString(b);
        et.setText(sub);
    }

    public void clickequal(View v)
    {

        if(ch == '+')
            {
                op2 = Integer.parseInt(et.getText().toString());
                int sum = op1 + op2;
                et.setText(Integer.toString(sum));
            }
        else if(ch == '-')
            {
                op2 = Integer.parseInt(et.getText().toString());
                int sum = op1 - op2;
                et.setText(Integer.toString(sum));
            }

        else if(ch == '*')
            {
                op2 = Integer.parseInt(et.getText().toString());
                int sum = op1 * op2;
                et.setText(Integer.toString(sum));
            }

        else
            {
                op2 = Integer.parseInt(et.getText().toString());
                if(op2 == 0)
                {
                    Toast.makeText(getApplicationContext(),"RESULT IS INFINITE",Toast.LENGTH_LONG);
                    et.setText("Inf");
                }
                else {
                    int sum = op1 / op2;
                    et.setText(Integer.toString(sum));
                }
            }

        }
    }