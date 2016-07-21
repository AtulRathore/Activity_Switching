package com.example.atul.activityswitchwithlifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton radioButtonm ,radioButtonf;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButtonm = (RadioButton) findViewById(R.id.radioButtonm);
        radioButtonf = (RadioButton) findViewById(R.id.radioButtonf);
        radioButtonf.setOnClickListener(this);
        radioButtonm.setOnClickListener(this);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this,Second.class);
        startActivity(i);
    }
}

