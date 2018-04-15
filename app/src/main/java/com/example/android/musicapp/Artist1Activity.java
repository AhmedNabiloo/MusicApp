package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Artist1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_list);

        // Create a list of items in first artist category

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Uncover", "Album: Uncover"));

        items.add(new Item("Wanna Be Your Baby", "Album: Uncover"));

        items.add(new Item("Rooftop", "Album: Uncover"));

        items.add(new Item("Carry You Home", "Album: Uncover"));

        items.add(new Item("Never Gonna Die", "Album: Uncover"));

        items.add(new Item("What They Say", "Album: So Good"));

        items.add(new Item("Lush Life", "Album: So Good"));

        items.add(new Item("I Would Like", "Album: So Good"));

        items.add(new Item("So Good", "Album: So Good"));

        items.add(new Item("TG4M", "Album: So Good"));

        items.add(new Item("Only You", "Album: So Good"));

        items.add(new Item("Never Forget You", "Album: So Good"));

        items.add(new Item("Sundown", "Album: So Good"));

        items.add(new Item("Don't Let Me Be Yours", "Album: So Good"));

        items.add(new Item("Make That Money Girl", "Album: So Good"));

        items.add(new Item("Ain't My Fault", "Album: So Good"));

        items.add(new Item("One Mississippi", "Album: So Good"));

        items.add(new Item("Funeral", "Album: So Good"));

        items.add(new Item("I Can't Fall In Love Without You", "Album: So Good"));

        items.add(new Item("Symphony", "Album: So Good"));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The

        // adapter knows how to create list items for each item in the list.

        ItemAdapter adapter = new ItemAdapter(this, items);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // selection_list.xml layout file.

        final ListView artist1ListView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the

        // {@link ListView} will display list items for each {@link Item} in the list.

        artist1ListView.setAdapter(adapter);

        //Set a click listener on that View

        artist1ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // Start the Now Playing activity

                // put extra First line & Second line from selected item

                Item selectedItem = (Item) artist1ListView.getItemAtPosition(position);
                Intent PlayingIntent = new Intent(Artist1Activity.this, NowPlayingActivity.class);
                PlayingIntent.putExtra("FIRSTLINE", selectedItem.getFirstLine());
                PlayingIntent.putExtra("SECONDLINE", selectedItem.getSecondLine());
                startActivity(PlayingIntent);
            }
        });

    }
}