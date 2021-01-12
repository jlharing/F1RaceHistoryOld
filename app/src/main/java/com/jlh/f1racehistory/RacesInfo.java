package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "races")
public class RacesInfo {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "year")
    private int year;
    @ColumnInfo(name = "round")
    private int round;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "circuit")
    private String circuit;
    @ColumnInfo(name = "location")
    private String location;
    @ColumnInfo(name = "country")
    private String country;

    public RacesInfo(int year, int round, String name,
                     String circuit, String location, String country) {
        this.id = id;
        this.year = year;
        this.round = round;
        this.name = name;
        this.circuit = circuit;
        this.location = location;
        this.country = country;
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
    public String getName() {
        return name;
    }
    public String getCircuit() {
        return circuit;
    }
    public String getLocation() {
        return location;
    }
    public String getCountry() {
        return country;
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
    public void setName(String name) {
        this.name = name;
    }
    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
