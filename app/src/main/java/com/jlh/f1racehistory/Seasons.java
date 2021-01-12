package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "seasons")
public class Seasons {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "year")
    private int year;
    @ColumnInfo(name = "url")
    private String  url;

    public Seasons(int year, String url) {
        this.id = id;
        this.year = year;
        this.url = url;
    }

    public int getId() {
        return id;
    }
    public int getYear() {
        return year;
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
    public void setUrl(String url) {
        this.url = url;
    }
}
