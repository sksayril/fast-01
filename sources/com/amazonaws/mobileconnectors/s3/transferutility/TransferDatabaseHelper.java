package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class TransferDatabaseHelper extends SQLiteOpenHelper {

    /* renamed from: m  reason: collision with root package name */
    private final Context f4120m;

    /* renamed from: n  reason: collision with root package name */
    private int f4121n;

    public TransferDatabaseHelper(Context context) {
        this(context, 6);
    }

    public TransferDatabaseHelper(Context context, int i10) {
        super(context, "awss3transfertable.db", (SQLiteDatabase.CursorFactory) null, i10);
        this.f4120m = context;
        this.f4121n = i10;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        TransferTable.f(sQLiteDatabase, this.f4121n);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f4120m.deleteDatabase("awss3transfertable.db");
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        TransferTable.g(sQLiteDatabase, i10, i11);
    }
}
