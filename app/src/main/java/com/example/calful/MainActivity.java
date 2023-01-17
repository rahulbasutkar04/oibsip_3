package com.example.calful;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String oldnumber="";
    String op="+";
    EditText input;
    boolean isnewoperator=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          input=findViewById(R.id.editTextTextPersonName);

    }

    public void NumberEvent(View view) {
        if(isnewoperator)
        {
            input.setText("");
            isnewoperator=false;
        }
        String number=input.getText().toString();

        switch(view.getId()){

            case R.id.one:
                number+="1";
                break;

            case R.id.two:
                number+="2";
                break;
            case R.id.three:
                number+="3";
                break;
            case R.id.four:
                number+="4";
                break;
            case R.id.five:
                number+="5";
                break;
            case R.id.six:
                number+="6";
                break;
            case R.id.seven:
                number+="7";
                break;
            case R.id.eight:
                number+="8";
                break;
            case R.id.nine:
                number+="9";
                break;
            case R.id.zero:
                number+="0";
                break;
            case R.id.dot:
                number+=".";
                break;

        }
        input.setText(number);
    }

    public void OperatorEvent(View view) {
        isnewoperator=true;
        oldnumber=input.getText().toString();//first input
        switch(view.getId())
        {
            case R.id.plus: op="+"; break;
            case R.id.minus: op="-"; break;
            case R.id.mul: op="*"; break;
            case R.id.div: op="/"; break;


        }
    }

    public void equalEvent(View view) {
        String newnumber=input.getText().toString();//second input
        double result=0.0;
        switch(op)
        {
            case "+":
                result=Double.parseDouble(oldnumber)+Double.parseDouble(newnumber);
                break;

            case "-":
                result=Double.parseDouble(oldnumber)-Double.parseDouble(newnumber);
                break;
            case "*":
                result=Double.parseDouble(oldnumber)*Double.parseDouble(newnumber);
                break;
            case "/":
                result=Double.parseDouble(oldnumber)/Double.parseDouble(newnumber);
                break;

        }
        input.setText(result+"");
    }
     //to clear the screen
    public void clrEvent(View view) {
        input.setText("0");
        isnewoperator=true;
    }
   //to calculate the percentage
    public void percentrEvent(View view) {
        double no=Double.parseDouble(input.getText().toString())/100;
        input.setText(no+"");
        isnewoperator=true;
    }
}