package com.google.android.gms.measurement.internal;

public final class o4<V> {

    /* renamed from: h  reason: collision with root package name */
    private static final Object f6371h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f6372a;

    /* renamed from: b  reason: collision with root package name */
    private final m4<V> f6373b;

    /* renamed from: c  reason: collision with root package name */
    private final V f6374c;

    /* renamed from: d  reason: collision with root package name */
    private final V f6375d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f6376e;

    /* renamed from: f  reason: collision with root package name */
    private volatile V f6377f;

    /* renamed from: g  reason: collision with root package name */
    private volatile V f6378g;

    private o4(String str, V v9, V v10, m4<V> m4Var) {
        this.f6376e = new Object();
        this.f6377f = null;
        this.f6378g = null;
        this.f6372a = str;
        this.f6374c = v9;
        this.f6375d = v10;
        this.f6373b = m4Var;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 171 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0046 */
    public final V a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6376e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.f r4 = com.google.android.gms.measurement.internal.l4.f6272a
            if (r4 != 0) goto L_0x000e
            V r4 = r3.f6374c
            return r4
        L_0x000e:
            java.lang.Object r4 = f6371h
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.f.a()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0022
            V r0 = r3.f6378g     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x001e
            V r0 = r3.f6374c     // Catch:{ all -> 0x006b }
            goto L_0x0020
        L_0x001e:
            V r0 = r3.f6378g     // Catch:{ all -> 0x006b }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            java.util.List r4 = com.google.android.gms.measurement.internal.k0.f6173a     // Catch:{ SecurityException -> 0x0058 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0058 }
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0058 }
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0058 }
            com.google.android.gms.measurement.internal.o4 r0 = (com.google.android.gms.measurement.internal.o4) r0     // Catch:{ SecurityException -> 0x0058 }
            boolean r1 = com.google.android.gms.measurement.internal.f.a()     // Catch:{ SecurityException -> 0x0058 }
            if (r1 != 0) goto L_0x0050
            r1 = 0
            com.google.android.gms.measurement.internal.m4<V> r2 = r0.f6373b     // Catch:{ IllegalStateException -> 0x0046 }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0046 }
        L_0x0046:
            java.lang.Object r2 = f6371h     // Catch:{ SecurityException -> 0x0058 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0058 }
            r0.f6378g = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            goto L_0x002b
        L_0x004d:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0058 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0058 }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0058:
        L_0x0059:
            com.google.android.gms.measurement.internal.m4<V> r4 = r3.f6373b
            if (r4 != 0) goto L_0x0060
            V r4 = r3.f6374c
            return r4
        L_0x0060:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0068, IllegalStateException -> 0x0065 }
            return r4
        L_0x0065:
            V r4 = r3.f6374c
            return r4
        L_0x0068:
            V r4 = r3.f6374c
            return r4
        L_0x006b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            throw r4
        L_0x0070:
            r4 = move-exception
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.o4.a(java.lang.Object):java.lang.Object");
    }

    public final String b() {
        return this.f6372a;
    }
}
