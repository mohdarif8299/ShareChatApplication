package com.application.sharechat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.application.sharechat.adapters.ImagePostAdapter;
import com.application.sharechat.adapters.PostMediaAdapter;
import com.application.sharechat.adapters.TextPostAdapter;
import com.application.sharechat.models.PostModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView recyclerView1;
    RecyclerView recyclerView2;
    PostMediaAdapter adapter;
    TextPostAdapter textPostAdapter;
    ImagePostAdapter imagePostAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.outer_recycler);
        recyclerView1= findViewById(R.id.outer_recycler1);
        recyclerView2 = findViewById(R.id.outer_recycler2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PostMediaAdapter(this);
        textPostAdapter = new TextPostAdapter(this);
        imagePostAdapter = new ImagePostAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setAdapter(textPostAdapter);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setAdapter(imagePostAdapter);
    }
}