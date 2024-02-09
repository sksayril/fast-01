package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

class TransferDBBase {

    /* renamed from: f  reason: collision with root package name */
    private static final Log f4109f = LogFactory.b(TransferDBBase.class);

    /* renamed from: g  reason: collision with root package name */
    private static final Object f4110g = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f4111a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f4112b;

    /* renamed from: c  reason: collision with root package name */
    private final UriMatcher f4113c;

    /* renamed from: d  reason: collision with root package name */
    private final TransferDatabaseHelper f4114d;

    /* renamed from: e  reason: collision with root package name */
    private SQLiteDatabase f4115e;

    public TransferDBBase(Context context) {
        this.f4111a = context;
        String packageName = context.getApplicationContext().getPackageName();
        TransferDatabaseHelper transferDatabaseHelper = new TransferDatabaseHelper(context);
        this.f4114d = transferDatabaseHelper;
        this.f4115e = transferDatabaseHelper.getWritableDatabase();
        this.f4112b = Uri.parse("content://" + packageName + "/" + "transfers");
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f4113c = uriMatcher;
        uriMatcher.addURI(packageName, "transfers", 10);
        uriMatcher.addURI(packageName, "transfers/#", 20);
        uriMatcher.addURI(packageName, "transfers/part/#", 30);
        uriMatcher.addURI(packageName, "transfers/state/*", 40);
    }

    private void c() {
        synchronized (f4110g) {
            if (!this.f4115e.isOpen()) {
                this.f4115e = this.f4114d.getWritableDatabase();
            }
        }
    }

    public int a(Uri uri, ContentValues[] contentValuesArr) {
        int match = this.f4113c.match(uri);
        c();
        if (match == 10) {
            int i10 = 0;
            try {
                this.f4115e.beginTransaction();
                i10 = (int) this.f4115e.insertOrThrow("awstransfer", (String) null, contentValuesArr[0]);
                for (int i11 = 1; i11 < contentValuesArr.length; i11++) {
                    contentValuesArr[i11].put("main_upload_id", Integer.valueOf(i10));
                    this.f4115e.insertOrThrow("awstransfer", (String) null, contentValuesArr[i11]);
                }
                this.f4115e.setTransactionSuccessful();
            } catch (Exception e10) {
                f4109f.k("bulkInsert error : ", e10);
            } catch (Throwable th) {
                this.f4115e.endTransaction();
                throw th;
            }
            this.f4115e.endTransaction();
            return i10;
        }
        throw new IllegalArgumentException("Unknown URI: " + uri);
    }

    public int b(Uri uri, String str, String[] strArr) {
        int match = this.f4113c.match(uri);
        c();
        if (match == 10) {
            return this.f4115e.delete("awstransfer", str, strArr);
        }
        if (match == 20) {
            String lastPathSegment = uri.getLastPathSegment();
            if (TextUtils.isEmpty(str)) {
                SQLiteDatabase sQLiteDatabase = this.f4115e;
                return sQLiteDatabase.delete("awstransfer", "_id=" + lastPathSegment, (String[]) null);
            }
            SQLiteDatabase sQLiteDatabase2 = this.f4115e;
            return sQLiteDatabase2.delete("awstransfer", "_id=" + lastPathSegment + " and " + str, strArr);
        }
        throw new IllegalArgumentException("Unknown URI: " + uri);
    }

    public Uri d() {
        return this.f4112b;
    }

    public Uri e(Uri uri, ContentValues contentValues) {
        int match = this.f4113c.match(uri);
        c();
        if (match == 10) {
            long insertOrThrow = this.f4115e.insertOrThrow("awstransfer", (String) null, contentValues);
            return Uri.parse("transfers/" + insertOrThrow);
        }
        throw new IllegalArgumentException("Unknown URI: " + uri);
    }

    public Cursor f(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        String str4;
        StringBuilder sb;
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("awstransfer");
        int match = this.f4113c.match(uri);
        if (match != 10) {
            if (match == 20) {
                sb = new StringBuilder();
                str4 = "_id=";
            } else if (match == 30) {
                sb = new StringBuilder();
                str4 = "main_upload_id=";
            } else if (match == 40) {
                sQLiteQueryBuilder.appendWhere("state=");
                sQLiteQueryBuilder.appendWhereEscapeString(uri.getLastPathSegment());
                c();
                return sQLiteQueryBuilder.query(this.f4115e, strArr, str, strArr2, (String) null, (String) null, str2);
            } else {
                throw new IllegalArgumentException("Unknown URI: " + uri);
            }
            sb.append(str4);
            sb.append(uri.getLastPathSegment());
            str3 = sb.toString();
        } else {
            str3 = "part_num=0";
        }
        sQLiteQueryBuilder.appendWhere(str3);
        c();
        return sQLiteQueryBuilder.query(this.f4115e, strArr, str, strArr2, (String) null, (String) null, str2);
    }

    public synchronized int g(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i10;
        int match = this.f4113c.match(uri);
        c();
        if (match == 10) {
            i10 = this.f4115e.update("awstransfer", contentValues, str, strArr);
        } else if (match == 20) {
            String lastPathSegment = uri.getLastPathSegment();
            if (TextUtils.isEmpty(str)) {
                SQLiteDatabase sQLiteDatabase = this.f4115e;
                i10 = sQLiteDatabase.update("awstransfer", contentValues, "_id=" + lastPathSegment, (String[]) null);
            } else {
                SQLiteDatabase sQLiteDatabase2 = this.f4115e;
                i10 = sQLiteDatabase2.update("awstransfer", contentValues, "_id=" + lastPathSegment + " and " + str, strArr);
            }
        } else {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        return i10;
    }
}
