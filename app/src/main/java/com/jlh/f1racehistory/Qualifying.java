package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "qualifying")
public class Qualifying {
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
    @ColumnInfo(name = "numbewr")
    private int number;
    @ColumnInfo(name = "position")
    private int position;
    @ColumnInfo(name = "q1")
    private String q1;
    @ColumnInfo(name = "q2")
    private String q2;
    @ColumnInfo(name = "q3")
    private String q3;

    public Qualifying(int race_id, int driver_id, int constructor_id, int number, int position,
                    String q1, String q2, String q3) {
        this.id = id;
        this.race_id = race_id;
        this.driver_id = driver_id;
        this.constructor_id = constructor_id;
        this.number = number;
        this.position = position;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
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
    public int getPosition() {
        return position;
    }
    public String getQ1() {
        return q1;
    }
    public String getQ2() {
        return q2;
    }
    public String getQ3() {
        return q3;
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
    public void setPosition(int position) {
        this.position = position;
    }
    public void setQ1(String q1) {
        this.q1 = q1;
    }
    public void setQ2(String q2) {
        this.q2 = q2;
    }
    public void setQ3(String q3) {
        this.q3 = q3;
    }
}
