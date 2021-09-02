package com.example.intentsandtoastsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etn1,etn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //get the values passed
        Intent i= getIntent();

        etn1=findViewById(R.id.etNum1);
        etn2=findViewById(R.id.etNum2);

        etn1.setText(i.getStringExtra("num1"));
        etn2.setText(i.getStringExtra("num2"));
    }

    //one method button click
    public void onClick(View v){

        float n1=Float.parseFloat(etn1.getText().toString());
        float n2=Float.parseFloat(etn2.getText().toString());
        float result=0.0f;
        TextView tv=findViewById(R.id.tvresult);

        switch(v.getId()){
            case R.id.btnAdd:
                result=n1+n2;
                tv.setText(n1+" + "+n2+" = "+result);
                break;
            case R.id.btnSub:
                result=n1-n2;
                tv.setText(n1+" - "+n2+" = "+result);
                break;
            case R.id.btnMul:
                result=n1*n2;
                tv.setText(n1+" * "+n2+" = "+result);
                break;
            case R.id.btnDiv:
                result=n1/n2;
                tv.setText(n1+" / "+n2+" = "+result);
                break;
        }
    }
}