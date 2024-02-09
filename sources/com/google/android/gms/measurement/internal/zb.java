package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.ee;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.kd;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.p4;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.w4;
import com.google.android.gms.measurement.internal.p7;
import h2.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l2.d;
import n2.c;

public class zb implements n7 {
    private static volatile zb H;
    private long A;
    private final Map<String, p7> B;
    private final Map<String, z> C;
    private final Map<String, b> D;
    private r9 E;
    private String F;
    private final qc G;

    /* renamed from: a  reason: collision with root package name */
    private w5 f6781a;

    /* renamed from: b  reason: collision with root package name */
    private e5 f6782b;

    /* renamed from: c  reason: collision with root package name */
    private p f6783c;

    /* renamed from: d  reason: collision with root package name */
    private i5 f6784d;

    /* renamed from: e  reason: collision with root package name */
    private tb f6785e;

    /* renamed from: f  reason: collision with root package name */
    private xc f6786f;

    /* renamed from: g  reason: collision with root package name */
    private final jc f6787g;

    /* renamed from: h  reason: collision with root package name */
    private p9 f6788h;

    /* renamed from: i  reason: collision with root package name */
    private bb f6789i;

    /* renamed from: j  reason: collision with root package name */
    private final xb f6790j;

    /* renamed from: k  reason: collision with root package name */
    private t5 f6791k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final m6 f6792l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6793m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6794n;

    /* renamed from: o  reason: collision with root package name */
    private long f6795o;

    /* renamed from: p  reason: collision with root package name */
    private List<Runnable> f6796p;

    /* renamed from: q  reason: collision with root package name */
    private final Set<String> f6797q;

    /* renamed from: r  reason: collision with root package name */
    private int f6798r;

    /* renamed from: s  reason: collision with root package name */
    private int f6799s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6800t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6801u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6802v;

    /* renamed from: w  reason: collision with root package name */
    private FileLock f6803w;

    /* renamed from: x  reason: collision with root package name */
    private FileChannel f6804x;

    /* renamed from: y  reason: collision with root package name */
    private List<Long> f6805y;

    /* renamed from: z  reason: collision with root package name */
    private List<Long> f6806z;

    private class a implements t {

        /* renamed from: a  reason: collision with root package name */
        s4 f6807a;

        /* renamed from: b  reason: collision with root package name */
        List<Long> f6808b;

        /* renamed from: c  reason: collision with root package name */
        List<n4> f6809c;

        /* renamed from: d  reason: collision with root package name */
        private long f6810d;

        private a() {
        }

        private static long c(n4 n4Var) {
            return ((n4Var.b0() / 1000) / 60) / 60;
        }

        public final void a(s4 s4Var) {
            p.j(s4Var);
            this.f6807a = s4Var;
        }

        public final boolean b(long j10, n4 n4Var) {
            p.j(n4Var);
            if (this.f6809c == null) {
                this.f6809c = new ArrayList();
            }
            if (this.f6808b == null) {
                this.f6808b = new ArrayList();
            }
            if (!this.f6809c.isEmpty() && c(this.f6809c.get(0)) != c(n4Var)) {
                return false;
            }
            long d10 = this.f6810d + ((long) n4Var.d());
            zb.this.b0();
            if (d10 >= ((long) Math.max(0, k0.f6195k.a(null).intValue()))) {
                return false;
            }
            this.f6810d = d10;
            this.f6809c.add(n4Var);
            this.f6808b.add(Long.valueOf(j10));
            int size = this.f6809c.size();
            zb.this.b0();
            return size < Math.max(1, k0.f6197l.a(null).intValue());
        }
    }

    private class b {

        /* renamed from: a  reason: collision with root package name */
        final String f6812a;

        /* renamed from: b  reason: collision with root package name */
        long f6813b;

        private b(zb zbVar) {
            this(zbVar, zbVar.m0().R0());
        }

        private b(zb zbVar, String str) {
            this.f6812a = str;
            this.f6813b = zbVar.a().b();
        }
    }

    private zb(lc lcVar) {
        this(lcVar, (m6) null);
    }

    private zb(lc lcVar, m6 m6Var) {
        this.f6793m = false;
        this.f6797q = new HashSet();
        this.G = new gc(this);
        p.j(lcVar);
        this.f6792l = m6.b(lcVar.f6285a, (f2) null, (Long) null);
        this.A = -1;
        this.f6790j = new xb(this);
        jc jcVar = new jc(this);
        jcVar.u();
        this.f6787g = jcVar;
        e5 e5Var = new e5(this);
        e5Var.u();
        this.f6782b = e5Var;
        w5 w5Var = new w5(this);
        w5Var.u();
        this.f6781a = w5Var;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        i().C(new cc(this, lcVar));
    }

    private final void E(String str, boolean z9) {
        h6 C0 = d0().C0(str);
        if (C0 != null) {
            C0.G(z9);
            if (C0.s()) {
                d0().U(C0);
            }
        }
    }

    private final void F(List<Long> list) {
        p.a(!list.isEmpty());
        if (this.f6805y != null) {
            k().F().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f6805y = new ArrayList(list);
        }
    }

