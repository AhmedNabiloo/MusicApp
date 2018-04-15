package com.example.android.musicapp;

/**
 * Created by ahmed on 2018-03-16.
 */

public class Item {
    /**
     * item first line
     */
    private String mFirstLine;

    /**
     * item second line
     */
    private String mSecondLine;

    /**
     * Create a new selection item
     *
     * @param firstLine song title
     * @param secondLine artisit name / Album title
     */

    public Item(String firstLine, String secondLine) {
        mFirstLine = firstLine;
        mSecondLine = secondLine;
    }

    /**
     * Get the first line of item
     */

    public String getFirstLine() {
        return mFirstLine;
    }

    /**
     * Get the second line of item
     */

    public String getSecondLine() {
        return mSecondLine;
    }
}