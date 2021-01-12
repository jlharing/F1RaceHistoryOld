package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "results")
public class Results {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "race_id")
    private int race_id;
    @ColumnInfo(name = "driver_id")
    private int driver_id;
    @ColumnInfo(name = "constructor_id")
    private int constructor_id;
    @ColumnInfo(name = "number")
    private int number;
    @ColumnInfo(name = "grid")
    private int grid;
    @ColumnInfo(name = "position")
    private int position;
    @ColumnInfo(name = "positiontext")
    private String positiontext;
    @ColumnInfo(name = "positionorder")
    private int positionorder;
    @ColumnInfo(name = "points")
    private int points;
    @ColumnInfo(name = "laps")
    private int laps;
    @ColumnInfo(name = "time")
    private String time;
    @ColumnInfo(name = "milliseconds")
    private String milliseconds;
    @ColumnInfo(name = "fastestlap")
    private String fastestlap;
    @ColumnInfo(name = "rank")
    private String rank;
    @ColumnInfo(name = "fastestlaptime")
    private String fastestlaptime;
    @ColumnInfo(name = "fastestlapspeed")
    private String fastestlapspeed;
    @ColumnInfo(name = "status_id")
    private int status_id;

    public Results(int race_id, int driver_id, int constructor_id, int number, int grid,
                   int position, String positiontext, int positionorder, int points,
                   int laps, String time, String milliseconds, String fastestlap, String rank,
                   String fastestlaptime, String fastestlapspeed, int status_id) {
        this.id = id;
        this.race_id = race_id;
        this.driver_id = driver_id;
        this.constructor_id = constructor_id;
        this.number = number;
        this.grid = grid;
        this.position = position;
        this.positiontext = positiontext;
        this.positionorder = positionorder;
        this.points = points;
        this.laps = laps;
        this.time = time;
        this.milliseconds = milliseconds;
        this.fastestlap = fastestlap;
        this.rank = rank;
        this.fastestlaptime = fastestlaptime;
        this.fastestlapspeed = fastestlapspeed;
        this.status_id = status_id;
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
    public int getConstructor_id() {
        return constructor_id;
    }
    public int getNumber() {
        return number;
    }
    public int getGrid() {
        return grid;
    }
    public int getPosition() {
        return position;
    }
    public String getPositiontext() {
        return positiontext;
    }
    public int getPositionorder() {
        return positionorder;
    }
    public int getPoints() {
        return points;
    }
    public int getLaps() {
        return laps;
    }
    public String getTime() {
        return time;
    }
    public String getMilliseconds() {
        return milliseconds;
    }
    public String getFastestlap() {
        return fastestlap;
    }
    public String getRank() {
        return rank;
    }
    public String getFastestlaptime() {
        return fastestlaptime;
    }
    public String getFastestlapspeed() {
        return fastestlapspeed;
    }
    public int getStatus_id() {
        return status_id;
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
    public void setConstructor_id(int constructor_id) {
        this.constructor_id = constructor_id;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setGrid(int grid) {
        this.grid = grid;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public void setPositiontext(String positiontext) {
        this.positiontext = positiontext;
    }
    public void setPositionorder(int positionorder) {
        this.positionorder = positionorder;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public void setLaps(int laps) {
        this.laps = laps;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setMilliseconds(String milliseconds) {
        this.milliseconds = milliseconds;
    }
    public void setFastestlap(String fastestlap) {
        this.fastestlap = fastestlap;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public void setFastestlaptime(String fastestlaptime) {
        this.fastestlaptime = fastestlaptime;
    }
    public void setFastestlapspeed(String fastestlapspeed) {
        this.fastestlapspeed = fastestlapspeed;
    }
    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }
}