    private final boolean I(int i10, FileChannel fileChannel) {
        i().m();
        if (fileChannel == null || !fileChannel.isOpen()) {
            k().F().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i10);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                k().F().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e10) {
            k().F().b("Failed to write to channel", e10);
            return false;
        }
    }

    private final boolean J(n4.a aVar, n4.a aVar2) {
        p.a("_e".equals(aVar.L()));
        l0();
        p4 D2 = jc.D((n4) ((p8) aVar.l()), "_sc");
        String str = null;
        String g02 = D2 == null ? null : D2.g0();
        l0();
        p4 D3 = jc.D((n4) ((p8) aVar2.l()), "_pc");
        if (D3 != null) {
            str = D3.g0();
        }
        if (str == null || !str.equals(g02)) {
            return false;
        }
        p.a("_e".equals(aVar.L()));
        l0();
        p4 D4 = jc.D((n4) ((p8) aVar.l()), "_et");
        if (D4 == null || !D4.k0() || D4.a0() <= 0) {
            return true;
        }
        long a02 = D4.a0();
        l0();
        p4 D5 = jc.D((n4) ((p8) aVar2.l()), "_et");
        if (D5 != null && D5.a0() > 0) {
            a02 += D5.a0();
        }
        l0();
        jc.Q(aVar2, "_et", Long.valueOf(a02));
        l0();
        jc.Q(aVar, "_fr", 1L);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021c, code lost:
        if (r4 != null) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0230 A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03a9 A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03ab A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03ae A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03af A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0587 A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0652 A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x06a4 A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0b1e A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0b31 A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0b34 A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0b56 A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0e95 A[SYNTHETIC, Splitter:B:514:0x0e95] */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x0ea9 A[SYNTHETIC, Splitter:B:521:0x0ea9] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0224 A[Catch:{ SQLiteException -> 0x0e72, all -> 0x0ead }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean K(java.lang.String r41, long r42) {
        /*
            r40 = this;
            r1 = r40
            java.lang.String r2 = "_ai"
            com.google.android.gms.measurement.internal.p r3 = r40.d0()
            r3.P0()
            com.google.android.gms.measurement.internal.zb$a r3 = new com.google.android.gms.measurement.internal.zb$a     // Catch:{ all -> 0x0ead }
            r4 = 0
            r3.<init>()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.p r5 = r40.d0()     // Catch:{ all -> 0x0ead }
            long r6 = r1.A     // Catch:{ all -> 0x0ead }
            h2.p.j(r3)     // Catch:{ all -> 0x0ead }
            r5.m()     // Catch:{ all -> 0x0ead }
            r5.t()     // Catch:{ all -> 0x0ead }
            r9 = -1
            r11 = 2
            r12 = 1
            r13 = 0
            android.database.sqlite.SQLiteDatabase r15 = r5.A()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            boolean r14 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            java.lang.String r16 = ""
            if (r14 == 0) goto L_0x0085
            int r14 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r14 == 0) goto L_0x0049
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r17 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0044 }
            r8[r13] = r17     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r17 = java.lang.String.valueOf(r42)     // Catch:{ SQLiteException -> 0x0044 }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0044 }
            goto L_0x0051
        L_0x0044:
            r0 = move-exception
            r6 = r0
            r8 = r4
            goto L_0x020b
        L_0x0049:
            java.lang.String[] r8 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            java.lang.String r17 = java.lang.String.valueOf(r42)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            r8[r13] = r17     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
        L_0x0051:
            if (r14 == 0) goto L_0x0055
            java.lang.String r16 = "rowid <= ? and "
        L_0x0055:
            r14 = r16
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            java.lang.String r11 = "select app_id, metadata_fingerprint from raw_events where "
            r4.<init>(r11)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            r4.append(r14)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            java.lang.String r11 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r11)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            android.database.Cursor r4 = r15.rawQuery(r4, r8)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            boolean r8 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01ff }
            if (r8 != 0) goto L_0x0079
        L_0x0074:
            r4.close()     // Catch:{ all -> 0x0ead }
            goto L_0x0220
        L_0x0079:
            java.lang.String r8 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x01ff }
            java.lang.String r11 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01fc }
            r4.close()     // Catch:{ SQLiteException -> 0x01fc }
            goto L_0x00c7
        L_0x0085:
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0096
            r8 = 2
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            r8 = 0
            r11[r13] = r8     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            r11[r12] = r8     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            goto L_0x009b
        L_0x0096:
            r8 = 0
            java.lang.String[] r11 = new java.lang.String[]{r8}     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
        L_0x009b:
            if (r4 == 0) goto L_0x009f
            java.lang.String r16 = " and rowid <= ?"
        L_0x009f:
            r4 = r16
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            java.lang.String r14 = "select metadata_fingerprint from raw_events where app_id = ?"
            r8.<init>(r14)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            r8.append(r4)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            java.lang.String r4 = " order by rowid limit 1;"
            r8.append(r4)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            java.lang.String r4 = r8.toString()     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            android.database.Cursor r4 = r15.rawQuery(r4, r11)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0202 }
            boolean r8 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01ff }
            if (r8 != 0) goto L_0x00bf
            goto L_0x0074
        L_0x00bf:
            java.lang.String r11 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x01ff }
            r4.close()     // Catch:{ SQLiteException -> 0x01ff }
            r8 = 0
        L_0x00c7:
            java.lang.String r16 = "raw_events_metadata"
            java.lang.String r14 = "metadata"
            java.lang.String[] r17 = new java.lang.String[]{r14}     // Catch:{ SQLiteException -> 0x01fc }
            java.lang.String r18 = "app_id = ? and metadata_fingerprint = ?"
            r14 = 2
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x01fc }
            r9[r13] = r8     // Catch:{ SQLiteException -> 0x01fc }
            r9[r12] = r11     // Catch:{ SQLiteException -> 0x01fc }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "2"
            r14 = r15
            r10 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r9
            android.database.Cursor r4 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x01fc }
            boolean r9 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01fc }
            if (r9 != 0) goto L_0x0107
            com.google.android.gms.measurement.internal.x4 r6 = r5.k()     // Catch:{ SQLiteException -> 0x01fc }
            com.google.android.gms.measurement.internal.z4 r6 = r6.F()     // Catch:{ SQLiteException -> 0x01fc }
            java.lang.String r7 = "Raw event metadata record is missing. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.x4.u(r8)     // Catch:{ SQLiteException -> 0x01fc }
            r6.b(r7, r9)     // Catch:{ SQLiteException -> 0x01fc }
            goto L_0x0074
        L_0x0107:
            byte[] r9 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x01fc }
            com.google.android.gms.internal.measurement.s4$a r14 = com.google.android.gms.internal.measurement.s4.D3()     // Catch:{ IOException -> 0x01e7 }
            com.google.android.gms.internal.measurement.ga r9 = com.google.android.gms.measurement.internal.jc.E(r14, r9)     // Catch:{ IOException -> 0x01e7 }
            com.google.android.gms.internal.measurement.s4$a r9 = (com.google.android.gms.internal.measurement.s4.a) r9     // Catch:{ IOException -> 0x01e7 }
            com.google.android.gms.internal.measurement.da r9 = r9.l()     // Catch:{ IOException -> 0x01e7 }
            com.google.android.gms.internal.measurement.p8 r9 = (com.google.android.gms.internal.measurement.p8) r9     // Catch:{ IOException -> 0x01e7 }
            com.google.android.gms.internal.measurement.s4 r9 = (com.google.android.gms.internal.measurement.s4) r9     // Catch:{ IOException -> 0x01e7 }
            boolean r14 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01fc }
            if (r14 == 0) goto L_0x0134
            com.google.android.gms.measurement.internal.x4 r14 = r5.k()     // Catch:{ SQLiteException -> 0x01fc }
            com.google.android.gms.measurement.internal.z4 r14 = r14.K()     // Catch:{ SQLiteException -> 0x01fc }
            java.lang.String r15 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.x4.u(r8)     // Catch:{ SQLiteException -> 0x01fc }
            r14.b(r15, r12)     // Catch:{ SQLiteException -> 0x01fc }
        L_0x0134:
            r4.close()     // Catch:{ SQLiteException -> 0x01fc }
            r3.a(r9)     // Catch:{ SQLiteException -> 0x01fc }
            r14 = -1
            int r9 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0156
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r12 = 3
            java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01fc }
            r14[r13] = r8     // Catch:{ SQLiteException -> 0x01fc }
            r12 = 1
            r14[r12] = r11     // Catch:{ SQLiteException -> 0x01fc }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x01fc }
            r7 = 2
            r14[r7] = r6     // Catch:{ SQLiteException -> 0x01fc }
            r17 = r9
            r18 = r14
            goto L_0x0164
        L_0x0156:
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ?"
            r7 = 2
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x01fc }
            r9[r13] = r8     // Catch:{ SQLiteException -> 0x01fc }
            r7 = 1
            r9[r7] = r11     // Catch:{ SQLiteException -> 0x01fc }
            r17 = r6
            r18 = r9
        L_0x0164:
            java.lang.String r15 = "raw_events"
            java.lang.String r6 = "rowid"
            java.lang.String r7 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r11 = "data"
            java.lang.String[] r16 = new java.lang.String[]{r6, r7, r9, r11}     // Catch:{ SQLiteException -> 0x01fc }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            r22 = 0
            r14 = r10
            android.database.Cursor r4 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x01fc }
            boolean r6 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01fc }
            if (r6 != 0) goto L_0x0198
            com.google.android.gms.measurement.internal.x4 r6 = r5.k()     // Catch:{ SQLiteException -> 0x01fc }
            com.google.android.gms.measurement.internal.z4 r6 = r6.K()     // Catch:{ SQLiteException -> 0x01fc }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.x4.u(r8)     // Catch:{ SQLiteException -> 0x01fc }
            r6.b(r7, r9)     // Catch:{ SQLiteException -> 0x01fc }
            goto L_0x0074
        L_0x0198:
            long r6 = r4.getLong(r13)     // Catch:{ SQLiteException -> 0x01fc }
            r9 = 3
            byte[] r10 = r4.getBlob(r9)     // Catch:{ SQLiteException -> 0x01fc }
            com.google.android.gms.internal.measurement.n4$a r9 = com.google.android.gms.internal.measurement.n4.c0()     // Catch:{ IOException -> 0x01cc }
            com.google.android.gms.internal.measurement.ga r9 = com.google.android.gms.measurement.internal.jc.E(r9, r10)     // Catch:{ IOException -> 0x01cc }
            com.google.android.gms.internal.measurement.n4$a r9 = (com.google.android.gms.internal.measurement.n4.a) r9     // Catch:{ IOException -> 0x01cc }
            r10 = 1
            java.lang.String r11 = r4.getString(r10)     // Catch:{ SQLiteException -> 0x01fc }
            com.google.android.gms.internal.measurement.n4$a r10 = r9.F(r11)     // Catch:{ SQLiteException -> 0x01fc }
            r11 = 2
            long r14 = r4.getLong(r11)     // Catch:{ SQLiteException -> 0x01fc }
            r10.H(r14)     // Catch:{ SQLiteException -> 0x01fc }
            com.google.android.gms.internal.measurement.da r9 = r9.l()     // Catch:{ SQLiteException -> 0x01fc }
            com.google.android.gms.internal.measurement.p8 r9 = (com.google.android.gms.internal.measurement.p8) r9     // Catch:{ SQLiteException -> 0x01fc }
            com.google.android.gms.internal.measurement.n4 r9 = (com.google.android.gms.internal.measurement.n4) r9     // Catch:{ SQLiteException -> 0x01fc }
            boolean r6 = r3.b(r6, r9)     // Catch:{ SQLiteException -> 0x01fc }
            if (r6 != 0) goto L_0x01df
            goto L_0x0074
        L_0x01cc:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.x4 r7 = r5.k()     // Catch:{ SQLiteException -> 0x01fc }
            com.google.android.gms.measurement.internal.z4 r7 = r7.F()     // Catch:{ SQLiteException -> 0x01fc }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.x4.u(r8)     // Catch:{ SQLiteException -> 0x01fc }
            r7.c(r9, r10, r6)     // Catch:{ SQLiteException -> 0x01fc }
        L_0x01df:
            boolean r6 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01fc }
            if (r6 != 0) goto L_0x0198
            goto L_0x0074
        L_0x01e7:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.x4 r7 = r5.k()     // Catch:{ SQLiteException -> 0x01fc }
            com.google.android.gms.measurement.internal.z4 r7 = r7.F()     // Catch:{ SQLiteException -> 0x01fc }
            java.lang.String r9 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.x4.u(r8)     // Catch:{ SQLiteException -> 0x01fc }
            r7.c(r9, r10, r6)     // Catch:{ SQLiteException -> 0x01fc }
            goto L_0x0074
        L_0x01fc:
            r0 = move-exception
            r6 = r0
            goto L_0x020b
        L_0x01ff:
            r0 = move-exception
            r6 = r0
            goto L_0x020a
        L_0x0202:
            r0 = move-exception
            r1 = r0
            r4 = 0
            goto L_0x0ea7
        L_0x0207:
            r0 = move-exception
            r6 = r0
            r4 = 0
        L_0x020a:
            r8 = 0
        L_0x020b:
            com.google.android.gms.measurement.internal.x4 r5 = r5.k()     // Catch:{ all -> 0x0ea5 }
            com.google.android.gms.measurement.internal.z4 r5 = r5.F()     // Catch:{ all -> 0x0ea5 }
            java.lang.String r7 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.x4.u(r8)     // Catch:{ all -> 0x0ea5 }
            r5.c(r7, r8, r6)     // Catch:{ all -> 0x0ea5 }
            if (r4 == 0) goto L_0x0220
            goto L_0x0074
        L_0x0220:
            java.util.List<com.google.android.gms.internal.measurement.n4> r4 = r3.f6809c     // Catch:{ all -> 0x0ead }
            if (r4 == 0) goto L_0x022d
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0ead }
            if (r4 == 0) goto L_0x022b
            goto L_0x022d
        L_0x022b:
            r4 = 0
            goto L_0x022e
        L_0x022d:
            r4 = 1
        L_0x022e:
            if (r4 != 0) goto L_0x0e95
            com.google.android.gms.internal.measurement.s4 r4 = r3.f6807a     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8$b r4 = r4.B()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4$a r4 = (com.google.android.gms.internal.measurement.s4.a) r4     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4$a r4 = r4.u0()     // Catch:{ all -> 0x0ead }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
        L_0x0243:
            java.util.List<com.google.android.gms.internal.measurement.n4> r14 = r3.f6809c     // Catch:{ all -> 0x0ead }
            int r14 = r14.size()     // Catch:{ all -> 0x0ead }
            java.lang.String r15 = "_fr"
            java.lang.String r13 = "_et"
            java.lang.String r5 = "_e"
            r17 = r9
            java.lang.String r9 = "_c"
            r43 = r10
            r18 = r11
            if (r8 >= r14) goto L_0x071f
            java.util.List<com.google.android.gms.internal.measurement.n4> r14 = r3.f6809c     // Catch:{ all -> 0x0ead }
            java.lang.Object r14 = r14.get(r8)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r14 = (com.google.android.gms.internal.measurement.n4) r14     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8$b r14 = r14.B()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4$a r14 = (com.google.android.gms.internal.measurement.n4.a) r14     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.w5 r10 = r40.g0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r11 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = r11.G3()     // Catch:{ all -> 0x0ead }
            r21 = r8
            java.lang.String r8 = r14.L()     // Catch:{ all -> 0x0ead }
            boolean r8 = r10.N(r11, r8)     // Catch:{ all -> 0x0ead }
            java.lang.String r10 = "_err"
            if (r8 == 0) goto L_0x02fe
            com.google.android.gms.measurement.internal.x4 r5 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r5 = r5.K()     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.s4 r9 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r9 = r9.G3()     // Catch:{ all -> 0x0ead }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.x4.u(r9)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.m6 r11 = r1.f6792l     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.w4 r11 = r11.C()     // Catch:{ all -> 0x0ead }
            java.lang.String r13 = r14.L()     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = r11.c(r13)     // Catch:{ all -> 0x0ead }
            r5.c(r8, r9, r11)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.w5 r5 = r40.g0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r8 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = r8.G3()     // Catch:{ all -> 0x0ead }
            boolean r5 = r5.W(r8)     // Catch:{ all -> 0x0ead }
            if (r5 != 0) goto L_0x02c7
            com.google.android.gms.measurement.internal.w5 r5 = r40.g0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r8 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = r8.G3()     // Catch:{ all -> 0x0ead }
            boolean r5 = r5.Y(r8)     // Catch:{ all -> 0x0ead }
            if (r5 == 0) goto L_0x02c5
            goto L_0x02c7
        L_0x02c5:
            r5 = 0
            goto L_0x02c8
        L_0x02c7:
            r5 = 1
        L_0x02c8:
            if (r5 != 0) goto L_0x02ee
            java.lang.String r5 = r14.L()     // Catch:{ all -> 0x0ead }
            boolean r5 = r10.equals(r5)     // Catch:{ all -> 0x0ead }
            if (r5 != 0) goto L_0x02ee
            r40.m0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.qc r5 = r1.G     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r8 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r24 = r8.G3()     // Catch:{ all -> 0x0ead }
            r25 = 11
            java.lang.String r26 = "_ev"
            java.lang.String r27 = r14.L()     // Catch:{ all -> 0x0ead }
            r28 = 0
            r23 = r5
            com.google.android.gms.measurement.internal.oc.X(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0ead }
        L_0x02ee:
            r23 = r2
            r8 = r7
            r9 = r17
            r11 = r18
            r13 = r21
            r10 = 3
            r2 = r43
            r7 = r4
            r4 = -1
            goto L_0x0714
        L_0x02fe:
            java.lang.String r8 = r14.L()     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = com.google.android.gms.measurement.internal.q7.a(r2)     // Catch:{ all -> 0x0ead }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0ead }
            if (r8 == 0) goto L_0x0370
            r14.F(r2)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.x4 r8 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r8 = r8.J()     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = "Renaming ad_impression to _ai"
            r8.a(r11)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.x4 r8 = r40.k()     // Catch:{ all -> 0x0ead }
            r11 = 5
            boolean r8 = r8.B(r11)     // Catch:{ all -> 0x0ead }
            if (r8 == 0) goto L_0x0370
            r8 = 0
        L_0x0328:
            int r11 = r14.x()     // Catch:{ all -> 0x0ead }
            if (r8 >= r11) goto L_0x0370
            java.lang.String r11 = "ad_platform"
            com.google.android.gms.internal.measurement.p4 r22 = r14.I(r8)     // Catch:{ all -> 0x0ead }
            r23 = r2
            java.lang.String r2 = r22.f0()     // Catch:{ all -> 0x0ead }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x036b
            com.google.android.gms.internal.measurement.p4 r2 = r14.I(r8)     // Catch:{ all -> 0x0ead }
            java.lang.String r2 = r2.g0()     // Catch:{ all -> 0x0ead }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0ead }
            if (r2 != 0) goto L_0x036b
            java.lang.String r2 = "admob"
            com.google.android.gms.internal.measurement.p4 r11 = r14.I(r8)     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = r11.g0()     // Catch:{ all -> 0x0ead }
            boolean r2 = r2.equalsIgnoreCase(r11)     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x036b
            com.google.android.gms.measurement.internal.x4 r2 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r2 = r2.L()     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = "AdMob ad impression logged from app. Potentially duplicative."
            r2.a(r11)     // Catch:{ all -> 0x0ead }
        L_0x036b:
            int r8 = r8 + 1
            r2 = r23
            goto L_0x0328
        L_0x0370:
            r23 = r2
            com.google.android.gms.measurement.internal.w5 r2 = r40.g0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r8 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = r8.G3()     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = r14.L()     // Catch:{ all -> 0x0ead }
            boolean r2 = r2.L(r8, r11)     // Catch:{ all -> 0x0ead }
            if (r2 != 0) goto L_0x03b8
            r40.l0()     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = r14.L()     // Catch:{ all -> 0x0ead }
            h2.p.f(r8)     // Catch:{ all -> 0x0ead }
            int r11 = r8.hashCode()     // Catch:{ all -> 0x0ead }
            r22 = r6
            r6 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r6) goto L_0x039c
            goto L_0x03a6
        L_0x039c:
            java.lang.String r6 = "_ui"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x0ead }
            if (r6 == 0) goto L_0x03a6
            r6 = 0
            goto L_0x03a7
        L_0x03a6:
            r6 = -1
        L_0x03a7:
            if (r6 == 0) goto L_0x03ab
            r6 = 0
            goto L_0x03ac
        L_0x03ab:
            r6 = 1
        L_0x03ac:
            if (r6 == 0) goto L_0x03af
            goto L_0x03ba
        L_0x03af:
            r25 = r4
            r8 = r7
            r26 = r12
            r24 = r13
            goto L_0x0585
        L_0x03b8:
            r22 = r6
        L_0x03ba:
            r24 = r13
            r6 = 0
            r8 = 0
            r11 = 0
        L_0x03bf:
            int r13 = r14.x()     // Catch:{ all -> 0x0ead }
            r25 = r4
            java.lang.String r4 = "_r"
            if (r6 >= r13) goto L_0x0429
            com.google.android.gms.internal.measurement.p4 r13 = r14.I(r6)     // Catch:{ all -> 0x0ead }
            java.lang.String r13 = r13.f0()     // Catch:{ all -> 0x0ead }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0ead }
            if (r13 == 0) goto L_0x03f6
            com.google.android.gms.internal.measurement.p4 r4 = r14.I(r6)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8$b r4 = r4.B()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4$a r4 = (com.google.android.gms.internal.measurement.p4.a) r4     // Catch:{ all -> 0x0ead }
            r26 = r12
            r12 = 1
            com.google.android.gms.internal.measurement.p4$a r4 = r4.z(r12)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r4 = r4.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r4 = (com.google.android.gms.internal.measurement.p8) r4     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r4 = (com.google.android.gms.internal.measurement.p4) r4     // Catch:{ all -> 0x0ead }
            r14.A(r6, r4)     // Catch:{ all -> 0x0ead }
            r8 = 1
            goto L_0x0422
        L_0x03f6:
            r26 = r12
            com.google.android.gms.internal.measurement.p4 r12 = r14.I(r6)     // Catch:{ all -> 0x0ead }
            java.lang.String r12 = r12.f0()     // Catch:{ all -> 0x0ead }
            boolean r4 = r4.equals(r12)     // Catch:{ all -> 0x0ead }
            if (r4 == 0) goto L_0x0422
            com.google.android.gms.internal.measurement.p4 r4 = r14.I(r6)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8$b r4 = r4.B()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4$a r4 = (com.google.android.gms.internal.measurement.p4.a) r4     // Catch:{ all -> 0x0ead }
            r11 = 1
            com.google.android.gms.internal.measurement.p4$a r4 = r4.z(r11)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r4 = r4.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r4 = (com.google.android.gms.internal.measurement.p8) r4     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r4 = (com.google.android.gms.internal.measurement.p4) r4     // Catch:{ all -> 0x0ead }
            r14.A(r6, r4)     // Catch:{ all -> 0x0ead }
            r11 = 1
        L_0x0422:
            int r6 = r6 + 1
            r4 = r25
            r12 = r26
            goto L_0x03bf
        L_0x0429:
            r26 = r12
            if (r8 != 0) goto L_0x045b
            if (r2 == 0) goto L_0x045b
            com.google.android.gms.measurement.internal.x4 r6 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r6 = r6.J()     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.m6 r12 = r1.f6792l     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.w4 r12 = r12.C()     // Catch:{ all -> 0x0ead }
            java.lang.String r13 = r14.L()     // Catch:{ all -> 0x0ead }
            java.lang.String r12 = r12.c(r13)     // Catch:{ all -> 0x0ead }
            r6.b(r8, r12)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4$a r6 = com.google.android.gms.internal.measurement.p4.c0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4$a r6 = r6.C(r9)     // Catch:{ all -> 0x0ead }
            r12 = 1
            com.google.android.gms.internal.measurement.p4$a r6 = r6.z(r12)     // Catch:{ all -> 0x0ead }
            r14.C(r6)     // Catch:{ all -> 0x0ead }
        L_0x045b:
            if (r11 != 0) goto L_0x0489
            com.google.android.gms.measurement.internal.x4 r6 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r6 = r6.J()     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.m6 r11 = r1.f6792l     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.w4 r11 = r11.C()     // Catch:{ all -> 0x0ead }
            java.lang.String r12 = r14.L()     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = r11.c(r12)     // Catch:{ all -> 0x0ead }
            r6.b(r8, r11)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4$a r6 = com.google.android.gms.internal.measurement.p4.c0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4$a r6 = r6.C(r4)     // Catch:{ all -> 0x0ead }
            r11 = 1
            com.google.android.gms.internal.measurement.p4$a r6 = r6.z(r11)     // Catch:{ all -> 0x0ead }
            r14.C(r6)     // Catch:{ all -> 0x0ead }
        L_0x0489:
            com.google.android.gms.measurement.internal.p r27 = r40.d0()     // Catch:{ all -> 0x0ead }
            long r28 = r40.t0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r6 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r30 = r6.G3()     // Catch:{ all -> 0x0ead }
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 1
            com.google.android.gms.measurement.internal.q r6 = r27.I(r28, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0ead }
            long r11 = r6.f6453e     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.g r6 = r40.b0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r8 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = r8.G3()     // Catch:{ all -> 0x0ead }
            int r6 = r6.z(r8)     // Catch:{ all -> 0x0ead }
            r8 = r7
            long r6 = (long) r6     // Catch:{ all -> 0x0ead }
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x04bf
            o(r14, r4)     // Catch:{ all -> 0x0ead }
            goto L_0x04c1
        L_0x04bf:
            r17 = 1
        L_0x04c1:
            java.lang.String r4 = r14.L()     // Catch:{ all -> 0x0ead }
            boolean r4 = com.google.android.gms.measurement.internal.oc.I0(r4)     // Catch:{ all -> 0x0ead }
            if (r4 == 0) goto L_0x0585
            if (r2 == 0) goto L_0x0585
            com.google.android.gms.measurement.internal.p r27 = r40.d0()     // Catch:{ all -> 0x0ead }
            long r28 = r40.t0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r4 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r30 = r4.G3()     // Catch:{ all -> 0x0ead }
            r31 = 0
            r32 = 0
            r33 = 1
            r34 = 0
            r35 = 0
            com.google.android.gms.measurement.internal.q r4 = r27.I(r28, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0ead }
            long r6 = r4.f6451c     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.g r4 = r40.b0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r11 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = r11.G3()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.o4<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.k0.f6205p     // Catch:{ all -> 0x0ead }
            int r4 = r4.t(r11, r12)     // Catch:{ all -> 0x0ead }
            long r11 = (long) r4     // Catch:{ all -> 0x0ead }
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0585
            com.google.android.gms.measurement.internal.x4 r4 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r4 = r4.K()     // Catch:{ all -> 0x0ead }
            java.lang.String r6 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.s4 r7 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r7 = r7.G3()     // Catch:{ all -> 0x0ead }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.x4.u(r7)     // Catch:{ all -> 0x0ead }
            r4.b(r6, r7)     // Catch:{ all -> 0x0ead }
            r4 = -1
            r6 = 0
            r7 = 0
            r11 = 0
        L_0x051b:
            int r12 = r14.x()     // Catch:{ all -> 0x0ead }
            if (r6 >= r12) goto L_0x0546
            com.google.android.gms.internal.measurement.p4 r12 = r14.I(r6)     // Catch:{ all -> 0x0ead }
            java.lang.String r13 = r12.f0()     // Catch:{ all -> 0x0ead }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0ead }
            if (r13 == 0) goto L_0x0538
            com.google.android.gms.internal.measurement.p8$b r4 = r12.B()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4$a r4 = (com.google.android.gms.internal.measurement.p4.a) r4     // Catch:{ all -> 0x0ead }
            r7 = r4
            r4 = r6
            goto L_0x0543
        L_0x0538:
            java.lang.String r12 = r12.f0()     // Catch:{ all -> 0x0ead }
            boolean r12 = r10.equals(r12)     // Catch:{ all -> 0x0ead }
            if (r12 == 0) goto L_0x0543
            r11 = 1
        L_0x0543:
            int r6 = r6 + 1
            goto L_0x051b
        L_0x0546:
            if (r11 == 0) goto L_0x054e
            if (r7 == 0) goto L_0x054e
            r14.y(r4)     // Catch:{ all -> 0x0ead }
            goto L_0x0585
        L_0x054e:
            if (r7 == 0) goto L_0x056e
            java.lang.Object r6 = r7.clone()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8$b r6 = (com.google.android.gms.internal.measurement.p8.b) r6     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4$a r6 = (com.google.android.gms.internal.measurement.p4.a) r6     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4$a r6 = r6.C(r10)     // Catch:{ all -> 0x0ead }
            r10 = 10
            com.google.android.gms.internal.measurement.p4$a r6 = r6.z(r10)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r6 = r6.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r6 = (com.google.android.gms.internal.measurement.p8) r6     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r6 = (com.google.android.gms.internal.measurement.p4) r6     // Catch:{ all -> 0x0ead }
            r14.A(r4, r6)     // Catch:{ all -> 0x0ead }
            goto L_0x0585
        L_0x056e:
            com.google.android.gms.measurement.internal.x4 r4 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r4 = r4.F()     // Catch:{ all -> 0x0ead }
            java.lang.String r6 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.s4 r7 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r7 = r7.G3()     // Catch:{ all -> 0x0ead }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.x4.u(r7)     // Catch:{ all -> 0x0ead }
            r4.b(r6, r7)     // Catch:{ all -> 0x0ead }
        L_0x0585:
            if (r2 == 0) goto L_0x0644
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0ead }
            java.util.List r4 = r14.M()     // Catch:{ all -> 0x0ead }
            r2.<init>(r4)     // Catch:{ all -> 0x0ead }
            r4 = 0
            r6 = -1
            r7 = -1
        L_0x0593:
            int r10 = r2.size()     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = "currency"
            java.lang.String r12 = "value"
            if (r4 >= r10) goto L_0x05c3
            java.lang.Object r10 = r2.get(r4)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r10 = (com.google.android.gms.internal.measurement.p4) r10     // Catch:{ all -> 0x0ead }
            java.lang.String r10 = r10.f0()     // Catch:{ all -> 0x0ead }
            boolean r10 = r12.equals(r10)     // Catch:{ all -> 0x0ead }
            if (r10 == 0) goto L_0x05af
            r6 = r4
            goto L_0x05c0
        L_0x05af:
            java.lang.Object r10 = r2.get(r4)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r10 = (com.google.android.gms.internal.measurement.p4) r10     // Catch:{ all -> 0x0ead }
            java.lang.String r10 = r10.f0()     // Catch:{ all -> 0x0ead }
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x0ead }
            if (r10 == 0) goto L_0x05c0
            r7 = r4
        L_0x05c0:
            int r4 = r4 + 1
            goto L_0x0593
        L_0x05c3:
            r4 = -1
            if (r6 == r4) goto L_0x0645
            java.lang.Object r4 = r2.get(r6)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r4 = (com.google.android.gms.internal.measurement.p4) r4     // Catch:{ all -> 0x0ead }
            boolean r4 = r4.k0()     // Catch:{ all -> 0x0ead }
            if (r4 != 0) goto L_0x05f7
            java.lang.Object r4 = r2.get(r6)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r4 = (com.google.android.gms.internal.measurement.p4) r4     // Catch:{ all -> 0x0ead }
            boolean r4 = r4.i0()     // Catch:{ all -> 0x0ead }
            if (r4 != 0) goto L_0x05f7
            com.google.android.gms.measurement.internal.x4 r2 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r2 = r2.L()     // Catch:{ all -> 0x0ead }
            java.lang.String r4 = "Value must be specified with a numeric type."
            r2.a(r4)     // Catch:{ all -> 0x0ead }
            r14.y(r6)     // Catch:{ all -> 0x0ead }
            o(r14, r9)     // Catch:{ all -> 0x0ead }
            r2 = 18
            n(r14, r2, r12)     // Catch:{ all -> 0x0ead }
            goto L_0x0644
        L_0x05f7:
            r4 = -1
            if (r7 != r4) goto L_0x05fd
            r2 = 1
            r10 = 3
            goto L_0x0629
        L_0x05fd:
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r2 = (com.google.android.gms.internal.measurement.p4) r2     // Catch:{ all -> 0x0ead }
            java.lang.String r2 = r2.g0()     // Catch:{ all -> 0x0ead }
            int r7 = r2.length()     // Catch:{ all -> 0x0ead }
            r10 = 3
            if (r7 == r10) goto L_0x0610
        L_0x060e:
            r2 = 1
            goto L_0x0629
        L_0x0610:
            r7 = 0
        L_0x0611:
            int r12 = r2.length()     // Catch:{ all -> 0x0ead }
            if (r7 >= r12) goto L_0x0628
            int r12 = r2.codePointAt(r7)     // Catch:{ all -> 0x0ead }
            boolean r13 = java.lang.Character.isLetter(r12)     // Catch:{ all -> 0x0ead }
            if (r13 != 0) goto L_0x0622
            goto L_0x060e
        L_0x0622:
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0ead }
            int r7 = r7 + r12
            goto L_0x0611
        L_0x0628:
            r2 = 0
        L_0x0629:
            if (r2 == 0) goto L_0x0646
            com.google.android.gms.measurement.internal.x4 r2 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r2 = r2.L()     // Catch:{ all -> 0x0ead }
            java.lang.String r7 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r7)     // Catch:{ all -> 0x0ead }
            r14.y(r6)     // Catch:{ all -> 0x0ead }
            o(r14, r9)     // Catch:{ all -> 0x0ead }
            r2 = 19
            n(r14, r2, r11)     // Catch:{ all -> 0x0ead }
            goto L_0x0646
        L_0x0644:
            r4 = -1
        L_0x0645:
            r10 = 3
        L_0x0646:
            java.lang.String r2 = r14.L()     // Catch:{ all -> 0x0ead }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0ead }
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x06a4
            r40.l0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r2 = r14.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r2 = (com.google.android.gms.internal.measurement.p8) r2     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r2 = (com.google.android.gms.internal.measurement.n4) r2     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r2 = com.google.android.gms.measurement.internal.jc.D(r2, r15)     // Catch:{ all -> 0x0ead }
            if (r2 != 0) goto L_0x069f
            if (r8 == 0) goto L_0x0694
            long r11 = r8.J()     // Catch:{ all -> 0x0ead }
            long r19 = r14.J()     // Catch:{ all -> 0x0ead }
            long r11 = r11 - r19
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0ead }
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0694
            java.lang.Object r2 = r8.clone()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8$b r2 = (com.google.android.gms.internal.measurement.p8.b) r2     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4$a r2 = (com.google.android.gms.internal.measurement.n4.a) r2     // Catch:{ all -> 0x0ead }
            boolean r5 = r1.J(r14, r2)     // Catch:{ all -> 0x0ead }
            if (r5 == 0) goto L_0x0694
            r7 = r25
            r9 = r26
            r7.z(r9, r2)     // Catch:{ all -> 0x0ead }
            r12 = r9
            r11 = r18
        L_0x068f:
            r8 = 0
            r22 = 0
            goto L_0x06fc
        L_0x0694:
            r7 = r25
            r9 = r26
            r11 = r43
            r12 = r9
            r22 = r14
            goto L_0x06fc
        L_0x069f:
            r7 = r25
            r9 = r26
            goto L_0x06f8
        L_0x06a4:
            r7 = r25
            r9 = r26
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r14.L()     // Catch:{ all -> 0x0ead }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x06f8
            r40.l0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r2 = r14.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r2 = (com.google.android.gms.internal.measurement.p8) r2     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r2 = (com.google.android.gms.internal.measurement.n4) r2     // Catch:{ all -> 0x0ead }
            r11 = r24
            com.google.android.gms.internal.measurement.p4 r2 = com.google.android.gms.measurement.internal.jc.D(r2, r11)     // Catch:{ all -> 0x0ead }
            if (r2 != 0) goto L_0x06f8
            if (r22 == 0) goto L_0x06f1
            long r11 = r22.J()     // Catch:{ all -> 0x0ead }
            long r19 = r14.J()     // Catch:{ all -> 0x0ead }
            long r11 = r11 - r19
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0ead }
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x06f1
            java.lang.Object r2 = r22.clone()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8$b r2 = (com.google.android.gms.internal.measurement.p8.b) r2     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4$a r2 = (com.google.android.gms.internal.measurement.n4.a) r2     // Catch:{ all -> 0x0ead }
            boolean r5 = r1.J(r2, r14)     // Catch:{ all -> 0x0ead }
            if (r5 == 0) goto L_0x06f1
            r5 = r18
            r7.z(r5, r2)     // Catch:{ all -> 0x0ead }
            r11 = r5
            r12 = r9
            goto L_0x068f
        L_0x06f1:
            r5 = r18
            r12 = r43
            r11 = r5
            r8 = r14
            goto L_0x06fc
        L_0x06f8:
            r5 = r18
            r11 = r5
            r12 = r9
        L_0x06fc:
            java.util.List<com.google.android.gms.internal.measurement.n4> r2 = r3.f6809c     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r5 = r14.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r5 = (com.google.android.gms.internal.measurement.p8) r5     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r5 = (com.google.android.gms.internal.measurement.n4) r5     // Catch:{ all -> 0x0ead }
            r13 = r21
            r2.set(r13, r5)     // Catch:{ all -> 0x0ead }
            int r2 = r43 + 1
            r7.E(r14)     // Catch:{ all -> 0x0ead }
            r9 = r17
            r6 = r22
        L_0x0714:
            int r5 = r13 + 1
            r10 = r2
            r4 = r7
            r7 = r8
            r2 = r23
            r13 = 0
            r8 = r5
            goto L_0x0243
        L_0x071f:
            r7 = r4
            r11 = r13
            r12 = 0
            r10 = r43
            r36 = r12
            r2 = 0
        L_0x0728:
            if (r2 >= r10) goto L_0x077e
            com.google.android.gms.internal.measurement.n4 r4 = r7.y(r2)     // Catch:{ all -> 0x0ead }
            java.lang.String r6 = r4.e0()     // Catch:{ all -> 0x0ead }
            boolean r6 = r5.equals(r6)     // Catch:{ all -> 0x0ead }
            if (r6 == 0) goto L_0x0749
            r40.l0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r6 = com.google.android.gms.measurement.internal.jc.D(r4, r15)     // Catch:{ all -> 0x0ead }
            if (r6 == 0) goto L_0x0749
            r7.M(r2)     // Catch:{ all -> 0x0ead }
            int r10 = r10 + -1
            int r2 = r2 + -1
            goto L_0x0779
        L_0x0749:
            r40.l0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r4 = com.google.android.gms.measurement.internal.jc.D(r4, r11)     // Catch:{ all -> 0x0ead }
            if (r4 == 0) goto L_0x0775
            boolean r6 = r4.k0()     // Catch:{ all -> 0x0ead }
            if (r6 == 0) goto L_0x0761
            long r21 = r4.a0()     // Catch:{ all -> 0x0ead }
            java.lang.Long r4 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0ead }
            goto L_0x0762
        L_0x0761:
            r4 = 0
        L_0x0762:
            if (r4 == 0) goto L_0x0775
            long r21 = r4.longValue()     // Catch:{ all -> 0x0ead }
            int r6 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x0775
            long r21 = r4.longValue()     // Catch:{ all -> 0x0ead }
            r12 = r36
            long r36 = r12 + r21
            goto L_0x0779
        L_0x0775:
            r12 = r36
            r36 = r12
        L_0x0779:
            r4 = 1
            int r2 = r2 + r4
            r12 = 0
            goto L_0x0728
        L_0x077e:
            r12 = r36
            r2 = 0
            r1.p(r7, r12, r2)     // Catch:{ all -> 0x0ead }
            java.util.List r2 = r7.Z0()     // Catch:{ all -> 0x0ead }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ead }
        L_0x078c:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0ead }
            if (r4 == 0) goto L_0x07a6
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r4 = (com.google.android.gms.internal.measurement.n4) r4     // Catch:{ all -> 0x0ead }
            java.lang.String r5 = "_s"
            java.lang.String r4 = r4.e0()     // Catch:{ all -> 0x0ead }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0ead }
            if (r4 == 0) goto L_0x078c
            r2 = 1
            goto L_0x07a7
        L_0x07a6:
            r2 = 0
        L_0x07a7:
            java.lang.String r4 = "_se"
            if (r2 == 0) goto L_0x07b6
            com.google.android.gms.measurement.internal.p r2 = r40.d0()     // Catch:{ all -> 0x0ead }
            java.lang.String r5 = r7.T0()     // Catch:{ all -> 0x0ead }
            r2.K0(r5, r4)     // Catch:{ all -> 0x0ead }
        L_0x07b6:
            java.lang.String r2 = "_sid"
            int r2 = com.google.android.gms.measurement.internal.jc.x(r7, r2)     // Catch:{ all -> 0x0ead }
            if (r2 < 0) goto L_0x07c0
            r2 = 1
            goto L_0x07c1
        L_0x07c0:
            r2 = 0
        L_0x07c1:
            if (r2 == 0) goto L_0x07c8
            r2 = 1
            r1.p(r7, r12, r2)     // Catch:{ all -> 0x0ead }
            goto L_0x07e8
        L_0x07c8:
            int r2 = com.google.android.gms.measurement.internal.jc.x(r7, r4)     // Catch:{ all -> 0x0ead }
            if (r2 < 0) goto L_0x07e8
            r7.S(r2)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.x4 r2 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r2 = r2.F()     // Catch:{ all -> 0x0ead }
            java.lang.String r4 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.s4 r5 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r5 = r5.G3()     // Catch:{ all -> 0x0ead }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.x4.u(r5)     // Catch:{ all -> 0x0ead }
            r2.b(r4, r5)     // Catch:{ all -> 0x0ead }
        L_0x07e8:
            com.google.android.gms.measurement.internal.jc r2 = r40.l0()     // Catch:{ all -> 0x0ead }
            r2.S(r7)     // Catch:{ all -> 0x0ead }
            boolean r2 = com.google.android.gms.internal.measurement.kd.a()     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x0836
            com.google.android.gms.measurement.internal.g r2 = r40.b0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.k0.T0     // Catch:{ all -> 0x0ead }
            boolean r2 = r2.r(r4)     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x0836
            com.google.android.gms.internal.measurement.s4 r2 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r2 = r2.G3()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.f6 r4 = r40.i()     // Catch:{ all -> 0x0ead }
            r4.m()     // Catch:{ all -> 0x0ead }
            r40.o0()     // Catch:{ all -> 0x0ead }
            boolean r4 = com.google.android.gms.internal.measurement.kd.a()     // Catch:{ all -> 0x0ead }
            if (r4 == 0) goto L_0x0836
            com.google.android.gms.measurement.internal.p r4 = r40.d0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.h6 r4 = r4.C0(r2)     // Catch:{ all -> 0x0ead }
            if (r4 != 0) goto L_0x0833
            com.google.android.gms.measurement.internal.x4 r4 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r4 = r4.F()     // Catch:{ all -> 0x0ead }
            java.lang.String r5 = "Cannot fix consent fields without appInfo. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.x4.u(r2)     // Catch:{ all -> 0x0ead }
            r4.b(r5, r2)     // Catch:{ all -> 0x0ead }
            goto L_0x0836
        L_0x0833:
            r1.u(r4, r7)     // Catch:{ all -> 0x0ead }
        L_0x0836:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.gms.internal.measurement.s4$a r2 = r7.w0(r4)     // Catch:{ all -> 0x0ead }
            r4 = -9223372036854775808
            r2.f0(r4)     // Catch:{ all -> 0x0ead }
            r2 = 0
        L_0x0845:
            int r4 = r7.x()     // Catch:{ all -> 0x0ead }
            if (r2 >= r4) goto L_0x0878
            com.google.android.gms.internal.measurement.n4 r4 = r7.y(r2)     // Catch:{ all -> 0x0ead }
            long r5 = r4.b0()     // Catch:{ all -> 0x0ead }
            long r10 = r7.X()     // Catch:{ all -> 0x0ead }
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0862
            long r5 = r4.b0()     // Catch:{ all -> 0x0ead }
            r7.w0(r5)     // Catch:{ all -> 0x0ead }
        L_0x0862:
            long r5 = r4.b0()     // Catch:{ all -> 0x0ead }
            long r10 = r7.R()     // Catch:{ all -> 0x0ead }
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0875
            long r4 = r4.b0()     // Catch:{ all -> 0x0ead }
            r7.f0(r4)     // Catch:{ all -> 0x0ead }
        L_0x0875:
            int r2 = r2 + 1
            goto L_0x0845
        L_0x0878:
            r7.Q0()     // Catch:{ all -> 0x0ead }
            boolean r2 = com.google.android.gms.internal.measurement.df.a()     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x09aa
            com.google.android.gms.measurement.internal.g r2 = r40.b0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r4 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r4 = r4.G3()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.k0.L0     // Catch:{ all -> 0x0ead }
            boolean r2 = r2.A(r4, r5)     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x09aa
            r40.m0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r2 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r2 = r2.G3()     // Catch:{ all -> 0x0ead }
            boolean r2 = com.google.android.gms.measurement.internal.oc.C0(r2)     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x09aa
            com.google.android.gms.internal.measurement.s4 r2 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r2 = r2.G3()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.p7 r2 = r1.P(r2)     // Catch:{ all -> 0x0ead }
            boolean r2 = r2.x()     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x09aa
            com.google.android.gms.internal.measurement.s4 r2 = r3.f6807a     // Catch:{ all -> 0x0ead }
            boolean r2 = r2.x0()     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x09aa
            r2 = 0
        L_0x08bb:
            java.util.List<com.google.android.gms.internal.measurement.n4> r4 = r3.f6809c     // Catch:{ all -> 0x0ead }
            int r4 = r4.size()     // Catch:{ all -> 0x0ead }
            if (r2 >= r4) goto L_0x09aa
            java.util.List<com.google.android.gms.internal.measurement.n4> r4 = r3.f6809c     // Catch:{ all -> 0x0ead }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r4 = (com.google.android.gms.internal.measurement.n4) r4     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8$b r4 = r4.B()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4$a r4 = (com.google.android.gms.internal.measurement.n4.a) r4     // Catch:{ all -> 0x0ead }
            java.util.List r5 = r4.M()     // Catch:{ all -> 0x0ead }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0ead }
        L_0x08d9:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0ead }
            if (r6 == 0) goto L_0x08f1
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r6 = (com.google.android.gms.internal.measurement.p4) r6     // Catch:{ all -> 0x0ead }
            java.lang.String r6 = r6.f0()     // Catch:{ all -> 0x0ead }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0ead }
            if (r6 == 0) goto L_0x08d9
            r5 = 1
            goto L_0x08f2
        L_0x08f1:
            r5 = 0
        L_0x08f2:
            if (r5 == 0) goto L_0x09a6
            com.google.android.gms.internal.measurement.s4 r5 = r3.f6807a     // Catch:{ all -> 0x0ead }
            int r5 = r5.q()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.g r6 = r40.b0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r8 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = r8.G3()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.o4<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.k0.X     // Catch:{ all -> 0x0ead }
            int r6 = r6.t(r8, r10)     // Catch:{ all -> 0x0ead }
            if (r5 < r6) goto L_0x099b
            com.google.android.gms.measurement.internal.g r5 = r40.b0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r6 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r6 = r6.G3()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.k0.N0     // Catch:{ all -> 0x0ead }
            boolean r5 = r5.A(r6, r8)     // Catch:{ all -> 0x0ead }
            if (r5 == 0) goto L_0x0940
            com.google.android.gms.measurement.internal.oc r5 = r40.m0()     // Catch:{ all -> 0x0ead }
            java.lang.String r5 = r5.R0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4$a r6 = com.google.android.gms.internal.measurement.p4.c0()     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = "_tu"
            com.google.android.gms.internal.measurement.p4$a r6 = r6.C(r8)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4$a r6 = r6.E(r5)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r6 = r6.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r6 = (com.google.android.gms.internal.measurement.p8) r6     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r6 = (com.google.android.gms.internal.measurement.p4) r6     // Catch:{ all -> 0x0ead }
            r4.D(r6)     // Catch:{ all -> 0x0ead }
            goto L_0x0941
        L_0x0940:
            r5 = 0
        L_0x0941:
            com.google.android.gms.internal.measurement.p4$a r6 = com.google.android.gms.internal.measurement.p4.c0()     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = "_tr"
            com.google.android.gms.internal.measurement.p4$a r6 = r6.C(r8)     // Catch:{ all -> 0x0ead }
            r10 = 1
            com.google.android.gms.internal.measurement.p4$a r6 = r6.z(r10)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r6 = r6.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r6 = (com.google.android.gms.internal.measurement.p8) r6     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r6 = (com.google.android.gms.internal.measurement.p4) r6     // Catch:{ all -> 0x0ead }
            r4.D(r6)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.jc r6 = r40.l0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r8 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = r8.G3()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r10 = r3.f6807a     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.rb r5 = r6.G(r8, r10, r4, r5)     // Catch:{ all -> 0x0ead }
            if (r5 == 0) goto L_0x099b
            com.google.android.gms.measurement.internal.x4 r6 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r6 = r6.J()     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = "Generated trigger URI. appId, uri"
            com.google.android.gms.internal.measurement.s4 r10 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r10 = r10.G3()     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = r5.f6528m     // Catch:{ all -> 0x0ead }
            r6.c(r8, r10, r11)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.p r6 = r40.d0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r8 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r8 = r8.G3()     // Catch:{ all -> 0x0ead }
            r6.h0(r8, r5)     // Catch:{ all -> 0x0ead }
            java.util.Set<java.lang.String> r5 = r1.f6797q     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r6 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r6 = r6.G3()     // Catch:{ all -> 0x0ead }
            r5.add(r6)     // Catch:{ all -> 0x0ead }
        L_0x099b:
            com.google.android.gms.internal.measurement.da r4 = r4.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r4 = (com.google.android.gms.internal.measurement.p8) r4     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r4 = (com.google.android.gms.internal.measurement.n4) r4     // Catch:{ all -> 0x0ead }
            r7.A(r2, r4)     // Catch:{ all -> 0x0ead }
        L_0x09a6:
            int r2 = r2 + 1
            goto L_0x08bb
        L_0x09aa:
            com.google.android.gms.internal.measurement.s4$a r2 = r7.i0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.xc r8 = r40.W()     // Catch:{ all -> 0x0ead }
            java.lang.String r9 = r7.T0()     // Catch:{ all -> 0x0ead }
            java.util.List r10 = r7.Z0()     // Catch:{ all -> 0x0ead }
            java.util.List r11 = r7.a1()     // Catch:{ all -> 0x0ead }
            long r4 = r7.X()     // Catch:{ all -> 0x0ead }
            java.lang.Long r12 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ead }
            long r4 = r7.R()     // Catch:{ all -> 0x0ead }
            java.lang.Long r13 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ead }
            java.util.List r4 = r8.y(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0ead }
            r2.I(r4)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.g r2 = r40.b0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r4 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r4 = r4.G3()     // Catch:{ all -> 0x0ead }
            boolean r2 = r2.K(r4)     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x0d11
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0ead }
            r2.<init>()     // Catch:{ all -> 0x0ead }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0ead }
            r4.<init>()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.oc r5 = r40.m0()     // Catch:{ all -> 0x0ead }
            java.security.SecureRandom r5 = r5.T0()     // Catch:{ all -> 0x0ead }
            r6 = 0
        L_0x09f8:
            int r8 = r7.x()     // Catch:{ all -> 0x0ead }
            if (r6 >= r8) goto L_0x0cd8
            com.google.android.gms.internal.measurement.n4 r8 = r7.y(r6)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8$b r8 = r8.B()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4$a r8 = (com.google.android.gms.internal.measurement.n4.a) r8     // Catch:{ all -> 0x0ead }
            java.lang.String r9 = r8.L()     // Catch:{ all -> 0x0ead }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0ead }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0a96
            r40.l0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r9 = r8.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r9 = (com.google.android.gms.internal.measurement.p8) r9     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r9 = (com.google.android.gms.internal.measurement.n4) r9     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = "_en"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.jc.d0(r9, r11)     // Catch:{ all -> 0x0ead }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0ead }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.e0 r11 = (com.google.android.gms.measurement.internal.e0) r11     // Catch:{ all -> 0x0ead }
            if (r11 != 0) goto L_0x0a4a
            com.google.android.gms.measurement.internal.p r11 = r40.d0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r12 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r12 = r12.G3()     // Catch:{ all -> 0x0ead }
            java.lang.Object r13 = h2.p.j(r9)     // Catch:{ all -> 0x0ead }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.e0 r11 = r11.B0(r12, r13)     // Catch:{ all -> 0x0ead }
            if (r11 == 0) goto L_0x0a4a
            r2.put(r9, r11)     // Catch:{ all -> 0x0ead }
        L_0x0a4a:
            if (r11 == 0) goto L_0x0a89
            java.lang.Long r9 = r11.f5988i     // Catch:{ all -> 0x0ead }
            if (r9 != 0) goto L_0x0a89
            java.lang.Long r9 = r11.f5989j     // Catch:{ all -> 0x0ead }
            if (r9 == 0) goto L_0x0a66
            long r12 = r9.longValue()     // Catch:{ all -> 0x0ead }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0a66
            r40.l0()     // Catch:{ all -> 0x0ead }
            java.lang.Long r9 = r11.f5989j     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.jc.Q(r8, r10, r9)     // Catch:{ all -> 0x0ead }
        L_0x0a66:
            java.lang.Boolean r9 = r11.f5990k     // Catch:{ all -> 0x0ead }
            if (r9 == 0) goto L_0x0a7e
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0ead }
            if (r9 == 0) goto L_0x0a7e
            r40.l0()     // Catch:{ all -> 0x0ead }
            java.lang.String r9 = "_efs"
            r10 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.jc.Q(r8, r9, r12)     // Catch:{ all -> 0x0ead }
        L_0x0a7e:
            com.google.android.gms.internal.measurement.da r9 = r8.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r9 = (com.google.android.gms.internal.measurement.p8) r9     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r9 = (com.google.android.gms.internal.measurement.n4) r9     // Catch:{ all -> 0x0ead }
            r4.add(r9)     // Catch:{ all -> 0x0ead }
        L_0x0a89:
            r7.z(r6, r8)     // Catch:{ all -> 0x0ead }
            r18 = r3
            r43 = r5
            r1 = r6
            r5 = 1
            r3 = r2
            goto L_0x0ccc
        L_0x0a96:
            com.google.android.gms.measurement.internal.w5 r9 = r40.g0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r11 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = r11.G3()     // Catch:{ all -> 0x0ead }
            long r11 = r9.x(r11)     // Catch:{ all -> 0x0ead }
            r40.m0()     // Catch:{ all -> 0x0ead }
            long r13 = r8.J()     // Catch:{ all -> 0x0ead }
            long r13 = com.google.android.gms.measurement.internal.oc.x(r13, r11)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r9 = r8.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r9 = (com.google.android.gms.internal.measurement.p8) r9     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r9 = (com.google.android.gms.internal.measurement.n4) r9     // Catch:{ all -> 0x0ead }
            java.lang.String r15 = "_dbg"
            r18 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0ead }
            boolean r18 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0ead }
            if (r18 != 0) goto L_0x0b1b
            if (r1 != 0) goto L_0x0ac8
            goto L_0x0b1b
        L_0x0ac8:
            java.util.List r9 = r9.f0()     // Catch:{ all -> 0x0ead }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0ead }
        L_0x0ad0:
            boolean r18 = r9.hasNext()     // Catch:{ all -> 0x0ead }
            if (r18 == 0) goto L_0x0b1b
            java.lang.Object r18 = r9.next()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p4 r18 = (com.google.android.gms.internal.measurement.p4) r18     // Catch:{ all -> 0x0ead }
            r43 = r9
            java.lang.String r9 = r18.f0()     // Catch:{ all -> 0x0ead }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x0ead }
            if (r9 == 0) goto L_0x0b18
            long r21 = r18.a0()     // Catch:{ all -> 0x0ead }
            java.lang.Long r9 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0ead }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x0ead }
            if (r9 != 0) goto L_0x0b16
            boolean r9 = r1 instanceof java.lang.String     // Catch:{ all -> 0x0ead }
            if (r9 == 0) goto L_0x0b04
            java.lang.String r9 = r18.g0()     // Catch:{ all -> 0x0ead }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x0ead }
            if (r9 != 0) goto L_0x0b16
        L_0x0b04:
            boolean r9 = r1 instanceof java.lang.Double     // Catch:{ all -> 0x0ead }
            if (r9 == 0) goto L_0x0b1b
            double r21 = r18.J()     // Catch:{ all -> 0x0ead }
            java.lang.Double r9 = java.lang.Double.valueOf(r21)     // Catch:{ all -> 0x0ead }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x0ead }
            if (r1 == 0) goto L_0x0b1b
        L_0x0b16:
            r1 = 1
            goto L_0x0b1c
        L_0x0b18:
            r9 = r43
            goto L_0x0ad0
        L_0x0b1b:
            r1 = 0
        L_0x0b1c:
            if (r1 != 0) goto L_0x0b31
            com.google.android.gms.measurement.internal.w5 r1 = r40.g0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r9 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r9 = r9.G3()     // Catch:{ all -> 0x0ead }
            java.lang.String r15 = r8.L()     // Catch:{ all -> 0x0ead }
            int r1 = r1.H(r9, r15)     // Catch:{ all -> 0x0ead }
            goto L_0x0b32
        L_0x0b31:
            r1 = 1
        L_0x0b32:
            if (r1 > 0) goto L_0x0b56
            com.google.android.gms.measurement.internal.x4 r9 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r9 = r9.K()     // Catch:{ all -> 0x0ead }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r8.L()     // Catch:{ all -> 0x0ead }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0ead }
            r9.c(r10, r11, r1)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r1 = r8.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r1 = (com.google.android.gms.internal.measurement.p8) r1     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r1 = (com.google.android.gms.internal.measurement.n4) r1     // Catch:{ all -> 0x0ead }
            r4.add(r1)     // Catch:{ all -> 0x0ead }
            goto L_0x0a89
        L_0x0b56:
            java.lang.String r9 = r8.L()     // Catch:{ all -> 0x0ead }
            java.lang.Object r9 = r2.get(r9)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.e0 r9 = (com.google.android.gms.measurement.internal.e0) r9     // Catch:{ all -> 0x0ead }
            if (r9 != 0) goto L_0x0bb5
            com.google.android.gms.measurement.internal.p r9 = r40.d0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r15 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r15 = r15.G3()     // Catch:{ all -> 0x0ead }
            r21 = r11
            java.lang.String r11 = r8.L()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.e0 r9 = r9.B0(r15, r11)     // Catch:{ all -> 0x0ead }
            if (r9 != 0) goto L_0x0bb7
            com.google.android.gms.measurement.internal.x4 r9 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r9 = r9.K()     // Catch:{ all -> 0x0ead }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.s4 r12 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r12 = r12.G3()     // Catch:{ all -> 0x0ead }
            java.lang.String r15 = r8.L()     // Catch:{ all -> 0x0ead }
            r9.c(r11, r12, r15)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.e0 r9 = new com.google.android.gms.measurement.internal.e0     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r11 = r3.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r24 = r11.G3()     // Catch:{ all -> 0x0ead }
            java.lang.String r25 = r8.L()     // Catch:{ all -> 0x0ead }
            r26 = 1
            r28 = 1
            r30 = 1
            long r32 = r8.J()     // Catch:{ all -> 0x0ead }
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r23 = r9
            r23.<init>(r24, r25, r26, r28, r30, r32, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0ead }
            goto L_0x0bb7
        L_0x0bb5:
            r21 = r11
        L_0x0bb7:
            r40.l0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r11 = r8.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r11 = (com.google.android.gms.internal.measurement.p8) r11     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r11 = (com.google.android.gms.internal.measurement.n4) r11     // Catch:{ all -> 0x0ead }
            java.lang.String r12 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.jc.d0(r11, r12)     // Catch:{ all -> 0x0ead }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0ead }
            if (r11 == 0) goto L_0x0bce
            r12 = 1
            goto L_0x0bcf
        L_0x0bce:
            r12 = 0
        L_0x0bcf:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0ead }
            r15 = 1
            if (r1 != r15) goto L_0x0c01
            com.google.android.gms.internal.measurement.da r1 = r8.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r1 = (com.google.android.gms.internal.measurement.p8) r1     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r1 = (com.google.android.gms.internal.measurement.n4) r1     // Catch:{ all -> 0x0ead }
            r4.add(r1)     // Catch:{ all -> 0x0ead }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ead }
            if (r1 == 0) goto L_0x0a89
            java.lang.Long r1 = r9.f5988i     // Catch:{ all -> 0x0ead }
            if (r1 != 0) goto L_0x0bf3
            java.lang.Long r1 = r9.f5989j     // Catch:{ all -> 0x0ead }
            if (r1 != 0) goto L_0x0bf3
            java.lang.Boolean r1 = r9.f5990k     // Catch:{ all -> 0x0ead }
            if (r1 == 0) goto L_0x0a89
        L_0x0bf3:
            r1 = 0
            com.google.android.gms.measurement.internal.e0 r9 = r9.c(r1, r1, r1)     // Catch:{ all -> 0x0ead }
            java.lang.String r1 = r8.L()     // Catch:{ all -> 0x0ead }
            r2.put(r1, r9)     // Catch:{ all -> 0x0ead }
            goto L_0x0a89
        L_0x0c01:
            int r15 = r5.nextInt(r1)     // Catch:{ all -> 0x0ead }
            if (r15 != 0) goto L_0x0c46
            r40.l0()     // Catch:{ all -> 0x0ead }
            r43 = r5
            r15 = r6
            long r5 = (long) r1     // Catch:{ all -> 0x0ead }
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.jc.Q(r8, r10, r1)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r1 = r8.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r1 = (com.google.android.gms.internal.measurement.p8) r1     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r1 = (com.google.android.gms.internal.measurement.n4) r1     // Catch:{ all -> 0x0ead }
            r4.add(r1)     // Catch:{ all -> 0x0ead }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ead }
            if (r1 == 0) goto L_0x0c2f
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ead }
            r5 = 0
            com.google.android.gms.measurement.internal.e0 r9 = r9.c(r5, r1, r5)     // Catch:{ all -> 0x0ead }
        L_0x0c2f:
            java.lang.String r1 = r8.L()     // Catch:{ all -> 0x0ead }
            long r5 = r8.J()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.e0 r5 = r9.b(r5, r13)     // Catch:{ all -> 0x0ead }
            r2.put(r1, r5)     // Catch:{ all -> 0x0ead }
            r18 = r3
            r1 = r15
            r5 = 1
            r3 = r2
            goto L_0x0cc9
        L_0x0c46:
            r43 = r5
            r15 = r6
            java.lang.Long r5 = r9.f5987h     // Catch:{ all -> 0x0ead }
            if (r5 == 0) goto L_0x0c56
            long r5 = r5.longValue()     // Catch:{ all -> 0x0ead }
            r23 = r2
            r18 = r3
            goto L_0x0c67
        L_0x0c56:
            r40.m0()     // Catch:{ all -> 0x0ead }
            long r5 = r8.G()     // Catch:{ all -> 0x0ead }
            r23 = r2
            r18 = r3
            r2 = r21
            long r5 = com.google.android.gms.measurement.internal.oc.x(r5, r2)     // Catch:{ all -> 0x0ead }
        L_0x0c67:
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0cb2
            r40.l0()     // Catch:{ all -> 0x0ead }
            java.lang.String r2 = "_efs"
            r5 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.jc.Q(r8, r2, r3)     // Catch:{ all -> 0x0ead }
            r40.l0()     // Catch:{ all -> 0x0ead }
            long r1 = (long) r1     // Catch:{ all -> 0x0ead }
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.jc.Q(r8, r10, r3)     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r3 = r8.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r3 = (com.google.android.gms.internal.measurement.p8) r3     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.n4 r3 = (com.google.android.gms.internal.measurement.n4) r3     // Catch:{ all -> 0x0ead }
            r4.add(r3)     // Catch:{ all -> 0x0ead }
            boolean r3 = r12.booleanValue()     // Catch:{ all -> 0x0ead }
            if (r3 == 0) goto L_0x0ca0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0ead }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0ead }
            r3 = 0
            com.google.android.gms.measurement.internal.e0 r9 = r9.c(r3, r1, r2)     // Catch:{ all -> 0x0ead }
        L_0x0ca0:
            java.lang.String r1 = r8.L()     // Catch:{ all -> 0x0ead }
            long r2 = r8.J()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.e0 r2 = r9.b(r2, r13)     // Catch:{ all -> 0x0ead }
            r3 = r23
            r3.put(r1, r2)     // Catch:{ all -> 0x0ead }
            goto L_0x0cc8
        L_0x0cb2:
            r3 = r23
            r5 = 1
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ead }
            if (r1 == 0) goto L_0x0cc8
            java.lang.String r1 = r8.L()     // Catch:{ all -> 0x0ead }
            r2 = 0
            com.google.android.gms.measurement.internal.e0 r9 = r9.c(r11, r2, r2)     // Catch:{ all -> 0x0ead }
            r3.put(r1, r9)     // Catch:{ all -> 0x0ead }
        L_0x0cc8:
            r1 = r15
        L_0x0cc9:
            r7.z(r1, r8)     // Catch:{ all -> 0x0ead }
        L_0x0ccc:
            int r1 = r1 + 1
            r5 = r43
            r6 = r1
            r2 = r3
            r3 = r18
            r1 = r40
            goto L_0x09f8
        L_0x0cd8:
            r18 = r3
            r3 = r2
            int r1 = r4.size()     // Catch:{ all -> 0x0ead }
            int r2 = r7.x()     // Catch:{ all -> 0x0ead }
            if (r1 >= r2) goto L_0x0cec
            com.google.android.gms.internal.measurement.s4$a r1 = r7.u0()     // Catch:{ all -> 0x0ead }
            r1.O(r4)     // Catch:{ all -> 0x0ead }
        L_0x0cec:
            java.util.Set r1 = r3.entrySet()     // Catch:{ all -> 0x0ead }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0ead }
        L_0x0cf4:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0ead }
            if (r2 == 0) goto L_0x0d0e
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0ead }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.p r3 = r40.d0()     // Catch:{ all -> 0x0ead }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.e0 r2 = (com.google.android.gms.measurement.internal.e0) r2     // Catch:{ all -> 0x0ead }
            r3.T(r2)     // Catch:{ all -> 0x0ead }
            goto L_0x0cf4
        L_0x0d0e:
            r1 = r18
            goto L_0x0d12
        L_0x0d11:
            r1 = r3
        L_0x0d12:
            com.google.android.gms.internal.measurement.s4 r2 = r1.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r2 = r2.G3()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.p r3 = r40.d0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.h6 r3 = r3.C0(r2)     // Catch:{ all -> 0x0ead }
            if (r3 != 0) goto L_0x0d3a
            com.google.android.gms.measurement.internal.x4 r3 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()     // Catch:{ all -> 0x0ead }
            java.lang.String r4 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.s4 r5 = r1.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r5 = r5.G3()     // Catch:{ all -> 0x0ead }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.x4.u(r5)     // Catch:{ all -> 0x0ead }
            r3.b(r4, r5)     // Catch:{ all -> 0x0ead }
            goto L_0x0d95
        L_0x0d3a:
            int r4 = r7.x()     // Catch:{ all -> 0x0ead }
            if (r4 <= 0) goto L_0x0d95
            long r4 = r3.i0()     // Catch:{ all -> 0x0ead }
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0d4e
            r7.o0(r4)     // Catch:{ all -> 0x0ead }
            goto L_0x0d51
        L_0x0d4e:
            r7.I0()     // Catch:{ all -> 0x0ead }
        L_0x0d51:
            long r8 = r3.m0()     // Catch:{ all -> 0x0ead }
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0d5c
            goto L_0x0d5d
        L_0x0d5c:
            r4 = r8
        L_0x0d5d:
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0d65
            r7.s0(r4)     // Catch:{ all -> 0x0ead }
            goto L_0x0d68
        L_0x0d65:
            r7.K0()     // Catch:{ all -> 0x0ead }
        L_0x0d68:
            r3.p()     // Catch:{ all -> 0x0ead }
            long r4 = r3.k0()     // Catch:{ all -> 0x0ead }
            int r5 = (int) r4     // Catch:{ all -> 0x0ead }
            r7.j0(r5)     // Catch:{ all -> 0x0ead }
            long r4 = r7.X()     // Catch:{ all -> 0x0ead }
            r3.j0(r4)     // Catch:{ all -> 0x0ead }
            long r4 = r7.R()     // Catch:{ all -> 0x0ead }
            r3.f0(r4)     // Catch:{ all -> 0x0ead }
            java.lang.String r4 = r3.s0()     // Catch:{ all -> 0x0ead }
            if (r4 == 0) goto L_0x0d8b
            r7.L0(r4)     // Catch:{ all -> 0x0ead }
            goto L_0x0d8e
        L_0x0d8b:
            r7.y0()     // Catch:{ all -> 0x0ead }
        L_0x0d8e:
            com.google.android.gms.measurement.internal.p r4 = r40.d0()     // Catch:{ all -> 0x0ead }
            r4.U(r3)     // Catch:{ all -> 0x0ead }
        L_0x0d95:
            int r3 = r7.x()     // Catch:{ all -> 0x0ead }
            if (r3 <= 0) goto L_0x0df4
            com.google.android.gms.measurement.internal.w5 r3 = r40.g0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r4 = r1.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r4 = r4.G3()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.a4 r3 = r3.K(r4)     // Catch:{ all -> 0x0ead }
            if (r3 == 0) goto L_0x0dba
            boolean r4 = r3.e0()     // Catch:{ all -> 0x0ead }
            if (r4 != 0) goto L_0x0db2
            goto L_0x0dba
        L_0x0db2:
            long r3 = r3.O()     // Catch:{ all -> 0x0ead }
            r7.N(r3)     // Catch:{ all -> 0x0ead }
            goto L_0x0de3
        L_0x0dba:
            com.google.android.gms.internal.measurement.s4 r3 = r1.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r3 = r3.n0()     // Catch:{ all -> 0x0ead }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0ead }
            if (r3 == 0) goto L_0x0dcc
            r3 = -1
            r7.N(r3)     // Catch:{ all -> 0x0ead }
            goto L_0x0de3
        L_0x0dcc:
            com.google.android.gms.measurement.internal.x4 r3 = r40.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r3 = r3.K()     // Catch:{ all -> 0x0ead }
            java.lang.String r4 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.s4 r5 = r1.f6807a     // Catch:{ all -> 0x0ead }
            java.lang.String r5 = r5.G3()     // Catch:{ all -> 0x0ead }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.x4.u(r5)     // Catch:{ all -> 0x0ead }
            r3.b(r4, r5)     // Catch:{ all -> 0x0ead }
        L_0x0de3:
            com.google.android.gms.measurement.internal.p r3 = r40.d0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.da r4 = r7.l()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.p8 r4 = (com.google.android.gms.internal.measurement.p8) r4     // Catch:{ all -> 0x0ead }
            com.google.android.gms.internal.measurement.s4 r4 = (com.google.android.gms.internal.measurement.s4) r4     // Catch:{ all -> 0x0ead }
            r13 = r17
            r3.a0(r4, r13)     // Catch:{ all -> 0x0ead }
        L_0x0df4:
            com.google.android.gms.measurement.internal.p r3 = r40.d0()     // Catch:{ all -> 0x0ead }
            java.util.List<java.lang.Long> r1 = r1.f6808b     // Catch:{ all -> 0x0ead }
            h2.p.j(r1)     // Catch:{ all -> 0x0ead }
            r3.m()     // Catch:{ all -> 0x0ead }
            r3.t()     // Catch:{ all -> 0x0ead }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ead }
            java.lang.String r5 = "rowid in ("
            r4.<init>(r5)     // Catch:{ all -> 0x0ead }
            r5 = 0
        L_0x0e0b:
            int r6 = r1.size()     // Catch:{ all -> 0x0ead }
            if (r5 >= r6) goto L_0x0e28
            if (r5 == 0) goto L_0x0e18
            java.lang.String r6 = ","
            r4.append(r6)     // Catch:{ all -> 0x0ead }
        L_0x0e18:
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x0ead }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0ead }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0ead }
            r4.append(r6)     // Catch:{ all -> 0x0ead }
            int r5 = r5 + 1
            goto L_0x0e0b
        L_0x0e28:
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ all -> 0x0ead }
            android.database.sqlite.SQLiteDatabase r5 = r3.A()     // Catch:{ all -> 0x0ead }
            java.lang.String r6 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0ead }
            r7 = 0
            int r4 = r5.delete(r6, r4, r7)     // Catch:{ all -> 0x0ead }
            int r5 = r1.size()     // Catch:{ all -> 0x0ead }
            if (r4 == r5) goto L_0x0e5b
            com.google.android.gms.measurement.internal.x4 r3 = r3.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()     // Catch:{ all -> 0x0ead }
            java.lang.String r5 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0ead }
            int r1 = r1.size()     // Catch:{ all -> 0x0ead }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0ead }
            r3.c(r5, r4, r1)     // Catch:{ all -> 0x0ead }
        L_0x0e5b:
            com.google.android.gms.measurement.internal.p r1 = r40.d0()     // Catch:{ all -> 0x0ead }
            android.database.sqlite.SQLiteDatabase r3 = r1.A()     // Catch:{ all -> 0x0ead }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0e72 }
            r6 = 0
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0e72 }
            r6 = 1
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0e72 }
            r3.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x0e72 }
            goto L_0x0e85
        L_0x0e72:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.x4 r1 = r1.k()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.z4 r1 = r1.F()     // Catch:{ all -> 0x0ead }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.x4.u(r2)     // Catch:{ all -> 0x0ead }
            r1.c(r4, r2, r3)     // Catch:{ all -> 0x0ead }
        L_0x0e85:
            com.google.android.gms.measurement.internal.p r1 = r40.d0()     // Catch:{ all -> 0x0ead }
            r1.S0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.p r1 = r40.d0()
            r1.Q0()
            r1 = 1
            return r1
        L_0x0e95:
            com.google.android.gms.measurement.internal.p r1 = r40.d0()     // Catch:{ all -> 0x0ead }
            r1.S0()     // Catch:{ all -> 0x0ead }
            com.google.android.gms.measurement.internal.p r1 = r40.d0()
            r1.Q0()
            r1 = 0
            return r1
        L_0x0ea5:
            r0 = move-exception
            r1 = r0
        L_0x0ea7:
            if (r4 == 0) goto L_0x0eac
            r4.close()     // Catch:{ all -> 0x0ead }
        L_0x0eac:
            throw r1     // Catch:{ all -> 0x0ead }
        L_0x0ead:
            r0 = move-exception
            r1 = r0
            com.google.android.gms.measurement.internal.p r2 = r40.d0()
            r2.Q0()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zb.K(java.lang.String, long):boolean");
    }

    private final void L() {
        i().m();
        if (this.f6800t || this.f6801u || this.f6802v) {
            k().J().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f6800t), Boolean.valueOf(this.f6801u), Boolean.valueOf(this.f6802v));
            return;
        }
        k().J().a("Stopping uploading service(s)");
        List<Runnable> list = this.f6796p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) p.j(this.f6796p)).clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void M() {
        /*
            r21 = this;
            r0 = r21
            com.google.android.gms.measurement.internal.f6 r1 = r21.i()
            r1.m()
            r21.o0()
            long r1 = r0.f6795o
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            l2.d r1 = r21.a()
            long r1 = r1.b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f6795o
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.x4 r1 = r21.k()
            com.google.android.gms.measurement.internal.z4 r1 = r1.J()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.i5 r1 = r21.u0()
            r1.c()
            com.google.android.gms.measurement.internal.tb r1 = r21.v0()
            r1.y()
            return
        L_0x004b:
            r0.f6795o = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.m6 r1 = r0.f6792l
            boolean r1 = r1.r()
            if (r1 == 0) goto L_0x0233
            boolean r1 = r21.N()
            if (r1 != 0) goto L_0x005d
            goto L_0x0233
        L_0x005d:
            l2.d r1 = r21.a()
            long r1 = r1.a()
            r21.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Long> r5 = com.google.android.gms.measurement.internal.k0.C
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.p r5 = r21.d0()
            boolean r5 = r5.V0()
            if (r5 != 0) goto L_0x0090
            com.google.android.gms.measurement.internal.p r5 = r21.d0()
            boolean r5 = r5.U0()
            if (r5 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r5 = 0
            goto L_0x0091
        L_0x0090:
            r5 = 1
        L_0x0091:
            if (r5 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.g r10 = r21.b0()
            java.lang.String r10 = r10.M()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00af
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00af
            r21.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Long> r10 = com.google.android.gms.measurement.internal.k0.f6221x
            goto L_0x00ba
        L_0x00af:
            r21.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Long> r10 = com.google.android.gms.measurement.internal.k0.f6219w
            goto L_0x00ba
        L_0x00b5:
            r21.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Long> r10 = com.google.android.gms.measurement.internal.k0.f6217v
        L_0x00ba:
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            com.google.android.gms.measurement.internal.bb r12 = r0.f6789i
            com.google.android.gms.measurement.internal.p5 r12 = r12.f5899g
            long r12 = r12.a()
            com.google.android.gms.measurement.internal.bb r14 = r0.f6789i
            com.google.android.gms.measurement.internal.p5 r14 = r14.f5900h
            long r14 = r14.a()
            com.google.android.gms.measurement.internal.p r16 = r21.d0()
            r17 = r10
            long r9 = r16.y()
            com.google.android.gms.measurement.internal.p r11 = r21.d0()
            r19 = r7
            long r6 = r11.z()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00f7
        L_0x00f4:
            r10 = r3
            goto L_0x0172
        L_0x00f7:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x011d
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x011d
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x011d:
            com.google.android.gms.measurement.internal.jc r5 = r21.l0()
            r12 = r17
            boolean r5 = r5.a0(r8, r12)
            if (r5 != 0) goto L_0x012b
            long r10 = r8 + r12
        L_0x012b:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0172
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0172
            r5 = 0
        L_0x0134:
            r21.b0()
            r6 = 20
            com.google.android.gms.measurement.internal.o4<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.k0.E
            r8 = 0
            java.lang.Object r7 = r7.a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 0
            int r7 = java.lang.Math.max(r9, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x00f4
            r6 = 1
            long r6 = r6 << r5
            r21.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Long> r12 = com.google.android.gms.measurement.internal.k0.D
            java.lang.Object r12 = r12.a(r8)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r10 = r10 + r12
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x016f
            goto L_0x0172
        L_0x016f:
            int r5 = r5 + 1
            goto L_0x0134
        L_0x0172:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0192
            com.google.android.gms.measurement.internal.x4 r1 = r21.k()
            com.google.android.gms.measurement.internal.z4 r1 = r1.J()
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            com.google.android.gms.measurement.internal.i5 r1 = r21.u0()
            r1.c()
            com.google.android.gms.measurement.internal.tb r1 = r21.v0()
            r1.y()
            return
        L_0x0192:
            com.google.android.gms.measurement.internal.e5 r1 = r21.f0()
            boolean r1 = r1.z()
            if (r1 != 0) goto L_0x01b8
            com.google.android.gms.measurement.internal.x4 r1 = r21.k()
            com.google.android.gms.measurement.internal.z4 r1 = r1.J()
            java.lang.String r2 = "No network"
            r1.a(r2)
            com.google.android.gms.measurement.internal.i5 r1 = r21.u0()
            r1.b()
            com.google.android.gms.measurement.internal.tb r1 = r21.v0()
            r1.y()
            return
        L_0x01b8:
            com.google.android.gms.measurement.internal.bb r1 = r0.f6789i
            com.google.android.gms.measurement.internal.p5 r1 = r1.f5898f
            long r1 = r1.a()
            r21.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Long> r5 = com.google.android.gms.measurement.internal.k0.f6213t
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.jc r7 = r21.l0()
            boolean r7 = r7.a0(r1, r5)
            if (r7 != 0) goto L_0x01e3
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01e3:
            com.google.android.gms.measurement.internal.i5 r1 = r21.u0()
            r1.c()
            l2.d r1 = r21.a()
            long r1 = r1.a()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x021a
            r21.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Long> r1 = com.google.android.gms.measurement.internal.k0.f6223y
            r2 = 0
            java.lang.Object r1 = r1.a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.bb r1 = r0.f6789i
            com.google.android.gms.measurement.internal.p5 r1 = r1.f5899g
            l2.d r2 = r21.a()
            long r2 = r2.a()
            r1.b(r2)
        L_0x021a:
            com.google.android.gms.measurement.internal.x4 r1 = r21.k()
            com.google.android.gms.measurement.internal.z4 r1 = r1.J()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.tb r1 = r21.v0()
            r1.x(r10)
            return
        L_0x0233:
            com.google.android.gms.measurement.internal.x4 r1 = r21.k()
            com.google.android.gms.measurement.internal.z4 r1 = r1.J()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            com.google.android.gms.measurement.internal.i5 r1 = r21.u0()
            r1.c()
            com.google.android.gms.measurement.internal.tb r1 = r21.v0()
            r1.y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zb.M():void");
    }

    private final boolean N() {
        i().m();
        o0();
        return d0().T0() || !TextUtils.isEmpty(d0().B());
    }

    private final boolean O() {
        String str;
        z4 z4Var;
        i().m();
        FileLock fileLock = this.f6803w;
        if (fileLock == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f6792l.zza().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f6804x = channel;
                FileLock tryLock = channel.tryLock();
                this.f6803w = tryLock;
                if (tryLock != null) {
                    k().J().a("Storage concurrent access okay");
                    return true;
                }
                k().F().a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e10) {
                e = e10;
                z4Var = k().F();
                str = "Failed to acquire storage lock";
                z4Var.b(str, e);
                return false;
            } catch (IOException e11) {
                e = e11;
                z4Var = k().F();
                str = "Failed to access storage lock file";
                z4Var.b(str, e);
                return false;
            } catch (OverlappingFileLockException e12) {
                e = e12;
                z4Var = k().K();
                str = "Storage lock already acquired";
                z4Var.b(str, e);
                return false;
            }
        } else {
            k().J().a("Storage concurrent access okay");
            return true;
        }
    }

    private final void T(i0 i0Var, sc scVar) {
        p.f(scVar.f6559m);
        b5 b10 = b5.b(i0Var);
        m0().L(b10.f5887d, d0().z0(scVar.f6559m));
        m0().U(b10, b0().x(scVar.f6559m));
        i0 a10 = b10.a();
        if ("_cmp".equals(a10.f6112m) && "referrer API v2".equals(a10.f6113n.o("_cis"))) {
            String o10 = a10.f6113n.o("gclid");
            if (!TextUtils.isEmpty(o10)) {
                w(new nc("_lgclid", a10.f6115p, o10, "auto"), scVar);
            }
        }
        if (ee.a() && ee.c() && "_cmp".equals(a10.f6112m) && "referrer API v2".equals(a10.f6113n.o("_cis"))) {
            String o11 = a10.f6113n.o("gbraid");
            if (!TextUtils.isEmpty(o11)) {
                w(new nc("_gbraid", a10.f6115p, o11, "auto"), scVar);
            }
        }
        s(a10, scVar);
    }

    private final void U(h6 h6Var) {
        i().m();
        if (!TextUtils.isEmpty(h6Var.j()) || !TextUtils.isEmpty(h6Var.r0())) {
            Uri.Builder builder = new Uri.Builder();
            String j10 = h6Var.j();
            if (TextUtils.isEmpty(j10)) {
                j10 = h6Var.r0();
            }
            p.a aVar = null;
            Uri.Builder encodedAuthority = builder.scheme(k0.f6187g.a(null)).encodedAuthority(k0.f6189h.a(null));
            encodedAuthority.path("config/app/" + j10).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "82001").appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String str = (String) p.j(h6Var.t0());
                URL url = new URL(uri);
                k().J().b("Fetching remote configuration", str);
                a4 K = g0().K(str);
                String O = g0().O(str);
                if (K != null) {
                    if (!TextUtils.isEmpty(O)) {
                        aVar = new p.a();
                        aVar.put("If-Modified-Since", O);
                    }
                    String M = g0().M(str);
                    if (!TextUtils.isEmpty(M)) {
                        if (aVar == null) {
                            aVar = new p.a();
                        }
                        aVar.put("If-None-Match", M);
                    }
                }
                this.f6800t = true;
                e5 f02 = f0();
                ec ecVar = new ec(this);
                f02.m();
                f02.t();
                p.j(url);
                p.j(ecVar);
                f02.i().y(new j5(f02, str, url, (byte[]) null, aVar, ecVar));
            } catch (MalformedURLException unused) {
                k().F().c("Failed to parse config URL. Not fetching. appId", x4.u(h6Var.t0()), uri);
            }
        } else {
            y((String) p.j(h6Var.t0()), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
        }
    }

    private final sc V(String str) {
        z4 E2;
        String str2;
        Object obj;
        String str3;
        int i10;
        String str4 = str;
        h6 C0 = d0().C0(str4);
        if (C0 == null || TextUtils.isEmpty(C0.h())) {
            E2 = k().E();
            str2 = "No app data available; dropping";
            obj = str4;
        } else {
            Boolean l10 = l(C0);
            if (l10 == null || l10.booleanValue()) {
                p7 P = P(str);
                if (!kd.a() || !b0().r(k0.T0)) {
                    str3 = "";
                    i10 = 100;
                } else {
                    str3 = Z(str).i();
                    i10 = P.b();
                }
                h6 h6Var = C0;
                return new sc(str, C0.j(), C0.h(), C0.z(), C0.v0(), C0.g0(), C0.a0(), (String) null, C0.r(), false, C0.i(), C0.v(), 0, 0, h6Var.q(), false, h6Var.r0(), h6Var.q0(), h6Var.c0(), h6Var.n(), (String) null, P.v(), "", (String) null, h6Var.t(), h6Var.p0(), i10, str3, h6Var.a(), h6Var.D());
            }
            E2 = k().F();
            str2 = "App version does not match; dropping. appId";
            obj = x4.u(str);
        }
        E2.b(str2, obj);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x030c A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0342 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03ac A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x073d A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x074f A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0795 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x083a A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0853 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x08da A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x08f8 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x096e A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x09c6 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c6 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ce A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void X(com.google.android.gms.measurement.internal.i0 r29, com.google.android.gms.measurement.internal.sc r30) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            r3 = r30
            java.lang.String r4 = "_fx"
            java.lang.String r5 = "_sno"
            h2.p.j(r30)
            java.lang.String r6 = r3.f6559m
            h2.p.f(r6)
            long r6 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.f6 r8 = r28.i()
            r8.m()
            r28.o0()
            java.lang.String r8 = r3.f6559m
            r28.l0()
            boolean r9 = com.google.android.gms.measurement.internal.jc.b0(r29, r30)
            if (r9 != 0) goto L_0x002c
            return
        L_0x002c:
            boolean r9 = r3.f6566t
            if (r9 != 0) goto L_0x0034
            r1.f(r3)
            return
        L_0x0034:
            com.google.android.gms.measurement.internal.w5 r9 = r28.g0()
            java.lang.String r10 = r2.f6112m
            boolean r9 = r9.N(r8, r10)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r9 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.x4 r3 = r28.k()
            com.google.android.gms.measurement.internal.z4 r3 = r3.K()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.x4.u(r8)
            com.google.android.gms.measurement.internal.m6 r5 = r1.f6792l
            com.google.android.gms.measurement.internal.w4 r5 = r5.C()
            java.lang.String r6 = r2.f6112m
            java.lang.String r5 = r5.c(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.c(r6, r4, r5)
            com.google.android.gms.measurement.internal.w5 r3 = r28.g0()
            boolean r3 = r3.W(r8)
            if (r3 != 0) goto L_0x0077
            com.google.android.gms.measurement.internal.w5 r3 = r28.g0()
            boolean r3 = r3.Y(r8)
            if (r3 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r3 = 0
            goto L_0x0078
        L_0x0077:
            r3 = 1
        L_0x0078:
            if (r3 != 0) goto L_0x0095
            java.lang.String r4 = r2.f6112m
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L_0x0095
            r28.m0()
            com.google.android.gms.measurement.internal.qc r9 = r1.G
            r11 = 11
            java.lang.String r13 = r2.f6112m
            r2 = 0
            java.lang.String r12 = "_ev"
            r10 = r8
            r4 = r14
            r14 = r2
            com.google.android.gms.measurement.internal.oc.X(r9, r10, r11, r12, r13, r14)
            goto L_0x0096
        L_0x0095:
            r4 = r14
        L_0x0096:
            if (r3 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.p r2 = r28.d0()
            com.google.android.gms.measurement.internal.h6 r2 = r2.C0(r8)
            if (r2 == 0) goto L_0x00de
            long r5 = r2.e0()
            long r7 = r2.H()
            long r5 = java.lang.Math.max(r5, r7)
            l2.d r3 = r28.a()
            long r7 = r3.a()
            long r7 = r7 - r5
            long r5 = java.lang.Math.abs(r7)
            r28.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Long> r3 = com.google.android.gms.measurement.internal.k0.B
            java.lang.Object r3 = r3.a(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.x4 r3 = r28.k()
            com.google.android.gms.measurement.internal.z4 r3 = r3.E()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.a(r4)
            r1.U(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.b5 r2 = com.google.android.gms.measurement.internal.b5.b(r29)
            com.google.android.gms.measurement.internal.oc r9 = r28.m0()
            com.google.android.gms.measurement.internal.g r10 = r28.b0()
            int r10 = r10.x(r8)
            r9.U(r2, r10)
            boolean r9 = com.google.android.gms.internal.measurement.pe.a()
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.g r9 = r28.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.k0.J0
            boolean r9 = r9.r(r10)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.g r9 = r28.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.k0.S
            r11 = 10
            r12 = 35
            int r9 = r9.p(r8, r10, r11, r12)
            goto L_0x0114
        L_0x0113:
            r9 = 0
        L_0x0114:
            java.util.TreeSet r10 = new java.util.TreeSet
            android.os.Bundle r11 = r2.f5887d
            java.util.Set r11 = r11.keySet()
            r10.<init>(r11)
            java.util.Iterator r10 = r10.iterator()
        L_0x0123:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015b
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "items"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x0159
            com.google.android.gms.measurement.internal.oc r12 = r28.m0()
            android.os.Bundle r13 = r2.f5887d
            android.os.Parcelable[] r11 = r13.getParcelableArray(r11)
            boolean r13 = com.google.android.gms.internal.measurement.pe.a()
            if (r13 == 0) goto L_0x0155
            com.google.android.gms.measurement.internal.g r13 = r28.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.k0.J0
            boolean r13 = r13.r(r14)
            if (r13 == 0) goto L_0x0155
            r13 = 1
            goto L_0x0156
        L_0x0155:
            r13 = 0
        L_0x0156:
            r12.Z(r11, r9, r13)
        L_0x0159:
            r14 = 0
            goto L_0x0123
        L_0x015b:
            com.google.android.gms.measurement.internal.i0 r2 = r2.a()
            com.google.android.gms.measurement.internal.x4 r9 = r28.k()
            r10 = 2
            boolean r9 = r9.B(r10)
            if (r9 == 0) goto L_0x0181
            com.google.android.gms.measurement.internal.x4 r9 = r28.k()
            com.google.android.gms.measurement.internal.z4 r9 = r9.J()
            com.google.android.gms.measurement.internal.m6 r11 = r1.f6792l
            com.google.android.gms.measurement.internal.w4 r11 = r11.C()
            java.lang.String r11 = r11.b(r2)
            java.lang.String r12 = "Logging event"
            r9.b(r12, r11)
        L_0x0181:
            boolean r9 = com.google.android.gms.internal.measurement.je.a()
            if (r9 == 0) goto L_0x0190
            com.google.android.gms.measurement.internal.g r9 = r28.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.k0.G0
            r9.r(r11)
        L_0x0190:
            com.google.android.gms.measurement.internal.p r9 = r28.d0()
            r9.P0()
            r1.f(r3)     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r11 = r2.f6112m     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = "refund"
            if (r9 != 0) goto L_0x01bb
            java.lang.String r9 = "purchase"
            java.lang.String r12 = r2.f6112m     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x01bb
            java.lang.String r9 = r2.f6112m     // Catch:{ all -> 0x0a11 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            r9 = 0
            goto L_0x01bc
        L_0x01bb:
            r9 = 1
        L_0x01bc:
            java.lang.String r12 = "_iap"
            java.lang.String r13 = r2.f6112m     // Catch:{ all -> 0x0a11 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0a11 }
            if (r12 != 0) goto L_0x01cb
            if (r9 == 0) goto L_0x01c9
            goto L_0x01cb
        L_0x01c9:
            r12 = 0
            goto L_0x01cc
        L_0x01cb:
            r12 = 1
        L_0x01cc:
            if (r12 == 0) goto L_0x0351
            com.google.android.gms.measurement.internal.d0 r12 = r2.f6113n     // Catch:{ all -> 0x0a11 }
            java.lang.String r13 = "currency"
            java.lang.String r12 = r12.o(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x0235
            com.google.android.gms.measurement.internal.d0 r9 = r2.f6113n     // Catch:{ all -> 0x0a11 }
            java.lang.Double r9 = r9.g(r13)     // Catch:{ all -> 0x0a11 }
            double r19 = r9.doubleValue()     // Catch:{ all -> 0x0a11 }
            r21 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r19 = r19 * r21
            r23 = 0
            int r9 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r9 != 0) goto L_0x01fe
            com.google.android.gms.measurement.internal.d0 r9 = r2.f6113n     // Catch:{ all -> 0x0a11 }
            java.lang.Long r9 = r9.k(r13)     // Catch:{ all -> 0x0a11 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a11 }
            double r13 = (double) r13     // Catch:{ all -> 0x0a11 }
            double r19 = r13 * r21
        L_0x01fe:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x0218
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x0218
            long r13 = java.lang.Math.round(r19)     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r2.f6112m     // Catch:{ all -> 0x0a11 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x023f
            long r13 = -r13
            goto L_0x023f
        L_0x0218:
            com.google.android.gms.measurement.internal.x4 r9 = r28.k()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.z4 r9 = r9.K()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Data lost. Currency value is too big. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.x4.u(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.Double r12 = java.lang.Double.valueOf(r19)     // Catch:{ all -> 0x0a11 }
            r9.c(r10, r11, r12)     // Catch:{ all -> 0x0a11 }
            r24 = r6
            r26 = r15
            r7 = 0
            r13 = 0
            goto L_0x0340
        L_0x0235:
            com.google.android.gms.measurement.internal.d0 r9 = r2.f6113n     // Catch:{ all -> 0x0a11 }
            java.lang.Long r9 = r9.k(r13)     // Catch:{ all -> 0x0a11 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a11 }
        L_0x023f:
            boolean r9 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x033a
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r12.toUpperCase(r9)     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0a11 }
            if (r11 == 0) goto L_0x033a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = "_ltv_"
            r11.<init>(r12)     // Catch:{ all -> 0x0a11 }
            r11.append(r9)     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = r11.toString()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p r9 = r28.d0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.pc r9 = r9.E0(r8, r12)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x029d
            java.lang.Object r9 = r9.f6448e     // Catch:{ all -> 0x0a11 }
            boolean r11 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0a11 }
            if (r11 != 0) goto L_0x0272
            goto L_0x029d
        L_0x0272:
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0a11 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.pc r19 = new com.google.android.gms.measurement.internal.pc     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r2.f6114o     // Catch:{ all -> 0x0a11 }
            l2.d r20 = r28.a()     // Catch:{ all -> 0x0a11 }
            long r20 = r20.a()     // Catch:{ all -> 0x0a11 }
            long r9 = r9 + r13
            java.lang.Long r22 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0a11 }
            r9 = r19
            r10 = r8
            r13 = 0
            r24 = r6
            r6 = 1
            r7 = 0
            r13 = r20
            r26 = r15
            r15 = r22
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0a11 }
        L_0x029a:
            r6 = r19
            goto L_0x0302
        L_0x029d:
            r24 = r6
            r26 = r15
            r6 = 1
            r7 = 0
            com.google.android.gms.measurement.internal.p r9 = r28.d0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.g r11 = r28.b0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.o4<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.k0.G     // Catch:{ all -> 0x0a11 }
            int r11 = r11.t(r8, r15)     // Catch:{ all -> 0x0a11 }
            int r11 = r11 - r6
            h2.p.f(r8)     // Catch:{ all -> 0x0a11 }
            r9.m()     // Catch:{ all -> 0x0a11 }
            r9.t()     // Catch:{ all -> 0x0a11 }
            android.database.sqlite.SQLiteDatabase r15 = r9.A()     // Catch:{ SQLiteException -> 0x02d6 }
            java.lang.String r10 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x02d6 }
            r6[r7] = r8     // Catch:{ SQLiteException -> 0x02d6 }
            r17 = 1
            r6[r17] = r8     // Catch:{ SQLiteException -> 0x02d6 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x02d6 }
            r16 = 2
            r6[r16] = r11     // Catch:{ SQLiteException -> 0x02d6 }
            r15.execSQL(r10, r6)     // Catch:{ SQLiteException -> 0x02d6 }
            goto L_0x02e9
        L_0x02d6:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.x4 r9 = r9.k()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.z4 r9 = r9.F()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Error pruning currencies. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.x4.u(r8)     // Catch:{ all -> 0x0a11 }
            r9.c(r10, r11, r6)     // Catch:{ all -> 0x0a11 }
        L_0x02e9:
            com.google.android.gms.measurement.internal.pc r19 = new com.google.android.gms.measurement.internal.pc     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r2.f6114o     // Catch:{ all -> 0x0a11 }
            l2.d r6 = r28.a()     // Catch:{ all -> 0x0a11 }
            long r15 = r6.a()     // Catch:{ all -> 0x0a11 }
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0a11 }
            r9 = r19
            r10 = r8
            r13 = r15
            r15 = r6
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0a11 }
            goto L_0x029a
        L_0x0302:
            com.google.android.gms.measurement.internal.p r9 = r28.d0()     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.d0(r6)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x033f
            com.google.android.gms.measurement.internal.x4 r9 = r28.k()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.z4 r9 = r9.F()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.x4.u(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m6 r12 = r1.f6792l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.w4 r12 = r12.C()     // Catch:{ all -> 0x0a11 }
            java.lang.String r13 = r6.f6446c     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = r12.g(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.Object r6 = r6.f6448e     // Catch:{ all -> 0x0a11 }
            r9.d(r10, r11, r12, r6)     // Catch:{ all -> 0x0a11 }
            r28.m0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.qc r9 = r1.G     // Catch:{ all -> 0x0a11 }
            r11 = 9
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.oc.X(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0a11 }
            goto L_0x033f
        L_0x033a:
            r24 = r6
            r26 = r15
            r7 = 0
        L_0x033f:
            r13 = 1
        L_0x0340:
            if (r13 != 0) goto L_0x0356
            com.google.android.gms.measurement.internal.p r2 = r28.d0()     // Catch:{ all -> 0x0a11 }
            r2.S0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p r2 = r28.d0()
            r2.Q0()
            return
        L_0x0351:
            r24 = r6
            r26 = r15
            r7 = 0
        L_0x0356:
            java.lang.String r6 = r2.f6112m     // Catch:{ all -> 0x0a11 }
            boolean r6 = com.google.android.gms.measurement.internal.oc.I0(r6)     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r2.f6112m     // Catch:{ all -> 0x0a11 }
            r10 = r26
            boolean r20 = r10.equals(r9)     // Catch:{ all -> 0x0a11 }
            r28.m0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.d0 r9 = r2.f6113n     // Catch:{ all -> 0x0a11 }
            long r9 = com.google.android.gms.measurement.internal.oc.z(r9)     // Catch:{ all -> 0x0a11 }
            r13 = 1
            long r15 = r9 + r13
            com.google.android.gms.measurement.internal.p r9 = r28.d0()     // Catch:{ all -> 0x0a11 }
            long r10 = r28.t0()     // Catch:{ all -> 0x0a11 }
            r17 = 1
            r18 = 0
            r19 = 0
            r12 = r8
            r21 = r8
            r7 = r13
            r13 = r15
            r15 = r17
            r16 = r6
            r17 = r18
            r18 = r20
            com.google.android.gms.measurement.internal.q r9 = r9.H(r10, r12, r13, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0a11 }
            long r10 = r9.f6450b     // Catch:{ all -> 0x0a11 }
            r28.b0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.o4<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.k0.f6199m     // Catch:{ all -> 0x0a11 }
            r13 = 0
            java.lang.Object r12 = r12.a(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0a11 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0a11 }
            long r12 = (long) r12     // Catch:{ all -> 0x0a11 }
            long r10 = r10 - r12
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x03d7
            long r10 = r10 % r12
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x03c8
            com.google.android.gms.measurement.internal.x4 r2 = r28.k()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.z4 r2 = r2.F()     // Catch:{ all -> 0x0a11 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.x4.u(r21)     // Catch:{ all -> 0x0a11 }
            long r5 = r9.f6450b     // Catch:{ all -> 0x0a11 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a11 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0a11 }
        L_0x03c8:
            com.google.android.gms.measurement.internal.p r2 = r28.d0()     // Catch:{ all -> 0x0a11 }
            r2.S0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p r2 = r28.d0()
            r2.Q0()
            return
        L_0x03d7:
            if (r6 == 0) goto L_0x042f
            long r10 = r9.f6449a     // Catch:{ all -> 0x0a11 }
            r28.b0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.o4<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.k0.f6203o     // Catch:{ all -> 0x0a11 }
            r8 = 0
            java.lang.Object r7 = r7.a(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0a11 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0a11 }
            long r7 = (long) r7     // Catch:{ all -> 0x0a11 }
            long r10 = r10 - r7
            int r7 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x042f
            long r10 = r10 % r12
            r3 = 1
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x040f
            com.google.android.gms.measurement.internal.x4 r3 = r28.k()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()     // Catch:{ all -> 0x0a11 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.x4.u(r21)     // Catch:{ all -> 0x0a11 }
            long r6 = r9.f6449a     // Catch:{ all -> 0x0a11 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a11 }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x0a11 }
        L_0x040f:
            r28.m0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.qc r9 = r1.G     // Catch:{ all -> 0x0a11 }
            r11 = 16
            java.lang.String r12 = "_ev"
            java.lang.String r13 = r2.f6112m     // Catch:{ all -> 0x0a11 }
            r14 = 0
            r10 = r21
            com.google.android.gms.measurement.internal.oc.X(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p r2 = r28.d0()     // Catch:{ all -> 0x0a11 }
            r2.S0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p r2 = r28.d0()
            r2.Q0()
            return
        L_0x042f:
            if (r20 == 0) goto L_0x047d
            long r7 = r9.f6452d     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.g r10 = r28.b0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.o4<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.k0.f6201n     // Catch:{ all -> 0x0a11 }
            int r10 = r10.t(r11, r12)     // Catch:{ all -> 0x0a11 }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x0a11 }
            r11 = 0
            int r10 = java.lang.Math.max(r11, r10)     // Catch:{ all -> 0x0a11 }
            long r10 = (long) r10     // Catch:{ all -> 0x0a11 }
            long r7 = r7 - r10
            int r10 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x047d
            r10 = 1
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x046e
            com.google.android.gms.measurement.internal.x4 r2 = r28.k()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.z4 r2 = r2.F()     // Catch:{ all -> 0x0a11 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.x4.u(r21)     // Catch:{ all -> 0x0a11 }
            long r5 = r9.f6452d     // Catch:{ all -> 0x0a11 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a11 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0a11 }
        L_0x046e:
            com.google.android.gms.measurement.internal.p r2 = r28.d0()     // Catch:{ all -> 0x0a11 }
            r2.S0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p r2 = r28.d0()
            r2.Q0()
            return
        L_0x047d:
            com.google.android.gms.measurement.internal.d0 r7 = r2.f6113n     // Catch:{ all -> 0x0a11 }
            android.os.Bundle r7 = r7.i()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.oc r8 = r28.m0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "_o"
            java.lang.String r10 = r2.f6114o     // Catch:{ all -> 0x0a11 }
            r8.M(r7, r9, r10)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.oc r8 = r28.m0()     // Catch:{ all -> 0x0a11 }
            r13 = r21
            boolean r8 = r8.E0(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = "_r"
            if (r8 == 0) goto L_0x04b6
            com.google.android.gms.measurement.internal.oc r8 = r28.m0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "_dbg"
            r10 = 1
            java.lang.Long r14 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a11 }
            r8.M(r7, r9, r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.oc r8 = r28.m0()     // Catch:{ all -> 0x0a11 }
            java.lang.Long r9 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a11 }
            r8.M(r7, r12, r9)     // Catch:{ all -> 0x0a11 }
        L_0x04b6:
            java.lang.String r8 = "_s"
            java.lang.String r9 = r2.f6112m     // Catch:{ all -> 0x0a11 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x04db
            com.google.android.gms.measurement.internal.p r8 = r28.d0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.pc r8 = r8.E0(r9, r5)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x04db
            java.lang.Object r9 = r8.f6448e     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x04db
            com.google.android.gms.measurement.internal.oc r9 = r28.m0()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r8 = r8.f6448e     // Catch:{ all -> 0x0a11 }
            r9.M(r7, r5, r8)     // Catch:{ all -> 0x0a11 }
        L_0x04db:
            com.google.android.gms.measurement.internal.p r5 = r28.d0()     // Catch:{ all -> 0x0a11 }
            long r8 = r5.E(r13)     // Catch:{ all -> 0x0a11 }
            r14 = 0
            int r5 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x04fe
            com.google.android.gms.measurement.internal.x4 r5 = r28.k()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.z4 r5 = r5.K()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.x4.u(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0a11 }
            r5.c(r10, r11, r8)     // Catch:{ all -> 0x0a11 }
        L_0x04fe:
            com.google.android.gms.measurement.internal.a0 r5 = new com.google.android.gms.measurement.internal.a0     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m6 r10 = r1.f6792l     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r2.f6114o     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r2.f6112m     // Catch:{ all -> 0x0a11 }
            long r14 = r2.f6115p     // Catch:{ all -> 0x0a11 }
            r18 = 0
            r9 = r5
            r2 = r12
            r12 = r13
            r27 = r2
            r2 = r13
            r13 = r8
            r16 = r18
            r18 = r7
            r9.<init>((com.google.android.gms.measurement.internal.m6) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (long) r14, (long) r16, (android.os.Bundle) r18)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p r7 = r28.d0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r5.f5840b     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.e0 r7 = r7.B0(r2, r8)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x0596
            com.google.android.gms.measurement.internal.p r7 = r28.d0()     // Catch:{ all -> 0x0a11 }
            long r7 = r7.u0(r2)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.g r9 = r28.b0()     // Catch:{ all -> 0x0a11 }
            int r9 = r9.o(r2)     // Catch:{ all -> 0x0a11 }
            long r9 = (long) r9     // Catch:{ all -> 0x0a11 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x057a
            if (r6 == 0) goto L_0x057a
            com.google.android.gms.measurement.internal.x4 r3 = r28.k()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()     // Catch:{ all -> 0x0a11 }
            java.lang.String r4 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.x4.u(r2)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m6 r7 = r1.f6792l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.w4 r7 = r7.C()     // Catch:{ all -> 0x0a11 }
            java.lang.String r5 = r5.f5840b     // Catch:{ all -> 0x0a11 }
            java.lang.String r5 = r7.c(r5)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.g r7 = r28.b0()     // Catch:{ all -> 0x0a11 }
            int r7 = r7.o(r2)     // Catch:{ all -> 0x0a11 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0a11 }
            r3.d(r4, r6, r5, r7)     // Catch:{ all -> 0x0a11 }
            r28.m0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.qc r9 = r1.G     // Catch:{ all -> 0x0a11 }
            r11 = 8
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r2
            com.google.android.gms.measurement.internal.oc.X(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p r2 = r28.d0()
            r2.Q0()
            return
        L_0x057a:
            com.google.android.gms.measurement.internal.e0 r6 = new com.google.android.gms.measurement.internal.e0     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r5.f5840b     // Catch:{ all -> 0x0a11 }
            r12 = 0
            r14 = 0
            long r7 = r5.f5842d     // Catch:{ all -> 0x0a11 }
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r9 = r6
            r10 = r2
            r16 = r7
            r9.<init>(r10, r11, r12, r14, r16, r18, r20, r21, r22, r23)     // Catch:{ all -> 0x0a11 }
            goto L_0x05a4
        L_0x0596:
            com.google.android.gms.measurement.internal.m6 r2 = r1.f6792l     // Catch:{ all -> 0x0a11 }
            long r8 = r7.f5985f     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.a0 r5 = r5.a(r2, r8)     // Catch:{ all -> 0x0a11 }
            long r8 = r5.f5842d     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.e0 r6 = r7.a(r8)     // Catch:{ all -> 0x0a11 }
        L_0x05a4:
            com.google.android.gms.measurement.internal.p r2 = r28.d0()     // Catch:{ all -> 0x0a11 }
            r2.T(r6)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.f6 r2 = r28.i()     // Catch:{ all -> 0x0a11 }
            r2.m()     // Catch:{ all -> 0x0a11 }
            r28.o0()     // Catch:{ all -> 0x0a11 }
            h2.p.j(r5)     // Catch:{ all -> 0x0a11 }
            h2.p.j(r30)     // Catch:{ all -> 0x0a11 }
            java.lang.String r2 = r5.f5839a     // Catch:{ all -> 0x0a11 }
            h2.p.f(r2)     // Catch:{ all -> 0x0a11 }
            java.lang.String r2 = r5.f5839a     // Catch:{ all -> 0x0a11 }
            java.lang.String r6 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0a11 }
            h2.p.a(r2)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.s4$a r2 = com.google.android.gms.internal.measurement.s4.D3()     // Catch:{ all -> 0x0a11 }
            r6 = 1
            com.google.android.gms.internal.measurement.s4$a r2 = r2.n0(r6)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = "android"
            com.google.android.gms.internal.measurement.s4$a r2 = r2.P0(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x05e7
            java.lang.String r7 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            r2.P(r7)     // Catch:{ all -> 0x0a11 }
        L_0x05e7:
            java.lang.String r7 = r3.f6562p     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x05f4
            java.lang.String r7 = r3.f6562p     // Catch:{ all -> 0x0a11 }
            r2.b0(r7)     // Catch:{ all -> 0x0a11 }
        L_0x05f4:
            java.lang.String r7 = r3.f6561o     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x0601
            java.lang.String r7 = r3.f6561o     // Catch:{ all -> 0x0a11 }
            r2.h0(r7)     // Catch:{ all -> 0x0a11 }
        L_0x0601:
            boolean r7 = com.google.android.gms.internal.measurement.pf.a()     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x062e
            java.lang.String r7 = r3.J     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x062e
            com.google.android.gms.measurement.internal.g r7 = r28.b0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.k0.f6220w0     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.r(r8)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x0629
            com.google.android.gms.measurement.internal.g r7 = r28.b0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.k0.f6224y0     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.A(r8, r9)     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x062e
        L_0x0629:
            java.lang.String r7 = r3.J     // Catch:{ all -> 0x0a11 }
            r2.S0(r7)     // Catch:{ all -> 0x0a11 }
        L_0x062e:
            long r7 = r3.f6568v     // Catch:{ all -> 0x0a11 }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x063b
            int r8 = (int) r7     // Catch:{ all -> 0x0a11 }
            r2.e0(r8)     // Catch:{ all -> 0x0a11 }
        L_0x063b:
            long r7 = r3.f6563q     // Catch:{ all -> 0x0a11 }
            r2.k0(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = r3.f6560n     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x064d
            java.lang.String r7 = r3.f6560n     // Catch:{ all -> 0x0a11 }
            r2.J0(r7)     // Catch:{ all -> 0x0a11 }
        L_0x064d:
            java.lang.String r7 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = h2.p.j(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p7 r7 = r1.P(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.H     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p7 r8 = com.google.android.gms.measurement.internal.p7.e(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p7 r7 = r7.d(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r7.v()     // Catch:{ all -> 0x0a11 }
            r2.p0(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r2.W0()     // Catch:{ all -> 0x0a11 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0681
            java.lang.String r8 = r3.C     // Catch:{ all -> 0x0a11 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a11 }
            if (r8 != 0) goto L_0x0681
            java.lang.String r8 = r3.C     // Catch:{ all -> 0x0a11 }
            r2.J(r8)     // Catch:{ all -> 0x0a11 }
        L_0x0681:
            boolean r8 = com.google.android.gms.internal.measurement.df.a()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0735
            com.google.android.gms.measurement.internal.g r8 = r28.b0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.k0.L0     // Catch:{ all -> 0x0a11 }
            boolean r8 = r8.A(r9, r10)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0735
            r28.m0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            boolean r8 = com.google.android.gms.measurement.internal.oc.C0(r8)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0735
            int r8 = r3.O     // Catch:{ all -> 0x0a11 }
            r2.Y(r8)     // Catch:{ all -> 0x0a11 }
            long r8 = r3.P     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.x()     // Catch:{ all -> 0x0a11 }
            r10 = 32
            r12 = 0
            if (r7 != 0) goto L_0x06bb
            int r7 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x06bb
            r14 = -2
            long r7 = r8 & r14
            long r8 = r7 | r10
        L_0x06bb:
            r14 = 1
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x06c3
            r7 = 1
            goto L_0x06c4
        L_0x06c3:
            r7 = 0
        L_0x06c4:
            r2.K(r7)     // Catch:{ all -> 0x0a11 }
            int r7 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x0737
            com.google.android.gms.internal.measurement.k4$a r7 = com.google.android.gms.internal.measurement.k4.J()     // Catch:{ all -> 0x0a11 }
            r14 = 1
            long r16 = r8 & r14
            int r14 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x06d9
            r14 = 1
            goto L_0x06da
        L_0x06d9:
            r14 = 0
        L_0x06da:
            r7.z(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 2
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x06e6
            r14 = 1
            goto L_0x06e7
        L_0x06e6:
            r14 = 0
        L_0x06e7:
            r7.B(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 4
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x06f3
            r14 = 1
            goto L_0x06f4
        L_0x06f3:
            r14 = 0
        L_0x06f4:
            r7.C(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 8
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x0700
            r14 = 1
            goto L_0x0701
        L_0x0700:
            r14 = 0
        L_0x0701:
            r7.D(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 16
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x070d
            r14 = 1
            goto L_0x070e
        L_0x070d:
            r14 = 0
        L_0x070e:
            r7.y(r14)     // Catch:{ all -> 0x0a11 }
            long r10 = r10 & r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0718
            r10 = 1
            goto L_0x0719
        L_0x0718:
            r10 = 0
        L_0x0719:
            r7.x(r10)     // Catch:{ all -> 0x0a11 }
            r10 = 64
            long r8 = r8 & r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x0725
            r8 = 1
            goto L_0x0726
        L_0x0725:
            r8 = 0
        L_0x0726:
            r7.A(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.da r7 = r7.l()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.p8 r7 = (com.google.android.gms.internal.measurement.p8) r7     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.k4 r7 = (com.google.android.gms.internal.measurement.k4) r7     // Catch:{ all -> 0x0a11 }
            r2.D(r7)     // Catch:{ all -> 0x0a11 }
            goto L_0x0737
        L_0x0735:
            r12 = 0
        L_0x0737:
            long r7 = r3.f6564r     // Catch:{ all -> 0x0a11 }
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0740
            r2.T(r7)     // Catch:{ all -> 0x0a11 }
        L_0x0740:
            long r7 = r3.E     // Catch:{ all -> 0x0a11 }
            r2.Z(r7)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.jc r7 = r28.l0()     // Catch:{ all -> 0x0a11 }
            java.util.List r7 = r7.i0()     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x0752
            r2.U(r7)     // Catch:{ all -> 0x0a11 }
        L_0x0752:
            java.lang.String r7 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = h2.p.j(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p7 r7 = r1.P(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.H     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p7 r8 = com.google.android.gms.measurement.internal.p7.e(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p7 r7 = r7.d(r8)     // Catch:{ all -> 0x0a11 }
            boolean r8 = r7.x()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            boolean r8 = r3.A     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            com.google.android.gms.measurement.internal.bb r8 = r1.f6789i     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            android.util.Pair r8 = r8.y(r9, r7)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x0a11 }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x0a11 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x07f0
            boolean r9 = r3.A     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x07f0
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0a11 }
            r2.R0(r9)     // Catch:{ all -> 0x0a11 }
            java.lang.Object r9 = r8.second     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x079e
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0a11 }
            r2.W(r9)     // Catch:{ all -> 0x0a11 }
        L_0x079e:
            boolean r9 = com.google.android.gms.internal.measurement.fd.a()     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x07f0
            com.google.android.gms.measurement.internal.g r9 = r28.b0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.k0.Y0     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.r(r10)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x07f0
            java.lang.String r9 = r5.f5840b     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.equals(r4)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x07f0
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "00000000-0000-0000-0000-000000000000"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r8 != 0) goto L_0x07f0
            com.google.android.gms.measurement.internal.p r8 = r28.d0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.h6 r8 = r8.C0(r9)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            boolean r8 = r8.u()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            java.lang.String r8 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            r9 = 0
            r1.E(r8, r9)     // Catch:{ all -> 0x0a11 }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x0a11 }
            r8.<init>()     // Catch:{ all -> 0x0a11 }
            r10 = r27
            r14 = 1
            r8.putLong(r10, r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.qc r11 = r1.G     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            r11.a(r14, r4, r8)     // Catch:{ all -> 0x0a11 }
            goto L_0x07f3
        L_0x07f0:
            r10 = r27
            r9 = 0
        L_0x07f3:
            com.google.android.gms.measurement.internal.m6 r4 = r1.f6792l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.c0 r4 = r4.z()     // Catch:{ all -> 0x0a11 }
            r4.n()     // Catch:{ all -> 0x0a11 }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.s4$a r4 = r2.x0(r4)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m6 r8 = r1.f6792l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.c0 r8 = r8.z()     // Catch:{ all -> 0x0a11 }
            r8.n()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.s4$a r4 = r4.N0(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m6 r8 = r1.f6792l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.c0 r8 = r8.z()     // Catch:{ all -> 0x0a11 }
            long r14 = r8.u()     // Catch:{ all -> 0x0a11 }
            int r8 = (int) r14     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.s4$a r4 = r4.v0(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m6 r8 = r1.f6792l     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.c0 r8 = r8.z()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r8.v()     // Catch:{ all -> 0x0a11 }
            r4.U0(r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.L     // Catch:{ all -> 0x0a11 }
            r2.z0(r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m6 r4 = r1.f6792l     // Catch:{ all -> 0x0a11 }
            boolean r4 = r4.o()     // Catch:{ all -> 0x0a11 }
            if (r4 == 0) goto L_0x0847
            r2.T0()     // Catch:{ all -> 0x0a11 }
            r4 = 0
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a11 }
            if (r8 != 0) goto L_0x0847
            r2.A0(r4)     // Catch:{ all -> 0x0a11 }
        L_0x0847:
            com.google.android.gms.measurement.internal.p r4 = r28.d0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.h6 r4 = r4.C0(r8)     // Catch:{ all -> 0x0a11 }
            if (r4 != 0) goto L_0x08b3
            com.google.android.gms.measurement.internal.h6 r4 = new com.google.android.gms.measurement.internal.h6     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.m6 r8 = r1.f6792l     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            r4.<init>(r8, r11)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r1.m(r7)     // Catch:{ all -> 0x0a11 }
            r4.x(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f6569w     // Catch:{ all -> 0x0a11 }
            r4.J(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f6560n     // Catch:{ all -> 0x0a11 }
            r4.M(r8)     // Catch:{ all -> 0x0a11 }
            boolean r8 = r7.x()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0880
            com.google.android.gms.measurement.internal.bb r8 = r1.f6789i     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            boolean r14 = r3.A     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r8.z(r11, r14)     // Catch:{ all -> 0x0a11 }
            r4.S(r8)     // Catch:{ all -> 0x0a11 }
        L_0x0880:
            r4.h0(r12)     // Catch:{ all -> 0x0a11 }
            r4.j0(r12)     // Catch:{ all -> 0x0a11 }
            r4.f0(r12)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f6561o     // Catch:{ all -> 0x0a11 }
            r4.F(r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.f6568v     // Catch:{ all -> 0x0a11 }
            r4.c(r14)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f6562p     // Catch:{ all -> 0x0a11 }
            r4.B(r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.f6563q     // Catch:{ all -> 0x0a11 }
            r4.d0(r14)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.f6564r     // Catch:{ all -> 0x0a11 }
            r4.X(r14)     // Catch:{ all -> 0x0a11 }
            boolean r8 = r3.f6566t     // Catch:{ all -> 0x0a11 }
            r4.y(r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.E     // Catch:{ all -> 0x0a11 }
            r4.Z(r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p r8 = r28.d0()     // Catch:{ all -> 0x0a11 }
            r8.U(r4)     // Catch:{ all -> 0x0a11 }
        L_0x08b3:
            boolean r7 = r7.y()     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x08d0
            java.lang.String r7 = r4.u0()     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x08d0
            java.lang.String r7 = r4.u0()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = h2.p.j(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            r2.V(r7)     // Catch:{ all -> 0x0a11 }
        L_0x08d0:
            java.lang.String r7 = r4.i()     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x08e7
            java.lang.String r7 = r4.i()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = h2.p.j(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            r2.H0(r7)     // Catch:{ all -> 0x0a11 }
        L_0x08e7:
            com.google.android.gms.measurement.internal.p r7 = r28.d0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.f6559m     // Catch:{ all -> 0x0a11 }
            java.util.List r7 = r7.L0(r8)     // Catch:{ all -> 0x0a11 }
            r8 = 0
        L_0x08f2:
            int r11 = r7.size()     // Catch:{ all -> 0x0a11 }
            if (r8 >= r11) goto L_0x0956
            com.google.android.gms.internal.measurement.w4$a r11 = com.google.android.gms.internal.measurement.w4.a0()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r14 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.pc r14 = (com.google.android.gms.measurement.internal.pc) r14     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r14.f6446c     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.w4$a r11 = r11.A(r14)     // Catch:{ all -> 0x0a11 }
            java.lang.Object r14 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.pc r14 = (com.google.android.gms.measurement.internal.pc) r14     // Catch:{ all -> 0x0a11 }
            long r14 = r14.f6447d     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.w4$a r11 = r11.C(r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.jc r14 = r28.l0()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r15 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.pc r15 = (com.google.android.gms.measurement.internal.pc) r15     // Catch:{ all -> 0x0a11 }
            java.lang.Object r15 = r15.f6448e     // Catch:{ all -> 0x0a11 }
            r14.T(r11, r15)     // Catch:{ all -> 0x0a11 }
            r2.G(r11)     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = "_sid"
            java.lang.Object r14 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.pc r14 = (com.google.android.gms.measurement.internal.pc) r14     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r14.f6446c     // Catch:{ all -> 0x0a11 }
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x0a11 }
            if (r11 == 0) goto L_0x0953
            long r14 = r4.o0()     // Catch:{ all -> 0x0a11 }
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x0953
            com.google.android.gms.measurement.internal.jc r11 = r28.l0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r3.J     // Catch:{ all -> 0x0a11 }
            long r14 = r11.y(r14)     // Catch:{ all -> 0x0a11 }
            long r16 = r4.o0()     // Catch:{ all -> 0x0a11 }
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0953
            r2.O0()     // Catch:{ all -> 0x0a11 }
        L_0x0953:
            int r8 = r8 + 1
            goto L_0x08f2
        L_0x0956:
            com.google.android.gms.measurement.internal.p r3 = r28.d0()     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.internal.measurement.da r4 = r2.l()     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.internal.measurement.p8 r4 = (com.google.android.gms.internal.measurement.p8) r4     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.internal.measurement.s4 r4 = (com.google.android.gms.internal.measurement.s4) r4     // Catch:{ IOException -> 0x09c9 }
            long r2 = r3.D(r4)     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.measurement.internal.p r4 = r28.d0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.d0 r7 = r5.f5844f     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x09bf
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0a11 }
        L_0x0972:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0985
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a11 }
            boolean r8 = r10.equals(r8)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0972
            goto L_0x09c0
        L_0x0985:
            com.google.android.gms.measurement.internal.w5 r7 = r28.g0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r5.f5839a     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = r5.f5840b     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.L(r8, r10)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p r14 = r28.d0()     // Catch:{ all -> 0x0a11 }
            long r15 = r28.t0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r5.f5839a     // Catch:{ all -> 0x0a11 }
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r8
            com.google.android.gms.measurement.internal.q r8 = r14.I(r15, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x09bf
            long r7 = r8.f6453e     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.g r10 = r28.b0()     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r5.f5839a     // Catch:{ all -> 0x0a11 }
            int r10 = r10.z(r11)     // Catch:{ all -> 0x0a11 }
            long r10 = (long) r10     // Catch:{ all -> 0x0a11 }
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x09bf
            goto L_0x09c0
        L_0x09bf:
            r6 = 0
        L_0x09c0:
            boolean r2 = r4.c0(r5, r2, r6)     // Catch:{ all -> 0x0a11 }
            if (r2 == 0) goto L_0x09e0
            r1.f6795o = r12     // Catch:{ all -> 0x0a11 }
            goto L_0x09e0
        L_0x09c9:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.x4 r4 = r28.k()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.z4 r4 = r4.F()     // Catch:{ all -> 0x0a11 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.T0()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.x4.u(r2)     // Catch:{ all -> 0x0a11 }
            r4.c(r5, r2, r3)     // Catch:{ all -> 0x0a11 }
        L_0x09e0:
            com.google.android.gms.measurement.internal.p r2 = r28.d0()     // Catch:{ all -> 0x0a11 }
            r2.S0()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.p r2 = r28.d0()
            r2.Q0()
            r28.M()
            com.google.android.gms.measurement.internal.x4 r2 = r28.k()
            com.google.android.gms.measurement.internal.z4 r2 = r2.J()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r24
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x0a11:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.p r3 = r28.d0()
            r3.Q0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zb.X(com.google.android.gms.measurement.internal.i0, com.google.android.gms.measurement.internal.sc):void");
    }

    private final z Z(String str) {
        i().m();
        o0();
        if (!kd.a()) {
            return z.f6758f;
        }
        z zVar = this.C.get(str);
        if (zVar != null) {
            return zVar;
        }
        z F0 = d0().F0(str);
        this.C.put(str, F0);
        return F0;
    }

    private final int b(FileChannel fileChannel) {
        i().m();
        if (fileChannel == null || !fileChannel.isOpen()) {
            k().F().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    k().K().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e10) {
            k().F().b("Failed to read from channel", e10);
            return 0;
        }
    }

    private static boolean c0(sc scVar) {
        return !TextUtils.isEmpty(scVar.f6560n) || !TextUtils.isEmpty(scVar.C);
    }

    private final z e(String str, z zVar, p7 p7Var, l lVar) {
        if (!kd.a()) {
            return z.f6758f;
        }
        int i10 = 90;
        if (g0().I(str) == null) {
            Boolean f10 = zVar.f();
            Boolean bool = Boolean.FALSE;
            if (f10 == bool) {
                i10 = zVar.a();
                lVar.c(p7.a.AD_USER_DATA, i10);
            } else {
                lVar.d(p7.a.AD_USER_DATA, k.FAILSAFE);
            }
            return new z(bool, i10, Boolean.TRUE, "-");
        }
        Boolean f11 = zVar.f();
        if (f11 != null) {
            i10 = zVar.a();
            lVar.c(p7.a.AD_USER_DATA, i10);
        } else {
            w5 w5Var = this.f6781a;
            p7.a aVar = p7.a.AD_USER_DATA;
            if (w5Var.B(str, aVar) == p7.a.AD_STORAGE && p7Var.s() != null) {
                f11 = p7Var.s();
                lVar.d(aVar, k.REMOTE_DELEGATION);
            }
            if (f11 == null) {
                f11 = Boolean.valueOf(this.f6781a.J(str, aVar));
                lVar.d(aVar, k.REMOTE_DEFAULT);
            }
        }
        p.j(f11);
        boolean X = this.f6781a.X(str);
        SortedSet<String> R = g0().R(str);
        if (!f11.booleanValue() || R.isEmpty()) {
            return new z(Boolean.FALSE, i10, Boolean.valueOf(X), "-");
        }
        Boolean bool2 = Boolean.TRUE;
        Boolean valueOf = Boolean.valueOf(X);
        String str2 = "";
        if (X) {
            str2 = TextUtils.join(str2, R);
        }
        return new z(bool2, i10, valueOf, str2);
    }

    private static yb h(yb ybVar) {
        if (ybVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (ybVar.v()) {
            return ybVar;
        } else {
            String valueOf = String.valueOf(ybVar.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    public static zb j(Context context) {
        p.j(context);
        p.j(context.getApplicationContext());
        if (H == null) {
            synchronized (zb.class) {
                if (H == null) {
                    H = new zb((lc) p.j(new lc(context)));
                }
            }
        }
        return H;
    }

    private final Boolean l(h6 h6Var) {
        try {
            if (h6Var.z() != -2147483648L) {
                if (h6Var.z() == ((long) c.a(this.f6792l.zza()).d(h6Var.t0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = c.a(this.f6792l.zza()).d(h6Var.t0(), 0).versionName;
                String h10 = h6Var.h();
                if (h10 != null && h10.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final String m(p7 p7Var) {
        if (!p7Var.y()) {
            return null;
        }
        byte[] bArr = new byte[16];
        m0().T0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    private static void n(n4.a aVar, int i10, String str) {
        List<p4> M = aVar.M();
        int i11 = 0;
        while (i11 < M.size()) {
            if (!"_err".equals(M.get(i11).f0())) {
                i11++;
            } else {
                return;
            }
        }
        aVar.D((p4) ((p8) p4.c0().C("_err").z(Long.valueOf((long) i10).longValue()).l())).D((p4) ((p8) p4.c0().C("_ev").E(str).l()));
    }

    private static void o(n4.a aVar, String str) {
        List<p4> M = aVar.M();
        for (int i10 = 0; i10 < M.size(); i10++) {
            if (str.equals(M.get(i10).f0())) {
                aVar.y(i10);
                return;
            }
        }
    }

    private final void p(s4.a aVar, long j10, boolean z9) {
        String str = z9 ? "_se" : "_lte";
        pc E0 = d0().E0(aVar.T0(), str);
        pc pcVar = (E0 == null || E0.f6448e == null) ? new pc(aVar.T0(), "auto", str, a().a(), Long.valueOf(j10)) : new pc(aVar.T0(), "auto", str, a().a(), Long.valueOf(((Long) E0.f6448e).longValue() + j10));
        w4 w4Var = (w4) ((p8) w4.a0().A(str).C(a().a()).z(((Long) pcVar.f6448e).longValue()).l());
        boolean z10 = false;
        int x9 = jc.x(aVar, str);
        if (x9 >= 0) {
            aVar.B(x9, w4Var);
            z10 = true;
        }
        if (!z10) {
            aVar.H(w4Var);
        }
        if (j10 > 0) {
            d0().d0(pcVar);
            k().J().c("Updated engagement user property. scope, value", z9 ? "session-scoped" : "lifetime", pcVar.f6448e);
        }
    }

    private final long t0() {
        long a10 = a().a();
        bb bbVar = this.f6789i;
        bbVar.t();
        bbVar.m();
        long a11 = bbVar.f5901i.a();
        if (a11 == 0) {
            a11 = 1 + ((long) bbVar.h().T0().nextInt(86400000));
            bbVar.f5901i.b(a11);
        }
        return ((((a10 + a11) / 1000) / 60) / 60) / 24;
    }

    private final i5 u0() {
        i5 i5Var = this.f6784d;
        if (i5Var != null) {
            return i5Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    static /* synthetic */ void v(zb zbVar, lc lcVar) {
        zbVar.i().m();
        zbVar.f6791k = new t5(zbVar);
        p pVar = new p(zbVar);
        pVar.u();
        zbVar.f6783c = pVar;
        zbVar.b0().q((i) p.j(zbVar.f6781a));
        bb bbVar = new bb(zbVar);
        bbVar.u();
        zbVar.f6789i = bbVar;
        xc xcVar = new xc(zbVar);
        xcVar.u();
        zbVar.f6786f = xcVar;
        p9 p9Var = new p9(zbVar);
        p9Var.u();
        zbVar.f6788h = p9Var;
        tb tbVar = new tb(zbVar);
        tbVar.u();
        zbVar.f6785e = tbVar;
        zbVar.f6784d = new i5(zbVar);
        if (zbVar.f6798r != zbVar.f6799s) {
            zbVar.k().F().c("Not all upload components initialized", Integer.valueOf(zbVar.f6798r), Integer.valueOf(zbVar.f6799s));
        }
        zbVar.f6793m = true;
    }

    private final tb v0() {
        return (tb) h(this.f6785e);
    }

    /* access modifiers changed from: package-private */
    public final void A(String str, z zVar) {
        i().m();
        o0();
        if (kd.a()) {
            this.C.put(str, zVar);
            d0().V(str, zVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void B(String str, p7 p7Var) {
        i().m();
        o0();
        this.B.put(str, p7Var);
        d0().W(str, p7Var);
    }

    public final void C(String str, r9 r9Var) {
        i().m();
        String str2 = this.F;
        if (str2 == null || str2.equals(str) || r9Var != null) {
            this.F = str;
            this.E = r9Var;
        }
    }

    /* access modifiers changed from: package-private */
    public final void D(String str, sc scVar) {
        i().m();
        o0();
        if (c0(scVar)) {
            if (!scVar.f6566t) {
                f(scVar);
            } else if (!"_npa".equals(str) || scVar.D == null) {
                k().E().b("Removing user property", this.f6792l.C().g(str));
                d0().P0();
                try {
                    f(scVar);
                    if ("_id".equals(str)) {
                        d0().K0((String) p.j(scVar.f6559m), "_lair");
                    }
                    d0().K0((String) p.j(scVar.f6559m), str);
                    d0().S0();
                    k().E().b("User property removed", this.f6792l.C().g(str));
                } finally {
                    d0().Q0();
                }
            } else {
                k().E().a("Falling back to manifest metadata value for ad personalization");
                w(new nc("_npa", a().a(), Long.valueOf(scVar.D.booleanValue() ? 1 : 0), "auto"), scVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void G(boolean z9) {
        M();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2 A[Catch:{ all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0131 A[Catch:{ SQLiteException -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0135 A[Catch:{ SQLiteException -> 0x0149 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(boolean r9, int r10, java.lang.Throwable r11, byte[] r12, java.lang.String r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.f6 r13 = r8.i()
            r13.m()
            r8.o0()
            r13 = 0
            if (r12 != 0) goto L_0x000f
            byte[] r12 = new byte[r13]     // Catch:{ all -> 0x01c0 }
        L_0x000f:
            java.util.List<java.lang.Long> r0 = r8.f6805y     // Catch:{ all -> 0x01c0 }
            java.lang.Object r0 = h2.p.j(r0)     // Catch:{ all -> 0x01c0 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01c0 }
            r1 = 0
            r8.f6805y = r1     // Catch:{ all -> 0x01c0 }
            boolean r2 = com.google.android.gms.internal.measurement.fd.a()     // Catch:{ all -> 0x01c0 }
            r3 = 1
            if (r2 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.g r2 = r8.b0()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.k0.Y0     // Catch:{ all -> 0x01c0 }
            boolean r2 = r2.r(r4)     // Catch:{ all -> 0x01c0 }
            if (r2 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x0039
        L_0x002f:
            r2 = 200(0xc8, float:2.8E-43)
            if (r10 == r2) goto L_0x0037
            r2 = 204(0xcc, float:2.86E-43)
            if (r10 != r2) goto L_0x0175
        L_0x0037:
            if (r11 != 0) goto L_0x0175
        L_0x0039:
            boolean r11 = com.google.android.gms.internal.measurement.fd.a()     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x004d
            com.google.android.gms.measurement.internal.g r11 = r8.b0()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.k0.Y0     // Catch:{ SQLiteException -> 0x0149 }
            boolean r11 = r11.r(r2)     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x004d
            if (r9 == 0) goto L_0x005c
        L_0x004d:
            com.google.android.gms.measurement.internal.bb r11 = r8.f6789i     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.p5 r11 = r11.f5899g     // Catch:{ SQLiteException -> 0x0149 }
            l2.d r2 = r8.a()     // Catch:{ SQLiteException -> 0x0149 }
            long r4 = r2.a()     // Catch:{ SQLiteException -> 0x0149 }
            r11.b(r4)     // Catch:{ SQLiteException -> 0x0149 }
        L_0x005c:
            com.google.android.gms.measurement.internal.bb r11 = r8.f6789i     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.p5 r11 = r11.f5900h     // Catch:{ SQLiteException -> 0x0149 }
            r4 = 0
            r11.b(r4)     // Catch:{ SQLiteException -> 0x0149 }
            r8.M()     // Catch:{ SQLiteException -> 0x0149 }
            boolean r11 = com.google.android.gms.internal.measurement.fd.a()     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x009b
            com.google.android.gms.measurement.internal.g r11 = r8.b0()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.k0.Y0     // Catch:{ SQLiteException -> 0x0149 }
            boolean r11 = r11.r(r2)     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x009b
            if (r9 == 0) goto L_0x007d
            goto L_0x009b
        L_0x007d:
            boolean r9 = com.google.android.gms.internal.measurement.fd.a()     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x00b1
            com.google.android.gms.measurement.internal.g r9 = r8.b0()     // Catch:{ SQLiteException -> 0x0149 }
            boolean r9 = r9.r(r2)     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x00b1
            com.google.android.gms.measurement.internal.x4 r9 = r8.k()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.z4 r9 = r9.J()     // Catch:{ SQLiteException -> 0x0149 }
            java.lang.String r10 = "Purged empty bundles"
            r9.a(r10)     // Catch:{ SQLiteException -> 0x0149 }
            goto L_0x00b1
        L_0x009b:
            com.google.android.gms.measurement.internal.x4 r9 = r8.k()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.z4 r9 = r9.J()     // Catch:{ SQLiteException -> 0x0149 }
            java.lang.String r11 = "Successful upload. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x0149 }
            int r12 = r12.length     // Catch:{ SQLiteException -> 0x0149 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x0149 }
            r9.c(r11, r10, r12)     // Catch:{ SQLiteException -> 0x0149 }
        L_0x00b1:
            com.google.android.gms.measurement.internal.p r9 = r8.d0()     // Catch:{ SQLiteException -> 0x0149 }
            r9.P0()     // Catch:{ SQLiteException -> 0x0149 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0140 }
        L_0x00bc:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0140 }
            if (r10 == 0) goto L_0x0111
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0140 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0140 }
            com.google.android.gms.measurement.internal.p r11 = r8.d0()     // Catch:{ SQLiteException -> 0x0104 }
            long r6 = r10.longValue()     // Catch:{ SQLiteException -> 0x0104 }
            r11.m()     // Catch:{ SQLiteException -> 0x0104 }
            r11.t()     // Catch:{ SQLiteException -> 0x0104 }
            android.database.sqlite.SQLiteDatabase r12 = r11.A()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0104 }
            r0[r13] = r2     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r2 = "queue"
            java.lang.String r6 = "rowid=?"
            int r12 = r12.delete(r2, r6, r0)     // Catch:{ SQLiteException -> 0x00f5 }
            if (r12 != r3) goto L_0x00ed
            goto L_0x00bc
        L_0x00ed:
            android.database.sqlite.SQLiteException r12 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00f5 }
            java.lang.String r0 = "Deleted fewer rows from queue than expected"
            r12.<init>(r0)     // Catch:{ SQLiteException -> 0x00f5 }
            throw r12     // Catch:{ SQLiteException -> 0x00f5 }
        L_0x00f5:
            r12 = move-exception
            com.google.android.gms.measurement.internal.x4 r11 = r11.k()     // Catch:{ SQLiteException -> 0x0104 }
            com.google.android.gms.measurement.internal.z4 r11 = r11.F()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r0 = "Failed to delete a bundle in a queue table"
            r11.b(r0, r12)     // Catch:{ SQLiteException -> 0x0104 }
            throw r12     // Catch:{ SQLiteException -> 0x0104 }
        L_0x0104:
            r11 = move-exception
            java.util.List<java.lang.Long> r12 = r8.f6806z     // Catch:{ all -> 0x0140 }
            if (r12 == 0) goto L_0x0110
            boolean r10 = r12.contains(r10)     // Catch:{ all -> 0x0140 }
            if (r10 == 0) goto L_0x0110
            goto L_0x00bc
        L_0x0110:
            throw r11     // Catch:{ all -> 0x0140 }
        L_0x0111:
            com.google.android.gms.measurement.internal.p r9 = r8.d0()     // Catch:{ all -> 0x0140 }
            r9.S0()     // Catch:{ all -> 0x0140 }
            com.google.android.gms.measurement.internal.p r9 = r8.d0()     // Catch:{ SQLiteException -> 0x0149 }
            r9.Q0()     // Catch:{ SQLiteException -> 0x0149 }
            r8.f6806z = r1     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.e5 r9 = r8.f0()     // Catch:{ SQLiteException -> 0x0149 }
            boolean r9 = r9.z()     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x0135
            boolean r9 = r8.N()     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x0135
            r8.s0()     // Catch:{ SQLiteException -> 0x0149 }
            goto L_0x013c
        L_0x0135:
            r9 = -1
            r8.A = r9     // Catch:{ SQLiteException -> 0x0149 }
            r8.M()     // Catch:{ SQLiteException -> 0x0149 }
        L_0x013c:
            r8.f6795o = r4     // Catch:{ SQLiteException -> 0x0149 }
            goto L_0x01ba
        L_0x0140:
            r9 = move-exception
            com.google.android.gms.measurement.internal.p r10 = r8.d0()     // Catch:{ SQLiteException -> 0x0149 }
            r10.Q0()     // Catch:{ SQLiteException -> 0x0149 }
            throw r9     // Catch:{ SQLiteException -> 0x0149 }
        L_0x0149:
            r9 = move-exception
            com.google.android.gms.measurement.internal.x4 r10 = r8.k()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.z4 r10 = r10.F()     // Catch:{ all -> 0x01c0 }
            java.lang.String r11 = "Database error while trying to delete uploaded bundles"
            r10.b(r11, r9)     // Catch:{ all -> 0x01c0 }
            l2.d r9 = r8.a()     // Catch:{ all -> 0x01c0 }
            long r9 = r9.b()     // Catch:{ all -> 0x01c0 }
            r8.f6795o = r9     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.x4 r9 = r8.k()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.z4 r9 = r9.J()     // Catch:{ all -> 0x01c0 }
            java.lang.String r10 = "Disable upload, time"
            long r11 = r8.f6795o     // Catch:{ all -> 0x01c0 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01c0 }
            r9.b(r10, r11)     // Catch:{ all -> 0x01c0 }
            goto L_0x01ba
        L_0x0175:
            com.google.android.gms.measurement.internal.x4 r9 = r8.k()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.z4 r9 = r9.J()     // Catch:{ all -> 0x01c0 }
            java.lang.String r12 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01c0 }
            r9.c(r12, r1, r11)     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.bb r9 = r8.f6789i     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.p5 r9 = r9.f5900h     // Catch:{ all -> 0x01c0 }
            l2.d r11 = r8.a()     // Catch:{ all -> 0x01c0 }
            long r11 = r11.a()     // Catch:{ all -> 0x01c0 }
            r9.b(r11)     // Catch:{ all -> 0x01c0 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x019f
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            r3 = 0
        L_0x019f:
            if (r3 == 0) goto L_0x01b0
            com.google.android.gms.measurement.internal.bb r9 = r8.f6789i     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.p5 r9 = r9.f5898f     // Catch:{ all -> 0x01c0 }
            l2.d r10 = r8.a()     // Catch:{ all -> 0x01c0 }
            long r10 = r10.a()     // Catch:{ all -> 0x01c0 }
            r9.b(r10)     // Catch:{ all -> 0x01c0 }
        L_0x01b0:
            com.google.android.gms.measurement.internal.p r9 = r8.d0()     // Catch:{ all -> 0x01c0 }
            r9.Z(r0)     // Catch:{ all -> 0x01c0 }
            r8.M()     // Catch:{ all -> 0x01c0 }
        L_0x01ba:
            r8.f6801u = r13
            r8.L()
            return
        L_0x01c0:
            r9 = move-exception
            r8.f6801u = r13
            r8.L()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zb.H(boolean, int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final p7 P(String str) {
        i().m();
        o0();
        p7 p7Var = this.B.get(str);
        if (p7Var == null) {
            p7Var = d0().H0(str);
            if (p7Var == null) {
                p7Var = p7.f6429c;
            }
            B(str, p7Var);
        }
        return p7Var;
    }

    /* access modifiers changed from: package-private */
    public final String Q(sc scVar) {
        try {
            return (String) i().v(new dc(this, scVar)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            k().F().c("Failed to get app instance id. appId", x4.u(scVar.f6559m), e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void R(e eVar) {
        sc V = V((String) p.j(eVar.f5969m));
        if (V != null) {
            S(eVar, V);
        }
    }

    /* access modifiers changed from: package-private */
    public final void S(e eVar, sc scVar) {
        z4 F2;
        String str;
        Object u9;
        String g10;
        Object d10;
        z4 F3;
        String str2;
        Object u10;
        String g11;
        Object obj;
        boolean z9;
        p.j(eVar);
        p.f(eVar.f5969m);
        p.j(eVar.f5970n);
        p.j(eVar.f5971o);
        p.f(eVar.f5971o.f6359n);
        i().m();
        o0();
        if (c0(scVar)) {
            if (!scVar.f6566t) {
                f(scVar);
                return;
            }
            e eVar2 = new e(eVar);
            boolean z10 = false;
            eVar2.f5973q = false;
            d0().P0();
            try {
                e A0 = d0().A0((String) p.j(eVar2.f5969m), eVar2.f5971o.f6359n);
                if (A0 != null && !A0.f5970n.equals(eVar2.f5970n)) {
                    k().K().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f6792l.C().g(eVar2.f5971o.f6359n), eVar2.f5970n, A0.f5970n);
                }
                if (A0 != null && (z9 = A0.f5973q)) {
                    eVar2.f5970n = A0.f5970n;
                    eVar2.f5972p = A0.f5972p;
                    eVar2.f5976t = A0.f5976t;
                    eVar2.f5974r = A0.f5974r;
                    eVar2.f5977u = A0.f5977u;
                    eVar2.f5973q = z9;
                    nc ncVar = eVar2.f5971o;
                    eVar2.f5971o = new nc(ncVar.f6359n, A0.f5971o.f6360o, ncVar.d(), A0.f5971o.f6364s);
                } else if (TextUtils.isEmpty(eVar2.f5974r)) {
                    nc ncVar2 = eVar2.f5971o;
                    eVar2.f5971o = new nc(ncVar2.f6359n, eVar2.f5972p, ncVar2.d(), eVar2.f5971o.f6364s);
                    eVar2.f5973q = true;
                    z10 = true;
                }
                if (eVar2.f5973q) {
                    nc ncVar3 = eVar2.f5971o;
                    pc pcVar = new pc((String) p.j(eVar2.f5969m), eVar2.f5970n, ncVar3.f6359n, ncVar3.f6360o, p.j(ncVar3.d()));
                    if (d0().d0(pcVar)) {
                        F3 = k().E();
                        str2 = "User property updated immediately";
                        u10 = eVar2.f5969m;
                        g11 = this.f6792l.C().g(pcVar.f6446c);
                        obj = pcVar.f6448e;
                    } else {
                        F3 = k().F();
                        str2 = "(2)Too many active user properties, ignoring";
                        u10 = x4.u(eVar2.f5969m);
                        g11 = this.f6792l.C().g(pcVar.f6446c);
                        obj = pcVar.f6448e;
                    }
                    F3.d(str2, u10, g11, obj);
                    if (z10 && eVar2.f5977u != null) {
                        X(new i0(eVar2.f5977u, eVar2.f5972p), scVar);
                    }
                }
                if (d0().b0(eVar2)) {
                    F2 = k().E();
                    str = "Conditional property added";
                    u9 = eVar2.f5969m;
                    g10 = this.f6792l.C().g(eVar2.f5971o.f6359n);
                    d10 = eVar2.f5971o.d();
                } else {
                    F2 = k().F();
                    str = "Too many conditional properties, ignoring";
                    u9 = x4.u(eVar2.f5969m);
                    g10 = this.f6792l.C().g(eVar2.f5971o.f6359n);
                    d10 = eVar2.f5971o.d();
                }
                F2.d(str, u9, g10, d10);
                d0().S0();
            } finally {
                d0().Q0();
            }
        }
    }

    public final xc W() {
        return (xc) h(this.f6786f);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03b6 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03e1 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03f8 A[SYNTHETIC, Splitter:B:133:0x03f8] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04b2 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x051f A[Catch:{ SQLiteException -> 0x01c4, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0119 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d9 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0210 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0231 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0237 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0244 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x054b }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0253 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x054b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y(com.google.android.gms.measurement.internal.sc r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "com.android.vending"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            com.google.android.gms.measurement.internal.f6 r9 = r23.i()
            r9.m()
            r23.o0()
            h2.p.j(r24)
            java.lang.String r9 = r2.f6559m
            h2.p.f(r9)
            boolean r9 = c0(r24)
            if (r9 != 0) goto L_0x002b
            return
        L_0x002b:
            com.google.android.gms.measurement.internal.p r9 = r23.d0()
            java.lang.String r10 = r2.f6559m
            com.google.android.gms.measurement.internal.h6 r9 = r9.C0(r10)
            r10 = 0
            if (r9 == 0) goto L_0x005e
            java.lang.String r12 = r9.j()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x005e
            java.lang.String r12 = r2.f6560n
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x005e
            r9.A(r10)
            com.google.android.gms.measurement.internal.p r12 = r23.d0()
            r12.U(r9)
            com.google.android.gms.measurement.internal.w5 r9 = r23.g0()
            java.lang.String r12 = r2.f6559m
            r9.T(r12)
        L_0x005e:
            boolean r9 = r2.f6566t
            if (r9 != 0) goto L_0x0066
            r23.f(r24)
            return
        L_0x0066:
            long r12 = r2.f6571y
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0074
            l2.d r9 = r23.a()
            long r12 = r9.a()
        L_0x0074:
            com.google.android.gms.measurement.internal.m6 r9 = r1.f6792l
            com.google.android.gms.measurement.internal.c0 r9 = r9.z()
            r9.w()
            int r9 = r2.f6572z
            r15 = 1
            if (r9 == 0) goto L_0x009c
            if (r9 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.x4 r16 = r23.k()
            com.google.android.gms.measurement.internal.z4 r14 = r16.K()
            java.lang.String r15 = r2.f6559m
            java.lang.Object r15 = com.google.android.gms.measurement.internal.x4.u(r15)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "Incorrect app type, assuming installed app. appId, appType"
            r14.c(r10, r15, r9)
            r9 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.p r10 = r23.d0()
            r10.P0()
            com.google.android.gms.measurement.internal.p r10 = r23.d0()     // Catch:{ all -> 0x054b }
            java.lang.String r11 = r2.f6559m     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.pc r10 = r10.E0(r11, r0)     // Catch:{ all -> 0x054b }
            if (r10 == 0) goto L_0x00c1
            java.lang.String r11 = "auto"
            java.lang.String r14 = r10.f6445b     // Catch:{ all -> 0x054b }
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x054b }
            if (r11 == 0) goto L_0x00ba
            goto L_0x00c1
        L_0x00ba:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            goto L_0x0107
        L_0x00c1:
            java.lang.Boolean r11 = r2.D     // Catch:{ all -> 0x054b }
            if (r11 == 0) goto L_0x00fc
            com.google.android.gms.measurement.internal.nc r0 = new com.google.android.gms.measurement.internal.nc     // Catch:{ all -> 0x054b }
            java.lang.String r15 = "_npa"
            java.lang.Boolean r11 = r2.D     // Catch:{ all -> 0x054b }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x054b }
            if (r11 == 0) goto L_0x00d4
            r20 = 1
            goto L_0x00d6
        L_0x00d4:
            r20 = 0
        L_0x00d6:
            java.lang.Long r11 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x054b }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 0
            r14 = r0
            r4 = 1
            r16 = r12
            r18 = r11
            r19 = r20
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x054b }
            if (r10 == 0) goto L_0x00f8
            java.lang.Object r10 = r10.f6448e     // Catch:{ all -> 0x054b }
            java.lang.Long r11 = r0.f6361p     // Catch:{ all -> 0x054b }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x054b }
            if (r10 != 0) goto L_0x0107
        L_0x00f8:
            r1.w(r0, r2)     // Catch:{ all -> 0x054b }
            goto L_0x0107
        L_0x00fc:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0107
            r1.D(r0, r2)     // Catch:{ all -> 0x054b }
        L_0x0107:
            com.google.android.gms.measurement.internal.p r0 = r23.d0()     // Catch:{ all -> 0x054b }
            java.lang.String r10 = r2.f6559m     // Catch:{ all -> 0x054b }
            java.lang.Object r10 = h2.p.j(r10)     // Catch:{ all -> 0x054b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.h6 r0 = r0.C0(r10)     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x01d7
            r23.m0()     // Catch:{ all -> 0x054b }
            java.lang.String r11 = r2.f6560n     // Catch:{ all -> 0x054b }
            java.lang.String r14 = r0.j()     // Catch:{ all -> 0x054b }
            java.lang.String r15 = r2.C     // Catch:{ all -> 0x054b }
            java.lang.String r10 = r0.r0()     // Catch:{ all -> 0x054b }
            boolean r10 = com.google.android.gms.measurement.internal.oc.k0(r11, r14, r15, r10)     // Catch:{ all -> 0x054b }
            if (r10 == 0) goto L_0x01d7
            com.google.android.gms.measurement.internal.x4 r10 = r23.k()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.z4 r10 = r10.K()     // Catch:{ all -> 0x054b }
            java.lang.String r11 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r14 = r0.t0()     // Catch:{ all -> 0x054b }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.x4.u(r14)     // Catch:{ all -> 0x054b }
            r10.b(r11, r14)     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.p r10 = r23.d0()     // Catch:{ all -> 0x054b }
            java.lang.String r11 = r0.t0()     // Catch:{ all -> 0x054b }
            r10.t()     // Catch:{ all -> 0x054b }
            r10.m()     // Catch:{ all -> 0x054b }
            h2.p.f(r11)     // Catch:{ all -> 0x054b }
            android.database.sqlite.SQLiteDatabase r0 = r10.A()     // Catch:{ SQLiteException -> 0x01c4 }
            java.lang.String[] r14 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01c4 }
            r14[r3] = r11     // Catch:{ SQLiteException -> 0x01c4 }
            java.lang.String r15 = "events"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "user_attributes"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "conditional_properties"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "apps"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "raw_events"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "raw_events_metadata"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "event_filters"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "property_filters"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "audience_filter_values"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "consent_settings"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "default_event_params"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "trigger_uris"
            int r0 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r0
            if (r15 <= 0) goto L_0x01d6
            com.google.android.gms.measurement.internal.x4 r0 = r10.k()     // Catch:{ SQLiteException -> 0x01c4 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.J()     // Catch:{ SQLiteException -> 0x01c4 }
            java.lang.String r3 = "Deleted application data. app, records"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x01c4 }
            r0.c(r3, r11, r8)     // Catch:{ SQLiteException -> 0x01c4 }
            goto L_0x01d6
        L_0x01c4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.x4 r3 = r10.k()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()     // Catch:{ all -> 0x054b }
            java.lang.String r8 = "Error deleting application data. appId, error"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.x4.u(r11)     // Catch:{ all -> 0x054b }
            r3.c(r8, r10, r0)     // Catch:{ all -> 0x054b }
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            if (r0 == 0) goto L_0x0231
            long r10 = r0.z()     // Catch:{ all -> 0x054b }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x01f1
            long r10 = r0.z()     // Catch:{ all -> 0x054b }
            r3 = r5
            long r4 = r2.f6568v     // Catch:{ all -> 0x054b }
            int r16 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x01f2
            r4 = 1
            goto L_0x01f3
        L_0x01f1:
            r3 = r5
        L_0x01f2:
            r4 = 0
        L_0x01f3:
            java.lang.String r5 = r0.h()     // Catch:{ all -> 0x054b }
            long r10 = r0.z()     // Catch:{ all -> 0x054b }
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x020b
            if (r5 == 0) goto L_0x020b
            java.lang.String r0 = r2.f6561o     // Catch:{ all -> 0x054b }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x054b }
            if (r0 != 0) goto L_0x020b
            r15 = 1
            goto L_0x020c
        L_0x020b:
            r15 = 0
        L_0x020c:
            r0 = r4 | r15
            if (r0 == 0) goto L_0x0232
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x054b }
            r0.<init>()     // Catch:{ all -> 0x054b }
            java.lang.String r4 = "_pv"
            r0.putString(r4, r5)     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.i0 r4 = new com.google.android.gms.measurement.internal.i0     // Catch:{ all -> 0x054b }
            java.lang.String r15 = "_au"
            com.google.android.gms.measurement.internal.d0 r5 = new com.google.android.gms.measurement.internal.d0     // Catch:{ all -> 0x054b }
            r5.<init>(r0)     // Catch:{ all -> 0x054b }
            java.lang.String r17 = "auto"
            r14 = r4
            r16 = r5
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x054b }
            r1.s(r4, r2)     // Catch:{ all -> 0x054b }
            goto L_0x0232
        L_0x0231:
            r3 = r5
        L_0x0232:
            r23.f(r24)     // Catch:{ all -> 0x054b }
            if (r9 != 0) goto L_0x0244
            com.google.android.gms.measurement.internal.p r0 = r23.d0()     // Catch:{ all -> 0x054b }
            java.lang.String r4 = r2.f6559m     // Catch:{ all -> 0x054b }
            java.lang.String r5 = "_f"
        L_0x023f:
            com.google.android.gms.measurement.internal.e0 r0 = r0.B0(r4, r5)     // Catch:{ all -> 0x054b }
            goto L_0x0251
        L_0x0244:
            r4 = 1
            if (r9 != r4) goto L_0x0250
            com.google.android.gms.measurement.internal.p r0 = r23.d0()     // Catch:{ all -> 0x054b }
            java.lang.String r4 = r2.f6559m     // Catch:{ all -> 0x054b }
            java.lang.String r5 = "_v"
            goto L_0x023f
        L_0x0250:
            r0 = 0
        L_0x0251:
            if (r0 != 0) goto L_0x051f
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            long r10 = r12 / r4
            r14 = 1
            long r10 = r10 + r14
            long r10 = r10 * r4
            java.lang.String r4 = "_dac"
            java.lang.String r5 = "_et"
            java.lang.String r15 = "_r"
            java.lang.String r14 = "_c"
            if (r9 != 0) goto L_0x04cf
            com.google.android.gms.measurement.internal.nc r0 = new com.google.android.gms.measurement.internal.nc     // Catch:{ all -> 0x054b }
            java.lang.String r9 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x054b }
            java.lang.String r19 = "auto"
            r10 = r14
            r14 = r0
            r11 = r15
            r15 = r9
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x054b }
            r1.w(r0, r2)     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.f6 r0 = r23.i()     // Catch:{ all -> 0x054b }
            r0.m()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.t5 r0 = r1.f6791k     // Catch:{ all -> 0x054b }
            java.lang.Object r0 = h2.p.j(r0)     // Catch:{ all -> 0x054b }
            r9 = r0
            com.google.android.gms.measurement.internal.t5 r9 = (com.google.android.gms.measurement.internal.t5) r9     // Catch:{ all -> 0x054b }
            java.lang.String r0 = r2.f6559m     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x0376
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x054b }
            if (r14 == 0) goto L_0x0299
            goto L_0x0376
        L_0x0299:
            com.google.android.gms.measurement.internal.m6 r14 = r9.f6578a     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.f6 r14 = r14.i()     // Catch:{ all -> 0x054b }
            r14.m()     // Catch:{ all -> 0x054b }
            boolean r14 = r9.b()     // Catch:{ all -> 0x054b }
            if (r14 != 0) goto L_0x02b9
            com.google.android.gms.measurement.internal.m6 r0 = r9.f6578a     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.z4 r0 = r0.I()     // Catch:{ all -> 0x054b }
            java.lang.String r6 = "Install Referrer Reporter is not available"
        L_0x02b4:
            r0.a(r6)     // Catch:{ all -> 0x054b }
            goto L_0x0384
        L_0x02b9:
            com.google.android.gms.measurement.internal.s5 r14 = new com.google.android.gms.measurement.internal.s5     // Catch:{ all -> 0x054b }
            r14.<init>(r9, r0)     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.m6 r0 = r9.f6578a     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.f6 r0 = r0.i()     // Catch:{ all -> 0x054b }
            r0.m()     // Catch:{ all -> 0x054b }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x054b }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x054b }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x054b }
            java.lang.String r8 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r6, r8)     // Catch:{ all -> 0x054b }
            r0.setComponent(r15)     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.m6 r8 = r9.f6578a     // Catch:{ all -> 0x054b }
            android.content.Context r8 = r8.zza()     // Catch:{ all -> 0x054b }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ all -> 0x054b }
            if (r8 != 0) goto L_0x02f1
            com.google.android.gms.measurement.internal.m6 r0 = r9.f6578a     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.z4 r0 = r0.M()     // Catch:{ all -> 0x054b }
            java.lang.String r6 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            goto L_0x02b4
        L_0x02f1:
            r15 = 0
            java.util.List r8 = r8.queryIntentServices(r0, r15)     // Catch:{ all -> 0x054b }
            if (r8 == 0) goto L_0x0368
            boolean r17 = r8.isEmpty()     // Catch:{ all -> 0x054b }
            if (r17 != 0) goto L_0x0368
            java.lang.Object r8 = r8.get(r15)     // Catch:{ all -> 0x054b }
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8     // Catch:{ all -> 0x054b }
            android.content.pm.ServiceInfo r8 = r8.serviceInfo     // Catch:{ all -> 0x054b }
            if (r8 == 0) goto L_0x0384
            java.lang.String r15 = r8.packageName     // Catch:{ all -> 0x054b }
            java.lang.String r8 = r8.name     // Catch:{ all -> 0x054b }
            if (r8 == 0) goto L_0x035a
            boolean r6 = r6.equals(r15)     // Catch:{ all -> 0x054b }
            if (r6 == 0) goto L_0x035a
            boolean r6 = r9.b()     // Catch:{ all -> 0x054b }
            if (r6 == 0) goto L_0x035a
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x054b }
            r6.<init>(r0)     // Catch:{ all -> 0x054b }
            k2.a r0 = k2.a.b()     // Catch:{ RuntimeException -> 0x0345 }
            com.google.android.gms.measurement.internal.m6 r8 = r9.f6578a     // Catch:{ RuntimeException -> 0x0345 }
            android.content.Context r8 = r8.zza()     // Catch:{ RuntimeException -> 0x0345 }
            r15 = 1
            boolean r0 = r0.a(r8, r6, r14, r15)     // Catch:{ RuntimeException -> 0x0345 }
            com.google.android.gms.measurement.internal.m6 r6 = r9.f6578a     // Catch:{ RuntimeException -> 0x0345 }
            com.google.android.gms.measurement.internal.x4 r6 = r6.k()     // Catch:{ RuntimeException -> 0x0345 }
            com.google.android.gms.measurement.internal.z4 r6 = r6.J()     // Catch:{ RuntimeException -> 0x0345 }
            java.lang.String r14 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x033f
            java.lang.String r0 = "available"
            goto L_0x0341
        L_0x033f:
            java.lang.String r0 = "not available"
        L_0x0341:
            r6.b(r14, r0)     // Catch:{ RuntimeException -> 0x0345 }
            goto L_0x0384
        L_0x0345:
            r0 = move-exception
            com.google.android.gms.measurement.internal.m6 r6 = r9.f6578a     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.x4 r6 = r6.k()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.z4 r6 = r6.F()     // Catch:{ all -> 0x054b }
            java.lang.String r9 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x054b }
            r6.b(r9, r0)     // Catch:{ all -> 0x054b }
            goto L_0x0384
        L_0x035a:
            com.google.android.gms.measurement.internal.m6 r0 = r9.f6578a     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.z4 r0 = r0.K()     // Catch:{ all -> 0x054b }
            java.lang.String r6 = "Play Store version 8.3.73 or higher required for Install Referrer"
            goto L_0x02b4
        L_0x0368:
            com.google.android.gms.measurement.internal.m6 r0 = r9.f6578a     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.z4 r0 = r0.I()     // Catch:{ all -> 0x054b }
            java.lang.String r6 = "Play Service for fetching Install Referrer is unavailable on device"
            goto L_0x02b4
        L_0x0376:
            com.google.android.gms.measurement.internal.m6 r0 = r9.f6578a     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.z4 r0 = r0.M()     // Catch:{ all -> 0x054b }
            java.lang.String r6 = "Install Referrer Reporter was called with invalid app package name"
            goto L_0x02b4
        L_0x0384:
            com.google.android.gms.measurement.internal.f6 r0 = r23.i()     // Catch:{ all -> 0x054b }
            r0.m()     // Catch:{ all -> 0x054b }
            r23.o0()     // Catch:{ all -> 0x054b }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x054b }
            r6.<init>()     // Catch:{ all -> 0x054b }
            r14 = 1
            r6.putLong(r10, r14)     // Catch:{ all -> 0x054b }
            r6.putLong(r11, r14)     // Catch:{ all -> 0x054b }
            r9 = 0
            r6.putLong(r7, r9)     // Catch:{ all -> 0x054b }
            r6.putLong(r3, r9)     // Catch:{ all -> 0x054b }
            r11 = r22
            r6.putLong(r11, r9)     // Catch:{ all -> 0x054b }
            r15 = r21
            r6.putLong(r15, r9)     // Catch:{ all -> 0x054b }
            r9 = 1
            r6.putLong(r5, r9)     // Catch:{ all -> 0x054b }
            boolean r0 = r2.B     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x03b9
            r6.putLong(r4, r9)     // Catch:{ all -> 0x054b }
        L_0x03b9:
            java.lang.String r0 = r2.f6559m     // Catch:{ all -> 0x054b }
            java.lang.Object r0 = h2.p.j(r0)     // Catch:{ all -> 0x054b }
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.p r0 = r23.d0()     // Catch:{ all -> 0x054b }
            h2.p.f(r4)     // Catch:{ all -> 0x054b }
            r0.m()     // Catch:{ all -> 0x054b }
            r0.t()     // Catch:{ all -> 0x054b }
            java.lang.String r5 = "first_open_count"
            long r9 = r0.v0(r4, r5)     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.m6 r0 = r1.f6792l     // Catch:{ all -> 0x054b }
            android.content.Context r0 = r0.zza()     // Catch:{ all -> 0x054b }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x054b }
            if (r0 != 0) goto L_0x03f8
            com.google.android.gms.measurement.internal.x4 r0 = r23.k()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()     // Catch:{ all -> 0x054b }
            java.lang.String r5 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.x4.u(r4)     // Catch:{ all -> 0x054b }
            r0.b(r5, r4)     // Catch:{ all -> 0x054b }
            r22 = r3
        L_0x03f4:
            r3 = 0
            goto L_0x04ae
        L_0x03f8:
            com.google.android.gms.measurement.internal.m6 r0 = r1.f6792l     // Catch:{ NameNotFoundException -> 0x0408 }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x0408 }
            n2.b r0 = n2.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0408 }
            r5 = 0
            android.content.pm.PackageInfo r0 = r0.d(r4, r5)     // Catch:{ NameNotFoundException -> 0x0408 }
            goto L_0x041b
        L_0x0408:
            r0 = move-exception
            com.google.android.gms.measurement.internal.x4 r5 = r23.k()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.z4 r5 = r5.F()     // Catch:{ all -> 0x054b }
            java.lang.String r14 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.x4.u(r4)     // Catch:{ all -> 0x054b }
            r5.c(r14, r8, r0)     // Catch:{ all -> 0x054b }
            r0 = 0
        L_0x041b:
            if (r0 == 0) goto L_0x046d
            r8 = r15
            long r14 = r0.firstInstallTime     // Catch:{ all -> 0x054b }
            r16 = 0
            int r5 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            r22 = r3
            if (r5 == 0) goto L_0x046a
            r5 = r4
            long r3 = r0.lastUpdateTime     // Catch:{ all -> 0x054b }
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x044c
            com.google.android.gms.measurement.internal.g r0 = r23.b0()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.k0.f6204o0     // Catch:{ all -> 0x054b }
            boolean r0 = r0.r(r3)     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x0447
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x044a
            r3 = 1
        L_0x0443:
            r6.putLong(r7, r3)     // Catch:{ all -> 0x054b }
            goto L_0x044a
        L_0x0447:
            r3 = 1
            goto L_0x0443
        L_0x044a:
            r15 = 0
            goto L_0x044d
        L_0x044c:
            r15 = 1
        L_0x044d:
            com.google.android.gms.measurement.internal.nc r0 = new com.google.android.gms.measurement.internal.nc     // Catch:{ all -> 0x054b }
            java.lang.String r3 = "_fi"
            if (r15 == 0) goto L_0x0456
            r14 = 1
            goto L_0x0458
        L_0x0456:
            r14 = 0
        L_0x0458:
            java.lang.Long r18 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x054b }
            java.lang.String r19 = "auto"
            r14 = r0
            r4 = r8
            r15 = r3
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x054b }
            r1.w(r0, r2)     // Catch:{ all -> 0x054b }
            goto L_0x0471
        L_0x046a:
            r5 = r4
            r4 = r8
            goto L_0x0471
        L_0x046d:
            r22 = r3
            r5 = r4
            r4 = r15
        L_0x0471:
            com.google.android.gms.measurement.internal.m6 r0 = r1.f6792l     // Catch:{ NameNotFoundException -> 0x0481 }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x0481 }
            n2.b r0 = n2.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0481 }
            r3 = 0
            android.content.pm.ApplicationInfo r0 = r0.b(r5, r3)     // Catch:{ NameNotFoundException -> 0x0481 }
            goto L_0x0494
        L_0x0481:
            r0 = move-exception
            com.google.android.gms.measurement.internal.x4 r3 = r23.k()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()     // Catch:{ all -> 0x054b }
            java.lang.String r7 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.x4.u(r5)     // Catch:{ all -> 0x054b }
            r3.c(r7, r5, r0)     // Catch:{ all -> 0x054b }
            r0 = 0
        L_0x0494:
            if (r0 == 0) goto L_0x03f4
            int r3 = r0.flags     // Catch:{ all -> 0x054b }
            r5 = 1
            r3 = r3 & r5
            if (r3 == 0) goto L_0x04a1
            r7 = 1
            r6.putLong(r11, r7)     // Catch:{ all -> 0x054b }
        L_0x04a1:
            int r0 = r0.flags     // Catch:{ all -> 0x054b }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03f4
            r7 = 1
            r6.putLong(r4, r7)     // Catch:{ all -> 0x054b }
            goto L_0x03f4
        L_0x04ae:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04b7
            r3 = r22
            r6.putLong(r3, r9)     // Catch:{ all -> 0x054b }
        L_0x04b7:
            com.google.android.gms.measurement.internal.i0 r0 = new com.google.android.gms.measurement.internal.i0     // Catch:{ all -> 0x054b }
            java.lang.String r15 = "_f"
            com.google.android.gms.measurement.internal.d0 r3 = new com.google.android.gms.measurement.internal.d0     // Catch:{ all -> 0x054b }
            r3.<init>(r6)     // Catch:{ all -> 0x054b }
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r3
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x054b }
            r1.T(r0, r2)     // Catch:{ all -> 0x054b }
            goto L_0x053c
        L_0x04cf:
            r6 = r14
            r3 = r15
            r7 = 1
            if (r9 != r7) goto L_0x053c
            com.google.android.gms.measurement.internal.nc r0 = new com.google.android.gms.measurement.internal.nc     // Catch:{ all -> 0x054b }
            java.lang.String r15 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x054b }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x054b }
            r1.w(r0, r2)     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.f6 r0 = r23.i()     // Catch:{ all -> 0x054b }
            r0.m()     // Catch:{ all -> 0x054b }
            r23.o0()     // Catch:{ all -> 0x054b }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x054b }
            r0.<init>()     // Catch:{ all -> 0x054b }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x054b }
            r0.putLong(r3, r7)     // Catch:{ all -> 0x054b }
            r0.putLong(r5, r7)     // Catch:{ all -> 0x054b }
            boolean r3 = r2.B     // Catch:{ all -> 0x054b }
            if (r3 == 0) goto L_0x0508
            r0.putLong(r4, r7)     // Catch:{ all -> 0x054b }
        L_0x0508:
            com.google.android.gms.measurement.internal.i0 r3 = new com.google.android.gms.measurement.internal.i0     // Catch:{ all -> 0x054b }
            java.lang.String r15 = "_v"
            com.google.android.gms.measurement.internal.d0 r4 = new com.google.android.gms.measurement.internal.d0     // Catch:{ all -> 0x054b }
            r4.<init>(r0)     // Catch:{ all -> 0x054b }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x054b }
        L_0x051b:
            r1.T(r3, r2)     // Catch:{ all -> 0x054b }
            goto L_0x053c
        L_0x051f:
            boolean r0 = r2.f6567u     // Catch:{ all -> 0x054b }
            if (r0 == 0) goto L_0x053c
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x054b }
            r0.<init>()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.i0 r3 = new com.google.android.gms.measurement.internal.i0     // Catch:{ all -> 0x054b }
            java.lang.String r15 = "_cd"
            com.google.android.gms.measurement.internal.d0 r4 = new com.google.android.gms.measurement.internal.d0     // Catch:{ all -> 0x054b }
            r4.<init>(r0)     // Catch:{ all -> 0x054b }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x054b }
            goto L_0x051b
        L_0x053c:
            com.google.android.gms.measurement.internal.p r0 = r23.d0()     // Catch:{ all -> 0x054b }
            r0.S0()     // Catch:{ all -> 0x054b }
            com.google.android.gms.measurement.internal.p r0 = r23.d0()
            r0.Q0()
            return
        L_0x054b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p r2 = r23.d0()
            r2.Q0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zb.Y(com.google.android.gms.measurement.internal.sc):void");
    }

    public final d a() {
        return ((m6) p.j(this.f6792l)).a();
    }

    /* access modifiers changed from: package-private */
    public final void a0(sc scVar) {
        if (this.f6805y != null) {
            ArrayList arrayList = new ArrayList();
            this.f6806z = arrayList;
            arrayList.addAll(this.f6805y);
        }
        p d02 = d0();
        String str = (String) p.j(scVar.f6559m);
        p.f(str);
        d02.m();
        d02.t();
        try {
            SQLiteDatabase A2 = d02.A();
            String[] strArr = {str};
            int delete = A2.delete("apps", "app_id=?", strArr) + 0 + A2.delete("events", "app_id=?", strArr) + A2.delete("user_attributes", "app_id=?", strArr) + A2.delete("conditional_properties", "app_id=?", strArr) + A2.delete("raw_events", "app_id=?", strArr) + A2.delete("raw_events_metadata", "app_id=?", strArr) + A2.delete("queue", "app_id=?", strArr) + A2.delete("audience_filter_values", "app_id=?", strArr) + A2.delete("main_event_params", "app_id=?", strArr) + A2.delete("default_event_params", "app_id=?", strArr) + A2.delete("trigger_uris", "app_id=?", strArr);
            if (delete > 0) {
                d02.k().J().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            d02.k().F().c("Error resetting analytics data. appId, error", x4.u(str), e10);
        }
        if (scVar.f6566t) {
            Y(scVar);
        }
    }

    public final g b0() {
        return ((m6) p.j(this.f6792l)).y();
    }

    public final f c() {
        return this.f6792l.c();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle d(java.lang.String r6) {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.f6 r0 = r5.i()
            r0.m()
            r5.o0()
            boolean r0 = com.google.android.gms.internal.measurement.kd.a()
            r1 = 0
            if (r0 == 0) goto L_0x007e
            com.google.android.gms.measurement.internal.w5 r0 = r5.g0()
            com.google.android.gms.internal.measurement.x3 r0 = r0.I(r6)
            if (r0 != 0) goto L_0x001c
            return r1
        L_0x001c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.p7 r1 = r5.P(r6)
            android.os.Bundle r2 = r1.o()
            r0.putAll(r2)
            com.google.android.gms.measurement.internal.z r2 = r5.Z(r6)
            com.google.android.gms.measurement.internal.l r3 = new com.google.android.gms.measurement.internal.l
            r3.<init>()
            com.google.android.gms.measurement.internal.z r1 = r5.e(r6, r2, r1, r3)
            android.os.Bundle r1 = r1.e()
            r0.putAll(r1)
            com.google.android.gms.measurement.internal.jc r1 = r5.l0()
            boolean r1 = r1.g0(r6)
            r2 = 1
            if (r1 != 0) goto L_0x0070
            com.google.android.gms.measurement.internal.p r1 = r5.d0()
            java.lang.String r3 = "_npa"
            com.google.android.gms.measurement.internal.pc r1 = r1.E0(r6, r3)
            if (r1 == 0) goto L_0x0064
            java.lang.Object r6 = r1.f6448e
            r3 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            boolean r6 = r6.equals(r1)
            goto L_0x0071
        L_0x0064:
            com.google.android.gms.measurement.internal.w5 r1 = r5.f6781a
            com.google.android.gms.measurement.internal.p7$a r3 = com.google.android.gms.measurement.internal.p7.a.AD_PERSONALIZATION
            boolean r6 = r1.J(r6, r3)
            if (r6 == 0) goto L_0x0070
            r6 = 0
            goto L_0x0071
        L_0x0070:
            r6 = 1
        L_0x0071:
            if (r6 != r2) goto L_0x0076
            java.lang.String r6 = "denied"
            goto L_0x0078
        L_0x0076:
            java.lang.String r6 = "granted"
        L_0x0078:
            java.lang.String r1 = "ad_personalization"
            r0.putString(r1, r6)
            return r0
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zb.d(java.lang.String):android.os.Bundle");
    }

    public final p d0() {
        return (p) h(this.f6783c);
    }

    public final w4 e0() {
        return this.f6792l.C();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ae, code lost:
        if (b0().r(com.google.android.gms.measurement.internal.k0.f6216u0) != false) goto L_0x019a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.h6 f(com.google.android.gms.measurement.internal.sc r11) {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.f6 r0 = r10.i()
            r0.m()
            r10.o0()
            h2.p.j(r11)
            java.lang.String r0 = r11.f6559m
            h2.p.f(r0)
            java.lang.String r0 = r11.I
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0029
            java.util.Map<java.lang.String, com.google.android.gms.measurement.internal.zb$b> r0 = r10.D
            java.lang.String r2 = r11.f6559m
            com.google.android.gms.measurement.internal.zb$b r3 = new com.google.android.gms.measurement.internal.zb$b
            java.lang.String r4 = r11.I
            r3.<init>(r4)
            r0.put(r2, r3)
        L_0x0029:
            com.google.android.gms.measurement.internal.p r0 = r10.d0()
            java.lang.String r2 = r11.f6559m
            com.google.android.gms.measurement.internal.h6 r0 = r0.C0(r2)
            java.lang.String r2 = r11.f6559m
            com.google.android.gms.measurement.internal.p7 r2 = r10.P(r2)
            java.lang.String r3 = r11.H
            com.google.android.gms.measurement.internal.p7 r3 = com.google.android.gms.measurement.internal.p7.e(r3)
            com.google.android.gms.measurement.internal.p7 r2 = r2.d(r3)
            boolean r3 = r2.x()
            if (r3 == 0) goto L_0x0054
            com.google.android.gms.measurement.internal.bb r3 = r10.f6789i
            java.lang.String r4 = r11.f6559m
            boolean r5 = r11.A
            java.lang.String r3 = r3.z(r4, r5)
            goto L_0x0056
        L_0x0054:
            java.lang.String r3 = ""
        L_0x0056:
            if (r0 != 0) goto L_0x0079
            com.google.android.gms.measurement.internal.h6 r0 = new com.google.android.gms.measurement.internal.h6
            com.google.android.gms.measurement.internal.m6 r4 = r10.f6792l
            java.lang.String r5 = r11.f6559m
            r0.<init>(r4, r5)
            boolean r4 = r2.y()
            if (r4 == 0) goto L_0x006e
            java.lang.String r4 = r10.m(r2)
            r0.x(r4)
        L_0x006e:
            boolean r2 = r2.x()
            if (r2 == 0) goto L_0x0100
            r0.S(r3)
            goto L_0x0100
        L_0x0079:
            boolean r4 = r2.x()
            if (r4 == 0) goto L_0x00e9
            if (r3 == 0) goto L_0x00e9
            java.lang.String r4 = r0.l()
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x00e9
            r0.S(r3)
            boolean r3 = r11.A
            if (r3 == 0) goto L_0x0100
            com.google.android.gms.measurement.internal.bb r3 = r10.f6789i
            java.lang.String r4 = r11.f6559m
            android.util.Pair r3 = r3.y(r4, r2)
            java.lang.Object r3 = r3.first
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0100
            java.lang.String r2 = r10.m(r2)
            r0.x(r2)
            com.google.android.gms.measurement.internal.p r2 = r10.d0()
            java.lang.String r3 = r11.f6559m
            java.lang.String r4 = "_id"
            com.google.android.gms.measurement.internal.pc r2 = r2.E0(r3, r4)
            if (r2 == 0) goto L_0x0100
            com.google.android.gms.measurement.internal.p r2 = r10.d0()
            java.lang.String r3 = r11.f6559m
            java.lang.String r4 = "_lair"
            com.google.android.gms.measurement.internal.pc r2 = r2.E0(r3, r4)
            if (r2 != 0) goto L_0x0100
            l2.d r2 = r10.a()
            long r7 = r2.a()
            com.google.android.gms.measurement.internal.pc r2 = new com.google.android.gms.measurement.internal.pc
            java.lang.String r4 = r11.f6559m
            r5 = 1
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = "auto"
            java.lang.String r6 = "_lair"
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r9)
            com.google.android.gms.measurement.internal.p r3 = r10.d0()
            r3.d0(r2)
            goto L_0x0100
        L_0x00e9:
            java.lang.String r3 = r0.u0()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0100
            boolean r3 = r2.y()
            if (r3 == 0) goto L_0x0100
            java.lang.String r2 = r10.m(r2)
            r0.x(r2)
        L_0x0100:
            java.lang.String r2 = r11.f6560n
            r0.M(r2)
            java.lang.String r2 = r11.C
            r0.e(r2)
            java.lang.String r2 = r11.f6569w
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0117
            java.lang.String r2 = r11.f6569w
            r0.J(r2)
        L_0x0117:
            long r2 = r11.f6563q
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0122
            r0.d0(r2)
        L_0x0122:
            java.lang.String r2 = r11.f6561o
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x012f
            java.lang.String r2 = r11.f6561o
            r0.F(r2)
        L_0x012f:
            long r2 = r11.f6568v
            r0.c(r2)
            java.lang.String r2 = r11.f6562p
            if (r2 == 0) goto L_0x013b
            r0.B(r2)
        L_0x013b:
            long r2 = r11.f6564r
            r0.X(r2)
            boolean r2 = r11.f6566t
            r0.y(r2)
            java.lang.String r2 = r11.f6565s
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0152
            java.lang.String r2 = r11.f6565s
            r0.P(r2)
        L_0x0152:
            boolean r2 = r11.A
            r0.g(r2)
            java.lang.Boolean r2 = r11.D
            r0.d(r2)
            long r2 = r11.E
            r0.Z(r2)
            boolean r2 = com.google.android.gms.internal.measurement.pf.a()
            if (r2 == 0) goto L_0x0186
            com.google.android.gms.measurement.internal.g r2 = r10.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.k0.f6220w0
            boolean r2 = r2.r(r3)
            if (r2 != 0) goto L_0x0181
            com.google.android.gms.measurement.internal.g r2 = r10.b0()
            java.lang.String r3 = r11.f6559m
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.k0.f6224y0
            boolean r2 = r2.A(r3, r4)
            if (r2 == 0) goto L_0x0186
        L_0x0181:
            java.lang.String r2 = r11.J
            r0.V(r2)
        L_0x0186:
            boolean r2 = com.google.android.gms.internal.measurement.ld.a()
            if (r2 == 0) goto L_0x019e
            com.google.android.gms.measurement.internal.g r2 = r10.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.k0.f6218v0
            boolean r2 = r2.r(r3)
            if (r2 == 0) goto L_0x019e
            java.util.List<java.lang.String> r1 = r11.F
        L_0x019a:
            r0.f(r1)
            goto L_0x01b1
        L_0x019e:
            boolean r2 = com.google.android.gms.internal.measurement.ld.a()
            if (r2 == 0) goto L_0x01b1
            com.google.android.gms.measurement.internal.g r2 = r10.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.k0.f6216u0
            boolean r2 = r2.r(r3)
            if (r2 == 0) goto L_0x01b1
            goto L_0x019a
        L_0x01b1:
            boolean r1 = com.google.android.gms.internal.measurement.bg.a()
            if (r1 == 0) goto L_0x01c8
            com.google.android.gms.measurement.internal.g r1 = r10.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.k0.A0
            boolean r1 = r1.r(r2)
            if (r1 == 0) goto L_0x01c8
            boolean r1 = r11.K
            r0.C(r1)
        L_0x01c8:
            boolean r1 = com.google.android.gms.internal.measurement.df.a()
            if (r1 == 0) goto L_0x01df
            com.google.android.gms.measurement.internal.g r1 = r10.b0()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.k0.L0
            boolean r1 = r1.r(r2)
            if (r1 == 0) goto L_0x01df
            int r1 = r11.O
            r0.b(r1)
        L_0x01df:
            long r1 = r11.L
            r0.n0(r1)
            boolean r11 = r0.s()
            if (r11 == 0) goto L_0x01f1
            com.google.android.gms.measurement.internal.p r11 = r10.d0()
            r11.U(r0)
        L_0x01f1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zb.f(com.google.android.gms.measurement.internal.sc):com.google.android.gms.measurement.internal.h6");
    }

    public final e5 f0() {
        return (e5) h(this.f6782b);
    }

    public final w5 g0() {
        return (w5) h(this.f6781a);
    }

    /* access modifiers changed from: package-private */
    public final m6 h0() {
        return this.f6792l;
    }

    public final f6 i() {
        return ((m6) p.j(this.f6792l)).i();
    }

    public final p9 i0() {
        return (p9) h(this.f6788h);
    }

    public final bb j0() {
        return this.f6789i;
    }

    public final x4 k() {
        return ((m6) p.j(this.f6792l)).k();
    }

    public final xb k0() {
        return this.f6790j;
    }

    public final jc l0() {
        return (jc) h(this.f6787g);
    }

    public final oc m0() {
        return ((m6) p.j(this.f6792l)).K();
    }

    /* access modifiers changed from: package-private */
    public final void n0() {
        String str;
        z4 z4Var;
        Integer num;
        Integer num2;
        i().m();
        o0();
        if (!this.f6794n) {
            this.f6794n = true;
            if (O()) {
                int b10 = b(this.f6804x);
                int C2 = this.f6792l.A().C();
                i().m();
                if (b10 > C2) {
                    z4Var = k().F();
                    num2 = Integer.valueOf(b10);
                    num = Integer.valueOf(C2);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (b10 >= C2) {
                    return;
                } else {
                    if (I(C2, this.f6804x)) {
                        z4Var = k().J();
                        num2 = Integer.valueOf(b10);
                        num = Integer.valueOf(C2);
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        z4Var = k().F();
                        num2 = Integer.valueOf(b10);
                        num = Integer.valueOf(C2);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                z4Var.c(str, num2, num);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void o0() {
        if (!this.f6793m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    public final void p0() {
        this.f6799s++;
    }

    /* access modifiers changed from: package-private */
    public final void q(e eVar) {
        sc V = V((String) p.j(eVar.f5969m));
        if (V != null) {
            r(eVar, V);
        }
    }

    /* access modifiers changed from: package-private */
    public final void q0() {
        this.f6798r++;
    }

    /* access modifiers changed from: package-private */
    public final void r(e eVar, sc scVar) {
        p.j(eVar);
        p.f(eVar.f5969m);
        p.j(eVar.f5971o);
        p.f(eVar.f5971o.f6359n);
        i().m();
        o0();
        if (c0(scVar)) {
            if (!scVar.f6566t) {
                f(scVar);
                return;
            }
            d0().P0();
            try {
                f(scVar);
                String str = (String) p.j(eVar.f5969m);
                e A0 = d0().A0(str, eVar.f5971o.f6359n);
                if (A0 != null) {
                    k().E().c("Removing conditional user property", eVar.f5969m, this.f6792l.C().g(eVar.f5971o.f6359n));
                    d0().C(str, eVar.f5971o.f6359n);
                    if (A0.f5973q) {
                        d0().K0(str, eVar.f5971o.f6359n);
                    }
                    i0 i0Var = eVar.f5979w;
                    if (i0Var != null) {
                        d0 d0Var = i0Var.f6113n;
                        X((i0) p.j(m0().F(str, ((i0) p.j(eVar.f5979w)).f6112m, d0Var != null ? d0Var.i() : null, A0.f5970n, eVar.f5979w.f6115p, true, true)), scVar);
                    }
                } else {
                    k().K().c("Conditional user property doesn't exist", x4.u(eVar.f5969m), this.f6792l.C().g(eVar.f5971o.f6359n));
                }
                d0().S0();
            } finally {
                d0().Q0();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void r0() {
        i().m();
        d0().R0();
        if (this.f6789i.f5899g.a() == 0) {
            this.f6789i.f5899g.b(a().a());
        }
        M();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002b, code lost:
        r4 = r1.F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(com.google.android.gms.measurement.internal.i0 r20, com.google.android.gms.measurement.internal.sc r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            h2.p.j(r21)
            java.lang.String r2 = r0.f6559m
            h2.p.f(r2)
            com.google.android.gms.measurement.internal.f6 r2 = r19.i()
            r2.m()
            r19.o0()
            java.lang.String r2 = r0.f6559m
            r3 = r20
            long r10 = r3.f6115p
            com.google.android.gms.measurement.internal.b5 r3 = com.google.android.gms.measurement.internal.b5.b(r20)
            com.google.android.gms.measurement.internal.f6 r4 = r19.i()
            r4.m()
            com.google.android.gms.measurement.internal.r9 r4 = r1.E
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = r1.F
            if (r4 == 0) goto L_0x0039
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            com.google.android.gms.measurement.internal.r9 r4 = r1.E
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            android.os.Bundle r5 = r3.f5887d
            r12 = 0
            com.google.android.gms.measurement.internal.oc.V(r4, r5, r12)
            com.google.android.gms.measurement.internal.i0 r3 = r3.a()
            r19.l0()
            boolean r4 = com.google.android.gms.measurement.internal.jc.b0(r3, r0)
            if (r4 != 0) goto L_0x004e
            return
        L_0x004e:
            boolean r4 = r0.f6566t
            if (r4 != 0) goto L_0x0056
            r1.f(r0)
            return
        L_0x0056:
            java.util.List<java.lang.String> r4 = r0.F
            if (r4 == 0) goto L_0x0097
            java.lang.String r5 = r3.f6112m
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0085
            com.google.android.gms.measurement.internal.d0 r4 = r3.f6113n
            android.os.Bundle r4 = r4.i()
            r5 = 1
            java.lang.String r7 = "ga_safelisted"
            r4.putLong(r7, r5)
            com.google.android.gms.measurement.internal.i0 r5 = new com.google.android.gms.measurement.internal.i0
            java.lang.String r14 = r3.f6112m
            com.google.android.gms.measurement.internal.d0 r15 = new com.google.android.gms.measurement.internal.d0
            r15.<init>(r4)
            java.lang.String r4 = r3.f6114o
            long r6 = r3.f6115p
            r13 = r5
            r16 = r4
            r17 = r6
            r13.<init>(r14, r15, r16, r17)
            goto L_0x0098
        L_0x0085:
            com.google.android.gms.measurement.internal.x4 r0 = r19.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.E()
            java.lang.String r4 = r3.f6112m
            java.lang.String r3 = r3.f6114o
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r0.d(r5, r2, r4, r3)
            return
        L_0x0097:
            r13 = r3
        L_0x0098:
            com.google.android.gms.measurement.internal.p r3 = r19.d0()
            r3.P0()
            com.google.android.gms.measurement.internal.p r3 = r19.d0()     // Catch:{ all -> 0x02f0 }
            h2.p.f(r2)     // Catch:{ all -> 0x02f0 }
            r3.m()     // Catch:{ all -> 0x02f0 }
            r3.t()     // Catch:{ all -> 0x02f0 }
            r4 = 0
            r6 = 2
            r14 = 1
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ce
            com.google.android.gms.measurement.internal.x4 r3 = r3.k()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.K()     // Catch:{ all -> 0x02f0 }
            java.lang.String r4 = "Invalid time querying timed out conditional properties"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.x4.u(r2)     // Catch:{ all -> 0x02f0 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f0 }
            r3.c(r4, r5, r8)     // Catch:{ all -> 0x02f0 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f0 }
            goto L_0x00de
        L_0x00ce:
            java.lang.String r4 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x02f0 }
            r5[r12] = r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f0 }
            r5[r14] = r8     // Catch:{ all -> 0x02f0 }
            java.util.List r3 = r3.R(r4, r5)     // Catch:{ all -> 0x02f0 }
        L_0x00de:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02f0 }
        L_0x00e2:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x02f0 }
            if (r4 == 0) goto L_0x012e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.e r4 = (com.google.android.gms.measurement.internal.e) r4     // Catch:{ all -> 0x02f0 }
            if (r4 == 0) goto L_0x00e2
            com.google.android.gms.measurement.internal.x4 r5 = r19.k()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.z4 r5 = r5.J()     // Catch:{ all -> 0x02f0 }
            java.lang.String r8 = "User property timed out"
            java.lang.String r9 = r4.f5969m     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.m6 r15 = r1.f6792l     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.w4 r15 = r15.C()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.nc r14 = r4.f5971o     // Catch:{ all -> 0x02f0 }
            java.lang.String r14 = r14.f6359n     // Catch:{ all -> 0x02f0 }
            java.lang.String r14 = r15.g(r14)     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.nc r15 = r4.f5971o     // Catch:{ all -> 0x02f0 }
            java.lang.Object r15 = r15.d()     // Catch:{ all -> 0x02f0 }
            r5.d(r8, r9, r14, r15)     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.i0 r5 = r4.f5975s     // Catch:{ all -> 0x02f0 }
            if (r5 == 0) goto L_0x0121
            com.google.android.gms.measurement.internal.i0 r5 = new com.google.android.gms.measurement.internal.i0     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.i0 r8 = r4.f5975s     // Catch:{ all -> 0x02f0 }
            r5.<init>(r8, r10)     // Catch:{ all -> 0x02f0 }
            r1.X(r5, r0)     // Catch:{ all -> 0x02f0 }
        L_0x0121:
            com.google.android.gms.measurement.internal.p r5 = r19.d0()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.nc r4 = r4.f5971o     // Catch:{ all -> 0x02f0 }
            java.lang.String r4 = r4.f6359n     // Catch:{ all -> 0x02f0 }
            r5.C(r2, r4)     // Catch:{ all -> 0x02f0 }
            r14 = 1
            goto L_0x00e2
        L_0x012e:
            com.google.android.gms.measurement.internal.p r3 = r19.d0()     // Catch:{ all -> 0x02f0 }
            h2.p.f(r2)     // Catch:{ all -> 0x02f0 }
            r3.m()     // Catch:{ all -> 0x02f0 }
            r3.t()     // Catch:{ all -> 0x02f0 }
            if (r7 >= 0) goto L_0x0157
            com.google.android.gms.measurement.internal.x4 r3 = r3.k()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.K()     // Catch:{ all -> 0x02f0 }
            java.lang.String r4 = "Invalid time querying expired conditional properties"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.x4.u(r2)     // Catch:{ all -> 0x02f0 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f0 }
            r3.c(r4, r5, r8)     // Catch:{ all -> 0x02f0 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f0 }
            goto L_0x0168
        L_0x0157:
            java.lang.String r4 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x02f0 }
            r5[r12] = r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f0 }
            r9 = 1
            r5[r9] = r8     // Catch:{ all -> 0x02f0 }
            java.util.List r3 = r3.R(r4, r5)     // Catch:{ all -> 0x02f0 }
        L_0x0168:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x02f0 }
            int r5 = r3.size()     // Catch:{ all -> 0x02f0 }
            r4.<init>(r5)     // Catch:{ all -> 0x02f0 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02f0 }
        L_0x0175:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x02f0 }
            if (r5 == 0) goto L_0x01c5
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.e r5 = (com.google.android.gms.measurement.internal.e) r5     // Catch:{ all -> 0x02f0 }
            if (r5 == 0) goto L_0x0175
            com.google.android.gms.measurement.internal.x4 r8 = r19.k()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.z4 r8 = r8.J()     // Catch:{ all -> 0x02f0 }
            java.lang.String r9 = "User property expired"
            java.lang.String r14 = r5.f5969m     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.m6 r15 = r1.f6792l     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.w4 r15 = r15.C()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.nc r6 = r5.f5971o     // Catch:{ all -> 0x02f0 }
            java.lang.String r6 = r6.f6359n     // Catch:{ all -> 0x02f0 }
            java.lang.String r6 = r15.g(r6)     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.nc r15 = r5.f5971o     // Catch:{ all -> 0x02f0 }
            java.lang.Object r15 = r15.d()     // Catch:{ all -> 0x02f0 }
            r8.d(r9, r14, r6, r15)     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.p r6 = r19.d0()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.nc r8 = r5.f5971o     // Catch:{ all -> 0x02f0 }
            java.lang.String r8 = r8.f6359n     // Catch:{ all -> 0x02f0 }
            r6.K0(r2, r8)     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.i0 r6 = r5.f5979w     // Catch:{ all -> 0x02f0 }
            if (r6 == 0) goto L_0x01b8
            r4.add(r6)     // Catch:{ all -> 0x02f0 }
        L_0x01b8:
            com.google.android.gms.measurement.internal.p r6 = r19.d0()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.nc r5 = r5.f5971o     // Catch:{ all -> 0x02f0 }
            java.lang.String r5 = r5.f6359n     // Catch:{ all -> 0x02f0 }
            r6.C(r2, r5)     // Catch:{ all -> 0x02f0 }
            r6 = 2
            goto L_0x0175
        L_0x01c5:
            int r3 = r4.size()     // Catch:{ all -> 0x02f0 }
            r5 = 0
        L_0x01ca:
            if (r5 >= r3) goto L_0x01dd
            java.lang.Object r6 = r4.get(r5)     // Catch:{ all -> 0x02f0 }
            int r5 = r5 + 1
            com.google.android.gms.measurement.internal.i0 r6 = (com.google.android.gms.measurement.internal.i0) r6     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.i0 r8 = new com.google.android.gms.measurement.internal.i0     // Catch:{ all -> 0x02f0 }
            r8.<init>(r6, r10)     // Catch:{ all -> 0x02f0 }
            r1.X(r8, r0)     // Catch:{ all -> 0x02f0 }
            goto L_0x01ca
        L_0x01dd:
            com.google.android.gms.measurement.internal.p r3 = r19.d0()     // Catch:{ all -> 0x02f0 }
            java.lang.String r4 = r13.f6112m     // Catch:{ all -> 0x02f0 }
            h2.p.f(r2)     // Catch:{ all -> 0x02f0 }
            h2.p.f(r4)     // Catch:{ all -> 0x02f0 }
            r3.m()     // Catch:{ all -> 0x02f0 }
            r3.t()     // Catch:{ all -> 0x02f0 }
            if (r7 >= 0) goto L_0x0213
            com.google.android.gms.measurement.internal.x4 r5 = r3.k()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.z4 r5 = r5.K()     // Catch:{ all -> 0x02f0 }
            java.lang.String r6 = "Invalid time querying triggered conditional properties"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.x4.u(r2)     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.w4 r3 = r3.f()     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = r3.c(r4)     // Catch:{ all -> 0x02f0 }
            java.lang.Long r4 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f0 }
            r5.d(r6, r2, r3, r4)     // Catch:{ all -> 0x02f0 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f0 }
            goto L_0x0228
        L_0x0213:
            java.lang.String r5 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x02f0 }
            r6[r12] = r2     // Catch:{ all -> 0x02f0 }
            r2 = 1
            r6[r2] = r4     // Catch:{ all -> 0x02f0 }
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f0 }
            r4 = 2
            r6[r4] = r2     // Catch:{ all -> 0x02f0 }
            java.util.List r2 = r3.R(r5, r6)     // Catch:{ all -> 0x02f0 }
        L_0x0228:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x02f0 }
            int r3 = r2.size()     // Catch:{ all -> 0x02f0 }
            r14.<init>(r3)     // Catch:{ all -> 0x02f0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x02f0 }
        L_0x0235:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x02f0 }
            if (r3 == 0) goto L_0x02c6
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x02f0 }
            r15 = r3
            com.google.android.gms.measurement.internal.e r15 = (com.google.android.gms.measurement.internal.e) r15     // Catch:{ all -> 0x02f0 }
            if (r15 == 0) goto L_0x0235
            com.google.android.gms.measurement.internal.nc r3 = r15.f5971o     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.pc r9 = new com.google.android.gms.measurement.internal.pc     // Catch:{ all -> 0x02f0 }
            java.lang.String r4 = r15.f5969m     // Catch:{ all -> 0x02f0 }
            java.lang.Object r4 = h2.p.j(r4)     // Catch:{ all -> 0x02f0 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x02f0 }
            java.lang.String r5 = r15.f5970n     // Catch:{ all -> 0x02f0 }
            java.lang.String r6 = r3.f6359n     // Catch:{ all -> 0x02f0 }
            java.lang.Object r3 = r3.d()     // Catch:{ all -> 0x02f0 }
            java.lang.Object r16 = h2.p.j(r3)     // Catch:{ all -> 0x02f0 }
            r3 = r9
            r7 = r10
            r12 = r9
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.p r3 = r19.d0()     // Catch:{ all -> 0x02f0 }
            boolean r3 = r3.d0(r12)     // Catch:{ all -> 0x02f0 }
            if (r3 == 0) goto L_0x028c
            com.google.android.gms.measurement.internal.x4 r3 = r19.k()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.J()     // Catch:{ all -> 0x02f0 }
            java.lang.String r4 = "User property triggered"
            java.lang.String r5 = r15.f5969m     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.m6 r6 = r1.f6792l     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.w4 r6 = r6.C()     // Catch:{ all -> 0x02f0 }
            java.lang.String r7 = r12.f6446c     // Catch:{ all -> 0x02f0 }
            java.lang.String r6 = r6.g(r7)     // Catch:{ all -> 0x02f0 }
            java.lang.Object r7 = r12.f6448e     // Catch:{ all -> 0x02f0 }
        L_0x0288:
            r3.d(r4, r5, r6, r7)     // Catch:{ all -> 0x02f0 }
            goto L_0x02ab
        L_0x028c:
            com.google.android.gms.measurement.internal.x4 r3 = r19.k()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()     // Catch:{ all -> 0x02f0 }
            java.lang.String r4 = "Too many active user properties, ignoring"
            java.lang.String r5 = r15.f5969m     // Catch:{ all -> 0x02f0 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.x4.u(r5)     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.m6 r6 = r1.f6792l     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.w4 r6 = r6.C()     // Catch:{ all -> 0x02f0 }
            java.lang.String r7 = r12.f6446c     // Catch:{ all -> 0x02f0 }
            java.lang.String r6 = r6.g(r7)     // Catch:{ all -> 0x02f0 }
            java.lang.Object r7 = r12.f6448e     // Catch:{ all -> 0x02f0 }
            goto L_0x0288
        L_0x02ab:
            com.google.android.gms.measurement.internal.i0 r3 = r15.f5977u     // Catch:{ all -> 0x02f0 }
            if (r3 == 0) goto L_0x02b2
            r14.add(r3)     // Catch:{ all -> 0x02f0 }
        L_0x02b2:
            com.google.android.gms.measurement.internal.nc r3 = new com.google.android.gms.measurement.internal.nc     // Catch:{ all -> 0x02f0 }
            r3.<init>(r12)     // Catch:{ all -> 0x02f0 }
            r15.f5971o = r3     // Catch:{ all -> 0x02f0 }
            r3 = 1
            r15.f5973q = r3     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.p r4 = r19.d0()     // Catch:{ all -> 0x02f0 }
            r4.b0(r15)     // Catch:{ all -> 0x02f0 }
            r12 = 0
            goto L_0x0235
        L_0x02c6:
            r1.X(r13, r0)     // Catch:{ all -> 0x02f0 }
            int r2 = r14.size()     // Catch:{ all -> 0x02f0 }
            r12 = 0
        L_0x02ce:
            if (r12 >= r2) goto L_0x02e1
            java.lang.Object r3 = r14.get(r12)     // Catch:{ all -> 0x02f0 }
            int r12 = r12 + 1
            com.google.android.gms.measurement.internal.i0 r3 = (com.google.android.gms.measurement.internal.i0) r3     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.i0 r4 = new com.google.android.gms.measurement.internal.i0     // Catch:{ all -> 0x02f0 }
            r4.<init>(r3, r10)     // Catch:{ all -> 0x02f0 }
            r1.X(r4, r0)     // Catch:{ all -> 0x02f0 }
            goto L_0x02ce
        L_0x02e1:
            com.google.android.gms.measurement.internal.p r0 = r19.d0()     // Catch:{ all -> 0x02f0 }
            r0.S0()     // Catch:{ all -> 0x02f0 }
            com.google.android.gms.measurement.internal.p r0 = r19.d0()
            r0.Q0()
            return
        L_0x02f0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p r2 = r19.d0()
            r2.Q0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zb.s(com.google.android.gms.measurement.internal.i0, com.google.android.gms.measurement.internal.sc):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        k().F().c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.x4.u(r6), r3.a());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x03e7 */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02f0 A[Catch:{ all -> 0x0425 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02f1 A[Catch:{ all -> 0x0425 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s0() {
        /*
            r21 = this;
            r7 = r21
            com.google.android.gms.measurement.internal.f6 r0 = r21.i()
            r0.m()
            r21.o0()
            r0 = 1
            r7.f6802v = r0
            r8 = 0
            com.google.android.gms.measurement.internal.m6 r1 = r7.f6792l     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.y9 r1 = r1.I()     // Catch:{ all -> 0x0425 }
            java.lang.Boolean r1 = r1.V()     // Catch:{ all -> 0x0425 }
            if (r1 != 0) goto L_0x002f
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.K()     // Catch:{ all -> 0x0425 }
            java.lang.String r1 = "Upload data called on the client side before use of service was decided"
        L_0x0026:
            r0.a(r1)     // Catch:{ all -> 0x0425 }
        L_0x0029:
            r7.f6802v = r8
        L_0x002b:
            r21.L()
            return
        L_0x002f:
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0425 }
            if (r1 == 0) goto L_0x0040
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()     // Catch:{ all -> 0x0425 }
            java.lang.String r1 = "Upload called in the client side when service should be used"
            goto L_0x0026
        L_0x0040:
            long r1 = r7.f6795o     // Catch:{ all -> 0x0425 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
        L_0x0048:
            r21.M()     // Catch:{ all -> 0x0425 }
            goto L_0x0029
        L_0x004c:
            com.google.android.gms.measurement.internal.f6 r1 = r21.i()     // Catch:{ all -> 0x0425 }
            r1.m()     // Catch:{ all -> 0x0425 }
            java.util.List<java.lang.Long> r1 = r7.f6805y     // Catch:{ all -> 0x0425 }
            if (r1 == 0) goto L_0x0059
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            if (r1 == 0) goto L_0x0067
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.J()     // Catch:{ all -> 0x0425 }
            java.lang.String r1 = "Uploading requested multiple times"
            goto L_0x0026
        L_0x0067:
            com.google.android.gms.measurement.internal.e5 r1 = r21.f0()     // Catch:{ all -> 0x0425 }
            boolean r1 = r1.z()     // Catch:{ all -> 0x0425 }
            if (r1 != 0) goto L_0x007f
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.J()     // Catch:{ all -> 0x0425 }
            java.lang.String r1 = "Network not connected, ignoring upload request"
            r0.a(r1)     // Catch:{ all -> 0x0425 }
            goto L_0x0048
        L_0x007f:
            l2.d r1 = r21.a()     // Catch:{ all -> 0x0425 }
            long r1 = r1.a()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.g r5 = r21.b0()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.o4<java.lang.Integer> r6 = com.google.android.gms.measurement.internal.k0.U     // Catch:{ all -> 0x0425 }
            r9 = 0
            int r5 = r5.t(r9, r6)     // Catch:{ all -> 0x0425 }
            r21.b0()     // Catch:{ all -> 0x0425 }
            long r10 = com.google.android.gms.measurement.internal.g.F()     // Catch:{ all -> 0x0425 }
            long r10 = r1 - r10
            r6 = 0
        L_0x009c:
            if (r6 >= r5) goto L_0x00a7
            boolean r12 = r7.K(r9, r10)     // Catch:{ all -> 0x0425 }
            if (r12 == 0) goto L_0x00a7
            int r6 = r6 + 1
            goto L_0x009c
        L_0x00a7:
            boolean r5 = com.google.android.gms.internal.measurement.df.a()     // Catch:{ all -> 0x0425 }
            if (r5 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.f6 r5 = r21.i()     // Catch:{ all -> 0x0425 }
            r5.m()     // Catch:{ all -> 0x0425 }
            java.util.Set<java.lang.String> r5 = r7.f6797q     // Catch:{ all -> 0x0425 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0425 }
        L_0x00ba:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0425 }
            if (r6 == 0) goto L_0x00fc
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0425 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0425 }
            boolean r10 = com.google.android.gms.internal.measurement.df.a()     // Catch:{ all -> 0x0425 }
            if (r10 == 0) goto L_0x00ba
            com.google.android.gms.measurement.internal.g r10 = r21.b0()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.k0.L0     // Catch:{ all -> 0x0425 }
            boolean r10 = r10.A(r6, r11)     // Catch:{ all -> 0x0425 }
            if (r10 == 0) goto L_0x00ba
            com.google.android.gms.measurement.internal.x4 r10 = r21.k()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.z4 r10 = r10.E()     // Catch:{ all -> 0x0425 }
            java.lang.String r11 = "Notifying app that trigger URIs are available. App ID"
            r10.b(r11, r6)     // Catch:{ all -> 0x0425 }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x0425 }
            r10.<init>()     // Catch:{ all -> 0x0425 }
            java.lang.String r11 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r10.setAction(r11)     // Catch:{ all -> 0x0425 }
            r10.setPackage(r6)     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.m6 r6 = r7.f6792l     // Catch:{ all -> 0x0425 }
            android.content.Context r6 = r6.zza()     // Catch:{ all -> 0x0425 }
            r6.sendBroadcast(r10)     // Catch:{ all -> 0x0425 }
            goto L_0x00ba
        L_0x00fc:
            java.util.Set<java.lang.String> r5 = r7.f6797q     // Catch:{ all -> 0x0425 }
            r5.clear()     // Catch:{ all -> 0x0425 }
        L_0x0101:
            com.google.android.gms.measurement.internal.bb r5 = r7.f6789i     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.p5 r5 = r5.f5899g     // Catch:{ all -> 0x0425 }
            long r5 = r5.a()     // Catch:{ all -> 0x0425 }
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0124
            com.google.android.gms.measurement.internal.x4 r3 = r21.k()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.E()     // Catch:{ all -> 0x0425 }
            java.lang.String r4 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0425 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0425 }
            r3.b(r4, r5)     // Catch:{ all -> 0x0425 }
        L_0x0124:
            com.google.android.gms.measurement.internal.p r3 = r21.d0()     // Catch:{ all -> 0x0425 }
            java.lang.String r6 = r3.B()     // Catch:{ all -> 0x0425 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0425 }
            r4 = -1
            if (r3 != 0) goto L_0x03fd
            long r10 = r7.A     // Catch:{ all -> 0x0425 }
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0144
            com.google.android.gms.measurement.internal.p r3 = r21.d0()     // Catch:{ all -> 0x0425 }
            long r3 = r3.x()     // Catch:{ all -> 0x0425 }
            r7.A = r3     // Catch:{ all -> 0x0425 }
        L_0x0144:
            com.google.android.gms.measurement.internal.g r3 = r21.b0()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.o4<java.lang.Integer> r4 = com.google.android.gms.measurement.internal.k0.f6191i     // Catch:{ all -> 0x0425 }
            int r3 = r3.t(r6, r4)     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.g r4 = r21.b0()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.o4<java.lang.Integer> r5 = com.google.android.gms.measurement.internal.k0.f6193j     // Catch:{ all -> 0x0425 }
            int r4 = r4.t(r6, r5)     // Catch:{ all -> 0x0425 }
            int r4 = java.lang.Math.max(r8, r4)     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.p r5 = r21.d0()     // Catch:{ all -> 0x0425 }
            java.util.List r3 = r5.P(r6, r3, r4)     // Catch:{ all -> 0x0425 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0425 }
            if (r4 != 0) goto L_0x0422
            com.google.android.gms.measurement.internal.p7 r4 = r7.P(r6)     // Catch:{ all -> 0x0425 }
            boolean r4 = r4.x()     // Catch:{ all -> 0x0425 }
            if (r4 == 0) goto L_0x01c7
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0425 }
        L_0x0178:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0425 }
            if (r5 == 0) goto L_0x0197
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0425 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x0425 }
            java.lang.Object r5 = r5.first     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.s4 r5 = (com.google.android.gms.internal.measurement.s4) r5     // Catch:{ all -> 0x0425 }
            java.lang.String r10 = r5.r0()     // Catch:{ all -> 0x0425 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0425 }
            if (r10 != 0) goto L_0x0178
            java.lang.String r4 = r5.r0()     // Catch:{ all -> 0x0425 }
            goto L_0x0198
        L_0x0197:
            r4 = r9
        L_0x0198:
            if (r4 == 0) goto L_0x01c7
            r5 = 0
        L_0x019b:
            int r10 = r3.size()     // Catch:{ all -> 0x0425 }
            if (r5 >= r10) goto L_0x01c7
            java.lang.Object r10 = r3.get(r5)     // Catch:{ all -> 0x0425 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0425 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.s4 r10 = (com.google.android.gms.internal.measurement.s4) r10     // Catch:{ all -> 0x0425 }
            java.lang.String r11 = r10.r0()     // Catch:{ all -> 0x0425 }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x0425 }
            if (r11 != 0) goto L_0x01c4
            java.lang.String r10 = r10.r0()     // Catch:{ all -> 0x0425 }
            boolean r10 = r10.equals(r4)     // Catch:{ all -> 0x0425 }
            if (r10 != 0) goto L_0x01c4
            java.util.List r3 = r3.subList(r8, r5)     // Catch:{ all -> 0x0425 }
            goto L_0x01c7
        L_0x01c4:
            int r5 = r5 + 1
            goto L_0x019b
        L_0x01c7:
            com.google.android.gms.internal.measurement.r4$a r4 = com.google.android.gms.internal.measurement.r4.M()     // Catch:{ all -> 0x0425 }
            int r5 = r3.size()     // Catch:{ all -> 0x0425 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0425 }
            int r11 = r3.size()     // Catch:{ all -> 0x0425 }
            r10.<init>(r11)     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.g r11 = r21.b0()     // Catch:{ all -> 0x0425 }
            boolean r11 = r11.J(r6)     // Catch:{ all -> 0x0425 }
            if (r11 == 0) goto L_0x01ee
            com.google.android.gms.measurement.internal.p7 r11 = r7.P(r6)     // Catch:{ all -> 0x0425 }
            boolean r11 = r11.x()     // Catch:{ all -> 0x0425 }
            if (r11 == 0) goto L_0x01ee
            r11 = 1
            goto L_0x01ef
        L_0x01ee:
            r11 = 0
        L_0x01ef:
            com.google.android.gms.measurement.internal.p7 r12 = r7.P(r6)     // Catch:{ all -> 0x0425 }
            boolean r12 = r12.x()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.p7 r13 = r7.P(r6)     // Catch:{ all -> 0x0425 }
            boolean r13 = r13.y()     // Catch:{ all -> 0x0425 }
            boolean r14 = com.google.android.gms.internal.measurement.pf.a()     // Catch:{ all -> 0x0425 }
            if (r14 == 0) goto L_0x0213
            com.google.android.gms.measurement.internal.g r14 = r21.b0()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.k0.f6224y0     // Catch:{ all -> 0x0425 }
            boolean r14 = r14.A(r6, r15)     // Catch:{ all -> 0x0425 }
            if (r14 == 0) goto L_0x0213
            r14 = 1
            goto L_0x0214
        L_0x0213:
            r14 = 0
        L_0x0214:
            r15 = 0
        L_0x0215:
            if (r15 >= r5) goto L_0x0328
            java.lang.Object r16 = r3.get(r15)     // Catch:{ all -> 0x0425 }
            r9 = r16
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x0425 }
            java.lang.Object r9 = r9.first     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.s4 r9 = (com.google.android.gms.internal.measurement.s4) r9     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.p8$b r9 = r9.B()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.s4$a r9 = (com.google.android.gms.internal.measurement.s4.a) r9     // Catch:{ all -> 0x0425 }
            java.lang.Object r16 = r3.get(r15)     // Catch:{ all -> 0x0425 }
            r0 = r16
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0425 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0425 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0425 }
            r10.add(r0)     // Catch:{ all -> 0x0425 }
            r21.b0()     // Catch:{ all -> 0x0425 }
            r0 = r3
            r16 = r4
            r3 = 82001(0x14051, double:4.0514E-319)
            com.google.android.gms.internal.measurement.s4$a r3 = r9.G0(r3)     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.s4$a r3 = r3.D0(r1)     // Catch:{ all -> 0x0425 }
            r3.c0(r8)     // Catch:{ all -> 0x0425 }
            if (r11 != 0) goto L_0x0251
            r9.q0()     // Catch:{ all -> 0x0425 }
        L_0x0251:
            if (r12 != 0) goto L_0x0259
            r9.M0()     // Catch:{ all -> 0x0425 }
            r9.C0()     // Catch:{ all -> 0x0425 }
        L_0x0259:
            if (r13 != 0) goto L_0x025e
            r9.d0()     // Catch:{ all -> 0x0425 }
        L_0x025e:
            r7.z(r6, r9)     // Catch:{ all -> 0x0425 }
            if (r14 != 0) goto L_0x0266
            r9.O0()     // Catch:{ all -> 0x0425 }
        L_0x0266:
            boolean r3 = com.google.android.gms.internal.measurement.fd.a()     // Catch:{ all -> 0x0425 }
            if (r3 == 0) goto L_0x02f4
            com.google.android.gms.measurement.internal.g r3 = r21.b0()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.k0.Y0     // Catch:{ all -> 0x0425 }
            boolean r3 = r3.r(r4)     // Catch:{ all -> 0x0425 }
            if (r3 == 0) goto L_0x02f4
            java.lang.String r3 = r9.Y0()     // Catch:{ all -> 0x0425 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0425 }
            if (r4 != 0) goto L_0x028e
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0425 }
            if (r3 == 0) goto L_0x028b
            goto L_0x028e
        L_0x028b:
            r20 = r0
            goto L_0x02ea
        L_0x028e:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0425 }
            java.util.List r4 = r9.Z0()     // Catch:{ all -> 0x0425 }
            r3.<init>(r4)     // Catch:{ all -> 0x0425 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0425 }
            r17 = 0
            r18 = 0
        L_0x029f:
            boolean r19 = r4.hasNext()     // Catch:{ all -> 0x0425 }
            if (r19 == 0) goto L_0x02d6
            java.lang.Object r19 = r4.next()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.n4 r19 = (com.google.android.gms.internal.measurement.n4) r19     // Catch:{ all -> 0x0425 }
            java.lang.String r8 = "_fx"
            r20 = r0
            java.lang.String r0 = r19.e0()     // Catch:{ all -> 0x0425 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x02c4
            r4.remove()     // Catch:{ all -> 0x0425 }
            r0 = r20
            r8 = 0
            r17 = 1
            r18 = 1
            goto L_0x029f
        L_0x02c4:
            java.lang.String r0 = "_f"
            java.lang.String r8 = r19.e0()     // Catch:{ all -> 0x0425 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x02d2
            r18 = 1
        L_0x02d2:
            r0 = r20
            r8 = 0
            goto L_0x029f
        L_0x02d6:
            r20 = r0
            if (r17 == 0) goto L_0x02e0
            r9.u0()     // Catch:{ all -> 0x0425 }
            r9.O(r3)     // Catch:{ all -> 0x0425 }
        L_0x02e0:
            if (r18 == 0) goto L_0x02ea
            java.lang.String r0 = r9.T0()     // Catch:{ all -> 0x0425 }
            r3 = 1
            r7.E(r0, r3)     // Catch:{ all -> 0x0425 }
        L_0x02ea:
            int r0 = r9.x()     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x02f1
            goto L_0x02f6
        L_0x02f1:
            r0 = r16
            goto L_0x031e
        L_0x02f4:
            r20 = r0
        L_0x02f6:
            com.google.android.gms.measurement.internal.g r0 = r21.b0()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.k0.f6188g0     // Catch:{ all -> 0x0425 }
            boolean r0 = r0.A(r6, r3)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x0319
            com.google.android.gms.internal.measurement.da r0 = r9.l()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.p8 r0 = (com.google.android.gms.internal.measurement.p8) r0     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.s4 r0 = (com.google.android.gms.internal.measurement.s4) r0     // Catch:{ all -> 0x0425 }
            byte[] r0 = r0.n()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.jc r3 = r21.l0()     // Catch:{ all -> 0x0425 }
            long r3 = r3.z(r0)     // Catch:{ all -> 0x0425 }
            r9.C(r3)     // Catch:{ all -> 0x0425 }
        L_0x0319:
            r0 = r16
            r0.y(r9)     // Catch:{ all -> 0x0425 }
        L_0x031e:
            int r15 = r15 + 1
            r4 = r0
            r3 = r20
            r0 = 1
            r8 = 0
            r9 = 0
            goto L_0x0215
        L_0x0328:
            r0 = r4
            boolean r3 = com.google.android.gms.internal.measurement.fd.a()     // Catch:{ all -> 0x0425 }
            if (r3 == 0) goto L_0x0353
            com.google.android.gms.measurement.internal.g r3 = r21.b0()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.k0.Y0     // Catch:{ all -> 0x0425 }
            boolean r3 = r3.r(r4)     // Catch:{ all -> 0x0425 }
            if (r3 == 0) goto L_0x0353
            int r3 = r0.x()     // Catch:{ all -> 0x0425 }
            if (r3 != 0) goto L_0x0353
            r7.F(r10)     // Catch:{ all -> 0x0425 }
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r1 = r21
            r1.H(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0425 }
            r1 = 0
        L_0x034f:
            r7.f6802v = r1
            goto L_0x002b
        L_0x0353:
            com.google.android.gms.measurement.internal.x4 r3 = r21.k()     // Catch:{ all -> 0x0425 }
            r4 = 2
            boolean r3 = r3.B(r4)     // Catch:{ all -> 0x0425 }
            if (r3 == 0) goto L_0x036f
            com.google.android.gms.measurement.internal.jc r3 = r21.l0()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.da r4 = r0.l()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.p8 r4 = (com.google.android.gms.internal.measurement.p8) r4     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.r4 r4 = (com.google.android.gms.internal.measurement.r4) r4     // Catch:{ all -> 0x0425 }
            java.lang.String r9 = r3.J(r4)     // Catch:{ all -> 0x0425 }
            goto L_0x0370
        L_0x036f:
            r9 = 0
        L_0x0370:
            r21.l0()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.da r3 = r0.l()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.p8 r3 = (com.google.android.gms.internal.measurement.p8) r3     // Catch:{ all -> 0x0425 }
            com.google.android.gms.internal.measurement.r4 r3 = (com.google.android.gms.internal.measurement.r4) r3     // Catch:{ all -> 0x0425 }
            byte[] r14 = r3.n()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.xb r3 = r7.f6790j     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.ac r3 = r3.t(r6)     // Catch:{ all -> 0x0425 }
            r7.F(r10)     // Catch:{ MalformedURLException -> 0x03e7 }
            com.google.android.gms.measurement.internal.bb r4 = r7.f6789i     // Catch:{ MalformedURLException -> 0x03e7 }
            com.google.android.gms.measurement.internal.p5 r4 = r4.f5900h     // Catch:{ MalformedURLException -> 0x03e7 }
            r4.b(r1)     // Catch:{ MalformedURLException -> 0x03e7 }
            java.lang.String r1 = "?"
            if (r5 <= 0) goto L_0x039c
            r2 = 0
            com.google.android.gms.internal.measurement.s4 r0 = r0.z(r2)     // Catch:{ MalformedURLException -> 0x03e7 }
            java.lang.String r1 = r0.G3()     // Catch:{ MalformedURLException -> 0x03e7 }
        L_0x039c:
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ MalformedURLException -> 0x03e7 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.J()     // Catch:{ MalformedURLException -> 0x03e7 }
            java.lang.String r2 = "Uploading data. app, uncompressed size, data"
            int r4 = r14.length     // Catch:{ MalformedURLException -> 0x03e7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ MalformedURLException -> 0x03e7 }
            r0.d(r2, r1, r4, r9)     // Catch:{ MalformedURLException -> 0x03e7 }
            r0 = 1
            r7.f6801u = r0     // Catch:{ MalformedURLException -> 0x03e7 }
            com.google.android.gms.measurement.internal.e5 r11 = r21.f0()     // Catch:{ MalformedURLException -> 0x03e7 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x03e7 }
            java.lang.String r0 = r3.a()     // Catch:{ MalformedURLException -> 0x03e7 }
            r13.<init>(r0)     // Catch:{ MalformedURLException -> 0x03e7 }
            java.util.Map r15 = r3.b()     // Catch:{ MalformedURLException -> 0x03e7 }
            com.google.android.gms.measurement.internal.bc r0 = new com.google.android.gms.measurement.internal.bc     // Catch:{ MalformedURLException -> 0x03e7 }
            r0.<init>(r7, r6)     // Catch:{ MalformedURLException -> 0x03e7 }
            r11.m()     // Catch:{ MalformedURLException -> 0x03e7 }
            r11.t()     // Catch:{ MalformedURLException -> 0x03e7 }
            h2.p.j(r13)     // Catch:{ MalformedURLException -> 0x03e7 }
            h2.p.j(r14)     // Catch:{ MalformedURLException -> 0x03e7 }
            h2.p.j(r0)     // Catch:{ MalformedURLException -> 0x03e7 }
            com.google.android.gms.measurement.internal.f6 r1 = r11.i()     // Catch:{ MalformedURLException -> 0x03e7 }
            com.google.android.gms.measurement.internal.j5 r2 = new com.google.android.gms.measurement.internal.j5     // Catch:{ MalformedURLException -> 0x03e7 }
            r10 = r2
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x03e7 }
            r1.y(r2)     // Catch:{ MalformedURLException -> 0x03e7 }
            goto L_0x0422
        L_0x03e7:
            com.google.android.gms.measurement.internal.x4 r0 = r21.k()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()     // Catch:{ all -> 0x0425 }
            java.lang.String r1 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.x4.u(r6)     // Catch:{ all -> 0x0425 }
            java.lang.String r3 = r3.a()     // Catch:{ all -> 0x0425 }
            r0.c(r1, r2, r3)     // Catch:{ all -> 0x0425 }
            goto L_0x0422
        L_0x03fd:
            r7.A = r4     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.p r0 = r21.d0()     // Catch:{ all -> 0x0425 }
            r21.b0()     // Catch:{ all -> 0x0425 }
            long r3 = com.google.android.gms.measurement.internal.g.F()     // Catch:{ all -> 0x0425 }
            long r1 = r1 - r3
            java.lang.String r0 = r0.N(r1)     // Catch:{ all -> 0x0425 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0425 }
            if (r1 != 0) goto L_0x0422
            com.google.android.gms.measurement.internal.p r1 = r21.d0()     // Catch:{ all -> 0x0425 }
            com.google.android.gms.measurement.internal.h6 r0 = r1.C0(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x0422
            r7.U(r0)     // Catch:{ all -> 0x0425 }
        L_0x0422:
            r1 = 0
            goto L_0x034f
        L_0x0425:
            r0 = move-exception
            r1 = 0
            r7.f6802v = r1
            r21.L()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zb.s0():void");
    }

    /* access modifiers changed from: package-private */
    public final void t(i0 i0Var, String str) {
        String str2;
        int i10;
        i0 i0Var2 = i0Var;
        String str3 = str;
        h6 C0 = d0().C0(str3);
        if (C0 == null || TextUtils.isEmpty(C0.h())) {
            k().E().b("No app data available; dropping event", str3);
            return;
        }
        Boolean l10 = l(C0);
        if (l10 == null) {
            if (!"_ui".equals(i0Var2.f6112m)) {
                k().K().b("Could not find package. appId", x4.u(str));
            }
        } else if (!l10.booleanValue()) {
            k().F().b("App version does not match; dropping event. appId", x4.u(str));
            return;
        }
        p7 P = P(str3);
        if (!kd.a() || !b0().r(k0.T0)) {
            str2 = "";
            i10 = 100;
        } else {
            str2 = Z(str3).i();
            i10 = P.b();
        }
        sc scVar = r2;
        h6 h6Var = C0;
        sc scVar2 = new sc(str, C0.j(), C0.h(), C0.z(), C0.v0(), C0.g0(), C0.a0(), (String) null, C0.r(), false, h6Var.i(), h6Var.v(), 0, 0, h6Var.q(), false, h6Var.r0(), h6Var.q0(), h6Var.c0(), h6Var.n(), (String) null, P.v(), "", (String) null, h6Var.t(), h6Var.p0(), i10, str2, h6Var.a(), h6Var.D());
        T(i0Var2, scVar);
    }

    /* access modifiers changed from: package-private */
    public final void u(h6 h6Var, s4.a aVar) {
        i().m();
        o0();
        if (kd.a()) {
            l b10 = l.b(aVar.V0());
            String t02 = h6Var.t0();
            i().m();
            o0();
            if (kd.a()) {
                p7 P = P(t02);
                if (kd.a() && b0().r(k0.V0)) {
                    aVar.p0(P.w());
                }
                if (P.s() != null) {
                    b10.c(p7.a.AD_STORAGE, P.b());
                } else {
                    b10.d(p7.a.AD_STORAGE, k.FAILSAFE);
                }
                if (P.u() != null) {
                    b10.c(p7.a.ANALYTICS_STORAGE, P.b());
                } else {
                    b10.d(p7.a.ANALYTICS_STORAGE, k.FAILSAFE);
                }
            }
            String t03 = h6Var.t0();
            i().m();
            o0();
            if (kd.a()) {
                z e10 = e(t03, Z(t03), P(t03), b10);
                aVar.Q(((Boolean) p.j(e10.g())).booleanValue());
                if (!TextUtils.isEmpty(e10.h())) {
                    aVar.t0(e10.h());
                }
            }
            i().m();
            o0();
            if (kd.a()) {
                w4 w4Var = null;
                Iterator<w4> it = aVar.a1().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    w4 next = it.next();
                    if ("_npa".equals(next.c0())) {
                        w4Var = next;
                        break;
                    }
                }
                if (w4Var != null) {
                    p7.a aVar2 = p7.a.AD_PERSONALIZATION;
                    if (b10.a(aVar2) == k.UNSET) {
                        Boolean q02 = h6Var.q0();
                        b10.d(aVar2, (q02 == null || (q02 == Boolean.TRUE && w4Var.X() != 1) || (q02 == Boolean.FALSE && w4Var.X() != 0)) ? k.API : k.MANIFEST);
                    }
                } else if (kd.a() && b0().r(k0.W0)) {
                    boolean z9 = true;
                    if (this.f6781a.I(h6Var.t0()) == null) {
                        b10.d(p7.a.AD_PERSONALIZATION, k.FAILSAFE);
                    } else {
                        w5 w5Var = this.f6781a;
                        String t04 = h6Var.t0();
                        p7.a aVar3 = p7.a.AD_PERSONALIZATION;
                        z9 = true ^ w5Var.J(t04, aVar3);
                        b10.d(aVar3, k.REMOTE_DEFAULT);
                    }
                    aVar.H((w4) ((p8) w4.a0().A("_npa").C(a().a()).z(z9 ? 1 : 0).l()));
                }
            }
            aVar.l0(b10.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void w(nc ncVar, sc scVar) {
        pc E0;
        i().m();
        o0();
        if (c0(scVar)) {
            if (!scVar.f6566t) {
                f(scVar);
                return;
            }
            int p02 = m0().p0(ncVar.f6359n);
            if (p02 != 0) {
                m0();
                String str = ncVar.f6359n;
                b0();
                String H2 = oc.H(str, 24, true);
                String str2 = ncVar.f6359n;
                int length = str2 != null ? str2.length() : 0;
                m0();
                oc.X(this.G, scVar.f6559m, p02, "_ev", H2, length);
                return;
            }
            int v9 = m0().v(ncVar.f6359n, ncVar.d());
            if (v9 != 0) {
                m0();
                String str3 = ncVar.f6359n;
                b0();
                String H3 = oc.H(str3, 24, true);
                Object d10 = ncVar.d();
                int length2 = (d10 == null || (!(d10 instanceof String) && !(d10 instanceof CharSequence))) ? 0 : String.valueOf(d10).length();
                m0();
                oc.X(this.G, scVar.f6559m, v9, "_ev", H3, length2);
                return;
            }
            Object z02 = m0().z0(ncVar.f6359n, ncVar.d());
            if (z02 != null) {
                if ("_sid".equals(ncVar.f6359n)) {
                    long j10 = ncVar.f6360o;
                    String str4 = ncVar.f6364s;
                    String str5 = (String) p.j(scVar.f6559m);
                    long j11 = 0;
                    pc E02 = d0().E0(str5, "_sno");
                    if (E02 != null) {
                        Object obj = E02.f6448e;
                        if (obj instanceof Long) {
                            j11 = ((Long) obj).longValue();
                            w(new nc("_sno", j10, Long.valueOf(j11 + 1), str4), scVar);
                        }
                    }
                    if (E02 != null) {
                        k().K().b("Retrieved last session number from database does not contain a valid (long) value", E02.f6448e);
                    }
                    e0 B0 = d0().B0(str5, "_s");
                    if (B0 != null) {
                        j11 = B0.f5982c;
                        k().J().b("Backfill the session number. Last used session number", Long.valueOf(j11));
                    }
                    w(new nc("_sno", j10, Long.valueOf(j11 + 1), str4), scVar);
                }
                pc pcVar = new pc((String) p.j(scVar.f6559m), (String) p.j(ncVar.f6364s), ncVar.f6359n, ncVar.f6360o, z02);
                k().J().c("Setting user property", this.f6792l.C().g(pcVar.f6446c), z02);
                d0().P0();
                try {
                    if ("_id".equals(pcVar.f6446c) && (E0 = d0().E0(scVar.f6559m, "_id")) != null && !pcVar.f6448e.equals(E0.f6448e)) {
                        d0().K0(scVar.f6559m, "_lair");
                    }
                    f(scVar);
                    boolean d02 = d0().d0(pcVar);
                    if ("_sid".equals(ncVar.f6359n)) {
                        long y9 = l0().y(scVar.J);
                        h6 C0 = d0().C0(scVar.f6559m);
                        if (C0 != null) {
                            C0.l0(y9);
                            if (C0.s()) {
                                d0().U(C0);
                            }
                        }
                    }
                    d0().S0();
                    if (!d02) {
                        k().F().c("Too many unique user properties are set. Ignoring user property", this.f6792l.C().g(pcVar.f6446c), pcVar.f6448e);
                        m0();
                        oc.X(this.G, scVar.f6559m, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    d0().Q0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void x(Runnable runnable) {
        i().m();
        if (this.f6796p == null) {
            this.f6796p = new ArrayList();
        }
        this.f6796p.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013c A[Catch:{ all -> 0x017f, all -> 0x0188 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014a A[Catch:{ all -> 0x017f, all -> 0x0188 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.f6 r0 = r6.i()
            r0.m()
            r6.o0()
            h2.p.f(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0188 }
        L_0x0012:
            com.google.android.gms.measurement.internal.x4 r1 = r6.k()     // Catch:{ all -> 0x0188 }
            com.google.android.gms.measurement.internal.z4 r1 = r1.J()     // Catch:{ all -> 0x0188 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0188 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0188 }
            r1.b(r2, r3)     // Catch:{ all -> 0x0188 }
            com.google.android.gms.measurement.internal.p r1 = r6.d0()     // Catch:{ all -> 0x0188 }
            r1.P0()     // Catch:{ all -> 0x0188 }
            com.google.android.gms.measurement.internal.p r1 = r6.d0()     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.h6 r1 = r1.C0(r7)     // Catch:{ all -> 0x017f }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x0040
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0040
            if (r8 != r3) goto L_0x0044
        L_0x0040:
            if (r9 != 0) goto L_0x0044
            r2 = 1
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.x4 r8 = r6.k()     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.z4 r8 = r8.K()     // Catch:{ all -> 0x017f }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.x4.u(r7)     // Catch:{ all -> 0x017f }
            r8.b(r9, r7)     // Catch:{ all -> 0x017f }
            goto L_0x0173
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ba
            if (r8 != r5) goto L_0x0061
            goto L_0x00ba
        L_0x0061:
            l2.d r10 = r6.a()     // Catch:{ all -> 0x017f }
            long r10 = r10.a()     // Catch:{ all -> 0x017f }
            r1.b0(r10)     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.p r10 = r6.d0()     // Catch:{ all -> 0x017f }
            r10.U(r1)     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.x4 r10 = r6.k()     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.z4 r10 = r10.J()     // Catch:{ all -> 0x017f }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x017f }
            r10.c(r11, r1, r9)     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.w5 r9 = r6.g0()     // Catch:{ all -> 0x017f }
            r9.S(r7)     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.bb r7 = r6.f6789i     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.p5 r7 = r7.f5900h     // Catch:{ all -> 0x017f }
            l2.d r9 = r6.a()     // Catch:{ all -> 0x017f }
            long r9 = r9.a()     // Catch:{ all -> 0x017f }
            r7.b(r9)     // Catch:{ all -> 0x017f }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a4
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r4 = 0
        L_0x00a4:
            if (r4 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.bb r7 = r6.f6789i     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.p5 r7 = r7.f5898f     // Catch:{ all -> 0x017f }
            l2.d r8 = r6.a()     // Catch:{ all -> 0x017f }
            long r8 = r8.a()     // Catch:{ all -> 0x017f }
            r7.b(r8)     // Catch:{ all -> 0x017f }
        L_0x00b5:
            r6.M()     // Catch:{ all -> 0x017f }
            goto L_0x0173
        L_0x00ba:
            r9 = 0
            if (r11 == 0) goto L_0x00c6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r2 = r11.get(r2)     // Catch:{ all -> 0x017f }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x017f }
            goto L_0x00c7
        L_0x00c6:
            r2 = r9
        L_0x00c7:
            if (r2 == 0) goto L_0x00d6
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x017f }
            if (r4 != 0) goto L_0x00d6
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x017f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x017f }
            goto L_0x00d7
        L_0x00d6:
            r2 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e2
            java.lang.String r4 = "ETag"
            java.lang.Object r11 = r11.get(r4)     // Catch:{ all -> 0x017f }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x017f }
            goto L_0x00e3
        L_0x00e2:
            r11 = r9
        L_0x00e3:
            if (r11 == 0) goto L_0x00f2
            boolean r4 = r11.isEmpty()     // Catch:{ all -> 0x017f }
            if (r4 != 0) goto L_0x00f2
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x017f }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x017f }
            goto L_0x00f3
        L_0x00f2:
            r11 = r9
        L_0x00f3:
            if (r8 == r5) goto L_0x010f
            if (r8 != r3) goto L_0x00f8
            goto L_0x010f
        L_0x00f8:
            com.google.android.gms.measurement.internal.w5 r9 = r6.g0()     // Catch:{ all -> 0x017f }
            boolean r9 = r9.G(r7, r10, r2, r11)     // Catch:{ all -> 0x017f }
            if (r9 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.p r7 = r6.d0()     // Catch:{ all -> 0x0188 }
        L_0x0106:
            r7.Q0()     // Catch:{ all -> 0x0188 }
            r6.f6800t = r0
            r6.L()
            return
        L_0x010f:
            com.google.android.gms.measurement.internal.w5 r11 = r6.g0()     // Catch:{ all -> 0x017f }
            com.google.android.gms.internal.measurement.a4 r11 = r11.K(r7)     // Catch:{ all -> 0x017f }
            if (r11 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.w5 r11 = r6.g0()     // Catch:{ all -> 0x017f }
            boolean r9 = r11.G(r7, r9, r9, r9)     // Catch:{ all -> 0x017f }
            if (r9 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.p r7 = r6.d0()     // Catch:{ all -> 0x0188 }
            goto L_0x0106
        L_0x0128:
            l2.d r9 = r6.a()     // Catch:{ all -> 0x017f }
            long r2 = r9.a()     // Catch:{ all -> 0x017f }
            r1.A(r2)     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.p r9 = r6.d0()     // Catch:{ all -> 0x017f }
            r9.U(r1)     // Catch:{ all -> 0x017f }
            if (r8 != r5) goto L_0x014a
            com.google.android.gms.measurement.internal.x4 r8 = r6.k()     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.z4 r8 = r8.L()     // Catch:{ all -> 0x017f }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.b(r9, r7)     // Catch:{ all -> 0x017f }
            goto L_0x0160
        L_0x014a:
            com.google.android.gms.measurement.internal.x4 r7 = r6.k()     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.z4 r7 = r7.J()     // Catch:{ all -> 0x017f }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x017f }
            int r10 = r10.length     // Catch:{ all -> 0x017f }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x017f }
            r7.c(r9, r8, r10)     // Catch:{ all -> 0x017f }
        L_0x0160:
            com.google.android.gms.measurement.internal.e5 r7 = r6.f0()     // Catch:{ all -> 0x017f }
            boolean r7 = r7.z()     // Catch:{ all -> 0x017f }
            if (r7 == 0) goto L_0x00b5
            boolean r7 = r6.N()     // Catch:{ all -> 0x017f }
            if (r7 == 0) goto L_0x00b5
            r6.s0()     // Catch:{ all -> 0x017f }
        L_0x0173:
            com.google.android.gms.measurement.internal.p r7 = r6.d0()     // Catch:{ all -> 0x017f }
            r7.S0()     // Catch:{ all -> 0x017f }
            com.google.android.gms.measurement.internal.p r7 = r6.d0()     // Catch:{ all -> 0x0188 }
            goto L_0x0106
        L_0x017f:
            r7 = move-exception
            com.google.android.gms.measurement.internal.p r8 = r6.d0()     // Catch:{ all -> 0x0188 }
            r8.Q0()     // Catch:{ all -> 0x0188 }
            throw r7     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r7 = move-exception
            r6.f6800t = r0
            r6.L()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zb.y(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void z(String str, s4.a aVar) {
        int x9;
        int indexOf;
        Set<String> Q = g0().Q(str);
        if (Q != null) {
            aVar.a0(Q);
        }
        if (g0().a0(str)) {
            aVar.m0();
        }
        if (g0().d0(str)) {
            if (b0().A(str, k0.B0)) {
                String X0 = aVar.X0();
                if (!TextUtils.isEmpty(X0) && (indexOf = X0.indexOf(".")) != -1) {
                    aVar.N0(X0.substring(0, indexOf));
                }
            } else {
                aVar.F0();
            }
        }
        if (g0().e0(str) && (x9 = jc.x(aVar, "_id")) != -1) {
            aVar.S(x9);
        }
        if (g0().c0(str)) {
            aVar.q0();
        }
        if (g0().Z(str)) {
            aVar.d0();
            b bVar = this.D.get(str);
            if (bVar == null || bVar.f6813b + b0().w(str, k0.W) < a().b()) {
                bVar = new b();
                this.D.put(str, bVar);
            }
            aVar.E0(bVar.f6812a);
        }
        if (g0().b0(str)) {
            aVar.O0();
        }
    }

    public final Context zza() {
        return this.f6792l.zza();
    }
}
