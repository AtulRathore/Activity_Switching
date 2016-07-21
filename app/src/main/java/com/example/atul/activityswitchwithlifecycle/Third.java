package com.example.atul.activityswitchwithlifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Atul on 02-07-2016.
 */

public class Third extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener, View.OnClickListener{

    Button b4 , b5;
    RatingBar ratingBar;
    protected void onCreate(Bundle S){
        super.onCreate(S);
        setContentView(R.layout.third);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        ratingBar= (RatingBar) findViewById(R.id.ratingBar);
    }

    /*@Override
    public void onClick(View v) {
//    final int id = v.getId();
        *//*Switch(id){
            case R.id.b4:
                Intent a1= new Intent(this.Second.class);
        }*//*


    }*/

    @Override
    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
//        TextView.setText(""+v);
            Toast.makeText(this, ""+v, Toast.LENGTH_SHORT).show();
//            Intent i= new Intent(this,MainActivity.class);
//            startActivity(i);


    }

    @Override
    public void onClick(View view) {
        if(view==b4){
            Intent ib4= new Intent(this,MainActivity.class);
            startActivity(ib4);
            Toast.makeText(this, "Main Activity", Toast.LENGTH_SHORT).show();
        }

        else if (view==b5){
            Intent ib5 = new Intent(this, Second.class);
            startActivity(ib5);
            Toast.makeText(this, "Second Activity", Toast.LENGTH_SHORT).show();
        }
    }
}

