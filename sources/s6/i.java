package s6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u6.e;
import u6.g;
import u6.h;

class i {

    /* renamed from: n  reason: collision with root package name */
    private static Boolean f12270n;

    /* renamed from: a  reason: collision with root package name */
    final boolean f12271a;

    /* renamed from: b  reason: collision with root package name */
    final String f12272b;

    /* renamed from: c  reason: collision with root package name */
    final int f12273c;

    /* renamed from: d  reason: collision with root package name */
    final int f12274d;

    /* renamed from: e  reason: collision with root package name */
    final Context f12275e;

    /* renamed from: f  reason: collision with root package name */
    final List<g> f12276f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    final Map<Integer, t> f12277g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public o f12278h;

    /* renamed from: i  reason: collision with root package name */
    SQLiteDatabase f12279i;

    /* renamed from: j  reason: collision with root package name */
    private int f12280j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f12281k = 0;

    /* renamed from: l  reason: collision with root package name */
    private Integer f12282l;

    /* renamed from: m  reason: collision with root package name */
    private int f12283m = 0;

    class a implements DatabaseErrorHandler {
        a() {
        }

        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    i(Context context, String str, int i10, boolean z9, int i11) {
        this.f12275e = context;
        this.f12272b = str;
        this.f12271a = z9;
        this.f12273c = i10;
        this.f12274d = i11;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(e eVar) {
        Boolean f10 = eVar.f();
        boolean z9 = Boolean.TRUE.equals(f10) && eVar.h();
        if (z9) {
            int i10 = this.f12281k + 1;
            this.f12281k = i10;
            this.f12282l = Integer.valueOf(i10);
        }
        if (!w(eVar)) {
            if (z9) {
                this.f12282l = null;
            }
        } else if (z9) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", this.f12282l);
            eVar.a(hashMap);
        } else {
            if (Boolean.FALSE.equals(f10)) {
                this.f12282l = null;
            }
            eVar.a((Object) null);
        }
    }

    /* access modifiers changed from: private */
    public void Q() {
        while (!this.f12276f.isEmpty() && this.f12282l == null) {
            this.f12276f.get(0).a();
            this.f12276f.remove(0);
        }
    }

    private void S(e eVar, Runnable runnable) {
        Integer g10 = eVar.g();
        Integer num = this.f12282l;
        if (num == null) {
            runnable.run();
        } else if (g10 == null || (!g10.equals(num) && g10.intValue() != -1)) {
            this.f12276f.add(new g(eVar, runnable));
        } else {
            runnable.run();
            if (this.f12282l == null && !this.f12276f.isEmpty()) {
                this.f12278h.a(this, new c(this));
            }
        }
    }

