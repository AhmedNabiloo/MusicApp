package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_list);

        // Create a list of items in playlist category

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Spectre", "Alan Walker"));

        items.add(new Item("Despacito", "Luis Fonsi & Daddy Yankee"));

        items.add(new Item("Lush Life", "Zara Larsson"));

        items.add(new Item("Billionaire", "Bruno Mars"));

        items.add(new Item("Diamonds", "Rihanna"));

        items.add(new Item("Only You", "Zara Larsson"));

        items.add(new Item("Sing Me To Sleep", "Alan Walker"));

        items.add(new Item("Grenade", "Bruno Mars"));

        items.add(new Item("Heaven", "Bryan Adams"));

        items.add(new Item("Uncover", "Zara Larsson"));

        items.add(new Item("Bad", "Rihanna"));

        items.add(new Item("Treasure", "Bruno Mars"));

        items.add(new Item("So Good", "Zara Larsson"));

        items.add(new Item("Summer Of '69", "Bryan Adams"));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The

        // adapter knows how to create list items for each item in the list.

        ItemAdapter adapter = new ItemAdapter(this, items);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // selection_list.xml layout file.

        final ListView tracksListView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the

        // {@link ListView} will display list items for each {@link Item} in the list.

        tracksListView.setAdapter(adapter);

        //Set a click listener on that View

        tracksListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // Start the Now Playing activity

                // Put extra to the new activity First line and second line from selected item

                Item selectedItem = (Item) tracksListView.getItemAtPosition(position);
                Intent PlayingIntent = new Intent(TracksActivity.this, NowPlayingActivity.class);
                PlayingIntent.putExtra("FIRSTLINE", selectedItem.getFirstLine());
                PlayingIntent.putExtra("SECONDLINE", selectedItem.getSecondLine());
                startActivity(PlayingIntent);
            }
        });
    }
}
