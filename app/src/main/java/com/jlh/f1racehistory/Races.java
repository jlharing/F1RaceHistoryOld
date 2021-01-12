package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "races")
public class Races {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "year")
    private int year;
    @ColumnInfo(name = "round")
    private int round;
    @ColumnInfo(name = "circuit_id")
    private int circuit_id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "date")
    private String date;
    @ColumnInfo(name = "time")
    private String time;
    @ColumnInfo(name = "url")
    private String url;

    public Races(int year, int round, int circuit_id, String name,
                    String date,String time, String url) {
        this.id = id;
        this.year = year;
        this.round = round;
        this.circuit_id = circuit_id;
        this.name = name;
        this.date = date;
        this.time = time;
        this.url = url;
    }

    public int getId() {
        return id;
    }
    public int getYear() {
        return year;
    }
    public int getRound() {
        return round;
    }
    public int getCircuit_id() {
        return circuit_id;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public String getUrl() {
        return url;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setRound(int round) {
        this.round = round;
    }
    public void setCircuit_id(int circuit_id) {
        this.circuit_id = circuit_id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
