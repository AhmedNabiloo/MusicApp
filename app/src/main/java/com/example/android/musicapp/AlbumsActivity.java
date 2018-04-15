package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_list);

        // Create a list of items in Albums Category

        ArrayList<Item> songs = new ArrayList<Item>();

        songs.add(new Item("So Good", "Zara Larsson"));

        // Create an {@link itemAdapter}, whose data source is a list of {@link Item}s. The

        // adapter knows how to create list items for each item in the list.

        ItemAdapter adapter = new ItemAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // selection_list.xml layout file.

        ListView albumsListView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link itemAdapter} we created above, so that the

        // {@link ListView} will display list items for each {@link Item} in the list.

        albumsListView.setAdapter(adapter);

        //Set a click listener on that View

        albumsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                // Create a new intent to open the {@link Album1Activity} -> First Album screen

                Intent nowPlayingIntent = new Intent(AlbumsActivity.this, Album1Activity.class);

                // Start the new activity

                startActivity(nowPlayingIntent);
            }
        });
    }
}

