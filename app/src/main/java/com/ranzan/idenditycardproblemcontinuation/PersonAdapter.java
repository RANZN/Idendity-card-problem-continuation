package com.ranzan.idenditycardproblemcontinuation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private ArrayList<Person> personList;
    private onItemClicked onItemClicked;

    public PersonAdapter(ArrayList<Person> personList, onItemClicked onItemClicked) {
        this.personList = personList;
        this.onItemClicked = onItemClicked;
    }

    @NonNull

    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new PersonViewHolder(view, onItemClicked);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person person = personList.get(position);
        holder.setData(person);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}
