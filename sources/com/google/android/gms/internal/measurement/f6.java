package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p3.c;

public abstract class f6<T> {

    /* renamed from: g  reason: collision with root package name */
    private static final Object f5232g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static volatile m6 f5233h;

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReference<Collection<f6<?>>> f5234i = new AtomicReference<>();

    /* renamed from: j  reason: collision with root package name */
    private static q6 f5235j = new q6(g6.f5271a);

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicInteger f5236k = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private final n6 f5237a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5238b;

    /* renamed from: c  reason: collision with root package name */
    private final T f5239c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f5240d;

    /* renamed from: e  reason: collision with root package name */
    private volatile T f5241e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5242f;

    private f6(n6 n6Var, String str, T t9, boolean z9) {
        this.f5240d = -1;
        String str2 = n6Var.f5466a;
        if (str2 == null && n6Var.f5467b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (str2 == null || n6Var.f5467b == null) {
            this.f5237a = n6Var;
            this.f5238b = str;
            this.f5239c = t9;
            this.f5242f = z9;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    static /* synthetic */ f6 a(n6 n6Var, String str, Boolean bool, boolean z9) {
        return new i6(n6Var, str, bool, true);
    }

    static /* synthetic */ f6 b(n6 n6Var, String str, Double d10, boolean z9) {
        return new l6(n6Var, str, d10, true);
    }

    static /* synthetic */ f6 c(n6 n6Var, String str, Long l10, boolean z9) {
        return new j6(n6Var, str, l10, true);
    }

    static /* synthetic */ f6 d(n6 n6Var, String str, String str2, boolean z9) {
        return new k6(n6Var, str, str2, true);
    }

    private final T f(m6 m6Var) {
        c<Context, Boolean> cVar;
        n6 n6Var = this.f5237a;
        if (!n6Var.f5470e && ((cVar = n6Var.f5474i) == null || cVar.apply(m6Var.a()).booleanValue())) {
            y5 a10 = y5.a(m6Var.a());
            n6 n6Var2 = this.f5237a;
            Object i10 = a10.i(n6Var2.f5470e ? null : h(n6Var2.f5468c));
            if (i10 != null) {
                return g(i10);
            }
        }
        return null;
    }

    private final String h(String str) {
        if (str != null && str.isEmpty()) {
            return this.f5238b;
        }
        String str2 = this.f5238b;
        return str + str2;
    }

    private final T j(m6 m6Var) {
        Object i10;
        t5 a10 = this.f5237a.f5467b != null ? d6.b(m6Var.a(), this.f5237a.f5467b) ? this.f5237a.f5473h ? p5.a(m6Var.a().getContentResolver(), c6.a(c6.b(m6Var.a(), this.f5237a.f5467b.getLastPathSegment())), e6.f5206m) : p5.a(m6Var.a().getContentResolver(), this.f5237a.f5467b, e6.f5206m) : null : o6.b(m6Var.a(), this.f5237a.f5466a, e6.f5206m);
        if (a10 == null || (i10 = a10.i(k())) == null) {
            return null;
        }
        return g(i10);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void l(android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.m6 r0 = f5233h
            if (r0 != 0) goto L_0x0049
            if (r3 != 0) goto L_0x0007
            goto L_0x0049
        L_0x0007:
            java.lang.Object r0 = f5232g
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.m6 r1 = f5233h     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0044
            monitor-enter(r0)     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.measurement.m6 r1 = f5233h     // Catch:{ all -> 0x0041 }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            if (r1 == 0) goto L_0x0021
            android.content.Context r1 = r1.a()     // Catch:{ all -> 0x0041 }
            if (r1 == r3) goto L_0x003f
        L_0x0021:
            com.google.android.gms.internal.measurement.p5.d()     // Catch:{ all -> 0x0041 }
            com.google.android.gms.internal.measurement.o6.c()     // Catch:{ all -> 0x0041 }
            com.google.android.gms.internal.measurement.y5.b()     // Catch:{ all -> 0x0041 }
            com.google.android.gms.internal.measurement.h6 r1 = new com.google.android.gms.internal.measurement.h6     // Catch:{ all -> 0x0041 }
            r1.<init>(r3)     // Catch:{ all -> 0x0041 }
            p3.k r1 = p3.l.a(r1)     // Catch:{ all -> 0x0041 }
            com.google.android.gms.internal.measurement.m5 r2 = new com.google.android.gms.internal.measurement.m5     // Catch:{ all -> 0x0041 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0041 }
            f5233h = r2     // Catch:{ all -> 0x0041 }
            java.util.concurrent.atomic.AtomicInteger r3 = f5236k     // Catch:{ all -> 0x0041 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x0044
        L_0x0041:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r3
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.f6.l(android.content.Context):void");
    }

    public static void m() {
        f5236k.incrementAndGet();
    }

    static /* synthetic */ boolean n() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T e() {
        /*
            r8 = this;
            boolean r0 = r8.f5242f
            if (r0 != 0) goto L_0x0011
            com.google.android.gms.internal.measurement.q6 r0 = f5235j
            java.lang.String r1 = r8.f5238b
            boolean r0 = r0.a(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            p3.h.n(r0, r1)
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = f5236k
            int r0 = r0.get()
            int r1 = r8.f5240d
            if (r1 >= r0) goto L_0x0093
            monitor-enter(r8)
            int r1 = r8.f5240d     // Catch:{ all -> 0x0090 }
            if (r1 >= r0) goto L_0x008e
            com.google.android.gms.internal.measurement.m6 r1 = f5233h     // Catch:{ all -> 0x0090 }
            p3.g r2 = p3.g.a()     // Catch:{ all -> 0x0090 }
            r3 = 0
            if (r1 == 0) goto L_0x004d
            p3.k r2 = r1.b()     // Catch:{ all -> 0x0090 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0090 }
            p3.g r2 = (p3.g) r2     // Catch:{ all -> 0x0090 }
            boolean r4 = r2.c()     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x004d
            java.lang.Object r3 = r2.b()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.measurement.z5 r3 = (com.google.android.gms.internal.measurement.z5) r3     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.measurement.n6 r4 = r8.f5237a     // Catch:{ all -> 0x0090 }
            android.net.Uri r5 = r4.f5467b     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = r4.f5466a     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = r4.f5469d     // Catch:{ all -> 0x0090 }
            java.lang.String r7 = r8.f5238b     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = r3.a(r5, r6, r4, r7)     // Catch:{ all -> 0x0090 }
        L_0x004d:
            if (r1 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            java.lang.String r5 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            p3.h.n(r4, r5)     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.measurement.n6 r4 = r8.f5237a     // Catch:{ all -> 0x0090 }
            boolean r4 = r4.f5471f     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r8.f(r1)     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x0064
            goto L_0x007b
        L_0x0064:
            java.lang.Object r4 = r8.j(r1)     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x0079
            goto L_0x007b
        L_0x006b:
            java.lang.Object r4 = r8.j(r1)     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x0072
            goto L_0x007b
        L_0x0072:
            java.lang.Object r4 = r8.f(r1)     // Catch:{ all -> 0x0090 }
            if (r4 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            T r4 = r8.f5239c     // Catch:{ all -> 0x0090 }
        L_0x007b:
            boolean r1 = r2.c()     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x008a
            if (r3 != 0) goto L_0x0086
            T r4 = r8.f5239c     // Catch:{ all -> 0x0090 }
            goto L_0x008a
        L_0x0086:
            java.lang.Object r4 = r8.g(r3)     // Catch:{ all -> 0x0090 }
        L_0x008a:
            r8.f5241e = r4     // Catch:{ all -> 0x0090 }
            r8.f5240d = r0     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r8)     // Catch:{ all -> 0x0090 }
            goto L_0x0093
        L_0x0090:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0090 }
            throw r0
        L_0x0093:
            T r0 = r8.f5241e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.f6.e():java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public abstract T g(Object obj);

    public final String k() {
        return h(this.f5237a.f5469d);
    }
}
