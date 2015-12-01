package main.codeacid.com.clone.Adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import main.codeacid.com.clone.R;
import main.codeacid.com.clone.model.Person;

/**
 * Created by sujana on 11/29/2015.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    List<Person> persons;

    public RVAdapter(List<Person> persons) {
        this.persons = persons;
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        static CardView cv;
        static TextView personName;
        static TextView personAge;
        static ImageView personPhoto;

        public PersonViewHolder(View itemView) {
            super(itemView);
            //cv = (CardView) itemView.findViewById(R.id.card_view);
            personName = (TextView) itemView.findViewById(R.id.person_name);
            personAge = (TextView) itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
        }
    }


    @Override
    public RVAdapter.PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        PersonViewHolder pv = new PersonViewHolder(view);
        return pv;
    }

    @Override
    public void onBindViewHolder(RVAdapter.PersonViewHolder holder, int position) {

        PersonViewHolder.personName.setText(persons.get(position).name);
        PersonViewHolder.personAge.setText(persons.get(position).age);
        PersonViewHolder.personPhoto.setImageResource(persons.get(position).photoId);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return  persons.size();
    }
}
