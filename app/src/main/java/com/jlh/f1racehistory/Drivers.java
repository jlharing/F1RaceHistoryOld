package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "drivers")
public class Drivers {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "driverref")
    private String driverref;
    @ColumnInfo(name = "number")
    private String number;
    @ColumnInfo(name = "code")
    private String code;
    @ColumnInfo(name = "firstname")
    private String firstname;
    @ColumnInfo(name = "lastname")
    private String lastname;
    @ColumnInfo(name = "dob")
    private String dob;
    @ColumnInfo(name = "nationality")
    private String nationality;
    @ColumnInfo(name = "url")
    private String url;
    @ColumnInfo(name = "Filed10")
    private String field10;

    public Drivers(String driverref, String number, String code, String firstname, String lastname,
                    String dob, String nationality, String url, String field10) {
        this.id = id;
        this.driverref = driverref;
        this.number = number;
        this.code = code;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.nationality = nationality;
        this.url = url;
        this.field10 = field10;
    }

    public int getId() {
        return id;
    }
    public String getDriverref() {
        return driverref;
    }
    public String getNumber() {
        return number;
    }
    public String getCode() {
        return code;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getDob() {
        return dob;
    }
    public String getNationality() {
        return nationality;
    }
    public String getUrl() {
        return url;
    }
    public String getField10() {
        return field10;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setDriverref(String driverref) {
        this.driverref = driverref;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setField10(String field10) {
        this.field10 = field10;
    }
}
