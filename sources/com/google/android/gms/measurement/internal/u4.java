package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import l2.d;

public final class u4 extends e3 {

    /* renamed from: c  reason: collision with root package name */
    private final t4 f6597c = new t4(this, zza(), "google_app_measurement_local.db");

    /* renamed from: d  reason: collision with root package name */
    private boolean f6598d;

    u4(m6 m6Var) {
        super(m6Var);
    }

    private static long A(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, (String) null, (String) null, "rowid desc", "1");
            if (query.moveToFirst()) {
                long j10 = query.getLong(0);
                query.close();
                return j10;
            }
            query.close();
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bf A[SYNTHETIC, Splitter:B:47:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0113 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0113 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0113 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean C(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.m()
            boolean r0 = r1.f6598d
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0023:
            if (r5 >= r4) goto L_0x0125
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.J()     // Catch:{ SQLiteFullException -> 0x00f9, SQLiteDatabaseLockedException -> 0x00e7, SQLiteException -> 0x00bb, all -> 0x00b8 }
            if (r9 != 0) goto L_0x0035
            r1.f6598d = r8     // Catch:{ SQLiteFullException -> 0x00b6, SQLiteDatabaseLockedException -> 0x00e8, SQLiteException -> 0x00b2 }
            if (r9 == 0) goto L_0x0034
            r9.close()
        L_0x0034:
            return r2
        L_0x0035:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00b6, SQLiteDatabaseLockedException -> 0x00e8, SQLiteException -> 0x00b2 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00b6, SQLiteDatabaseLockedException -> 0x00e8, SQLiteException -> 0x00b2 }
            if (r12 == 0) goto L_0x0056
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0056
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            goto L_0x0056
        L_0x004d:
            r0 = move-exception
            goto L_0x00e5
        L_0x0050:
            r0 = move-exception
            goto L_0x00b4
        L_0x0052:
            r0 = move-exception
            r7 = r12
            goto L_0x00fb
        L_0x0056:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x009d
            com.google.android.gms.measurement.internal.x4 r15 = r16.k()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.z4 r15 = r15.F()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r4 = "Data loss, local db full"
            r15.a(r4)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            r10[r2] = r11     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            int r4 = r9.delete(r0, r4, r10)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            long r10 = (long) r4     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x009d
            com.google.android.gms.measurement.internal.x4 r4 = r16.k()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.z4 r4 = r4.F()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            r4.d(r15, r2, r8, r10)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
        L_0x009d:
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b0, SQLiteException -> 0x0050, all -> 0x004d }
            if (r12 == 0) goto L_0x00ab
            r12.close()
        L_0x00ab:
            r9.close()
            r2 = 1
            return r2
        L_0x00b0:
            r7 = r12
            goto L_0x00e8
        L_0x00b2:
            r0 = move-exception
            r12 = r7
        L_0x00b4:
            r7 = r9
            goto L_0x00bd
        L_0x00b6:
            r0 = move-exception
            goto L_0x00fb
        L_0x00b8:
            r0 = move-exception
            r9 = r7
            goto L_0x011a
        L_0x00bb:
            r0 = move-exception
            r12 = r7
        L_0x00bd:
            if (r7 == 0) goto L_0x00c8
            boolean r2 = r7.inTransaction()     // Catch:{ all -> 0x00e3 }
            if (r2 == 0) goto L_0x00c8
            r7.endTransaction()     // Catch:{ all -> 0x00e3 }
        L_0x00c8:
            com.google.android.gms.measurement.internal.x4 r2 = r16.k()     // Catch:{ all -> 0x00e3 }
            com.google.android.gms.measurement.internal.z4 r2 = r2.F()     // Catch:{ all -> 0x00e3 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.b(r4, r0)     // Catch:{ all -> 0x00e3 }
            r2 = 1
            r1.f6598d = r2     // Catch:{ all -> 0x00e3 }
            if (r12 == 0) goto L_0x00dd
            r12.close()
        L_0x00dd:
            if (r7 == 0) goto L_0x0113
            r7.close()
            goto L_0x0113
        L_0x00e3:
            r0 = move-exception
            r9 = r7
        L_0x00e5:
            r7 = r12
            goto L_0x011a
        L_0x00e7:
            r9 = r7
        L_0x00e8:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x0119 }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f3
            r7.close()
        L_0x00f3:
            if (r9 == 0) goto L_0x0113
        L_0x00f5:
            r9.close()
            goto L_0x0113
        L_0x00f9:
            r0 = move-exception
            r9 = r7
        L_0x00fb:
            com.google.android.gms.measurement.internal.x4 r2 = r16.k()     // Catch:{ all -> 0x0119 }
            com.google.android.gms.measurement.internal.z4 r2 = r2.F()     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.b(r4, r0)     // Catch:{ all -> 0x0119 }
            r2 = 1
            r1.f6598d = r2     // Catch:{ all -> 0x0119 }
            if (r7 == 0) goto L_0x0110
            r7.close()
        L_0x0110:
            if (r9 == 0) goto L_0x0113
            goto L_0x00f5
        L_0x0113:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0023
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            if (r7 == 0) goto L_0x011f
            r7.close()
        L_0x011f:
            if (r9 == 0) goto L_0x0124
            r9.close()
        L_0x0124:
            throw r0
        L_0x0125:
            com.google.android.gms.measurement.internal.x4 r0 = r16.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.J()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u4.C(int, byte[]):boolean");
    }

    private final SQLiteDatabase J() {
        if (this.f6598d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f6597c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f6598d = true;
        return null;
    }

    private final boolean K() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:60|61|62|63) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:75|76|77|78) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:47|48|49|50|169) */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x017c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x017f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0180, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0183, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0187, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0188, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        k().F().a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        k().F().a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        k().F().a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0104 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x017c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0193 A[SYNTHETIC, Splitter:B:123:0x0193] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01dc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01dc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01dc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<i2.a> B(int r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "Error reading entries from local database"
            r21.m()
            boolean r0 = r1.f6598d
            r3 = 0
            if (r0 == 0) goto L_0x000d
            return r3
        L_0x000d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r21.K()
            if (r0 != 0) goto L_0x0019
            return r4
        L_0x0019:
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 5
        L_0x001d:
            if (r7 >= r5) goto L_0x01ef
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r21.J()     // Catch:{ SQLiteFullException -> 0x01c4, SQLiteDatabaseLockedException -> 0x01b1, SQLiteException -> 0x018e, all -> 0x018b }
            if (r15 != 0) goto L_0x0034
            r1.f6598d = r9     // Catch:{ SQLiteFullException -> 0x0031, SQLiteDatabaseLockedException -> 0x0183, SQLiteException -> 0x002e, all -> 0x017c }
            if (r15 == 0) goto L_0x002d
            r15.close()
        L_0x002d:
            return r3
        L_0x002e:
            r0 = move-exception
            goto L_0x0181
        L_0x0031:
            r0 = move-exception
            goto L_0x0189
        L_0x0034:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0187, SQLiteDatabaseLockedException -> 0x0183, SQLiteException -> 0x017f, all -> 0x017c }
            long r10 = A(r15)     // Catch:{ SQLiteFullException -> 0x0187, SQLiteDatabaseLockedException -> 0x0183, SQLiteException -> 0x017f, all -> 0x017c }
            r19 = -1
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0031, SQLiteDatabaseLockedException -> 0x0183, SQLiteException -> 0x002e, all -> 0x017c }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0031, SQLiteDatabaseLockedException -> 0x0183, SQLiteException -> 0x002e, all -> 0x017c }
            r12[r6] = r10     // Catch:{ SQLiteFullException -> 0x0031, SQLiteDatabaseLockedException -> 0x0183, SQLiteException -> 0x002e, all -> 0x017c }
            r13 = r0
            r14 = r12
            goto L_0x0050
        L_0x004e:
            r13 = r3
            r14 = r13
        L_0x0050:
            java.lang.String r11 = "messages"
            java.lang.String r0 = "rowid"
            java.lang.String r10 = "type"
            java.lang.String r12 = "entry"
            java.lang.String[] r12 = new java.lang.String[]{r0, r10, r12}     // Catch:{ SQLiteFullException -> 0x0187, SQLiteDatabaseLockedException -> 0x0183, SQLiteException -> 0x017f, all -> 0x017c }
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r10 = 100
            java.lang.String r18 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x0187, SQLiteDatabaseLockedException -> 0x0183, SQLiteException -> 0x017f, all -> 0x017c }
            r10 = r15
            r5 = r15
            r15 = r0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x0178, SQLiteDatabaseLockedException -> 0x0184, SQLiteException -> 0x0174, all -> 0x0171 }
        L_0x006e:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            if (r0 == 0) goto L_0x0139
            long r19 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            r11 = 2
            byte[] r12 = r10.getBlob(r11)     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            if (r0 != 0) goto L_0x00b6
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            int r0 = r12.length     // Catch:{ a -> 0x00a1 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x00a1 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x00a1 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.i0> r0 = com.google.android.gms.measurement.internal.i0.CREATOR     // Catch:{ a -> 0x00a1 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x00a1 }
            com.google.android.gms.measurement.internal.i0 r0 = (com.google.android.gms.measurement.internal.i0) r0     // Catch:{ a -> 0x00a1 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            if (r0 == 0) goto L_0x006e
        L_0x009b:
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            goto L_0x006e
        L_0x009f:
            r0 = move-exception
            goto L_0x00b2
        L_0x00a1:
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ all -> 0x009f }
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()     // Catch:{ all -> 0x009f }
            java.lang.String r12 = "Failed to load event from local database"
            r0.a(r12)     // Catch:{ all -> 0x009f }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            goto L_0x006e
        L_0x00b2:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            throw r0     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
        L_0x00b6:
            if (r0 != r9) goto L_0x00e9
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            int r0 = r12.length     // Catch:{ a -> 0x00d1 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x00d1 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x00d1 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.nc> r0 = com.google.android.gms.measurement.internal.nc.CREATOR     // Catch:{ a -> 0x00d1 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x00d1 }
            com.google.android.gms.measurement.internal.nc r0 = (com.google.android.gms.measurement.internal.nc) r0     // Catch:{ a -> 0x00d1 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            goto L_0x00e2
        L_0x00cf:
            r0 = move-exception
            goto L_0x00e5
        L_0x00d1:
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()     // Catch:{ all -> 0x00cf }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.a(r12)     // Catch:{ all -> 0x00cf }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            r0 = r3
        L_0x00e2:
            if (r0 == 0) goto L_0x006e
            goto L_0x009b
        L_0x00e5:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            throw r0     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
        L_0x00e9:
            if (r0 != r11) goto L_0x011c
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            int r0 = r12.length     // Catch:{ a -> 0x0104 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x0104 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x0104 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.e> r0 = com.google.android.gms.measurement.internal.e.CREATOR     // Catch:{ a -> 0x0104 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x0104 }
            com.google.android.gms.measurement.internal.e r0 = (com.google.android.gms.measurement.internal.e) r0     // Catch:{ a -> 0x0104 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            goto L_0x0115
        L_0x0102:
            r0 = move-exception
            goto L_0x0118
        L_0x0104:
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ all -> 0x0102 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()     // Catch:{ all -> 0x0102 }
            java.lang.String r12 = "Failed to load conditional user property from local database"
            r0.a(r12)     // Catch:{ all -> 0x0102 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            r0 = r3
        L_0x0115:
            if (r0 == 0) goto L_0x006e
            goto L_0x009b
        L_0x0118:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            throw r0     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
        L_0x011c:
            r11 = 3
            if (r0 != r11) goto L_0x012e
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.K()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            java.lang.String r11 = "Skipping app launch break"
        L_0x0129:
            r0.a(r11)     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            goto L_0x006e
        L_0x012e:
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            java.lang.String r11 = "Unknown record type in local database"
            goto L_0x0129
        L_0x0139:
            java.lang.String r0 = "messages"
            java.lang.String r11 = "rowid <= ?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            java.lang.String r13 = java.lang.Long.toString(r19)     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            r12[r6] = r13     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            int r0 = r5.delete(r0, r11, r12)     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            int r11 = r4.size()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            if (r0 >= r11) goto L_0x015c
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            java.lang.String r11 = "Fewer entries removed from local database than expected"
            r0.a(r11)     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
        L_0x015c:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x016f, SQLiteDatabaseLockedException -> 0x0185, SQLiteException -> 0x016d, all -> 0x0169 }
            r10.close()
            r5.close()
            return r4
        L_0x0169:
            r0 = move-exception
            r3 = r10
            goto L_0x01e4
        L_0x016d:
            r0 = move-exception
            goto L_0x0176
        L_0x016f:
            r0 = move-exception
            goto L_0x017a
        L_0x0171:
            r0 = move-exception
            goto L_0x01e4
        L_0x0174:
            r0 = move-exception
            r10 = r3
        L_0x0176:
            r15 = r5
            goto L_0x0191
        L_0x0178:
            r0 = move-exception
            r10 = r3
        L_0x017a:
            r15 = r5
            goto L_0x01c7
        L_0x017c:
            r0 = move-exception
            goto L_0x01e3
        L_0x017f:
            r0 = move-exception
            r5 = r15
        L_0x0181:
            r10 = r3
            goto L_0x0191
        L_0x0183:
            r5 = r15
        L_0x0184:
            r10 = r3
        L_0x0185:
            r15 = r5
            goto L_0x01b3
        L_0x0187:
            r0 = move-exception
            r5 = r15
        L_0x0189:
            r10 = r3
            goto L_0x01c7
        L_0x018b:
            r0 = move-exception
            r5 = r3
            goto L_0x01e4
        L_0x018e:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x0191:
            if (r15 == 0) goto L_0x019c
            boolean r5 = r15.inTransaction()     // Catch:{ all -> 0x01e1 }
            if (r5 == 0) goto L_0x019c
            r15.endTransaction()     // Catch:{ all -> 0x01e1 }
        L_0x019c:
            com.google.android.gms.measurement.internal.x4 r5 = r21.k()     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.measurement.internal.z4 r5 = r5.F()     // Catch:{ all -> 0x01e1 }
            r5.b(r2, r0)     // Catch:{ all -> 0x01e1 }
            r1.f6598d = r9     // Catch:{ all -> 0x01e1 }
            if (r10 == 0) goto L_0x01ae
            r10.close()
        L_0x01ae:
            if (r15 == 0) goto L_0x01dc
            goto L_0x01c0
        L_0x01b1:
            r10 = r3
            r15 = r10
        L_0x01b3:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x01e1 }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x01be
            r10.close()
        L_0x01be:
            if (r15 == 0) goto L_0x01dc
        L_0x01c0:
            r15.close()
            goto L_0x01dc
        L_0x01c4:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x01c7:
            com.google.android.gms.measurement.internal.x4 r5 = r21.k()     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.measurement.internal.z4 r5 = r5.F()     // Catch:{ all -> 0x01e1 }
            r5.b(r2, r0)     // Catch:{ all -> 0x01e1 }
            r1.f6598d = r9     // Catch:{ all -> 0x01e1 }
            if (r10 == 0) goto L_0x01d9
            r10.close()
        L_0x01d9:
            if (r15 == 0) goto L_0x01dc
            goto L_0x01c0
        L_0x01dc:
            int r7 = r7 + 1
            r5 = 5
            goto L_0x001d
        L_0x01e1:
            r0 = move-exception
            r3 = r10
        L_0x01e3:
            r5 = r15
        L_0x01e4:
            if (r3 == 0) goto L_0x01e9
            r3.close()
        L_0x01e9:
            if (r5 == 0) goto L_0x01ee
            r5.close()
        L_0x01ee:
            throw r0
        L_0x01ef:
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.K()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.a(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u4.B(int):java.util.List");
    }

    public final boolean D(e eVar) {
        h();
        byte[] o02 = oc.o0(eVar);
        if (o02.length <= 131072) {
            return C(2, o02);
        }
        k().H().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean E(i0 i0Var) {
        Parcel obtain = Parcel.obtain();
        i0Var.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return C(0, marshall);
        }
        k().H().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean F(nc ncVar) {
        Parcel obtain = Parcel.obtain();
        ncVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return C(1, marshall);
        }
        k().H().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final void G() {
        int delete;
        m();
        try {
            SQLiteDatabase J = J();
            if (J != null && (delete = J.delete("messages", (String) null, (String[]) null) + 0) > 0) {
                k().J().b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            k().F().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean H() {
        return C(3, new byte[0]);
    }

    public final boolean I() {
        m();
        if (this.f6598d || !K()) {
            return false;
        }
        int i10 = 0;
        int i11 = 5;
        while (i10 < 5) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = J();
                if (sQLiteDatabase == null) {
                    this.f6598d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return false;
                }
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                sQLiteDatabase.close();
                return true;
            } catch (SQLiteFullException e10) {
                k().F().b("Error deleting app launch break from local database", e10);
                this.f6598d = true;
                if (sQLiteDatabase == null) {
                    i10++;
                }
                sQLiteDatabase.close();
                i10++;
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep((long) i11);
                i11 += 20;
                if (sQLiteDatabase == null) {
                    i10++;
                }
                sQLiteDatabase.close();
                i10++;
            } catch (SQLiteException e11) {
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
                k().F().b("Error deleting app launch break from local database", e11);
                this.f6598d = true;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    i10++;
                } else {
                    i10++;
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        k().K().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ f c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ g d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ c0 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ w4 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ k5 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ oc h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ f6 i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ x4 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final /* bridge */ /* synthetic */ b0 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ r4 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ u4 p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ y7 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ q9 r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ y9 s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ gb t() {
        return super.t();
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return false;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
