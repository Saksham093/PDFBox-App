package com.sam_p.pdfbox.db;

import androidx.room.RoomDatabase;

import com.sam_p.pdfbox.dao.ConfigDao;

public abstract class AppDatabase extends RoomDatabase {
    public abstract ConfigDao configDao();
}
