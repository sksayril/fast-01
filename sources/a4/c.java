package a4;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    private final e f6a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeUnit f8c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f9d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private CountDownLatch f10e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11f = false;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f6a = eVar;
        this.f7b = i10;
        this.f8c = timeUnit;
    }

    public void S(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f10e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        z3.g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f9d
            monitor-enter(r0)
            z3.g r1 = z3.g.f()     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r2.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006d }
            r1.i(r2)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x006d }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x006d }
            r5.f10e = r1     // Catch:{ all -> 0x006d }
            r1 = 0
            r5.f11f = r1     // Catch:{ all -> 0x006d }
            a4.e r1 = r5.f6a     // Catch:{ all -> 0x006d }
            r1.a(r6, r7)     // Catch:{ all -> 0x006d }
            z3.g r6 = z3.g.f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Awaiting app exception callback from Analytics..."
            r6.i(r7)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r6 = r5.f10e     // Catch:{ InterruptedException -> 0x005f }
            int r7 = r5.f7b     // Catch:{ InterruptedException -> 0x005f }
            long r3 = (long) r7     // Catch:{ InterruptedException -> 0x005f }
            java.util.concurrent.TimeUnit r7 = r5.f8c     // Catch:{ InterruptedException -> 0x005f }
            boolean r6 = r6.await(r3, r7)     // Catch:{ InterruptedException -> 0x005f }
            if (r6 == 0) goto L_0x0055
            r5.f11f = r2     // Catch:{ InterruptedException -> 0x005f }
            z3.g r6 = z3.g.f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "App exception callback received from Analytics listener."
            r6.i(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x0055:
            z3.g r6 = z3.g.f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r6.k(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x005f:
            z3.g r6 = z3.g.f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Interrupted while awaiting app exception callback from Analytics listener."
            r6.d(r7)     // Catch:{ all -> 0x006d }
        L_0x0068:
            r6 = 0
            r5.f10e = r6     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.c.a(java.lang.String, android.os.Bundle):void");
    }
}
