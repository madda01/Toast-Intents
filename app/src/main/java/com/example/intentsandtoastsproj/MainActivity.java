package com.example.intentsandtoastsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button btn;//create the button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btnOk);//map the button
    }

    @Override
    protected void onResume() {
        super.onResume();

        //handle the onclick event
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //create a toast
                //method1
                /*Toast t = new Toast(getApplicationContext());
                t.setText("Sending a message");
                t.setDuration(Toast.LENGTH_LONG);
                t.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);*/

                //method2
                // Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();

                //method3
                Context context = getApplicationContext();
                    //The context to use. Usually your Application or Activity object
                  CharSequence message = "You just clicked the OK button";
                    //Display string
                  int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                  Toast toast = Toast.makeText(context, message, duration);
                  toast.show();


                //intent creation: Explicit
                Intent i= new Intent(MainActivity.this,SecondActivity.class);

                //take data
                EditText num1,num2;
                num1=findViewById(R.id.etNum1);
                num2=findViewById(R.id.etNum2);

                i.putExtra("num1",num1.getText().toString());
                i.putExtra("num2",num2.getText().toString());

                //send
                startActivity(i);
            }
        });
    }
}