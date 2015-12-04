package main.codeacid.com.clone.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import main.codeacid.com.clone.Adapter.RVAdapter;
import main.codeacid.com.clone.R;
import main.codeacid.com.clone.model.Person;

import static main.codeacid.com.clone.R.mipmap.ic_launcher;

public class TabFragment1 extends Fragment {


    List<Person> persons;
    public RecyclerView rv;
    RVAdapter recyclerViewAdapter;

    public TabFragment1() {
        super();
        InitialiseData();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_tab_fragment1, container, false);
        rv = (RecyclerView) view.findViewById(R.id.rv);

        recyclerViewAdapter = new RVAdapter(persons);
        return view;
    }
    private void InitialiseData() {

        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", ic_launcher));
        persons.add(new Person("Lavery Maiss", "25 years old", ic_launcher));
        persons.add(new Person("Lillie Watts", "35  old", ic_launcher));
        persons.add(new Person("Lillie Watts", "35 years old", ic_launcher));
        persons.add(new Person("Lillie Watts", "35  old", ic_launcher));
        persons.add(new Person("Lillie ", "35 years old", ic_launcher));
        persons.add(new Person(" Watts", "35 years ", ic_launcher));
        persons.add(new Person("Lillie Watts", "35  old", ic_launcher));
        persons.add(new Person("Lillie ", "35  old", ic_launcher));
        persons.add(new Person("Lillie Watts", "35 years ", ic_launcher));


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayoutManager llm = new LinearLayoutManager(view.getContext());
        rv.setLayoutManager(llm);
        rv.setAdapter(recyclerViewAdapter);

    }
}