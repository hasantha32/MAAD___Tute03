package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public EditText text1;
    public EditText text2;

    public String in1, in2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button ok = findViewById(R.id.btn1);
        text1 = (EditText) findViewById(R.id.input1);
        text2 = (EditText) findViewById(R.id.input2);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                CharSequence message = "You clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();
                toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);

                Intent to = new Intent(FirstActivity.this ,SecondActivity.class);
                in1 = text1.getText().toString();
                in2 = text2.getText().toString();
                to.putExtra("to1",in1);
                to.putExtra("to2",in2);
                startActivity(to);
            }
        });
    }//end of on create

}//end of main method
