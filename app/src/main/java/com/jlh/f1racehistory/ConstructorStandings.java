package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "constructorstandings")
public class ConstructorStandings {
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
    @ColumnInfo(name = "position")
    private int position;
    @ColumnInfo(name = "positiontext")
    private String  positiontext;
    @ColumnInfo(name = "wins")
    private int wins;

    public ConstructorStandings(int race_id, int constructor_id, int points, int position,
                                String positiontext, int wins) {
        this.id = id;
        this.race_id = race_id;
        this.constructor_id = constructor_id;
        this.points = points;
        this.position = position;
        this.positiontext = positiontext;
        this.wins = wins;
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
    public int getPosition() {
        return this.position;
    }
    public String getPositiontext() {
        return this.positiontext;
    }
    public int getWins() {
        return this.wins;
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
