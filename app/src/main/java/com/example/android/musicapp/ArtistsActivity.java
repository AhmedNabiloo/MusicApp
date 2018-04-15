package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_list);

        // Create a list of items in Artists Category

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Zara Larsson", "20 tracks"));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The

        // adapter knows how to create list items for each item in the list.

        final ItemAdapter adapter = new ItemAdapter(this, items);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // selection_list.xml layout file.

        ListView artistsListView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the

        // {@link ListView} will display list items for each {@link Item} in the list.

        artistsListView.setAdapter(adapter);

        //Set a click listener on that View

        artistsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
        public void onItemClick(AdapterView<?> parent, View view,
        int position, long id) {

                // Create a new intent to open the {@link Artist1Activity} -> First Artist screen

                Intent nowPlayingIntent = new Intent(ArtistsActivity.this, Artist1Activity.class);

                // Start the new activity

                startActivity(nowPlayingIntent);
            }
        });
    }
}
