package com.example.baitaptuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity implements OnClickListener {
    private RecyclerView recyclerV;
    private CustomAdapter adt;
    ArrayList<Integer> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerV = findViewById(R.id.recyclerV);
        items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);
        items.add(7);
        items.add(8);
        items.add(9);

        adt = new CustomAdapter(items, this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerV.getContext(),1);
        recyclerV.addItemDecoration(dividerItemDecoration);

        recyclerV.setAdapter(adt);
        recyclerV.setHasFixedSize(true);
        recyclerV.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void itemClick(int index) {
        Intent intent = new Intent(getBaseContext(), Screen3Activity.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                RecyclerActivity.this, recyclerV, ViewCompat.getTransitionName(recyclerV));
        startActivity(intent, options.toBundle());
    }
}