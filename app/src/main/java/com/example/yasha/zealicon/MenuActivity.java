package com.example.yasha.zealicon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button n = (Button) findViewById(R.id.button);
        n.setText("show");


    }

    /**
     * This function opens the events navigation activity
     *
     * @param view
     */
    public void openEvents(View view) {
        Intent intent = new Intent(this, NavListActivity.class);
        startActivity(intent);
    }

    /**
     * This function opens a url in the an intent
     * @param view
     */
    public void openLink(View view) {
        Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
