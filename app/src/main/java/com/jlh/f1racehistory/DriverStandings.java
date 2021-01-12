package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "driverstandings")
public class DriverStandings {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "race_id")
    private int race_id;
    @ColumnInfo(name = "driver_id")
    private int driver_id;
    @ColumnInfo(name = "points")
    private int points;
    @ColumnInfo(name = "position")
    private int position;
    @ColumnInfo(name = "positiontext")
    private String  positiontext;
    @ColumnInfo(name = "wins")
    private int wins;

    public DriverStandings(int race_id, int driver_id, int points, int position,
                    String positiontext, int wins) {
        this.id = id;
        this.race_id = race_id;
        this.driver_id = driver_id;
        this.points = points;
        this.position =  position;
        this.positiontext = positiontext;
        this.wins = wins;
    }

    public int getId() {
        return id;
    }
    public int getRace_id() {
        return race_id;
    }
    public int getDriver_id() {
        return driver_id;
    }
    public int getPoints() {
        return points;
    }
    public int getPosition() {
        return position;
    }
    public String getPositiontext() {
        return positiontext;
    }
    public int getWins() {
        return wins;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setRace_id(int race_id) {
        this.race_id = race_id;
    }
    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public void setPositiontext(String positiontext) {
        this.positiontext = positiontext;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }
}
