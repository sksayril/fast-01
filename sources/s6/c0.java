package s6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import c7.a;
import java.util.HashMap;
import java.util.Map;
import k7.c;
import k7.j;
import k7.k;
import k7.s;

public class c0 implements c7.a, k.c {

    /* renamed from: o  reason: collision with root package name */
    static final Map<String, Integer> f12239o = new HashMap();
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: p  reason: collision with root package name */
    static final Map<Integer, i> f12240p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    private static final Object f12241q = new Object();
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final Object f12242r = new Object();

    /* renamed from: s  reason: collision with root package name */
    static int f12243s = 0;

    /* renamed from: t  reason: collision with root package name */
    static String f12244t;

    /* renamed from: u  reason: collision with root package name */
    private static int f12245u = 0;

    /* renamed from: v  reason: collision with root package name */
    private static int f12246v = 1;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static int f12247w = 0;

    /* renamed from: x  reason: collision with root package name */
    private static o f12248x;

    /* renamed from: m  reason: collision with root package name */
    private Context f12249m;

    /* renamed from: n  reason: collision with root package name */
    private k f12250n;

    class a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ i f12251m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ k.d f12252n;

        a(i iVar, k.d dVar) {
            this.f12251m = iVar;
            this.f12252n = dVar;
        }

        public void run() {
            synchronized (c0.f12242r) {
                c0.this.l(this.f12251m);
            }
            this.f12252n.a((Object) null);
        }
    }

    class b implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ i f12254m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f12255n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ k.d f12256o;

        b(i iVar, String str, k.d dVar) {
            this.f12254m = iVar;
            this.f12255n = str;
            this.f12256o = dVar;
        }

        public void run() {
            synchronized (c0.f12242r) {
                i iVar = this.f12254m;
                if (iVar != null) {
                    c0.this.l(iVar);
                }
                try {
                    if (r.c(c0.f12243s)) {
                        Log.d("Sqflite", "delete database " + this.f12255n);
                    }
                    i.o(this.f12255n);
                } catch (Exception e10) {
                    Log.e("Sqflite", "error " + e10 + " while closing database " + c0.f12247w);
                }
            }
            this.f12256o.a((Object) null);
        }
    }

    private void A(j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("id")).intValue();
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            if (r.b(n10.f12274d)) {
                Log.d("Sqflite", n10.A() + "closing " + intValue + " " + n10.f12272b);
            }
            String str = n10.f12272b;
            synchronized (f12241q) {
                f12240p.remove(Integer.valueOf(intValue));
                if (n10.f12271a) {
                    f12239o.remove(str);
                }
            }
            f12248x.a(n10, new a(n10, dVar));
        }
    }

    private void B(j jVar, k.d dVar) {
        dVar.a(Boolean.valueOf(i.x((String) jVar.a("path"))));
    }

    private void C(j jVar, k.d dVar) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) jVar.a("cmd"))) {
            int i10 = f12243s;
            if (i10 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i10));
            }
            Map<Integer, i> map = f12240p;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry next : map.entrySet()) {
                    i iVar = (i) next.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", iVar.f12272b);
                    hashMap3.put("singleInstance", Boolean.valueOf(iVar.f12271a));
                    int i11 = iVar.f12274d;
                    if (i11 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i11));
                    }
                    hashMap2.put(((Integer) next.getKey()).toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.a(hashMap);
    }

    private void D(j jVar, k.d dVar) {
        t6.a.f12448a = Boolean.TRUE.equals(jVar.b());
        t6.a.f12450c = t6.a.f12449b && t6.a.f12448a;
        if (!t6.a.f12448a) {
            f12243s = 0;
        } else if (t6.a.f12450c) {
            f12243s = 2;
        } else if (t6.a.f12448a) {
            f12243s = 1;
        }
        dVar.a((Object) null);
    }

    private void E(j jVar, k.d dVar) {
        i iVar;
        Map<Integer, i> map;
        String str = (String) jVar.a("path");
        synchronized (f12241q) {
            if (r.c(f12243s)) {
                Log.d("Sqflite", "Look for " + str + " in " + f12239o.keySet());
            }
            Map<String, Integer> map2 = f12239o;
            Integer num = map2.get(str);
            if (num == null || (iVar = map.get(num)) == null || !iVar.f12279i.isOpen()) {
                iVar = null;
            } else {
                if (r.c(f12243s)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(iVar.A());
                    sb.append("found single instance ");
                    sb.append(iVar.F() ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    Log.d("Sqflite", sb.toString());
                }
                (map = f12240p).remove(num);
                map2.remove(str);
            }
        }
        b bVar = new b(iVar, str, dVar);
        o oVar = f12248x;
        if (oVar != null) {
            oVar.a(iVar, bVar);
        } else {
            bVar.run();
        }
    }

    private void F(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f12248x.a(n10, new x(jVar, dVar, n10));
        }
    }

    private void H(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f12248x.a(n10, new v(jVar, dVar, n10));
        }
    }

    private void I(j jVar, k.d dVar) {
        int i10;
        i iVar;
        j jVar2 = jVar;
        String str = (String) jVar2.a("path");
        Boolean bool = (Boolean) jVar2.a("readOnly");
        boolean o10 = o(str);
        boolean z9 = !Boolean.FALSE.equals(jVar2.a("singleInstance")) && !o10;
        if (z9) {
            synchronized (f12241q) {
                if (r.c(f12243s)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f12239o.keySet());
                }
                Integer num = f12239o.get(str);
                if (!(num == null || (iVar = f12240p.get(num)) == null)) {
                    if (iVar.f12279i.isOpen()) {
                        if (r.c(f12243s)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(iVar.A());
                            sb.append("re-opened single instance ");
                            sb.append(iVar.F() ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        dVar.a(x(num.intValue(), true, iVar.F()));
                        return;
                    } else if (r.c(f12243s)) {
                        Log.d("Sqflite", iVar.A() + "single instance database of " + str + " not opened");
                    }
                }
                k.d dVar2 = dVar;
            }
        } else {
            k.d dVar3 = dVar;
        }
        Object obj = f12241q;
        synchronized (obj) {
            i10 = f12247w + 1;
            f12247w = i10;
        }
        i iVar2 = new i(this.f12249m, str, i10, z9, f12243s);
        synchronized (obj) {
            if (f12248x == null) {
                o b10 = n.b("Sqflite", f12246v, f12245u);
                f12248x = b10;
                b10.start();
                if (r.b(iVar2.f12274d)) {
                    Log.d("Sqflite", iVar2.A() + "starting worker pool with priority " + f12245u);
                }
            }
            iVar2.f12278h = f12248x;
            if (r.b(iVar2.f12274d)) {
                Log.d("Sqflite", iVar2.A() + "opened " + i10 + " " + str);
            }
            b0 b0Var = r1;
            o oVar = f12248x;
            b0 b0Var2 = new b0(o10, str, dVar, bool, iVar2, jVar, z9, i10);
            oVar.a(iVar2, b0Var);
        }
    }

    private void K(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f12248x.a(n10, new u(jVar, dVar, n10));
        }
    }

    private void L(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f12248x.a(n10, new y(jVar, dVar, n10));
        }
    }

    private void M(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f12248x.a(n10, new z(jVar, n10, dVar));
        }
    }

    private void N(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f12248x.a(n10, new w(jVar, dVar, n10));
        }
    }

    /* access modifiers changed from: private */
    public void l(i iVar) {
        try {
            if (r.b(iVar.f12274d)) {
                Log.d("Sqflite", iVar.A() + "closing database ");
            }
            iVar.k();
        } catch (Exception e10) {
            Log.e("Sqflite", "error " + e10 + " while closing database " + f12247w);
        }
        synchronized (f12241q) {
            if (f12240p.isEmpty() && f12248x != null) {
                if (r.b(iVar.f12274d)) {
                    Log.d("Sqflite", iVar.A() + "stopping thread");
                }
                f12248x.c();
                f12248x = null;
            }
        }
    }

    private i m(int i10) {
        return f12240p.get(Integer.valueOf(i10));
    }

    private i n(j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("id")).intValue();
        i m10 = m(intValue);
        if (m10 != null) {
            return m10;
        }
        dVar.b("sqlite_error", "database_closed " + intValue, (Object) null);
        return null;
    }

    static boolean o(String str) {
        return str == null || str.equals(":memory:");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r4.a(x(r9, false, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        r6.D(r2, new u6.d(r7, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void s(boolean r2, java.lang.String r3, k7.k.d r4, java.lang.Boolean r5, s6.i r6, k7.j r7, boolean r8, int r9) {
        /*
            java.lang.Object r0 = f12242r
            monitor-enter(r0)
            if (r2 != 0) goto L_0x003e
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x009f }
            r2.<init>(r3)     // Catch:{ all -> 0x009f }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.getParent()     // Catch:{ all -> 0x009f }
            r1.<init>(r2)     // Catch:{ all -> 0x009f }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            boolean r2 = r1.mkdirs()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            boolean r2 = r1.exists()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            java.lang.String r2 = "sqlite_error"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r5.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "open_failed "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x009f }
            r5 = 0
            r4.b(r2, r3, r5)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            return
        L_0x003e:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00a1 }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x00a1 }
            if (r2 == 0) goto L_0x004a
            r6.N()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x004d
        L_0x004a:
            r6.M()     // Catch:{ Exception -> 0x00a1 }
        L_0x004d:
            java.lang.Object r2 = f12241q     // Catch:{ all -> 0x009f }
            monitor-enter(r2)     // Catch:{ all -> 0x009f }
            if (r8 == 0) goto L_0x005b
            java.util.Map<java.lang.String, java.lang.Integer> r5 = f12239o     // Catch:{ all -> 0x009c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x009c }
            r5.put(r3, r7)     // Catch:{ all -> 0x009c }
        L_0x005b:
            java.util.Map<java.lang.Integer, s6.i> r5 = f12240p     // Catch:{ all -> 0x009c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x009c }
            r5.put(r7, r6)     // Catch:{ all -> 0x009c }
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            int r2 = r6.f12274d     // Catch:{ all -> 0x009f }
            boolean r2 = s6.r.b(r2)     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = "Sqflite"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r5.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r6.A()     // Catch:{ all -> 0x009f }
            r5.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "opened "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r9)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = " "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x009f }
            android.util.Log.d(r2, r3)     // Catch:{ all -> 0x009f }
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            r2 = 0
            java.util.Map r2 = x(r9, r2, r2)
            r4.a(r2)
            return
        L_0x009c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r3     // Catch:{ all -> 0x009f }
        L_0x009f:
            r2 = move-exception
            goto L_0x00ac
        L_0x00a1:
            r2 = move-exception
            u6.d r3 = new u6.d     // Catch:{ all -> 0x009f }
            r3.<init>(r7, r4)     // Catch:{ all -> 0x009f }
            r6.D(r2, r3)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            return
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.c0.s(boolean, java.lang.String, k7.k$d, java.lang.Boolean, s6.i, k7.j, boolean, int):void");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void v(j jVar, i iVar, k.d dVar) {
        try {
            iVar.f12279i.setLocale(e0.d((String) jVar.a("locale")));
            dVar.a((Object) null);
        } catch (Exception e10) {
            dVar.b("sqlite_error", "Error calling setLocale: " + e10.getMessage(), (Object) null);
        }
    }

    static Map x(int i10, boolean z9, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i10));
        if (z9) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z10) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    private void y(Context context, c cVar) {
        this.f12249m = context;
        k kVar = new k(cVar, "com.tekartik.sqflite", s.f11011b, cVar.d());
        this.f12250n = kVar;
        kVar.e(this);
    }

    private void z(j jVar, k.d dVar) {
        i n10 = n(jVar, dVar);
        if (n10 != null) {
            f12248x.a(n10, new a0(n10, jVar, dVar));
        }
    }

    /* access modifiers changed from: package-private */
    public void G(j jVar, k.d dVar) {
        if (f12244t == null) {
            f12244t = this.f12249m.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.a(f12244t);
    }

    /* access modifiers changed from: package-private */
    public void J(j jVar, k.d dVar) {
        Object a10 = jVar.a("androidThreadPriority");
        if (a10 != null) {
            f12245u = ((Integer) a10).intValue();
        }
        Object a11 = jVar.a("androidThreadCount");
        if (a11 != null && !a11.equals(Integer.valueOf(f12246v))) {
            f12246v = ((Integer) a11).intValue();
            o oVar = f12248x;
            if (oVar != null) {
                oVar.c();
                f12248x = null;
            }
        }
        Integer a12 = r.a(jVar);
        if (a12 != null) {
            f12243s = a12.intValue();
        }
        dVar.a((Object) null);
    }

    public void onAttachedToEngine(a.b bVar) {
        y(bVar.a(), bVar.b());
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f12249m = null;
        this.f12250n.e((k.c) null);
        this.f12250n = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f10996a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c10 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c10 = 4;
                    break;
                }
                break;
            case -396289107:
                if (str.equals("androidSetLocale")) {
                    c10 = 5;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c10 = 6;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c10 = 7;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c10 = 8;
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c10 = 9;
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c10 = 10;
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c10 = 11;
                    break;
                }
                break;
            case 956410295:
                if (str.equals("databaseExists")) {
                    c10 = 12;
                    break;
                }
                break;
            case 1193546321:
                if (str.equals("queryCursorNext")) {
                    c10 = 13;
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c10 = 15;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                F(jVar, dVar);
                return;
            case 1:
                A(jVar, dVar);
                return;
            case 2:
                J(jVar, dVar);
                return;
            case 3:
                H(jVar, dVar);
                return;
            case 4:
                N(jVar, dVar);
                return;
            case 5:
                M(jVar, dVar);
                return;
            case 6:
                E(jVar, dVar);
                return;
            case 7:
                D(jVar, dVar);
                return;
            case 8:
                I(jVar, dVar);
                return;
            case 9:
                z(jVar, dVar);
                return;
            case 10:
                C(jVar, dVar);
                return;
            case 11:
                K(jVar, dVar);
                return;
            case 12:
                B(jVar, dVar);
                return;
            case 13:
                L(jVar, dVar);
                return;
            case 14:
                dVar.a("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                G(jVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }
}
