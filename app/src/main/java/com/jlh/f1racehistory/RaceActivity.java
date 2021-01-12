package com.jlh.f1racehistory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jlh.f1racehistory.ui.main.MainViewModel;

import java.util.List;

public class RaceActivity extends AppCompatActivity {

    private MainViewModel mViewModel;

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerRaceAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.race_activity);

        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        recyclerView = findViewById(R.id.recycleRaceView);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerRaceAdapter();
        recyclerView.setAdapter(adapter);

        observerSetup();

        mViewModel.findRacesByYear("2015");
    }

    private void observerSetup() {
        mViewModel.getSearchResultsRacesByYear().observe(this, new Observer<List<Races>>() {
            @Override
            public void onChanged(List<Races> races) {
                if (races.size() > 0) {
                    adapter = new RecyclerRaceAdapter();
                    adapter.setRacesListByYear(races);
                    recyclerView.setAdapter(adapter);
                }
            }
        });
    }
}