package com.example.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.example.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newText=(TextView) findViewById(R.id.textView);
    }
    private TextView newText;
    public void changeText(View View){
        if(newText.getText().toString().equals("EXAMPLE")) {
            newText.setText("BUTTON SELECTED!");
        }
        else{
            newText.setText("EXAMPLE");
        }
    }
}