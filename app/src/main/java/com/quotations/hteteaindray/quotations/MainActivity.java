package com.quotations.hteteaindray.quotations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button b1;
    ViewFlipper fp;
    //ListView lv;
    //String[] l={"Love","Friendship","Life","Crush","Parent"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fp=(ViewFlipper)findViewById(R.id.flip);
        fp.startFlipping();
        fp.setAutoStart(true);
        fp.setFlipInterval(4000);
        fp.setInAnimation(this,android.R.anim.slide_in_left);
        fp.setOutAnimation(this,android.R.anim.slide_out_right);

        b1=(Button)findViewById(R.id.btn);
        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,l);
        //lv.setAdapter(adapter);
       // lv.setOnItemClickListener(this);
        /*Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"Thank you",Toast.LENGTH_LONG).show();
            }
        });*/
        //lv=(ListView)findViewById(R.id.list);

    }
    /*public void click(View view){
        Toast.makeText(getApplicationContext(),"Thank you",Toast.LENGTH_LONG).show();
    }*/
    public void nextpage(View v){
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }


    /*public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }*/
}
