package com.malik.usman.pic_changeatruntime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b1;
ImageView v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    b1= findViewById(R.id.btn_1);
    b1.setOnClickListener(this);
    v1=findViewById(R.id.image_1);
        v1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        v1.setVisibility(View.VISIBLE);
        v1.setImageResource(R.drawable.github);

    }
}
