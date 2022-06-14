package com.example.biggernumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonr,buttonl;
    DataModel model;

    int points = 0;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataModel model = new DataModel();
        result = findViewById(R.id.textView2);
        buttonl = findViewById(R.id.buttonl);
        buttonl.setText(Integer.toString(model.getNum1()));
        buttonl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Button temp = (Button) v;
                String txt = (String) temp.getText();
                String answer = Integer.toString(model.getAnswer());

                if(txt.equals(answer)){
                    Toast.makeText(getApplicationContext(),"CORRECT",Toast.LENGTH_LONG).show();
                    points++;
                    result.setText(" Points :" + points);
                }else{
                    Toast.makeText(getApplicationContext(),"NOT CORRECT",Toast.LENGTH_LONG).show();
                    points--;
                    result.setText(" Points :" + points);
                }
                model.setNum1();
                model.setNum2();
                model.setAnswer();
                buttonl.setText(Integer.toString(model.getNum1()));
                buttonr.setText(Integer.toString(model.getNum2()));
            }
        });

        buttonr = findViewById(R.id.buttonr);
        buttonr.setText(Integer.toString(model.getNum2()));
        buttonr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Button temp = (Button) v;
                String txt = (String) temp.getText();
                String answer = Integer.toString(model.getAnswer());

                if(txt.equals(answer)){
                    Toast.makeText(getApplicationContext(),"CORRECT",Toast.LENGTH_LONG).show();
                    points++;
                    result.setText(" Points :" + points);
                }else{
                    Toast.makeText(getApplicationContext(),"NOT CORRECT",Toast.LENGTH_LONG).show();
                    points--;
                    result.setText(" Points :" + points);
                }
                model.setNum1();
                model.setNum2();
                model.setAnswer();
                buttonl.setText(Integer.toString(model.getNum1()));
                buttonr.setText(Integer.toString(model.getNum2()));
            }
        });


    }


}