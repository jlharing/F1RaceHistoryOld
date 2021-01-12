package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "pitstops")
public class PitStops {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "race_id")
    private int race_id;
    @ColumnInfo(name = "dricer_id")
    private int driver_id;
    @ColumnInfo(name = "stop")
    private int stop;
    @ColumnInfo(name = "lap")
    private int lap;
    @ColumnInfo(name = "time")
    private String time;
    @ColumnInfo(name = "duration")
    private String duration;
    @ColumnInfo(name = "milliseconds")
    private int milliseconds;

    public PitStops(int race_id, int driver_id, int stop, int lap, String time,
                    String duration, int milliseconds) {
        this.id = id;
        this.race_id = race_id;
        this.driver_id = driver_id;
        this.stop = stop;
        this.lap = lap;
        this.time = time;
        this.duration = duration;
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
    public int getStop() {
        return stop;
    }
    public int getLap() {
        return lap;
    }
    public String getTime() {
        return time;
    }
    public String getDuration() {
        return duration;
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
    public void setStop(int stop) {
        this.stop = stop;
    }
    public void setLap(int lap) {
        this.lap = lap;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }
}
