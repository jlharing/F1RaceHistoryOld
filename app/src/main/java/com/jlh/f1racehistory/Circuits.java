package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "circuits")
public class Circuits {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "circuitref")
    private String circuitref;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "location")
    private  String location;
    @ColumnInfo(name = "country")
    private String country;
    @ColumnInfo(name = "lat")
    private float lat;
    @ColumnInfo(name = "lng")
    private float lng;
    @ColumnInfo(name = "alt")
    private String alt;
    @ColumnInfo(name = "url")
    private String url;

    public Circuits(String circuitref, String name, String location, String country,
                    float lat, float lng, String alt, String url) {
        this.id = id;
        this.circuitref = circuitref;
        this.name = name;
        this.location = location;
        this.country = country;
        this.lat = lat;
        this.lng = lng;
        this.alt = alt;
        this.url = url;
    }

    public int getId() {
        return this.id;
    }
    public String getCircuitref() {
        return this.circuitref;
    }
    public String getName() {
        return this.name;
    }
    public String getLocation() {
        return this.location;
    }
    public String getCountry() {
        return this.country;
    }
    public float getLat() {
        return this.lat;
    }
    public float getLng() {
        return this.lng;
    }
    public String getAlt() {
        return this.alt;
    }
    public String getUrl() {
        return this.url;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setCircuitref(String circuitref) {
        this.circuitref = circuitref;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setLat(float lat) {
        this.lat = lat;
    }
    public void setLng(float lng) {
        this.lng = lng;
    }
    public void setAlt(String alt) {
        this.alt = alt;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
