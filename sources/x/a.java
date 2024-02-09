package x;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.x;
import java.util.Arrays;

public class a {

    /* renamed from: w  reason: collision with root package name */
    private static final Interpolator f13022w = new C0223a();

    /* renamed from: a  reason: collision with root package name */
    private int f13023a;

    /* renamed from: b  reason: collision with root package name */
    private int f13024b;

    /* renamed from: c  reason: collision with root package name */
    private int f13025c = -1;

    /* renamed from: d  reason: collision with root package name */
    private float[] f13026d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f13027e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f13028f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f13029g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f13030h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f13031i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f13032j;

    /* renamed from: k  reason: collision with root package name */
    private int f13033k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f13034l;

    /* renamed from: m  reason: collision with root package name */
    private float f13035m;

    /* renamed from: n  reason: collision with root package name */
    private float f13036n;

    /* renamed from: o  reason: collision with root package name */
    private int f13037o;

    /* renamed from: p  reason: collision with root package name */
    private int f13038p;

    /* renamed from: q  reason: collision with root package name */
    private OverScroller f13039q;

    /* renamed from: r  reason: collision with root package name */
    private final c f13040r;

    /* renamed from: s  reason: collision with root package name */
    private View f13041s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f13042t;

    /* renamed from: u  reason: collision with root package name */
    private final ViewGroup f13043u;

    /* renamed from: v  reason: collision with root package name */
    private final Runnable f13044v = new b();

