package main.codeacid.com.clone.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import main.codeacid.com.clone.Adapter.PagerAdapter;
import main.codeacid.com.clone.Adapter.RVAdapter;
import main.codeacid.com.clone.Fragments.TabFragment1;
import main.codeacid.com.clone.Fragments.TabFragment2;
import main.codeacid.com.clone.Fragments.TabFragment3;
import main.codeacid.com.clone.R;
import main.codeacid.com.clone.helpers.FontManager;
import main.codeacid.com.clone.model.*;

import static main.codeacid.com.clone.R.mipmap.ic_launcher;

public class MainActivity extends AppCompatActivity {


    List<Person> persons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        InitializeTabs();
        //recyclerview initialization
       //InitialiseData();
//        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
//        rv.setHasFixedSize(true);
//        RVAdapter recyclerViewAdapter = new RVAdapter(persons);
//        rv.setAdapter(recyclerViewAdapter);
//        LinearLayoutManager llm = new LinearLayoutManager(this);
//        rv.setLayoutManager(llm);

        //floating button initialization
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void InitializeTabs(){



        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager());
        adapter.addFragment(new TabFragment1(),"Local");
        adapter.addFragment(new TabFragment2(),"Global");
        adapter.addFragment(new TabFragment3(),"Sports");
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);



    }


    private void InitialiseData() {

            persons = new ArrayList<>();
            persons.add(new Person("Emma Wilson", "23 years old", ic_launcher));
            persons.add(new Person("Lavery Maiss", "25 years old", ic_launcher));
            persons.add(new Person("Lillie Watts", "35 years old", ic_launcher));

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
