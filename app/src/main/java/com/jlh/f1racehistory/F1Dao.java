package com.jlh.f1racehistory;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface F1Dao {

    // Data Access for circuits
    @Query("SELECT * FROM circuits WHERE id = :id")
    List<Circuits> findCircuitsByPk(int id);
    @Query("SELECT * FROM circuits")
    LiveData<List<Circuits>> getAllCircuits();

    // Data Access for constructorresults
    @Query("SELECT * FROM constructorresults WHERE id = :id")
    List<ConstructorResults> findConstructorResultsByPk(int id);
    @Query("SELECT * FROM constructorresults")
    LiveData<List<ConstructorResults>> getAllConstructorResults();

    // Data Access for constructors
    @Query("SELECT * FROM constructors WHERE id = :id")
    List<Constructors> findConstructorsByPk(int id);
    @Query("SELECT * FROM constructors")
    LiveData<List<Constructors>> getAllConstructors();

    // Data Access for constructorstandings
    @Query("SELECT * FROM constructorstandings WHERE id = :id")
    List<ConstructorStandings> findConstructorStandingsByPk(int id);
    @Query("SELECT * FROM constructorstandings")
    LiveData<List<ConstructorStandings>> getAllConstructorStandings();

    // Data Access for drivers
    @Query("SELECT * FROM drivers WHERE id = :id")
    List<Drivers> findDriversByPk(int id);
    @Query("SELECT * FROM drivers")
    LiveData<List<Drivers>> getAllDrivers();

    // Data Access for driverstandings
    @Query("SELECT * FROM driverstandings WHERE id = :id")
    List<DriverStandings> findDriverStandingsByPk(int id);
    @Query("SELECT * FROM driverstandings")
    LiveData<List<DriverStandings>> getAllDriverStandings();

    // Data Access for laptimes
    @Query("SELECT * FROM laptimes WHERE id = :id")
    List<LapTimes> findLapTimesByPk(int id);
    @Query("SELECT * FROM laptimes")
    LiveData<List<LapTimes>> getAllLapTimes();

    // Data Access for pitstops
    @Query("SELECT * FROM pitstops WHERE id = :id")
    List<PitStops> findPitStopsByPk(int id);
    @Query("SELECT * FROM pitstops")
    LiveData<List<PitStops>> getAllPitStops();

    // Data Access for qualifying
    @Query("SELECT * FROM qualifying WHERE id = :id")
    List<Qualifying> findQualifyingByPk(int id);
    @Query("SELECT * FROM qualifying")
    LiveData<List<Qualifying>> getAllQualifying();

    // Data Access for races
    @Query("SELECT * FROM races WHERE id = :id")
    List<Races> findRacesByPk(int id);
    @Query("SELECT r.* " +
            "FROM races r " +
            "join circuits c on c.id = r.circuit_id " +
            "where year = :year")
    List<Races> findRacesByYear(int year);
    @Query("SELECT * FROM races")
    LiveData<List<Races>> getALLRaces();

    // Data Access for results
    @Query("SELECT * FROM results WHERE id = :id")
    List<Results> findResultsByPk(int id);
    @Query("SELECT * FROM results")
    LiveData<List<Results>> getAllResults();

    // Data Access for seasons
    @Query("SELECT * FROM seasons WHERE id = :id")
    List<Seasons> findSeasonsByPk(int id);
    @Query("SELECT * FROM seasons")
    LiveData<List<Seasons>> getAllSeasons();

    // Data Access for status
    @Query("SELECT * FROM status WHERE id = :id")
    List<Status> findStatusByPk(int id);
    @Query("SELECT * FROM status")
    LiveData<List<Status>> getAllStatus();
}