    /* renamed from: x.a$a  reason: collision with other inner class name */
    static class C0223a implements Interpolator {
        C0223a() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            a.this.E(0);
        }
    }

    public static abstract class c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    private a(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f13043u = viewGroup;
            this.f13040r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f13037o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f13024b = viewConfiguration.getScaledTouchSlop();
            this.f13035m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f13036n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f13039q = new OverScroller(context, f13022w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private void A() {
        this.f13034l.computeCurrentVelocity(1000, this.f13035m);
        n(e(this.f13034l.getXVelocity(this.f13025c), this.f13036n, this.f13035m), e(this.f13034l.getYVelocity(this.f13025c), this.f13036n, this.f13035m));
    }

    private void B(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        if (c(f11, f10, i10, 4)) {
            c10 |= true;
        }
        if (c(f10, f11, i10, 2)) {
            c10 |= true;
        }
        if (c(f11, f10, i10, 8)) {
            c10 |= true;
        }
        if (c10) {
            int[] iArr = this.f13031i;
            iArr[i10] = iArr[i10] | c10;
            this.f13040r.f(c10 ? 1 : 0, i10);
        }
    }

    private void C(float f10, float f11, int i10) {
        q(i10);
        float[] fArr = this.f13026d;
        this.f13028f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f13027e;
        this.f13029g[i10] = f11;
        fArr2[i10] = f11;
        this.f13030h[i10] = t((int) f10, (int) f11);
        this.f13033k |= 1 << i10;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (x(pointerId)) {
                float x9 = motionEvent.getX(i10);
                float y9 = motionEvent.getY(i10);
                this.f13028f[pointerId] = x9;
                this.f13029g[pointerId] = y9;
            }
        }
    }

    private boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f13030h[i10] & i11) != i11 || (this.f13038p & i11) == 0 || (this.f13032j[i10] & i11) == i11 || (this.f13031i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f13024b;
        if (abs <= ((float) i12) && abs2 <= ((float) i12)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f13040r.g(i11)) {
            return (this.f13031i[i10] & i11) == 0 && abs > ((float) this.f13024b);
        }
        int[] iArr = this.f13032j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    private boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z9 = this.f13040r.d(view) > 0;
        boolean z10 = this.f13040r.e(view) > 0;
        if (!z9 || !z10) {
            return z9 ? Math.abs(f10) > ((float) this.f13024b) : z10 && Math.abs(f11) > ((float) this.f13024b);
        }
        int i10 = this.f13024b;
        return (f10 * f10) + (f11 * f11) > ((float) (i10 * i10));
    }

    private float e(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    private int f(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    private void g() {
        float[] fArr = this.f13026d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f13027e, 0.0f);
            Arrays.fill(this.f13028f, 0.0f);
            Arrays.fill(this.f13029g, 0.0f);
            Arrays.fill(this.f13030h, 0);
            Arrays.fill(this.f13031i, 0);
            Arrays.fill(this.f13032j, 0);
            this.f13033k = 0;
        }
    }

    private void h(int i10) {
        if (this.f13026d != null && w(i10)) {
            this.f13026d[i10] = 0.0f;
            this.f13027e[i10] = 0.0f;
            this.f13028f[i10] = 0.0f;
            this.f13029g[i10] = 0.0f;
            this.f13030h[i10] = 0;
            this.f13031i[i10] = 0;
            this.f13032j[i10] = 0;
            this.f13033k = (~(1 << i10)) & this.f13033k;
        }
    }

    private int i(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f13043u.getWidth();
        float f10 = (float) (width / 2);
        float o10 = f10 + (o(Math.min(1.0f, ((float) Math.abs(i10)) / ((float) width))) * f10);
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs(o10 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i10)) / ((float) i12)) + 1.0f) * 256.0f), 600);
    }

    private int j(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int f14 = f(i12, (int) this.f13036n, (int) this.f13035m);
        int f15 = f(i13, (int) this.f13036n, (int) this.f13035m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(f14);
        int abs4 = Math.abs(f15);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (f14 != 0) {
            f11 = (float) abs3;
            f10 = (float) i14;
        } else {
            f11 = (float) abs;
            f10 = (float) i15;
        }
        float f16 = f11 / f10;
        if (f15 != 0) {
            f13 = (float) abs4;
            f12 = (float) i14;
        } else {
            f13 = (float) abs2;
            f12 = (float) i15;
        }
        float f17 = f13 / f12;
        return (int) ((((float) i(i10, f14, this.f13040r.d(view))) * f16) + (((float) i(i11, f15, this.f13040r.e(view))) * f17));
    }

    public static a l(ViewGroup viewGroup, float f10, c cVar) {
        a m10 = m(viewGroup, cVar);
        m10.f13024b = (int) (((float) m10.f13024b) * (1.0f / f10));
        return m10;
    }

    public static a m(ViewGroup viewGroup, c cVar) {
        return new a(viewGroup.getContext(), viewGroup, cVar);
    }

    private void n(float f10, float f11) {
        this.f13042t = true;
        this.f13040r.l(this.f13041s, f10, f11);
        this.f13042t = false;
        if (this.f13023a == 1) {
            E(0);
        }
    }

    private float o(float f10) {
        return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
    }

    private void p(int i10, int i11, int i12, int i13) {
        int left = this.f13041s.getLeft();
        int top = this.f13041s.getTop();
        if (i12 != 0) {
            i10 = this.f13040r.a(this.f13041s, i10, i12);
            x.V(this.f13041s, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f13040r.b(this.f13041s, i11, i13);
            x.W(this.f13041s, i11 - top);
        }
        int i15 = i11;
        if (i12 != 0 || i13 != 0) {
            this.f13040r.k(this.f13041s, i14, i15, i14 - left, i15 - top);
        }
    }

    private void q(int i10) {
        float[] fArr = this.f13026d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f13027e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f13028f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f13029g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f13030h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f13031i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f13032j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f13026d = fArr2;
            this.f13027e = fArr3;
            this.f13028f = fArr4;
            this.f13029g = fArr5;
            this.f13030h = iArr;
            this.f13031i = iArr2;
            this.f13032j = iArr3;
        }
    }

    private boolean s(int i10, int i11, int i12, int i13) {
        int left = this.f13041s.getLeft();
        int top = this.f13041s.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f13039q.abortAnimation();
            E(0);
            return false;
        }
        this.f13039q.startScroll(left, top, i14, i15, j(this.f13041s, i14, i15, i12, i13));
        E(2);
        return true;
    }

    private int t(int i10, int i11) {
        int i12 = i10 < this.f13043u.getLeft() + this.f13037o ? 1 : 0;
        if (i11 < this.f13043u.getTop() + this.f13037o) {
            i12 |= 4;
        }
        if (i10 > this.f13043u.getRight() - this.f13037o) {
            i12 |= 2;
        }
        return i11 > this.f13043u.getBottom() - this.f13037o ? i12 | 8 : i12;
    }

    private boolean x(int i10) {
        if (w(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* access modifiers changed from: package-private */
    public void E(int i10) {
        this.f13043u.removeCallbacks(this.f13044v);
        if (this.f13023a != i10) {
            this.f13023a = i10;
            this.f13040r.j(i10);
            if (this.f13023a == 0) {
                this.f13041s = null;
            }
        }
    }

    public boolean F(int i10, int i11) {
        if (this.f13042t) {
            return s(i10, i11, (int) this.f13034l.getXVelocity(this.f13025c), (int) this.f13034l.getYVelocity(this.f13025c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean G(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f13034l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f13034l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f13034l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.h(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.C(r7, r1, r2)
            int r3 = r0.f13023a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f13030h
            r1 = r1[r2]
            int r3 = r0.f13038p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            x.a$c r4 = r0.f13040r
            r1 = r1 & r3
            r4.h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.r(r3, r1)
            android.view.View r3 = r0.f13041s
            if (r1 != r3) goto L_0x0031
            r0.I(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f13026d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f13027e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.x(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f13026d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f13027e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.r(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            x.a$c r14 = r0.f13040r
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            x.a$c r5 = r0.f13040r
            int r5 = r5.b(r7, r15, r14)
            x.a$c r14 = r0.f13040r
            int r14 = r14.d(r7)
            x.a$c r15 = r0.f13040r
            int r15 = r15.e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.B(r9, r10, r4)
            int r5 = r0.f13023a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.I(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.D(r17)
            goto L_0x0031
        L_0x00ff:
            r16.a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.C(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.r(r2, r3)
            android.view.View r3 = r0.f13041s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f13023a
            if (r3 != r4) goto L_0x0125
            r0.I(r2, r1)
        L_0x0125:
            int[] r2 = r0.f13030h
            r2 = r2[r1]
            int r3 = r0.f13038p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            x.a$c r4 = r0.f13040r
            r2 = r2 & r3
            r4.h(r2, r1)
        L_0x0135:
            int r1 = r0.f13023a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x.a.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i10, int i11) {
        this.f13041s = view;
        this.f13025c = -1;
        boolean s9 = s(i10, i11, 0, 0);
        if (!s9 && this.f13023a == 0 && this.f13041s != null) {
            this.f13041s = null;
        }
        return s9;
    }

    /* access modifiers changed from: package-private */
    public boolean I(View view, int i10) {
        if (view == this.f13041s && this.f13025c == i10) {
            return true;
        }
        if (view == null || !this.f13040r.m(view, i10)) {
            return false;
        }
        this.f13025c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f13025c = -1;
        g();
        VelocityTracker velocityTracker = this.f13034l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f13034l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f13043u) {
            this.f13041s = view;
            this.f13025c = i10;
            this.f13040r.i(view, i10);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f13043u + ")");
    }

    public boolean k(boolean z9) {
        if (this.f13023a == 2) {
            boolean computeScrollOffset = this.f13039q.computeScrollOffset();
            int currX = this.f13039q.getCurrX();
            int currY = this.f13039q.getCurrY();
            int left = currX - this.f13041s.getLeft();
            int top = currY - this.f13041s.getTop();
            if (left != 0) {
                x.V(this.f13041s, left);
            }
            if (top != 0) {
                x.W(this.f13041s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f13040r.k(this.f13041s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f13039q.getFinalX() && currY == this.f13039q.getFinalY()) {
                this.f13039q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z9) {
                    this.f13043u.post(this.f13044v);
                } else {
                    E(0);
                }
            }
        }
        return this.f13023a == 2;
    }

    public View r(int i10, int i11) {
        for (int childCount = this.f13043u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f13043u.getChildAt(this.f13040r.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f13024b;
    }

    public boolean v(int i10, int i11) {
        return y(this.f13041s, i10, i11);
    }

    public boolean w(int i10) {
        return ((1 << i10) & this.f13033k) != 0;
    }

    public boolean y(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f13034l == null) {
            this.f13034l = VelocityTracker.obtain();
        }
        this.f13034l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f13023a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i11 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i11);
                            if (x(pointerId)) {
                                float x9 = motionEvent.getX(i11);
                                float y9 = motionEvent.getY(i11);
                                float f10 = x9 - this.f13026d[pointerId];
                                float f11 = y9 - this.f13027e[pointerId];
                                B(f10, f11, pointerId);
                                if (this.f13023a != 1) {
                                    View r9 = r((int) x9, (int) y9);
                                    if (d(r9, f10, f11) && I(r9, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i11++;
                        }
                    } else if (x(this.f13025c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f13025c);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f13028f;
                        int i12 = this.f13025c;
                        int i13 = (int) (x10 - fArr[i12]);
                        int i14 = (int) (y10 - this.f13029g[i12]);
                        p(this.f13041s.getLeft() + i13, this.f13041s.getTop() + i14, i13, i14);
                    } else {
                        return;
                    }
                    D(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x11 = motionEvent.getX(actionIndex);
                        float y11 = motionEvent.getY(actionIndex);
                        C(x11, y11, pointerId2);
                        if (this.f13023a == 0) {
                            I(r((int) x11, (int) y11), pointerId2);
                            int i15 = this.f13030h[pointerId2];
                            int i16 = this.f13038p;
                            if ((i15 & i16) != 0) {
                                this.f13040r.h(i15 & i16, pointerId2);
                                return;
                            }
                            return;
                        } else if (v((int) x11, (int) y11)) {
                            I(this.f13041s, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f13023a == 1 && pointerId3 == this.f13025c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i11 >= pointerCount2) {
                                    i10 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i11);
                                if (pointerId4 != this.f13025c) {
                                    View r10 = r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                    View view = this.f13041s;
                                    if (r10 == view && I(view, pointerId4)) {
                                        i10 = this.f13025c;
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (i10 == -1) {
                                A();
                            }
                        }
                        h(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f13023a == 1) {
                    n(0.0f, 0.0f);
                }
            } else if (this.f13023a == 1) {
                A();
            }
            a();
            return;
        }
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View r11 = r((int) x12, (int) y12);
        C(x12, y12, pointerId5);
        I(r11, pointerId5);
        int i17 = this.f13030h[pointerId5];
        int i18 = this.f13038p;
        if ((i17 & i18) != 0) {
            this.f13040r.h(i17 & i18, pointerId5);
        }
    }
}
