package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "laptimes")
public class LapTimes {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "race_id")
    private int race_id;
    @ColumnInfo(name = "driver_id")
    private int driver_id;
    @ColumnInfo(name = "lap")
    private int lap;
    @ColumnInfo(name = "position")
    private int position;
    @ColumnInfo(name = "time")
    private String time;
    @ColumnInfo(name = "milliseconds")
    private int milliseconds;

    public LapTimes(int race_id, int driver_id, int lap, int position,
                    String time, int milliseconds) {
        this.id = id;
        this.race_id = race_id;
        this.driver_id = driver_id;
        this.lap = lap;
        this.position = position;
        this.time = time;
        this.milliseconds = milliseconds;
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
    public int getLap() {
        return lap;
    }
    public int getPosition() {
        return position;
    }
    public String getTime() {
        return time;
    }
    public int getMilliseconds() {
        return milliseconds;
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
    public void setLap(int lap) {
        this.lap = lap;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }
}
