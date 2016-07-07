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
        n.setText("EVENTS");


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
     * This function opens a url(Zealicon'16 teaser) in the an intent
     * @param view
     */
    public void openLink(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=6I6WBTSOsZY"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    /**
     * This function opens the AboutZealicon acitvity when "ABOUT" button is pressed
     *
     * @param view
     */
    public void openAbout(View view) {
        Intent intent = new Intent(this, AboutZealicon.class);
        startActivity(intent);
    }

    public void openTeam(View view) {
        Intent intent = new Intent(this, Team.class);
        startActivity(intent);
    }

}
