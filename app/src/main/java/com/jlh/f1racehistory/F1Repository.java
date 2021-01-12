package com.jlh.f1racehistory;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.io.IOException;
import java.util.List;

import static java.lang.Integer.parseInt;

public class F1Repository {

    private MutableLiveData<List<Circuits>> searchResultsCircuits = new MutableLiveData<>();
    private MutableLiveData<List<ConstructorResults>> searchResultsConstructorResults = new MutableLiveData<>();
    private MutableLiveData<List<Constructors>> searchResultsConstructors = new MutableLiveData<>();
    private MutableLiveData<List<ConstructorStandings>> searchResultsConstructorStanding = new MutableLiveData<>();
    private MutableLiveData<List<Drivers>> searchResultsDrivers = new MutableLiveData<>();
    private MutableLiveData<List<DriverStandings>> searchResultsDriverStandings = new MutableLiveData<>();
    private MutableLiveData<List<LapTimes>> searchResultsLapTimes = new MutableLiveData<>();
    private MutableLiveData<List<PitStops>> searchResultsPitStops = new MutableLiveData<>();
    private MutableLiveData<List<Qualifying>> searchResultsQualifying = new MutableLiveData<>();
    private MutableLiveData<List<Races>> searchResultsRaces = new MutableLiveData<>();
    private MutableLiveData<List<Races>> searchResultsRacesByYear = new MutableLiveData<>();
    private MutableLiveData<List<RacesInfo>> searchResultsRacesInfoByYear = new MutableLiveData<>();
    private MutableLiveData<List<Results>> searchResultsResults = new MutableLiveData<>();
    private MutableLiveData<List<Seasons>> searchResultsSeasons = new MutableLiveData<>();
    private MutableLiveData<List<Status>> searchResultsStatus = new MutableLiveData<>();

    private LiveData<List<Circuits>> allCircuits;
    private LiveData<List<ConstructorResults>> allConstructorResults;
    private LiveData<List<Constructors>> allConstructors;
    private LiveData<List<ConstructorStandings>> allConstructorStandings;
    private LiveData<List<Drivers>> allDrivers;
    private LiveData<List<DriverStandings>> allDriverStandings;
    private LiveData<List<LapTimes>> allLaptimes;
    private LiveData<List<PitStops>> allPitStops;
    private LiveData<List<Qualifying>> allQualifying;
    private LiveData<List<Races>> allRaces;
    private LiveData<List<Results>> allResults;
    private LiveData<List<Seasons>> allSeasons;
    private LiveData<List<Status>> allStatus;

    private F1Dao f1Dao;

    public F1Repository(Application application) throws IOException {
        F1RoomDatabase db;
        db = F1RoomDatabase.getDatabase(application);
        f1Dao = db.f1Dao();
        allCircuits = f1Dao.getAllCircuits();
    }

    // Repository for Circuits
    public LiveData<List<Circuits>> getAllCircuits() {
        return allCircuits;
    }
    public MutableLiveData<List<Circuits>> getSearchResultsCircuits() {
        return searchResultsCircuits;
    }
    private void asyncFinishedCircuits(List<Circuits> results) {
        searchResultsCircuits.setValue(results);
    }
    private static class QueryAsyncTaskCircuits extends AsyncTask<String, Void, List<Circuits>> {
        private F1Dao asyncTaskDao;
        private F1Repository delegate = null;
        QueryAsyncTaskCircuits(F1Dao dao) {
            asyncTaskDao = dao;
        }
        @Override
        protected List<Circuits> doInBackground(String... strings) {
            return asyncTaskDao.findCircuitsByPk(parseInt(strings[0]));
        }
        @Override
        protected void onPostExecute(List<Circuits> result) {
            delegate.asyncFinishedCircuits(result);
        }
    }
    public void findCircuitsByPk(String id) {
        QueryAsyncTaskCircuits task = new QueryAsyncTaskCircuits(f1Dao);
        task.delegate = this;
        task.execute(id);
    }

    // Repository for ConstructorResults
    public LiveData<List<ConstructorResults>> getAllConstructorResults() {
        return allConstructorResults;
    }
    public MutableLiveData<List<ConstructorResults>> getSearchResultsConstructorResults() {
        return searchResultsConstructorResults;
    }
    private void asyncFinishedConstructorResults(List<ConstructorResults> results) {
        searchResultsConstructorResults.setValue(results);
    }
    private static class QueryAsyncTaskConstructorResults extends AsyncTask<String, Void, List<ConstructorResults>> {
        private F1Dao asyncTaskDao;
        private F1Repository delegate = null;
        QueryAsyncTaskConstructorResults(F1Dao dao) {
            asyncTaskDao = dao;
        }
        @Override
        protected List<ConstructorResults> doInBackground(String... strings) {
            return asyncTaskDao.findConstructorResultsByPk(parseInt(strings[0]));
        }
        @Override
        protected void onPostExecute(List<ConstructorResults> result) {
            delegate.asyncFinishedConstructorResults(result);
        }
    }
    public void findConstructorResultsByPk(String id) {
        QueryAsyncTaskConstructorResults task = new QueryAsyncTaskConstructorResults(f1Dao);
        task.delegate = this;
        task.execute(id);
    }

    // Repository for Constructors
    // Repository for ConstructorsStandings
    // Repository for Drivers
    // Repository for DriverStandings
    // Repository for LapTimes
    // Repository for PitStops
    // Repository for Qualifying
    // Repository for Races
    public MutableLiveData<List<Races>> getSearchResultsRaces() {
        return searchResultsRaces;
    }
    private void asyncFinishedRaces(List<Races> results) {
        searchResultsRaces.setValue(results);
    }
    private static class QueryAsyncTaskRaces extends AsyncTask<String, Void, List<Races>> {
        private F1Dao asyncTaskDao;
        private F1Repository delegate = null;
        QueryAsyncTaskRaces(F1Dao dao) {
            asyncTaskDao = dao;
        }
        @Override
        protected List<Races> doInBackground(String... strings) {
            return asyncTaskDao.findRacesByPk(parseInt(strings[0]));
        }
        @Override
        protected void onPostExecute(List<Races> result) {
            delegate.asyncFinishedRaces(result);
        }
    }
    public void findRacesByPk(String id) {
        QueryAsyncTaskRaces task = new QueryAsyncTaskRaces(f1Dao);
        task.delegate = this;
        task.execute(id);
    }
    // Races By Year
    public MutableLiveData<List<Races>> getSearchResultsRacesByYear() {
        return searchResultsRacesByYear;
    }
    private void asyncFinishedRacesByYear(List<Races> results) {
        searchResultsRacesByYear.setValue(results);
    }
    private static class QueryAsyncTaskRacesByYear extends AsyncTask<String, Void, List<Races>> {
        private F1Dao asyncTaskDao;
        private F1Repository delegate = null;
        QueryAsyncTaskRacesByYear(F1Dao dao) {
            asyncTaskDao = dao;
        }
        @Override
        protected List<Races> doInBackground(String... strings) {
            return asyncTaskDao.findRacesByYear(parseInt(strings[0]));
        }
        @Override
        protected void onPostExecute(List<Races> result) {
            delegate.asyncFinishedRacesByYear(result);
        }
    }
    public void findRacesByYear(String id) {
        QueryAsyncTaskRacesByYear task = new QueryAsyncTaskRacesByYear(f1Dao);
        task.delegate = this;
        task.execute(id);
    }
    // Repository for Results
    // Repository for Seasons
    // Repository for Status
}
