package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.x;

public abstract class a implements View.OnTouchListener {
    private static final int D = ViewConfiguration.getTapTimeout();
    boolean A;
    private boolean B;
    private boolean C;

    /* renamed from: m  reason: collision with root package name */
    final C0037a f1845m = new C0037a();

    /* renamed from: n  reason: collision with root package name */
    private final Interpolator f1846n = new AccelerateInterpolator();

    /* renamed from: o  reason: collision with root package name */
    final View f1847o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f1848p;

    /* renamed from: q  reason: collision with root package name */
    private float[] f1849q = {0.0f, 0.0f};

    /* renamed from: r  reason: collision with root package name */
    private float[] f1850r = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: s  reason: collision with root package name */
    private int f1851s;

    /* renamed from: t  reason: collision with root package name */
    private int f1852t;

    /* renamed from: u  reason: collision with root package name */
    private float[] f1853u = {0.0f, 0.0f};

    /* renamed from: v  reason: collision with root package name */
    private float[] f1854v = {0.0f, 0.0f};

    /* renamed from: w  reason: collision with root package name */
    private float[] f1855w = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: x  reason: collision with root package name */
    private boolean f1856x;

    /* renamed from: y  reason: collision with root package name */
    boolean f1857y;

    /* renamed from: z  reason: collision with root package name */
    boolean f1858z;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    private static class C0037a {

        /* renamed from: a  reason: collision with root package name */
        private int f1859a;

        /* renamed from: b  reason: collision with root package name */
        private int f1860b;

        /* renamed from: c  reason: collision with root package name */
        private float f1861c;

        /* renamed from: d  reason: collision with root package name */
        private float f1862d;

        /* renamed from: e  reason: collision with root package name */
        private long f1863e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f1864f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f1865g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f1866h = 0;

        /* renamed from: i  reason: collision with root package name */
        private long f1867i = -1;

        /* renamed from: j  reason: collision with root package name */
        private float f1868j;

        /* renamed from: k  reason: collision with root package name */
        private int f1869k;

        C0037a() {
        }

        private float e(long j10) {
            long j11 = this.f1863e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f1867i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / ((float) this.f1859a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f1868j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / ((float) this.f1869k), 0.0f, 1.0f));
        }

        private float g(float f10) {
            return (-4.0f * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f1864f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                this.f1864f = currentAnimationTimeMillis;
                float f10 = ((float) (currentAnimationTimeMillis - this.f1864f)) * g10;
                this.f1865g = (int) (this.f1861c * f10);
                this.f1866h = (int) (f10 * this.f1862d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f1865g;
        }

        public int c() {
            return this.f1866h;
        }

        public int d() {
            float f10 = this.f1861c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f1862d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f1867i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1867i + ((long) this.f1869k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1869k = a.f((int) (currentAnimationTimeMillis - this.f1863e), 0, this.f1860b);
            this.f1868j = e(currentAnimationTimeMillis);
            this.f1867i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f1860b = i10;
        }

        public void k(int i10) {
            this.f1859a = i10;
        }

        public void l(float f10, float f11) {
            this.f1861c = f10;
            this.f1862d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1863e = currentAnimationTimeMillis;
            this.f1867i = -1;
            this.f1864f = currentAnimationTimeMillis;
            this.f1868j = 0.5f;
            this.f1865g = 0;
            this.f1866h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.A) {
                if (aVar.f1857y) {
                    aVar.f1857y = false;
                    aVar.f1845m.m();
                }
                C0037a aVar2 = a.this.f1845m;
                if (aVar2.h() || !a.this.u()) {
                    a.this.A = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.f1858z) {
                    aVar3.f1858z = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                x.b0(a.this.f1847o, this);
            }
        }
    }

    public a(View view) {
        this.f1847o = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (float) ((int) ((1575.0f * f10) + 0.5f));
        o(f11, f11);
        float f12 = (float) ((int) ((f10 * 315.0f) + 0.5f));
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(D);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f1849q[i10], f11, this.f1850r[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.f1853u[i10];
        float f14 = this.f1854v[i10];
        float f15 = this.f1855w[i10];
        float f16 = f13 * f12;
        return i11 > 0 ? e(h10 * f16, f14, f15) : -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f1851s;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                return f10 >= 0.0f ? 1.0f - (f10 / f11) : (!this.A || i10 != 1) ? 0.0f : 1.0f;
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
    }

    private float h(float f10, float f11, float f12, float f13) {
        float f14;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            f14 = -this.f1846n.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            f14 = this.f1846n.getInterpolation(g10);
        }
        return e(f14, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f1857y) {
            this.A = false;
        } else {
            this.f1845m.i();
        }
    }

    private void v() {
        int i10;
        if (this.f1848p == null) {
            this.f1848p = new b();
        }
        this.A = true;
        this.f1857y = true;
        if (this.f1856x || (i10 = this.f1852t) <= 0) {
            this.f1848p.run();
        } else {
            x.c0(this.f1847o, this.f1848p, (long) i10);
        }
        this.f1856x = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1847o.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f1852t = i10;
        return this;
    }

    public a l(int i10) {
        this.f1851s = i10;
        return this;
    }

    public a m(boolean z9) {
        if (this.B && !z9) {
            i();
        }
        this.B = z9;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f1850r;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f1855w;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.B
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.f1858z = r2
            r5.f1856x = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1847o
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1847o
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f1845m
            r7.l(r0, r6)
            boolean r6 = r5.A
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.C
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.A
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f1854v;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f1845m.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f1845m.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f1849q;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f1853u;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0037a aVar = this.f1845m;
        int f10 = aVar.f();
        int d10 = aVar.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }
}
