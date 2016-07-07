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
//        Typeface typeface = Typeface.createFromAsset(getAssets(), "Helv Neue 67 Med Cond.ttf");
        n.setText("show");
//        n.setTypeface(typeface);

    }

    public void openEvents(View view) {
        Intent intent = new Intent(this, NavListActivity.class);
        startActivity(intent);
    }


    //to make a button open a link
    //the function name openlink is referenced in the button android:onClick="functionName"
    public void openLink(View view) {
        Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
