package com.jlh.f1racehistory;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "status")
public class Status {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "status")
    private String status;

    public Status(String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
