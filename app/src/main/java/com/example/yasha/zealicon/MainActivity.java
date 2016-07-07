package com.example.yasha.zealicon;


/* This project is based upon the tutorials -
 https://developer.android.com/training/basics/firstapp/starting-activity.html#RespondToButton
  required for switching to another activity*/

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This function is used to open certain item from the menu list
     *
     * @param view
     */
    public void openMenu(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
