package com.example.tryrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("t1","a1"));
        songs.add(new Song("t2","a2"));
        songs.add(new Song("t3","a3"));
        songs.add(new Song("t4","a4"));
        songs.add(new Song("t5","a5"));
        songs.add(new Song("t6","a6"));
        songs.add(new Song("t7","a7"));
        songs.add(new Song("t8","a8"));
        songs.add(new Song("t9","a9"));
        songs.add(new Song("t10","a10"));
        songs.add(new Song("t1","a1"));
        songs.add(new Song("t2","a2"));
        songs.add(new Song("t3","a3"));
        songs.add(new Song("t4","a4"));
        songs.add(new Song("t5","a5"));
        songs.add(new Song("t6","a6"));
        songs.add(new Song("t7","a7"));
        songs.add(new Song("t8","a8"));
        songs.add(new Song("t9","a9"));
        songs.add(new Song("t10","a10"));

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvSongs);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, songs);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position).title + " on row number " + position, Toast.LENGTH_SHORT).show();
    }


}