    protected static boolean i(Context context, String str, boolean z9) {
        try {
            String packageName = context.getPackageName();
            return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128)) : y(context, packageName, 128)).metaData.getBoolean(str, z9);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    protected static boolean j(Context context) {
        return i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    private void l(int i10) {
        t tVar = this.f12277g.get(Integer.valueOf(i10));
        if (tVar != null) {
            m(tVar);
        }
    }

    private void m(t tVar) {
        try {
            int i10 = tVar.f12310a;
            if (r.c(this.f12274d)) {
                Log.d("Sqflite", A() + "closing cursor " + i10);
            }
            this.f12277g.remove(Integer.valueOf(i10));
            tVar.f12312c.close();
        } catch (Exception unused) {
        }
    }

    private Map<String, Object> n(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i10 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                i10 = cursor.getColumnCount();
                hashMap2.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap2.put("rows", arrayList2);
                HashMap hashMap3 = hashMap2;
                arrayList = arrayList2;
                hashMap = hashMap3;
            }
            arrayList.add(e0.a(cursor, i10));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    static void o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    private boolean p(e eVar) {
        if (!w(eVar)) {
            return false;
        }
        eVar.a((Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cf  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean I(u6.e r10) {
        /*
            r9 = this;
            boolean r0 = r9.w(r10)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r10.e()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0014
            r10.a(r2)
            return r3
        L_0x0014:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.C()     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x009b
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0099 }
            if (r5 <= 0) goto L_0x009b
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x009b
            int r5 = r0.getInt(r1)     // Catch:{ Exception -> 0x0099 }
            if (r5 != 0) goto L_0x0067
            int r5 = r9.f12274d     // Catch:{ Exception -> 0x0099 }
            boolean r5 = s6.r.b(r5)     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x0060
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r5.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = r9.A()     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            long r6 = r0.getLong(r3)     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0099 }
        L_0x0060:
            r10.a(r2)     // Catch:{ Exception -> 0x0099 }
            r0.close()
            return r3
        L_0x0067:
            long r5 = r0.getLong(r3)     // Catch:{ Exception -> 0x0099 }
            int r2 = r9.f12274d     // Catch:{ Exception -> 0x0099 }
            boolean r2 = s6.r.b(r2)     // Catch:{ Exception -> 0x0099 }
            if (r2 == 0) goto L_0x008e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r2.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = r9.A()     // Catch:{ Exception -> 0x0099 }
            r2.append(r7)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch:{ Exception -> 0x0099 }
            r2.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.d(r4, r2)     // Catch:{ Exception -> 0x0099 }
        L_0x008e:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0099 }
            r10.a(r2)     // Catch:{ Exception -> 0x0099 }
            r0.close()
            return r3
        L_0x0099:
            r2 = move-exception
            goto L_0x00c2
        L_0x009b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r5.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = r9.A()     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0099 }
            r10.a(r2)     // Catch:{ Exception -> 0x0099 }
            if (r0 == 0) goto L_0x00bb
            r0.close()
        L_0x00bb:
            return r3
        L_0x00bc:
            r10 = move-exception
            goto L_0x00cd
        L_0x00be:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        L_0x00c2:
            r9.D(r2, r10)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00ca
            r0.close()
        L_0x00ca:
            return r1
        L_0x00cb:
            r10 = move-exception
            r2 = r0
        L_0x00cd:
            if (r2 == 0) goto L_0x00d2
            r2.close()
        L_0x00d2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.i.I(u6.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0098 A[Catch:{ all -> 0x00a3 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean J(u6.e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "cursorPageSize"
            java.lang.Object r0 = r10.c(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            s6.d0 r1 = r10.d()
            int r2 = r9.f12274d
            boolean r2 = s6.r.b(r2)
            if (r2 == 0) goto L_0x002c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r9.A()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Sqflite"
            android.util.Log.d(r3, r2)
        L_0x002c:
            r2 = 0
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r9.z()     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            s6.b r5 = new s6.b     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.lang.String r1 = r1.c()     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.lang.String[] r6 = s6.a.f12225a     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            android.database.Cursor r1 = r4.rawQueryWithFactory(r5, r1, r6, r2)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.util.Map r4 = r9.n(r1, r0)     // Catch:{ Exception -> 0x008c }
            r5 = 1
            if (r0 == 0) goto L_0x0056
            boolean r6 = r1.isLast()     // Catch:{ Exception -> 0x008c }
            if (r6 != 0) goto L_0x0056
            boolean r6 = r1.isAfterLast()     // Catch:{ Exception -> 0x008c }
            if (r6 != 0) goto L_0x0056
            r6 = 1
            goto L_0x0057
        L_0x0056:
            r6 = 0
        L_0x0057:
            if (r6 == 0) goto L_0x0081
            int r6 = r9.f12283m     // Catch:{ Exception -> 0x008c }
            int r6 = r6 + r5
            r9.f12283m = r6     // Catch:{ Exception -> 0x008c }
            java.lang.String r7 = "cursorId"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x008c }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x008c }
            s6.t r7 = new s6.t     // Catch:{ Exception -> 0x008c }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x008c }
            r7.<init>(r6, r0, r1)     // Catch:{ Exception -> 0x008c }
            java.util.Map<java.lang.Integer, s6.t> r0 = r9.f12277g     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r0.put(r2, r7)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r2 = r7
            goto L_0x0081
        L_0x007b:
            r10 = move-exception
            r2 = r7
            goto L_0x00a4
        L_0x007e:
            r0 = move-exception
            r2 = r7
            goto L_0x0093
        L_0x0081:
            r10.a(r4)     // Catch:{ Exception -> 0x008c }
            if (r2 != 0) goto L_0x008b
            if (r1 == 0) goto L_0x008b
            r1.close()
        L_0x008b:
            return r5
        L_0x008c:
            r0 = move-exception
            goto L_0x0093
        L_0x008e:
            r10 = move-exception
            r1 = r2
            goto L_0x00a4
        L_0x0091:
            r0 = move-exception
            r1 = r2
        L_0x0093:
            r9.D(r0, r10)     // Catch:{ all -> 0x00a3 }
            if (r2 == 0) goto L_0x009b
            r9.m(r2)     // Catch:{ all -> 0x00a3 }
        L_0x009b:
            if (r2 != 0) goto L_0x00a2
            if (r1 == 0) goto L_0x00a2
            r1.close()
        L_0x00a2:
            return r3
        L_0x00a3:
            r10 = move-exception
        L_0x00a4:
            if (r2 != 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00ab
            r1.close()
        L_0x00ab:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.i.J(u6.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6 A[Catch:{ all -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean K(u6.e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "cursorId"
            java.lang.Object r1 = r10.c(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cancel"
            java.lang.Object r3 = r10.c(r3)
            boolean r2 = r2.equals(r3)
            int r3 = r9.f12274d
            boolean r3 = s6.r.c(r3)
            if (r3 == 0) goto L_0x0047
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r9.A()
            r3.append(r4)
            java.lang.String r4 = "cursor "
            r3.append(r4)
            r3.append(r1)
            if (r2 == 0) goto L_0x0039
            java.lang.String r4 = " cancel"
            goto L_0x003b
        L_0x0039:
            java.lang.String r4 = " next"
        L_0x003b:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Sqflite"
            android.util.Log.d(r4, r3)
        L_0x0047:
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0052
            r9.l(r1)
            r10.a(r3)
            return r4
        L_0x0052:
            java.util.Map<java.lang.Integer, s6.t> r2 = r9.f12277g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r5)
            s6.t r2 = (s6.t) r2
            r5 = 0
            if (r2 == 0) goto L_0x0095
            android.database.Cursor r6 = r2.f12312c     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            int r7 = r2.f12311b     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.util.Map r7 = r9.n(r6, r7)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            boolean r8 = r6.isLast()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            if (r8 != 0) goto L_0x007b
            boolean r6 = r6.isAfterLast()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            if (r6 != 0) goto L_0x007b
            r6 = 1
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            if (r6 == 0) goto L_0x0085
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x008e }
            r7.put(r0, r1)     // Catch:{ Exception -> 0x008e }
        L_0x0085:
            r10.a(r7)     // Catch:{ Exception -> 0x008e }
            if (r6 != 0) goto L_0x008d
            r9.m(r2)
        L_0x008d:
            return r4
        L_0x008e:
            r0 = move-exception
            goto L_0x00b1
        L_0x0090:
            r10 = move-exception
            goto L_0x00c5
        L_0x0092:
            r0 = move-exception
            r6 = 0
            goto L_0x00b1
        L_0x0095:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r4.<init>()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r6 = "Cursor "
            r4.append(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r4.append(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r1 = " not found"
            r4.append(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            throw r0     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
        L_0x00b1:
            r9.D(r0, r10)     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00ba
            r9.m(r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x00bb
        L_0x00ba:
            r3 = r2
        L_0x00bb:
            if (r6 != 0) goto L_0x00c2
            if (r3 == 0) goto L_0x00c2
            r9.m(r3)
        L_0x00c2:
            return r5
        L_0x00c3:
            r10 = move-exception
            r5 = r6
        L_0x00c5:
            if (r5 != 0) goto L_0x00cc
            if (r2 == 0) goto L_0x00cc
            r9.m(r2)
        L_0x00cc:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.i.K(u6.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean L(u6.e r8) {
        /*
            r7 = this;
            boolean r0 = r7.w(r8)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r8.e()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r8.a(r3)
            return r2
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = r7.C()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = "SELECT changes()"
            android.database.Cursor r0 = r0.rawQuery(r4, r3)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x0066
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 <= 0) goto L_0x0066
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 == 0) goto L_0x0066
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            int r5 = r7.f12274d     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            boolean r5 = s6.r.b(r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 == 0) goto L_0x0055
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = r7.A()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = "changed "
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
        L_0x0055:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r8.a(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r0.close()
            return r2
        L_0x0060:
            r8 = move-exception
            r3 = r0
            goto L_0x0093
        L_0x0063:
            r2 = move-exception
            r3 = r0
            goto L_0x008a
        L_0x0066:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = r7.A()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = "fail to read changes for Update/Delete"
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r8.a(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r0 == 0) goto L_0x0086
            r0.close()
        L_0x0086:
            return r2
        L_0x0087:
            r8 = move-exception
            goto L_0x0093
        L_0x0089:
            r2 = move-exception
        L_0x008a:
            r7.D(r2, r8)     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0092
            r3.close()
        L_0x0092:
            return r1
        L_0x0093:
            if (r3 == 0) goto L_0x0098
            r3.close()
        L_0x0098:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.i.L(u6.e):boolean");
    }

    private boolean w(e eVar) {
        d0 d10 = eVar.d();
        if (r.b(this.f12274d)) {
            Log.d("Sqflite", A() + d10);
        }
        Boolean f10 = eVar.f();
        try {
            C().execSQL(d10.c(), d10.d());
            u(f10);
            return true;
        } catch (Exception e10) {
            D(e10, eVar);
            return false;
        }
    }

    public static boolean x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    static ApplicationInfo y(Context context, String str, int i10) {
        return context.getPackageManager().getApplicationInfo(str, i10);
    }

    /* access modifiers changed from: package-private */
    public String A() {
        return "[" + B() + "] ";
    }

    /* access modifiers changed from: package-private */
    public String B() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f12273c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase C() {
        return this.f12279i;
    }

    /* access modifiers changed from: package-private */
    public void D(Exception exc, e eVar) {
        String message;
        Map<String, Object> a10;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + this.f12272b;
            a10 = null;
        } else {
            boolean z9 = exc instanceof SQLException;
            message = exc.getMessage();
            a10 = h.a(eVar);
        }
        eVar.b("sqlite_error", message, a10);
    }

    public void E(e eVar) {
        S(eVar, new d(this, eVar));
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean F() {
        return this.f12280j > 0;
    }

    public void M() {
        if (f12270n == null) {
            Boolean valueOf = Boolean.valueOf(j(this.f12275e));
            f12270n = valueOf;
            if (valueOf.booleanValue() && r.c(this.f12274d)) {
                Log.d("Sqflite", A() + "[sqflite] WAL enabled");
            }
        }
        this.f12279i = SQLiteDatabase.openDatabase(this.f12272b, (SQLiteDatabase.CursorFactory) null, f12270n.booleanValue() ? 805306368 : 268435456);
    }

    public void N() {
        this.f12279i = SQLiteDatabase.openDatabase(this.f12272b, (SQLiteDatabase.CursorFactory) null, 1, new a());
    }

    public void O(e eVar) {
        S(eVar, new f(this, eVar));
    }

    public void P(e eVar) {
        S(eVar, new e(this, eVar));
    }

    public void R(e eVar) {
        S(eVar, new g(this, eVar));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        r5.t(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c1, code lost:
        r5.s(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(k7.j r9, k7.k.d r10) {
        /*
            r8 = this;
            u6.d r0 = new u6.d
            r0.<init>(r9, r10)
            boolean r9 = r0.e()
            boolean r1 = r0.l()
            java.lang.String r2 = "operations"
            java.lang.Object r0 = r0.c(r2)
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x00ca
            java.lang.Object r3 = r0.next()
            java.util.Map r3 = (java.util.Map) r3
            u6.c r5 = new u6.c
            r5.<init>(r3, r9)
            java.lang.String r3 = r5.i()
            r3.hashCode()
            r6 = -1
            int r7 = r3.hashCode()
            switch(r7) {
                case -1319569547: goto L_0x0061;
                case -1183792455: goto L_0x0056;
                case -838846263: goto L_0x004b;
                case 107944136: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x006b
        L_0x0040:
            java.lang.String r7 = "query"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x0049
            goto L_0x006b
        L_0x0049:
            r6 = 3
            goto L_0x006b
        L_0x004b:
            java.lang.String r7 = "update"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x0054
            goto L_0x006b
        L_0x0054:
            r6 = 2
            goto L_0x006b
        L_0x0056:
            java.lang.String r7 = "insert"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            r6 = 1
            goto L_0x006b
        L_0x0061:
            java.lang.String r7 = "execute"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r6 = 0
        L_0x006b:
            switch(r6) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x00a6;
                case 2: goto L_0x0098;
                case 3: goto L_0x008a;
                default: goto L_0x006e;
            }
        L_0x006e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Batch method '"
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = "' not supported"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "bad_param"
            r10.b(r0, r9, r4)
            return
        L_0x008a:
            boolean r3 = r8.J(r5)
            if (r3 == 0) goto L_0x0091
            goto L_0x00ba
        L_0x0091:
            if (r1 == 0) goto L_0x0094
            goto L_0x00af
        L_0x0094:
            r5.r(r10)
            return
        L_0x0098:
            boolean r3 = r8.L(r5)
            if (r3 == 0) goto L_0x009f
            goto L_0x00ba
        L_0x009f:
            if (r1 == 0) goto L_0x00a2
            goto L_0x00af
        L_0x00a2:
            r5.r(r10)
            return
        L_0x00a6:
            boolean r3 = r8.I(r5)
            if (r3 == 0) goto L_0x00ad
            goto L_0x00ba
        L_0x00ad:
            if (r1 == 0) goto L_0x00b0
        L_0x00af:
            goto L_0x00c1
        L_0x00b0:
            r5.r(r10)
            return
        L_0x00b4:
            boolean r3 = r8.p(r5)
            if (r3 == 0) goto L_0x00bf
        L_0x00ba:
            r5.t(r2)
            goto L_0x001e
        L_0x00bf:
            if (r1 == 0) goto L_0x00c6
        L_0x00c1:
            r5.s(r2)
            goto L_0x001e
        L_0x00c6:
            r5.r(r10)
            return
        L_0x00ca:
            if (r9 == 0) goto L_0x00d0
            r10.a(r4)
            goto L_0x00d3
        L_0x00d0:
            r10.a(r2)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.i.h(k7.j, k7.k$d):void");
    }

    public void k() {
        if (!this.f12277g.isEmpty() && r.b(this.f12274d)) {
            Log.d("Sqflite", A() + this.f12277g.size() + " cursor(s) are left opened");
        }
        this.f12279i.close();
    }

    /* access modifiers changed from: package-private */
    public synchronized void u(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            this.f12280j++;
        } else if (Boolean.FALSE.equals(bool)) {
            this.f12280j--;
        }
    }

    public void v(e eVar) {
        S(eVar, new h(this, eVar));
    }

    public SQLiteDatabase z() {
        return this.f12279i;
    }
}
