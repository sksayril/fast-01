package com.google.android.gms.internal.measurement;

public class g9 {

    /* renamed from: d  reason: collision with root package name */
    private static final c8 f5272d = c8.f5168c;

    /* renamed from: a  reason: collision with root package name */
    private f7 f5273a;

    /* renamed from: b  reason: collision with root package name */
    private volatile da f5274b;

    /* renamed from: c  reason: collision with root package name */
    private volatile f7 f5275c;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.da c(com.google.android.gms.internal.measurement.da r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.da r0 = r1.f5274b
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.da r0 = r1.f5274b     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f5274b = r2     // Catch:{ b9 -> 0x0012 }
            com.google.android.gms.internal.measurement.f7 r0 = com.google.android.gms.internal.measurement.f7.f5243n     // Catch:{ b9 -> 0x0012 }
            r1.f5275c = r0     // Catch:{ b9 -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f5274b = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.measurement.f7 r2 = com.google.android.gms.internal.measurement.f7.f5243n     // Catch:{ all -> 0x0019 }
            r1.f5275c = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.measurement.da r2 = r1.f5274b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g9.c(com.google.android.gms.internal.measurement.da):com.google.android.gms.internal.measurement.da");
    }

    public final da a(da daVar) {
        da daVar2 = this.f5274b;
        this.f5273a = null;
        this.f5275c = null;
        this.f5274b = daVar;
        return daVar2;
    }

    public final int b() {
        if (this.f5275c != null) {
            return this.f5275c.A();
        }
        if (this.f5274b != null) {
            return this.f5274b.d();
        }
        return 0;
    }

    public final f7 d() {
        if (this.f5275c != null) {
            return this.f5275c;
        }
        synchronized (this) {
            if (this.f5275c != null) {
                f7 f7Var = this.f5275c;
                return f7Var;
            }
            this.f5275c = this.f5274b == null ? f7.f5243n : this.f5274b.h();
            f7 f7Var2 = this.f5275c;
            return f7Var2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj;
        da daVar = this.f5274b;
        da daVar2 = g9Var.f5274b;
        return (daVar == null && daVar2 == null) ? d().equals(g9Var.d()) : (daVar == null || daVar2 == null) ? daVar != null ? daVar.equals(g9Var.c(daVar.f())) : c(daVar2.f()).equals(daVar2) : daVar.equals(daVar2);
    }

    public int hashCode() {
        return 1;
    }
}
