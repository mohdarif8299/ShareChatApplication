package com.application.sharechat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.application.sharechat.adapters.PostMediaAdapter;
import com.application.sharechat.models.PostModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<String> list;
    PostMediaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.outer_recycler);
//        list = new ArrayList<>();
//        list.add("https://gumlet.assettype.com/thequint%2F2020-02%2F86eeb2f2-6a8f-4e7b-94f2-e48ecc44f02f%2FWhatsApp_Image_2020_02_24_at_10_16_43_PM.jpeg?rect=0%2C0%2C1280%2C720&auto=format%2Ccompress&w=320&dpr=2.6");
//        list.add("https://scontent.fdel25-1.fna.fbcdn.net/v/t1.0-9/88295550_2689457441108200_8739536566436757504_n.jpg?_nc_cat=100&_nc_sid=8024bb&_nc_oc=AQn0GIAhn1ZA64Mk78CwcKXj-HTMx1HaaYXm89y4FijX6UFatf3d3vdwmWa9L_16Ln3R95PtdUjgvimuUUobNlQL&_nc_ht=scontent.fdel25-1.fna&oh=363a45ed46677248a4b6b1d049252ec3&oe=5EEB8D92");
//        list.add("https://firebasestorage.googleapis.com/v0/b/bookify-1cc7c.appspot.com/o/java13.mp4?alt=media&token=349c88be-a21d-4177-9c5a-7af8e801cae2");
//        list.add("https://firebasestorage.googleapis.com/v0/b/bookify-1cc7c.appspot.com/o/google_jobs.mp4?alt=media&token=5064d7b7-e9a9-4ccc-ae6d-19159285e019");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PostMediaAdapter(this);
        recyclerView.setAdapter(adapter);
    }
}




/*
  images.add("https://gumlet.assettype.com/thequint%2F2020-02%2F86eeb2f2-6a8f-4e7b-94f2-e48ecc44f02f%2FWhatsApp_Image_2020_02_24_at_10_16_43_PM.jpeg?rect=0%2C0%2C1280%2C720&auto=format%2Ccompress&w=320&dpr=2.6");
        images.add("https://scontent.fdel25-1.fna.fbcdn.net/v/t1.0-9/88295550_2689457441108200_8739536566436757504_n.jpg?_nc_cat=100&_nc_sid=8024bb&_nc_oc=AQn0GIAhn1ZA64Mk78CwcKXj-HTMx1HaaYXm89y4FijX6UFatf3d3vdwmWa9L_16Ln3R95PtdUjgvimuUUobNlQL&_nc_ht=scontent.fdel25-1.fna&oh=363a45ed46677248a4b6b1d049252ec3&oe=5EEB8D92");
        video.add("https://firebasestorage.googleapis.com/v0/b/bookify-1cc7c.appspot.com/o/java13.mp4?alt=media&token=349c88be-a21d-4177-9c5a-7af8e801cae2");
        video.add("https://firebasestorage.googleapis.com/v0/b/bookify-1cc7c.appspot.com/o/google_jobs.mp4?alt=media&token=5064d7b7-e9a9-4ccc-ae6d-19159285e019");

*/