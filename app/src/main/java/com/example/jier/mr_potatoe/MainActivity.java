package com.example.jier.mr_potatoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View view) {
        CheckBox checkbox = (CheckBox) view;
        String checkTxt  = "";

//        ImageView img = (ImageView) findViewById(R.id.arms);
        if (checkbox.isChecked()) {
            checkTxt = checkbox.getText().toString();
            System.out.println(checkTxt);
            Log.d("potato", "checkTxt" );
        }else {
            System.out.println(checkTxt);
        }

        Log.d("potato", "checkClicked:");

    }

}
