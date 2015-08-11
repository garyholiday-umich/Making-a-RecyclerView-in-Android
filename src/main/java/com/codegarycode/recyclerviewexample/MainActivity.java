package com.codegarycode.recyclerviewexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView)
                findViewById(R.id.my_recycler_view);

        //data
        String[] name = {"Stephanie","Erich","Ian","Sunny","Mike",
                         "Kayla","Jessica", "Bryan","Luke","Paige",
                         "Lindsey","Jake","Jeff","Carol", "Kevin"};
        String[] subject = {"Let's Get Coffee",
                            "Homework Assignment",
                            "Order Conformation",
                            "How Have You Been?",
                            "Check This Out",
                            "A Couple Questions",
                            "I Need Some Advice",
                            "Bill Reminder",
                            "Website Development",
                            "Welcome!","Final Notice",
                            "Mobile Device Registered",
                            "Pizza Order Confirmed!",
                            "Google Play Receipt",
                            "Update Available"};
        String[] message =
                {"Lorem ipsum dolor sit amet, consectetur adipiscing.",
                "Sed molestie vel ligula aend. Duis condimentum erat.",
                "Aliquam porttitor lacus velit, sed malesuada est po.",
                "Etiam risus orci, rhoncus viverra est sit amet, feu.",
                "Nam scelerisque, odio vel porttitor condimentums.",
                "Proin tincidunt metus at nisl mattis maximus.",
                "Nullam urna quam, dapibus id nisi vel, consequat.",
                "In hac habitasse platea dictumst.",
                "Fusce vel mauris eu orci vulputate euismod. ",
                "Mauris dolor justo, hendrerit sit amet pellentesque.",
                "Maecenas ut dapibus odio.",
                "Suspendisse non est rhoncus, bibendum ligula vel.",
                "Donec eleifend ante sed elit venenatis consequat. ",
                "Vestibulum in tellus ac massa venenatis cursus. ",
                "Nec ligula consectetur, tincidunt neque quis.",
        };

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // add the adapter to RecyclerView
        mAdapter = new MyAdapter(name, subject, message);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
