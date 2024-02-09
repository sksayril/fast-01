package androidx.datastore.preferences.protobuf;

public class e0 {

    /* renamed from: e  reason: collision with root package name */
    private static final p f1911e = p.b();

    /* renamed from: a  reason: collision with root package name */
    private h f1912a;

    /* renamed from: b  reason: collision with root package name */
    private p f1913b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile r0 f1914c;

    /* renamed from: d  reason: collision with root package name */
    private volatile h f1915d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f1914c = r4;
        r3.f1915d = androidx.datastore.preferences.protobuf.h.f1926n;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.datastore.preferences.protobuf.r0 r4) {
        /*
            r3 = this;
            androidx.datastore.preferences.protobuf.r0 r0 = r3.f1914c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            androidx.datastore.preferences.protobuf.r0 r0 = r3.f1914c     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x000c:
            androidx.datastore.preferences.protobuf.h r0 = r3.f1912a     // Catch:{ b0 -> 0x002a }
            if (r0 == 0) goto L_0x0025
            androidx.datastore.preferences.protobuf.z0 r0 = r4.k()     // Catch:{ b0 -> 0x002a }
            androidx.datastore.preferences.protobuf.h r1 = r3.f1912a     // Catch:{ b0 -> 0x002a }
            androidx.datastore.preferences.protobuf.p r2 = r3.f1913b     // Catch:{ b0 -> 0x002a }
            java.lang.Object r0 = r0.a(r1, r2)     // Catch:{ b0 -> 0x002a }
            androidx.datastore.preferences.protobuf.r0 r0 = (androidx.datastore.preferences.protobuf.r0) r0     // Catch:{ b0 -> 0x002a }
            r3.f1914c = r0     // Catch:{ b0 -> 0x002a }
            androidx.datastore.preferences.protobuf.h r0 = r3.f1912a     // Catch:{ b0 -> 0x002a }
        L_0x0022:
            r3.f1915d = r0     // Catch:{ b0 -> 0x002a }
            goto L_0x0030
        L_0x0025:
            r3.f1914c = r4     // Catch:{ b0 -> 0x002a }
            androidx.datastore.preferences.protobuf.h r0 = androidx.datastore.preferences.protobuf.h.f1926n     // Catch:{ b0 -> 0x002a }
            goto L_0x0022
        L_0x002a:
            r3.f1914c = r4     // Catch:{ all -> 0x0032 }
            androidx.datastore.preferences.protobuf.h r4 = androidx.datastore.preferences.protobuf.h.f1926n     // Catch:{ all -> 0x0032 }
            r3.f1915d = r4     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e0.a(androidx.datastore.preferences.protobuf.r0):void");
    }

    public int b() {
        if (this.f1915d != null) {
            return this.f1915d.size();
        }
        h hVar = this.f1912a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f1914c != null) {
            return this.f1914c.b();
        }
        return 0;
    }

    public r0 c(r0 r0Var) {
        a(r0Var);
        return this.f1914c;
    }

    public r0 d(r0 r0Var) {
        r0 r0Var2 = this.f1914c;
        this.f1912a = null;
        this.f1915d = null;
        this.f1914c = r0Var;
        return r0Var2;
    }

    public h e() {
        if (this.f1915d != null) {
            return this.f1915d;
        }
        h hVar = this.f1912a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            if (this.f1915d != null) {
                h hVar2 = this.f1915d;
                return hVar2;
            }
            this.f1915d = this.f1914c == null ? h.f1926n : this.f1914c.i();
            h hVar3 = this.f1915d;
            return hVar3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        r0 r0Var = this.f1914c;
        r0 r0Var2 = e0Var.f1914c;
        return (r0Var == null && r0Var2 == null) ? e().equals(e0Var.e()) : (r0Var == null || r0Var2 == null) ? r0Var != null ? r0Var.equals(e0Var.c(r0Var.d())) : c(r0Var2.d()).equals(r0Var2) : r0Var.equals(r0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
