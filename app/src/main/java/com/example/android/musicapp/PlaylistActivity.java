package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_list);

        // Create a list of items in Playlist category

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Warm", "Joey Pecoraro"));

        items.add(new Item("Nymano", "Chillhop Music"));

        items.add(new Item("Black Coffee", "Edo Lee"));

        items.add(new Item("Lovely Reasons", "Rose"));

        items.add(new Item("Often-Waves", "NDBeatz"));

        items.add(new Item("Timeless", "Aso"));

        items.add(new Item("Life", "Trevor Jordan"));

        items.add(new Item("Swing For Me", "SAIB"));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The

        // adapter knows how to create list items for each item in the list.

        ItemAdapter adapter = new ItemAdapter(this, items);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // selection_list.xml layout file.

        final ListView playlistListView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the

        // {@link ListView} will display list items for each {@link Item} in the list.

        playlistListView.setAdapter(adapter);

        //Set a click listener on that View

        playlistListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // Start the Now Playing activity

                // Put extra to the new activity First line and second line from selected item

                Item selectedItem = (Item) playlistListView.getItemAtPosition(position);
                Intent PlayingIntent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                PlayingIntent.putExtra("FIRSTLINE", selectedItem.getFirstLine());
                PlayingIntent.putExtra("SECONDLINE", selectedItem.getSecondLine());
                startActivity(PlayingIntent);
            }
        });
    }
}
