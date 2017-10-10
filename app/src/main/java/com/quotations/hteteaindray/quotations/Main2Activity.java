package com.quotations.hteteaindray.quotations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ViewFlipper;

public class Main2Activity extends AppCompatActivity {

    ViewFlipper fp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fp=(ViewFlipper)findViewById(R.id.flip);
        fp.startFlipping();
        fp.setAutoStart(true);
        fp.setFlipInterval(4000);
        fp.setInAnimation(this,android.R.anim.slide_in_left);
        fp.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
