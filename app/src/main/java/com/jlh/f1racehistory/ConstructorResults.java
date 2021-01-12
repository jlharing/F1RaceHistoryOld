package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "constructorresults")
public class ConstructorResults {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "race_id")
    private int race_id;
    @ColumnInfo(name = "constructor_id")
    private int constructor_id;
    @ColumnInfo(name = "points")
    private int points;
    @ColumnInfo(name = "status")
    private String status;

    public ConstructorResults(int race_id, int constructor_id, int points, String status) {
        this.id = id;
        this.race_id = race_id;
        this.constructor_id = constructor_id;
        this.points = points;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }
    public int getRace_id() {
        return this.race_id;
    }
    public int getConstructor_id() {
        return this.constructor_id;
    }
    public int getPoints() {
        return this.points;
    }
    public String  getStatus() {
        return this.status;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setRace_id(int race_id) {
        this.race_id = race_id;
    }
    public void setConstructor_id(int constructor_id) {
        this.constructor_id = constructor_id;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public void setStatus(String  status) {
        this.status = status;
    }
}
