package com.jlh.f1racehistory.ui.main;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jlh.f1racehistory.Circuits;
import com.jlh.f1racehistory.R;
import com.jlh.f1racehistory.RaceActivity;
import com.jlh.f1racehistory.Races;
import com.jlh.f1racehistory.RecyclerRaceAdapter;

import java.util.List;
import java.util.Locale;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
    private RecyclerRaceAdapter raceAdapter;
    private TextView circuitId;
    private EditText circuitName;
    private EditText circuitLatitude;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        listenerSetup();
        observerSetup();
        recyclerSetup();
    }

    private void listenerSetup() {

        Button addButton = getView().findViewById(R.id.addCircuit);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RaceActivity.class);
                startActivity(intent);
            }
        });
    }

    private void observerSetup() {

        // Circuits
        mViewModel.getSearchResultsCirciuts().observe(getViewLifecycleOwner(), new Observer<List<Circuits>>() {
            @Override
            public void onChanged(List<Circuits> circuits) {
                if (circuits.size() > 0) {
                    circuitId.setText(String.format(Locale.US, "%d", circuits.get(0).getId()));
                    circuitName.setText(circuits.get(0).getName());
                    circuitLatitude.setText("0.0");
                } else {
                    circuitId.setText("No Match");
                }
            }
        });

        // Constructor Results
        // Constructors
        // Constructor Standings
        // Drivers
        // Driver Standings
        // Lap Times
        // Pit Stops
        // Qualifying
        // Races
        // Results
        // Seasons
        // Status
    }

    public void recyclerSetup() {

    }

    private void clearFields() {
        circuitId.setText("");
        circuitName.setText("");
        circuitLatitude.setText("");
    }

}