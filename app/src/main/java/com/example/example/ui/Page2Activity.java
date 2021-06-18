package com.example.example.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.example.R;

public class Page2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);
        newText=(TextView) findViewById(R.id.newText2);
    }
    private TextView newText;
    public void changeText2(View View){
        if(newText.getText().toString().equals("")) {
            newText.setText("This is a check for the scrollable property of the TextView widget of android interface, XML file! I hope this blood works!");
        }
        else{
            newText.setText("");
        }
    }
    public void back(View view){
        finish();
    }
}