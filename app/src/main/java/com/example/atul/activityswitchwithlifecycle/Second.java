package com.example.atul.activityswitchwithlifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by Atul on 02-07-2016.
 */
public class Second extends AppCompatActivity implements View.OnClickListener {

    Button b3;
    CheckBox checkBox2, checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox.setOnClickListener(this);
        checkBox2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //if(view.getId()== checkBox){
            Intent s = new Intent(this,Third.class);
           startActivity(s);
        Toast.makeText(this, "Third", Toast.LENGTH_SHORT).show();
        //}


    }
}
