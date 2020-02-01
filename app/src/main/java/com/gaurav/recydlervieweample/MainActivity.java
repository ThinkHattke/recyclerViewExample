package com.gaurav.recydlervieweample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView ourRecyclerView;
    private String listNames[] = {"Akask","Abhishek","Varshita","Anila","Nerendra","Himabindu",
            "Shraddha","Uzer","Manisha", "Akask","Abhishek","Varshita","Anila","Nerendra",
            "Himabindu","Shraddha","Uzer","Manisha","Akask","Abhishek","Varshita","Anila",
            "Nerendra","Himabindu","Shraddha","Uzer","Manisha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ourRecyclerView = findViewById(R.id.ourRecyclerView);
        MyNewAdapter adapter = new MyNewAdapter(listNames, MainActivity.this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        ourRecyclerView.setLayoutManager(gridLayoutManager);
        ourRecyclerView.setAdapter(adapter);

    }
}
