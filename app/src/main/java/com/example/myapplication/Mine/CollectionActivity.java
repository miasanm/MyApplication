package com.example.myapplication.Mine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myapplication.R;

public class CollectionActivity extends AppCompatActivity {
    private RecyclerView CollectionPost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
        CollectionPost = findViewById(R.id.colletion_post);
        CollectionPost.setLayoutManager(new LinearLayoutManager(CollectionActivity.this));
        CollectionPost.setAdapter(new ColletionRecycleViewAdapter(CollectionActivity.this));

    }
}
