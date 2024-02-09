package x1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p1.h;
import p1.i;
import p1.p;
import s1.a;
import s1.c;
import s1.e;
import s1.f;
import y1.b;

public class m0 implements d, y1.b, c {

    /* renamed from: r  reason: collision with root package name */
    private static final n1.b f13094r = n1.b.b("proto");

    /* renamed from: m  reason: collision with root package name */
    private final t0 f13095m;

    /* renamed from: n  reason: collision with root package name */
    private final z1.a f13096n;

    /* renamed from: o  reason: collision with root package name */
    private final z1.a f13097o;

    /* renamed from: p  reason: collision with root package name */
    private final e f13098p;

    /* renamed from: q  reason: collision with root package name */
    private final f8.a<String> f13099q;

    interface b<T, U> {
        U apply(T t9);
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f13100a;

        /* renamed from: b  reason: collision with root package name */
        final String f13101b;

        private c(String str, String str2) {
            this.f13100a = str;
            this.f13101b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    m0(z1.a aVar, z1.a aVar2, e eVar, t0 t0Var, f8.a<String> aVar3) {
        this.f13095m = t0Var;
        this.f13096n = aVar;
        this.f13097o = aVar2;
        this.f13098p = eVar;
        this.f13099q = aVar3;
    }

    private static byte[] A0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void B0(a.C0208a aVar, Map<String, List<s1.c>> map) {
        for (Map.Entry next : map.entrySet()) {
            aVar.a(s1.d.c().c((String) next.getKey()).b((List) next.getValue()).a());
        }
    }

    private byte[] C0(long j10) {
        return (byte[]) G0(Q().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, (String) null, (String) null, "sequence_num"), s.f13124a);
    }

