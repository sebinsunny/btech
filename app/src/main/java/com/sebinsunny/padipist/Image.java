package com.sebinsunny.padipist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Image extends Activity implements View.OnClickListener {
    ImageView t, t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        t = (ImageView) findViewById(R.id.image1);
        t1 = (ImageView) findViewById(R.id.imagez);
        t.setOnClickListener(this);
        t1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.image1) {

            t.setVisibility(View.GONE);
            t1.setVisibility(View.VISIBLE);

        } else {
            t1.setVisibility(View.GONE);
            t.setVisibility(View.VISIBLE);
        }
    }
}