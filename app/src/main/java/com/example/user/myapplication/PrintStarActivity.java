package com.example.user.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PrintStarActivity extends AppCompatActivity {
    private EditText et;
    private Button button2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);
        getSupportActionBar().setTitle("별찍기"); //타이블이름변경
        init();
    }

    private int checkInteger(String v) {
        int result = 0;
        try {
            result = Integer.parseInt(v);
        } catch(Exception e) {

        }
        return result;
    }
   private void init() {
        et = findViewById(R.id.et);
       button2 = findViewById(R.id.button2);
       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String value = et.getText().toString();
               int no = checkInteger(value);

               if(no>0) {
                   String result = "";
                   for(int i=1; i<=no; i++) {
                       for(int j=0; j<i; j++) {
                           result += "*";
                       }
                       result +="\n";
                   }
                   tv.setText(result);
               }
           }
       });
       tv = findViewById(R.id.tv);

   }
    }