    private <T> T D0(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f13097o.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f13097o.a() >= ((long) this.f13098p.b()) + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50);
            }
        }
    }

    private static n1.b E0(String str) {
        return str == null ? f13094r : n1.b.b(str);
    }

    private static String F0(Iterable<k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static <T> T G0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private c.b M(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        t1.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void N(SQLiteDatabase sQLiteDatabase) {
        D0(new c0(sQLiteDatabase), b0.f13067a);
    }

    private long O(SQLiteDatabase sQLiteDatabase, p pVar) {
        Long V = V(sQLiteDatabase, pVar);
        if (V != null) {
            return V.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(a2.a.a(pVar.d())));
        contentValues.put("next_request_ms", 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    private s1.b R() {
        return s1.b.b().b(e.c().b(P()).c(e.f13070a.f()).a()).a();
    }

    private long S() {
        return Q().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long T() {
        return Q().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private f U() {
        return (f) W(new w(this.f13096n.a()));
    }

    private Long V(SQLiteDatabase sQLiteDatabase, p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{pVar.b(), String.valueOf(a2.a.a(pVar.d()))}));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) G0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), v.f13141a);
    }

    private boolean X() {
        return S() * T() >= this.f13098p.f();
    }

    private List<k> Y(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a l10 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l10.c(cVar.f13100a, cVar.f13101b);
                }
                listIterator.set(k.a(next.c(), next.d(), l10.d()));
            }
        }
        return list;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object Z(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            b((long) i10, c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer a0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        G0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new h0(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object c0(Throwable th) {
        throw new y1.a("Timed out while trying to acquire the lock.", th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase d0(Throwable th) {
        throw new y1.a("Timed out while trying to open db.", th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long e0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ f g0(long j10, SQLiteDatabase sQLiteDatabase) {
        return (f) G0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new l(j10));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long h0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean i0(p pVar, SQLiteDatabase sQLiteDatabase) {
        Long V = V(sQLiteDatabase, pVar);
        if (V == null) {
            return Boolean.FALSE;
        }
        return (Boolean) G0(Q().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{V.toString()}), y.f13144a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List j0(SQLiteDatabase sQLiteDatabase) {
        return (List) G0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), t.f13126a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List k0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(p.a().b(cursor.getString(1)).d(a2.a.b(cursor.getInt(2))).c(A0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List l0(p pVar, SQLiteDatabase sQLiteDatabase) {
        List<k> y02 = y0(sQLiteDatabase, pVar, this.f13098p.d());
        for (n1.d dVar : n1.d.values()) {
            if (dVar != pVar.d()) {
                int d10 = this.f13098p.d() - y02.size();
                if (d10 <= 0) {
                    break;
                }
                y02.addAll(y0(sQLiteDatabase, pVar.f(dVar), d10));
            }
        }
        return Y(y02, z0(sQLiteDatabase, y02));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ s1.a m0(Map map, a.C0208a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b M = M(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(s1.c.c().c(M).b(j10).a());
        }
        B0(aVar, map);
        aVar.e(U());
        aVar.d(R());
        aVar.c(this.f13099q.get());
        return aVar.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ s1.a n0(String str, Map map, a.C0208a aVar, SQLiteDatabase sQLiteDatabase) {
        return (s1.a) G0(sQLiteDatabase.rawQuery(str, new String[0]), new o(this, map, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o0(List list, p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z9 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z9 = true;
            }
            i.a k10 = i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            k10.h(z9 ? new h(E0(cursor.getString(4)), cursor.getBlob(5)) : new h(E0(cursor.getString(4)), C0(j10)));
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, pVar, k10.d()));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object p0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Long q0(i iVar, p pVar, SQLiteDatabase sQLiteDatabase) {
        if (X()) {
            b(1, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long O = O(sQLiteDatabase, pVar);
        int e10 = this.f13098p.e();
        byte[] a10 = iVar.e().a();
        boolean z9 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(O));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z9));
        contentValues.put("payload", z9 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z9) {
            int ceil = (int) Math.ceil(((double) a10.length) / ((double) e10));
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ byte[] r0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object s0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            b((long) i10, c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object t0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        G0(sQLiteDatabase.rawQuery(str2, (String[]) null), new i0(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean u0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object v0(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) G0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), x.f13143a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object w0(long j10, p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(a2.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(a2.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object x0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f13096n.a()).execute();
        return null;
    }

    private List<k> y0(SQLiteDatabase sQLiteDatabase, p pVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long V = V(sQLiteDatabase, pVar);
        if (V == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        G0(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{V.toString()}, (String) null, (String) null, (String) null, String.valueOf(i10)), new n(this, arrayList, pVar));
        return arrayList;
    }

    private Map<Long, Set<c>> z0(SQLiteDatabase sQLiteDatabase, List<k> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        G0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new g0(hashMap));
        return hashMap;
    }

    public void B(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            W(new l0(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + F0(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* access modifiers changed from: package-private */
    public long P() {
        return S() * T();
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase Q() {
        t0 t0Var = this.f13095m;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) D0(new d0(t0Var), a0.f13063a);
    }

    /* access modifiers changed from: package-private */
    public <T> T W(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase Q = Q();
        Q.beginTransaction();
        try {
            T apply = bVar.apply(Q);
            Q.setTransactionSuccessful();
            return apply;
        } finally {
            Q.endTransaction();
        }
    }

    public s1.a a() {
        return (s1.a) W(new m(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), s1.a.e()));
    }

    public void b(long j10, c.b bVar, String str) {
        W(new f0(str, bVar, j10));
    }

    public void c(p pVar, long j10) {
        W(new e0(j10, pVar));
    }

    public void close() {
        this.f13095m.close();
    }

    public int d() {
        return ((Integer) W(new k0(this, this.f13096n.a() - this.f13098p.c()))).intValue();
    }

    public void e() {
        W(new j0(this));
    }

    public void f(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            Q().compileStatement("DELETE FROM events WHERE _id in " + F0(iterable)).execute();
        }
    }

    public <T> T g(b.a<T> aVar) {
        SQLiteDatabase Q = Q();
        N(Q);
        try {
            T a10 = aVar.a();
            Q.setTransactionSuccessful();
            return a10;
        } finally {
            Q.endTransaction();
        }
    }

    public k i(p pVar, i iVar) {
        t1.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.j(), pVar.b());
        long longValue = ((Long) W(new p(this, iVar, pVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, pVar, iVar);
    }

    public long j(p pVar) {
        return ((Long) G0(Q().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(a2.a.a(pVar.d()))}), u.f13137a)).longValue();
    }

    public Iterable<p> s() {
        return (Iterable) W(z.f13145a);
    }

    public Iterable<k> v(p pVar) {
        return (Iterable) W(new q(this, pVar));
    }

    public boolean x(p pVar) {
        return ((Boolean) W(new r(this, pVar))).booleanValue();
    }
}
