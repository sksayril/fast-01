package w1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p1.h;
import p1.i;
import p1.p;
import q1.e;
import q1.f;
import q1.g;
import q1.m;
import s1.c;
import x1.c;
import x1.d;
import x1.k;
import y1.b;
import z1.a;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12795a;

    /* renamed from: b  reason: collision with root package name */
    private final e f12796b;

    /* renamed from: c  reason: collision with root package name */
    private final d f12797c;

    /* renamed from: d  reason: collision with root package name */
    private final x f12798d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f12799e;

    /* renamed from: f  reason: collision with root package name */
    private final b f12800f;

    /* renamed from: g  reason: collision with root package name */
    private final a f12801g;

    /* renamed from: h  reason: collision with root package name */
    private final a f12802h;

    /* renamed from: i  reason: collision with root package name */
    private final c f12803i;

    public r(Context context, e eVar, d dVar, x xVar, Executor executor, b bVar, a aVar, a aVar2, c cVar) {
        this.f12795a = context;
        this.f12796b = eVar;
        this.f12797c = dVar;
        this.f12798d = xVar;
        this.f12799e = executor;
        this.f12800f = bVar;
        this.f12801g = aVar;
        this.f12802h = aVar2;
        this.f12803i = cVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean l(p pVar) {
        return Boolean.valueOf(this.f12797c.x(pVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Iterable m(p pVar) {
        return this.f12797c.v(pVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, p pVar, long j10) {
        this.f12797c.B(iterable);
        this.f12797c.c(pVar, this.f12801g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f12797c.f(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f12803i.e();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f12803i.b((long) ((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r(p pVar, long j10) {
        this.f12797c.c(pVar, this.f12801g.a() + j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object s(p pVar, int i10) {
        this.f12798d.a(pVar, i10 + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f12798d.a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void t(p1.p r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            y1.b r0 = r3.f12800f     // Catch:{ a -> 0x0026 }
            x1.d r1 = r3.f12797c     // Catch:{ a -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ a -> 0x0026 }
            w1.h r2 = new w1.h     // Catch:{ a -> 0x0026 }
            r2.<init>(r1)     // Catch:{ a -> 0x0026 }
            r0.g(r2)     // Catch:{ a -> 0x0026 }
            boolean r0 = r3.k()     // Catch:{ a -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            y1.b r0 = r3.f12800f     // Catch:{ a -> 0x0026 }
            w1.o r1 = new w1.o     // Catch:{ a -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ a -> 0x0026 }
            r0.g(r1)     // Catch:{ a -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.u(r4, r5)     // Catch:{ a -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            w1.x r0 = r3.f12798d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.a(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.r.t(p1.p, int, java.lang.Runnable):void");
    }

    public i j(m mVar) {
        b bVar = this.f12800f;
        x1.c cVar = this.f12803i;
        Objects.requireNonNull(cVar);
        return mVar.b(i.a().i(this.f12801g.a()).k(this.f12802h.a()).j("GDT_CLIENT_METRICS").h(new h(n1.b.b("proto"), ((s1.a) bVar.g(new q(cVar))).f())).d());
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f12795a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public g u(p pVar, int i10) {
        g a10;
        m a11 = this.f12796b.a(pVar.b());
        long j10 = 0;
        g e10 = g.e(0);
        while (true) {
            long j11 = j10;
            while (((Boolean) this.f12800f.g(new m(this, pVar))).booleanValue()) {
                Iterable<k> iterable = (Iterable) this.f12800f.g(new n(this, pVar));
                if (!iterable.iterator().hasNext()) {
                    return e10;
                }
                if (a11 == null) {
                    t1.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    a10 = g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (k b10 : iterable) {
                        arrayList.add(b10.b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(a11));
                    }
                    a10 = a11.a(f.a().b(arrayList).c(pVar.c()).a());
                }
                e10 = a10;
                if (e10.c() == g.a.TRANSIENT_ERROR) {
                    this.f12800f.g(new k(this, iterable, pVar, j11));
                    this.f12798d.b(pVar, i10 + 1, true);
                    return e10;
                }
                this.f12800f.g(new j(this, iterable));
                if (e10.c() == g.a.OK) {
                    j10 = Math.max(j11, e10.b());
                    if (pVar.e()) {
                        this.f12800f.g(new i(this));
                    }
                } else if (e10.c() == g.a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (k b11 : iterable) {
                        String j12 = b11.b().j();
                        hashMap.put(j12, !hashMap.containsKey(j12) ? 1 : Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                    }
                    this.f12800f.g(new l(this, hashMap));
                }
            }
            this.f12800f.g(new p(this, pVar, j11));
            return e10;
        }
    }

    public void v(p pVar, int i10, Runnable runnable) {
        this.f12799e.execute(new g(this, pVar, i10, runnable));
    }
}
