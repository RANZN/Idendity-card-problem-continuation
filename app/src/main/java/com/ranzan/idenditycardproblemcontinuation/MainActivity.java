package com.ranzan.idenditycardproblemcontinuation;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements onItemClicked {
    private RecyclerView recyclerView;
    private ArrayList<Person> personList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildList();
        setRecyclerView();
    }

    private void buildList() {
        Person person1 = new Person("Microsoft", 64, "Business", R.drawable.bill_gates);
        Person person2 = new Person("Amazon", 56, "Business", R.drawable.jeff);
        Person person3 = new Person("Masai", 31, "Business", R.drawable.pratik);
        for (int i = 0; i < 25; i++) {
            personList.add(person1);
            personList.add(person2);
            personList.add(person3);

        }

    }

    private void setRecyclerView() {
        PersonAdapter personAdapter = new PersonAdapter(personList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1,
                GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(personAdapter);
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public void onItemClick(Person person, int position) {
        new AlertDialog.Builder(this).setTitle(person.getCompanyName())
                .setMessage("Age: " + person.getAge()).show();

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}