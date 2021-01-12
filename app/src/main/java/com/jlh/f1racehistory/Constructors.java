package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "constructors")
public class Constructors {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "constructorref")
    private String  constructorref;
    @ColumnInfo(name = "name")
    private String  name;
    @ColumnInfo(name = "nationality")
    private String nationality;
    @ColumnInfo(name = "url")
    private String url;

    public int getId() {
        return this.id;
    }
    public String getConstructorref() {
        return this.constructorref;
    }
    public String getName() {
        return this.name;
    }
    public String getNationality() {
        return this.nationality;
    }
    public String getUrl() {
        return this.url;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setConstructorref(String constructorref) {
        this.constructorref = constructorref;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
