package com.example.yasha.zealicon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class NavListActivity extends Activity {

    String navArray[] = {"Coderz", "Play it On!", "Robotiles", "Coloralo", "Mechanovoltz", "Z-Wars"};
    String[] txt = {
            "Coderz",
            "Play it On!",
            "Robotiles",
            "Coloralo",
            "Mechanovoltz",
            "Z-Wars"
    };
    Integer[] imageId = {
            R.drawable.batman,
            R.drawable.hulk,
            R.drawable.wolverine,
            R.drawable.ironman,
            R.drawable.spiderman,
            R.drawable.superman
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_list);

        EventList adapter = new
                EventList(NavListActivity.this, txt, imageId);
        ListView listView = (ListView) findViewById(R.id.nav_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent coderzActivity = new Intent(NavListActivity.this, Coderz.class);
                        startActivity(coderzActivity);
                        break;
                    case 1:
                        Intent playItOnActivity = new Intent(NavListActivity.this, PlayItOn.class);
                        startActivity(playItOnActivity);
                        break;
                    case 2:
                        Intent roboTilesActivity = new Intent(NavListActivity.this, Coderz.class);
                        startActivity(roboTilesActivity);
                }
            }
        });
    }


}
