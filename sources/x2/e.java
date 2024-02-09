package x2;

import android.content.Context;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f13152a = "e";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f13153b = false;

    /* renamed from: c  reason: collision with root package name */
    private static a f13154c = a.LEGACY;

    public enum a {
        LEGACY,
        LATEST
    }

    private e() {
    }

    public static synchronized int a(Context context) {
        int b10;
        synchronized (e.class) {
            b10 = b(context, (a) null, (g) null);
        }
        return b10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[Catch:{ RemoteException -> 0x007d, RemoteException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[Catch:{ RemoteException -> 0x007d, RemoteException -> 0x005b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int b(android.content.Context r5, x2.e.a r6, x2.g r7) {
        /*
            java.lang.Class<x2.e> r0 = x2.e.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            h2.p.k(r5, r1)     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = f13152a     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = "preferredRenderer: "
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x0089 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0089 }
            boolean r1 = f13153b     // Catch:{ all -> 0x0089 }
            r2 = 0
            if (r1 == 0) goto L_0x0025
            if (r7 == 0) goto L_0x0023
            x2.e$a r5 = f13154c     // Catch:{ all -> 0x0089 }
            r7.a(r5)     // Catch:{ all -> 0x0089 }
        L_0x0023:
            monitor-exit(r0)
            return r2
        L_0x0025:
            y2.g0 r1 = y2.e0.a(r5, r6)     // Catch:{ g -> 0x0084 }
            y2.a r3 = r1.d()     // Catch:{ RemoteException -> 0x007d }
            x2.b.k(r3)     // Catch:{ RemoteException -> 0x007d }
            u2.s r3 = r1.k()     // Catch:{ RemoteException -> 0x007d }
            z2.b.e(r3)     // Catch:{ RemoteException -> 0x007d }
            r3 = 1
            f13153b = r3     // Catch:{ all -> 0x0089 }
            r4 = 2
            if (r6 == 0) goto L_0x0048
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0089 }
            if (r6 == 0) goto L_0x0049
            if (r6 == r3) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r3 = 2
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            int r6 = r1.c()     // Catch:{ RemoteException -> 0x005b }
            if (r6 != r4) goto L_0x0053
            x2.e$a r6 = x2.e.a.LATEST     // Catch:{ RemoteException -> 0x005b }
            f13154c = r6     // Catch:{ RemoteException -> 0x005b }
        L_0x0053:
            o2.b r5 = o2.d.e3(r5)     // Catch:{ RemoteException -> 0x005b }
            r1.u0(r5, r3)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x0063
        L_0x005b:
            r5 = move-exception
            java.lang.String r6 = f13152a     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch:{ all -> 0x0089 }
        L_0x0063:
            java.lang.String r5 = f13152a     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "loadedRenderer: "
            x2.e$a r1 = f13154c     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = r6.concat(r1)     // Catch:{ all -> 0x0089 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0089 }
            if (r7 == 0) goto L_0x007b
            x2.e$a r5 = f13154c     // Catch:{ all -> 0x0089 }
            r7.a(r5)     // Catch:{ all -> 0x0089 }
        L_0x007b:
            monitor-exit(r0)
            return r2
        L_0x007d:
            r5 = move-exception
            z2.t r6 = new z2.t     // Catch:{ all -> 0x0089 }
            r6.<init>(r5)     // Catch:{ all -> 0x0089 }
            throw r6     // Catch:{ all -> 0x0089 }
        L_0x0084:
            r5 = move-exception
            int r5 = r5.f8352m     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)
            return r5
        L_0x0089:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.e.b(android.content.Context, x2.e$a, x2.g):int");
    }
}
