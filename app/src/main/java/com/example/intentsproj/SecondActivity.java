package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {
    public EditText textInput3;
    public EditText textInput4;

    public Double temp1, temp2,answer;
    private Button add;
    private Button subt;
    private Button multi;
    private Button divide ;
    private TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        multi = (Button) findViewById(R.id.btn4);
        divide = (Button) findViewById(R.id.btn5);
        add = (Button) findViewById(R.id.btn2);
        subt = (Button) findViewById(R.id.btn3);
        Answer = (TextView) findViewById(R.id.displayAns);

        textInput3 = (EditText) findViewById(R.id.input3);
        textInput4 = (EditText) findViewById(R.id.input4);



        temp1 = Double.parseDouble(getIntent().getExtras().getString("to1"));
        textInput3.setText(Double.toString(temp1));

        temp2 = Double.parseDouble(getIntent().getExtras().getString("to2"));
        textInput4.setText(Double.toString(temp2));


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = temp1 + temp2;
                Answer.setText(Double.toString(answer));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = temp1 / temp2;
                Answer.setText(Double.toString(answer));
            }
        });


        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = temp1 * temp2;
                Answer.setText(Double.toString(answer));
            }
        });

        subt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = temp1 - temp2;
                Answer.setText(Double.toString(answer));
            }
        });


    }//end of on create



}//end
