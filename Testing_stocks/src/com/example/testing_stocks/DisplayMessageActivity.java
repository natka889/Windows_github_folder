package com.example.testing_stocks;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;

public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Set the text view as the activity layout
        setContentView(textView);
        
        //------------Everything below this point is NEW--------------
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display_message); //Comment out cannot see text with this
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // If your minSdkVersion is 11 or higher, instead use:
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	 /**Add new stuff*/
        // Handle presses on the action bar items
           switch (item.getItemId()) {
               case R.id.action_search:
                   //openSearch(); COMMENT OUT UNTIL FIGURE OUT WHAT I WANT TO DO
                   return true;
               case R.id.action_settings:
                   //openSettings(); COMMENT OUT UNTIL FIGURE OUT WHAT I WANT TO DO
                   return true;
               default:
                   return super.onOptionsItemSelected(item);
           }
    	/**OLD Stuff----Keep until know it works than delete*/
    	// Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        /**int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
        */
       
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() { }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                  Bundle savedInstanceState) {
              View rootView = inflater.inflate(R.layout.fragment_display_message,
                      container, false);
              return rootView;
        }
    }
}