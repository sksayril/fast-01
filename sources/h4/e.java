package h4;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.SystemClock;
import com.google.firebase.crashlytics.internal.common.g0;
import com.google.firebase.crashlytics.internal.common.q0;
import com.google.firebase.crashlytics.internal.common.u;
import d3.k;
import d4.f0;
import i4.d;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n1.c;
import n1.f;
import p1.l;
import z3.g;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final double f9284a;

    /* renamed from: b  reason: collision with root package name */
    private final double f9285b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9286c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9287d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9288e;

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue<Runnable> f9289f;

    /* renamed from: g  reason: collision with root package name */
    private final ThreadPoolExecutor f9290g;

    /* renamed from: h  reason: collision with root package name */
    private final f<f0> f9291h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final g0 f9292i;

    /* renamed from: j  reason: collision with root package name */
    private int f9293j;

    /* renamed from: k  reason: collision with root package name */
    private long f9294k;

    private final class b implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private final u f9295m;

        /* renamed from: n  reason: collision with root package name */
        private final k<u> f9296n;

        private b(u uVar, k<u> kVar) {
            this.f9295m = uVar;
            this.f9296n = kVar;
        }

        public void run() {
            e.this.p(this.f9295m, this.f9296n);
            e.this.f9292i.e();
            double e10 = e.this.g();
            g f10 = g.f();
            f10.b("Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(e10 / 1000.0d)}) + " s for report: " + this.f9295m.d());
            e.q(e10);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    e(double d10, double d11, long j10, f<f0> fVar, g0 g0Var) {
        this.f9284a = d10;
        this.f9285b = d11;
        this.f9286c = j10;
        this.f9291h = fVar;
        this.f9292i = g0Var;
        this.f9287d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f9288e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f9289f = arrayBlockingQueue;
        this.f9290g = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f9293j = 0;
        this.f9294k = 0;
    }

    e(f<f0> fVar, d dVar, g0 g0Var) {
        this(dVar.f9464f, dVar.f9465g, ((long) dVar.f9466h) * 1000, fVar, g0Var);
    }

    /* access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f9284a) * Math.pow(this.f9285b, (double) h()));
    }

    private int h() {
        if (this.f9294k == 0) {
            this.f9294k = o();
        }
        int o10 = (int) ((o() - this.f9294k) / this.f9286c);
        int min = l() ? Math.min(100, this.f9293j + o10) : Math.max(0, this.f9293j - o10);
        if (this.f9293j != min) {
            this.f9293j = min;
            this.f9294k = o();
        }
        return min;
    }

    private boolean k() {
        return this.f9289f.size() < this.f9288e;
    }

    private boolean l() {
        return this.f9289f.size() == this.f9288e;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f9291h, n1.d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n(k kVar, boolean z9, u uVar, Exception exc) {
        if (exc != null) {
            kVar.d(exc);
            return;
        }
        if (z9) {
            j();
        }
        kVar.e(uVar);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    public void p(u uVar, k<u> kVar) {
        g f10 = g.f();
        f10.b("Sending report through Google DataTransport: " + uVar.d());
        this.f9291h.a(c.e(uVar.b()), new d(this, kVar, SystemClock.elapsedRealtime() - this.f9287d < 2000, uVar));
    }

    /* access modifiers changed from: private */
    public static void q(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public k<u> i(u uVar, boolean z9) {
        synchronized (this.f9289f) {
            k<u> kVar = new k<>();
            if (z9) {
                this.f9292i.d();
                if (k()) {
                    g f10 = g.f();
                    f10.b("Enqueueing report: " + uVar.d());
                    g f11 = g.f();
                    f11.b("Queue size: " + this.f9289f.size());
                    this.f9290g.execute(new b(uVar, kVar));
                    g f12 = g.f();
                    f12.b("Closing task for report: " + uVar.d());
                    kVar.e(uVar);
                    return kVar;
                }
                h();
                g f13 = g.f();
                f13.b("Dropping report due to queue being full: " + uVar.d());
                this.f9292i.c();
                kVar.e(uVar);
                return kVar;
            }
            p(uVar, kVar);
            return kVar;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new c(this, countDownLatch)).start();
        q0.g(countDownLatch, 2, TimeUnit.SECONDS);
    }
}
