package com.example.jier.mr_potatoe;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.support.constraint.ConstraintLayout;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Save checked boxes and their actions, i.e. the image clicked by it
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        // Initialise id of constraint layout of the image
        ConstraintLayout layout =  findViewById(R.id.layout);
        View v = null;
        int[] boxes  = new int[12]; // count the body as element

        // get every element of the layout as view object and store it in an box array
        for (int i = 0 ; i < layout.getChildCount(); i++) {
            v = layout.getChildAt(i);
            boxes[i] = v.getVisibility();
        }
        outState.putIntArray("checkedBox", boxes);
    }

    // restore every checked element and their images
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int[] checkedBox = savedInstanceState.getIntArray("checkedBox");
        ConstraintLayout layout =  findViewById(R.id.layout);

        // get every child that has been checked and set their visibility
        for (int i = 0; i < layout.getChildCount(); i++) {
            View v = layout.getChildAt(i);
            assert checkedBox != null;
            v.setVisibility(checkedBox[i]);
        }
    }
    
    // method to connect the layout with action of visible/invisible image by checkbox through id's
    public void checkClicked(@NonNull View view) {

        CheckBox checkbox = (CheckBox) view;
        boolean check = checkbox.isChecked();

        switch (view.getId()) {
            case R.id.body:
                if (check) {
                    findViewById(R.id.Body).setVisibility(view.INVISIBLE);
                } else {
                    findViewById(R.id.Body).setVisibility(view.VISIBLE);
                }
                break;
            case R.id.shoes:
                if (check) {
                    findViewById(R.id.Shoes).setVisibility(view.INVISIBLE);
                } else {
                    findViewById(R.id.Shoes).setVisibility(view.VISIBLE);
                }
                break;
            case R.id.hat:
                if (check) {
                    findViewById(R.id.Hat).setVisibility(view.INVISIBLE);
                } else {
                    findViewById(R.id.Hat).setVisibility(view.VISIBLE);
                }
                break;
            case R.id.mouth:
                if (check) {
                    findViewById(R.id.Mouth).setVisibility(view.INVISIBLE);
                } else {
                    findViewById(R.id.Mouth).setVisibility(view.VISIBLE);
                }
                break;
            case R.id.arms:
                if (check) {
                    findViewById(R.id.Arms).setVisibility(view.INVISIBLE);
                } else {
                    findViewById(R.id.Arms).setVisibility(view.VISIBLE);
                }
                break;
            case R.id.glasses:
                if (check) {
                    findViewById(R.id.Glasses).setVisibility(view.INVISIBLE);
                } else {
                    findViewById(R.id.Glasses).setVisibility(view.VISIBLE);
                }
                break;
            case R.id.nose:
                if (check) {
                    findViewById(R.id.Nose).setVisibility(view.INVISIBLE);
                } else {
                    findViewById(R.id.Nose).setVisibility(view.VISIBLE);
                }
                break;
            case R.id.moustache:
                if (check) {
                    findViewById(R.id.Moustache).setVisibility(view.INVISIBLE);
                } else {
                    findViewById(R.id.Moustache).setVisibility(view.VISIBLE);
                }
                break;
            case R.id.eyebrows:
                if (check) {
                    findViewById(R.id.Eyebrows).setVisibility(view.INVISIBLE);
                } else {
                    findViewById(R.id.Eyebrows).setVisibility(view.VISIBLE);
                }
                break;
            case R.id.ears:
                if (check) {
                    findViewById(R.id.Ears).setVisibility(view.INVISIBLE);
                } else {
                    findViewById(R.id.Ears).setVisibility(view.VISIBLE);
                }
                break;
            case R.id.eyes:
                if (check) {
                    findViewById(R.id.Eyes).setVisibility(view.INVISIBLE);
                } else {
                    findViewById(R.id.Eyes).setVisibility(view.VISIBLE);
                }
                break;
            default:
                    findViewById(R.id.Body).setVisibility(view.VISIBLE);
        }

    }

}
