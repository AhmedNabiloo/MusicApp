package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Album1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_list);

        // Create a list of items in first album
        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("What They Say", "Zara Larsson"));

        items.add(new Item("Lush Life", "Zara Larsson"));

        items.add(new Item("I Would Like", "Zara Larsson"));

        items.add(new Item("So Good", "Zara Larsson"));

        items.add(new Item("TG4M", "Zara Larsson"));

        items.add(new Item("Only You", "Zara Larsson"));

        items.add(new Item("Never Forget You", "Zara Larsson"));

        items.add(new Item("Sundown", "Zara Larsson"));

        items.add(new Item("Don't Let Me Be Yours", "Zara Larsson"));

        items.add(new Item("Make That Money Girl", "Zara Larsson"));

        items.add(new Item("Ain't My Fault", "Zara Larsson"));

        items.add(new Item("One Mississippi", "Zara Larsson"));

        items.add(new Item("Funeral", "Zara Larsson"));

        items.add(new Item("I Can't Fall In Love Without You", "Zara Larsson"));

        items.add(new Item("Symphony", "Zara Larsson"));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The

        // adapter knows how to create list items for each item in the list.

        ItemAdapter adapter = new ItemAdapter(this, items);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // selection_list.xml layout file.

        final ListView album1ListView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the

        // {@link ListView} will display list items for each {@link Item} in the list.

        album1ListView.setAdapter(adapter);

        //Set a click listener on that View

       album1ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // Start the Now Playing activity

                // Put extra to the new activity First line and second line from selected item

                Item selectedItem = (Item) album1ListView.getItemAtPosition(position);
                Intent PlayingIntent = new Intent(Album1Activity.this, NowPlayingActivity.class);
                PlayingIntent.putExtra("FIRSTLINE", selectedItem.getFirstLine());
                PlayingIntent.putExtra("SECONDLINE", selectedItem.getSecondLine());
                startActivity(PlayingIntent);
            }
       });
    }
}