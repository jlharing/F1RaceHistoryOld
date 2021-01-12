package com.jlh.f1racehistory;

import android.content.Context;
import android.util.Log;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.Room;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Database(entities = {Circuits.class, ConstructorResults.class, Constructors.class,
            ConstructorStandings.class, Drivers.class, DriverStandings.class,
            LapTimes.class, PitStops.class, Qualifying.class, Races.class,
            Results.class, Seasons.class, Status.class}, version = 1)
public abstract class F1RoomDatabase extends RoomDatabase {

    public abstract F1Dao f1Dao();
    private static F1RoomDatabase INSTANCE;

    static F1RoomDatabase getDatabase(final Context context) throws IOException {
        if (INSTANCE == null) {
            // Check if Database exists.
            File file = new File("/data/data/com.jlh.f1racehistory/databases/f1.db");
            if (!file.exists()) {
                copyDatabase(context);
            }
            synchronized (F1RoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            F1RoomDatabase.class,
                            "f1.db").build();
                }
            }
        }
        return INSTANCE;
    }

    /***
     * Copy database from source code assets to device
     * @throws IOException
     */
    public static void copyDatabase(Context context) throws IOException {
        try {
            InputStream myInput = context.getAssets().open("f1.db");
            String outputFileName = "/data/data/com.jlh.f1racehistory/databases/f1.db";
            OutputStream myOutput = new FileOutputStream(outputFileName);

            byte[] buffer = new byte[1024];
            int length;

            while((length = myInput.read(buffer))>0){
                myOutput.write(buffer, 0, length);
            }

            myOutput.flush();
            myOutput.close();
            myInput.close();
        } catch (Exception e) {
            Log.e("f1.db - copyDatabase", e.getMessage());
        }
    }
}
