package com.jlh.f1racehistory.ui.main;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import com.jlh.f1racehistory.Circuits;
import com.jlh.f1racehistory.F1Repository;
import com.jlh.f1racehistory.Races;
import com.jlh.f1racehistory.RacesInfo;

import java.io.IOException;
import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private F1Repository repository;
    private LiveData<List<Circuits>> allCircuits;
    private MutableLiveData<List<Circuits>> searchResultsCirciuts;

    private MutableLiveData<List<Races>> searchResultsRacesByYear;
    private MutableLiveData<List<RacesInfo>> searchResultsRacesInfoByYear;

    public MainViewModel(Application application) throws IOException {
        super(application);
        repository = new F1Repository(application);
        allCircuits = repository.getAllCircuits();
        searchResultsCirciuts = repository.getSearchResultsCircuits();
        searchResultsRacesByYear = repository.getSearchResultsRacesByYear();
    }

    // Circuits
    MutableLiveData<List<Circuits>> getSearchResultsCirciuts() {
        return searchResultsCirciuts;
    }
    LiveData<List<Circuits>> getAllCircuits() {
        return allCircuits;
    }
    public void findCircuitsByPk(String id) {
        repository.findCircuitsByPk(id);
    }

    // Constructor Results
    // Constructors
    // Constructor Standings
    // Drivers
    // Driver Standings
    // Lap Times
    // Pit Stops
    // Qualifying
    // Races
    public MutableLiveData<List<Races>> getSearchResultsRacesByYear() {
        return searchResultsRacesByYear;
    }
    public MutableLiveData<List<RacesInfo>> getSearchResultsRacesInfoByYear() {
        return searchResultsRacesInfoByYear;
    }
    public void findRacesByPk(String id) {
        repository.findRacesByPk(id);
    }
    public void findRacesByYear(String year) {
        repository.findRacesByYear(year);
    }

    // Results
    // Seasons
    // Status
}