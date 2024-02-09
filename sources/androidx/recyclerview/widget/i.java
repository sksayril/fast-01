package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.accessibility.d;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.n;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class i extends ViewGroup implements androidx.core.view.m {
    private static final int[] J0 = {16843830};
    private static final int[] K0 = {16842987};
    static final boolean L0 = false;
    static final boolean M0;
    static final boolean N0 = true;
    static final boolean O0 = true;
    private static final boolean P0 = false;
    private static final boolean Q0 = false;
    private static final Class<?>[] R0;
    static final Interpolator S0 = new c();
    private final ArrayList<r> A;
    private final int[] A0;
    private r B;
    private androidx.core.view.o B0;
    boolean C;
    private final int[] C0;
    boolean D;
    final int[] D0;
    boolean E;
    private final int[] E0;
    boolean F;
    final int[] F0;
    private int G;
    final List<b0> G0;
    boolean H;
    private Runnable H0;
    boolean I;
    private final n.b I0;
    private boolean J;
    private int K;
    boolean L;
    private final AccessibilityManager M;
    private List<p> N;
    boolean O;
    boolean P;
    private int Q;
    private int R;
    private j S;
    private EdgeEffect T;
    private EdgeEffect U;
    private EdgeEffect V;
    private EdgeEffect W;

    /* renamed from: a0  reason: collision with root package name */
    k f3070a0;

    /* renamed from: b0  reason: collision with root package name */
    private int f3071b0;

    /* renamed from: c0  reason: collision with root package name */
    private int f3072c0;

    /* renamed from: d0  reason: collision with root package name */
    private VelocityTracker f3073d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f3074e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f3075f0;

    /* renamed from: g0  reason: collision with root package name */
    private int f3076g0;

    /* renamed from: h0  reason: collision with root package name */
    private int f3077h0;

    /* renamed from: i0  reason: collision with root package name */
    private int f3078i0;

    /* renamed from: j0  reason: collision with root package name */
    private final int f3079j0;

    /* renamed from: k0  reason: collision with root package name */
    private final int f3080k0;

    /* renamed from: l0  reason: collision with root package name */
    private float f3081l0;

    /* renamed from: m  reason: collision with root package name */
    private final w f3082m;

    /* renamed from: m0  reason: collision with root package name */
    private float f3083m0;

    /* renamed from: n  reason: collision with root package name */
    final u f3084n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f3085n0;

    /* renamed from: o  reason: collision with root package name */
    private x f3086o;

    /* renamed from: o0  reason: collision with root package name */
    final a0 f3087o0;

    /* renamed from: p  reason: collision with root package name */
    a f3088p;

    /* renamed from: p0  reason: collision with root package name */
    e f3089p0;

    /* renamed from: q  reason: collision with root package name */
    b f3090q;

    /* renamed from: q0  reason: collision with root package name */
    e.b f3091q0;

    /* renamed from: r  reason: collision with root package name */
    final n f3092r;

    /* renamed from: r0  reason: collision with root package name */
    final y f3093r0;

    /* renamed from: s  reason: collision with root package name */
    boolean f3094s;

    /* renamed from: s0  reason: collision with root package name */
    private s f3095s0;

    /* renamed from: t  reason: collision with root package name */
    final Runnable f3096t;

    /* renamed from: t0  reason: collision with root package name */
    private List<s> f3097t0;

    /* renamed from: u  reason: collision with root package name */
    final Rect f3098u;

    /* renamed from: u0  reason: collision with root package name */
    boolean f3099u0;

    /* renamed from: v  reason: collision with root package name */
    private final Rect f3100v;

    /* renamed from: v0  reason: collision with root package name */
    boolean f3101v0;

    /* renamed from: w  reason: collision with root package name */
    final RectF f3102w;

    /* renamed from: w0  reason: collision with root package name */
    private k.b f3103w0;

    /* renamed from: x  reason: collision with root package name */
    n f3104x;

    /* renamed from: x0  reason: collision with root package name */
    boolean f3105x0;

    /* renamed from: y  reason: collision with root package name */
    v f3106y;

    /* renamed from: y0  reason: collision with root package name */
    j f3107y0;

    /* renamed from: z  reason: collision with root package name */
    final ArrayList<m> f3108z;

    /* renamed from: z0  reason: collision with root package name */
    private C0062i f3109z0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            i iVar = i.this;
            if (iVar.F && !iVar.isLayoutRequested()) {
                i iVar2 = i.this;
                if (!iVar2.C) {
                    iVar2.requestLayout();
                } else if (iVar2.I) {
                    iVar2.H = true;
                } else {
                    iVar2.n();
                }
            }
        }
    }

    class a0 implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private int f3111m;

        /* renamed from: n  reason: collision with root package name */
        private int f3112n;

        /* renamed from: o  reason: collision with root package name */
        OverScroller f3113o;

        /* renamed from: p  reason: collision with root package name */
        Interpolator f3114p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f3115q = false;

        /* renamed from: r  reason: collision with root package name */
        private boolean f3116r = false;

        a0() {
            Interpolator interpolator = i.S0;
            this.f3114p = interpolator;
            this.f3113o = new OverScroller(i.this.getContext(), interpolator);
        }

        private int a(int i10, int i11, int i12, int i13) {
            int i14;
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z9 = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i12 * i12) + (i13 * i13)));
            int sqrt2 = (int) Math.sqrt((double) ((i10 * i10) + (i11 * i11)));
            i iVar = i.this;
            int width = z9 ? iVar.getWidth() : iVar.getHeight();
            int i15 = width / 2;
            float f10 = (float) width;
            float f11 = (float) i15;
            float c10 = f11 + (c(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f10)) * f11);
            if (sqrt > 0) {
                i14 = Math.round(Math.abs(c10 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z9) {
                    abs = abs2;
                }
                i14 = (int) (((((float) abs) / f10) + 1.0f) * 300.0f);
            }
            return Math.min(i14, 2000);
        }

        private void b() {
            this.f3116r = false;
            this.f3115q = true;
        }

        private float c(float f10) {
            return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
        }

        private void d() {
            this.f3115q = false;
            if (this.f3116r) {
                f();
            }
        }

        public void e(int i10, int i11) {
            i.this.setScrollState(2);
            this.f3112n = 0;
            this.f3111m = 0;
            this.f3113o.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            f();
        }

        /* access modifiers changed from: package-private */
        public void f() {
            if (this.f3115q) {
                this.f3116r = true;
                return;
            }
            i.this.removeCallbacks(this);
            androidx.core.view.x.b0(i.this, this);
        }

        public void g(int i10, int i11, int i12, Interpolator interpolator) {
            if (this.f3114p != interpolator) {
                this.f3114p = interpolator;
                this.f3113o = new OverScroller(i.this.getContext(), interpolator);
            }
            i.this.setScrollState(2);
            this.f3112n = 0;
            this.f3111m = 0;
            this.f3113o.startScroll(0, 0, i10, i11, i12);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3113o.computeScrollOffset();
            }
            f();
        }

        public void h(int i10, int i11, Interpolator interpolator) {
            int a10 = a(i10, i11, 0, 0);
            if (interpolator == null) {
                interpolator = i.S0;
            }
            g(i10, i11, a10, interpolator);
        }

        public void i() {
            i.this.removeCallbacks(this);
            this.f3113o.abortAnimation();
        }

        public void run() {
            if (i.this.f3104x == null) {
                i();
                return;
            }
            b();
            i.this.n();
            OverScroller overScroller = this.f3113o;
            Objects.requireNonNull(i.this.f3104x);
            if (overScroller.computeScrollOffset()) {
                int[] iArr = i.this.D0;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i10 = currX - this.f3111m;
                int i11 = currY - this.f3112n;
                this.f3111m = currX;
                this.f3112n = currY;
                if (i.this.t(i10, i11, iArr, (int[]) null, 1)) {
                    i10 -= iArr[0];
                    i11 -= iArr[1];
                }
                Objects.requireNonNull(i.this);
                if (!i.this.f3108z.isEmpty()) {
                    i.this.invalidate();
                }
                if (i.this.getOverScrollMode() != 2) {
                    i.this.m(i10, i11);
                }
                boolean u9 = i.this.u(0, 0, 0, 0, (int[]) null, 1);
                if (!i.this.awakenScrollBars()) {
                    i.this.invalidate();
                }
                boolean z9 = (i10 == 0 && i11 == 0) || (i10 != 0 && i.this.f3104x.b() && i10 == 0) || (i11 != 0 && i.this.f3104x.c() && i11 == 0);
                if (overScroller.isFinished() || (!z9 && !i.this.M(1))) {
                    i.this.setScrollState(0);
                    if (i.O0) {
                        i.this.f3091q0.a();
                    }
                    i.this.a(1);
                } else {
                    f();
                    i iVar = i.this;
                    e eVar = iVar.f3089p0;
                    if (eVar != null) {
                        eVar.f(iVar, i10, i11);
                    }
                }
            }
            d();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            k kVar = i.this.f3070a0;
            if (kVar != null) {
                kVar.p();
            }
            i.this.f3105x0 = false;
        }
    }

    public static abstract class b0 {

        /* renamed from: s  reason: collision with root package name */
        private static final List<Object> f3119s = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f3120a;

        /* renamed from: b  reason: collision with root package name */
        WeakReference<i> f3121b;

        /* renamed from: c  reason: collision with root package name */
        int f3122c;

        /* renamed from: d  reason: collision with root package name */
        int f3123d;

        /* renamed from: e  reason: collision with root package name */
        long f3124e;

        /* renamed from: f  reason: collision with root package name */
        int f3125f;

        /* renamed from: g  reason: collision with root package name */
        int f3126g;

        /* renamed from: h  reason: collision with root package name */
        b0 f3127h;

        /* renamed from: i  reason: collision with root package name */
        b0 f3128i;

        /* renamed from: j  reason: collision with root package name */
        int f3129j;

        /* renamed from: k  reason: collision with root package name */
        List<Object> f3130k;

        /* renamed from: l  reason: collision with root package name */
        List<Object> f3131l;

        /* renamed from: m  reason: collision with root package name */
        private int f3132m;

        /* renamed from: n  reason: collision with root package name */
        u f3133n;

        /* renamed from: o  reason: collision with root package name */
        boolean f3134o;

        /* renamed from: p  reason: collision with root package name */
        private int f3135p;

        /* renamed from: q  reason: collision with root package name */
        int f3136q;

        /* renamed from: r  reason: collision with root package name */
        i f3137r;

        private void f() {
            if (this.f3130k == null) {
                ArrayList arrayList = new ArrayList();
                this.f3130k = arrayList;
                this.f3131l = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(int i10, int i11) {
            this.f3129j = (i10 & i11) | (this.f3129j & (~i11));
        }

        public final void B(boolean z9) {
            int i10;
            int i11 = this.f3132m;
            int i12 = z9 ? i11 - 1 : i11 + 1;
            this.f3132m = i12;
            if (i12 < 0) {
                this.f3132m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z9 && i12 == 1) {
                i10 = this.f3129j | 16;
            } else if (z9 && i12 == 0) {
                i10 = this.f3129j & -17;
            } else {
                return;
            }
            this.f3129j = i10;
        }

        /* access modifiers changed from: package-private */
        public void C(u uVar, boolean z9) {
            this.f3133n = uVar;
            this.f3134o = z9;
        }

        /* access modifiers changed from: package-private */
        public boolean D() {
            return (this.f3129j & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean E() {
            return (this.f3129j & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void F() {
            this.f3133n.B(this);
        }

        /* access modifiers changed from: package-private */
        public boolean G() {
            return (this.f3129j & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f3129j) == 0) {
                f();
                this.f3130k.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            this.f3129j = i10 | this.f3129j;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            List<Object> list = this.f3130k;
            if (list != null) {
                list.clear();
            }
            this.f3129j &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f3129j &= -33;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f3129j &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return (this.f3129j & 16) == 0 && androidx.core.view.x.M(this.f3120a);
        }

        /* access modifiers changed from: package-private */
        public void h(int i10, int i11, boolean z9) {
            b(8);
            x(i11, z9);
            this.f3122c = i10;
        }

        public final int i() {
            i iVar = this.f3137r;
            if (iVar == null) {
                return -1;
            }
            return iVar.H(this);
        }

        public final int j() {
            return this.f3125f;
        }

        public final int k() {
            int i10 = this.f3126g;
            return i10 == -1 ? this.f3122c : i10;
        }

        public final int l() {
            return this.f3123d;
        }

        /* access modifiers changed from: package-private */
        public List<Object> m() {
            if ((this.f3129j & 1024) != 0) {
                return f3119s;
            }
            List<Object> list = this.f3130k;
            return (list == null || list.size() == 0) ? f3119s : this.f3131l;
        }

        /* access modifiers changed from: package-private */
        public boolean n(int i10) {
            return (i10 & this.f3129j) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return (this.f3129j & 512) != 0 || q();
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return (this.f3129j & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean q() {
            return (this.f3129j & 4) != 0;
        }

        public final boolean r() {
            return (this.f3129j & 16) == 0 && !androidx.core.view.x.M(this.f3120a);
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            return (this.f3129j & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            return this.f3133n != null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f3122c + " id=" + this.f3124e + ", oldPos=" + this.f3123d + ", pLpos:" + this.f3126g);
            if (t()) {
                sb.append(" scrap ");
                sb.append(this.f3134o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (q()) {
                sb.append(" invalid");
            }
            if (!p()) {
                sb.append(" unbound");
            }
            if (w()) {
                sb.append(" update");
            }
            if (s()) {
                sb.append(" removed");
            }
            if (E()) {
                sb.append(" ignored");
            }
            if (u()) {
                sb.append(" tmpDetached");
            }
            if (!r()) {
                sb.append(" not recyclable(" + this.f3132m + ")");
            }
            if (o()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3120a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public boolean u() {
            return (this.f3129j & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean v() {
            return (this.f3129j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean w() {
            return (this.f3129j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void x(int i10, boolean z9) {
            if (this.f3123d == -1) {
                this.f3123d = this.f3122c;
            }
            if (this.f3126g == -1) {
                this.f3126g = this.f3122c;
            }
            if (z9) {
                this.f3126g += i10;
            }
            this.f3122c += i10;
            if (this.f3120a.getLayoutParams() != null) {
                ((o) this.f3120a.getLayoutParams()).f3176c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void y(i iVar) {
            iVar.x0(this, this.f3135p);
            this.f3135p = 0;
        }

        /* access modifiers changed from: package-private */
        public void z() {
            this.f3129j = 0;
            this.f3122c = -1;
            this.f3123d = -1;
            this.f3124e = -1;
            this.f3126g = -1;
            this.f3132m = 0;
            this.f3127h = null;
            this.f3128i = null;
            c();
            this.f3135p = 0;
            this.f3136q = -1;
            i.l(this);
        }
    }

    static class c implements Interpolator {
        c() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class d implements n.b {
        d() {
        }
    }

    class e implements b.C0059b {
        e() {
        }

        public View a(int i10) {
            return i.this.getChildAt(i10);
        }

        public b0 b(View view) {
            return i.J(view);
        }

        public void c(int i10) {
            b0 J;
            View a10 = a(i10);
            if (!(a10 == null || (J = i.J(a10)) == null)) {
                if (!J.u() || J.E()) {
                    J.b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + J + i.this.D());
                }
            }
            i.this.detachViewFromParent(i10);
        }

        public void d(View view) {
            b0 J = i.J(view);
            if (J != null) {
                J.y(i.this);
            }
        }

        public int e() {
            return i.this.getChildCount();
        }

        public void f(int i10) {
            View childAt = i.this.getChildAt(i10);
            if (childAt != null) {
                i.this.q(childAt);
                childAt.clearAnimation();
            }
            i.this.removeViewAt(i10);
        }

        public void g() {
            int e10 = e();
            for (int i10 = 0; i10 < e10; i10++) {
                View a10 = a(i10);
                i.this.q(a10);
                a10.clearAnimation();
            }
            i.this.removeAllViews();
        }

        public int h(View view) {
            return i.this.indexOfChild(view);
        }
    }

    class f implements a.C0058a {
        f() {
        }

        public void a(int i10, int i11) {
            i.this.a0(i10, i11);
            i.this.f3099u0 = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public b0 c(int i10) {
            b0 F = i.this.F(i10, true);
            if (F != null && !i.this.f3090q.i(F.f3120a)) {
                return F;
            }
            return null;
        }

        public void d(int i10, int i11) {
            i.this.b0(i10, i11, false);
            i.this.f3099u0 = true;
        }

        public void e(int i10, int i11) {
            i.this.Z(i10, i11);
            i.this.f3099u0 = true;
        }

        public void f(int i10, int i11) {
            i.this.b0(i10, i11, true);
            i iVar = i.this;
            iVar.f3099u0 = true;
            iVar.f3093r0.f3197d += i11;
        }

        public void g(a.b bVar) {
            i(bVar);
        }

        public void h(int i10, int i11, Object obj) {
            i.this.G0(i10, i11, obj);
            i.this.f3101v0 = true;
        }

        /* access modifiers changed from: package-private */
        public void i(a.b bVar) {
            int i10 = bVar.f2954a;
            if (i10 == 1) {
                i iVar = i.this;
                iVar.f3104x.g0(iVar, bVar.f2955b, bVar.f2957d);
            } else if (i10 == 2) {
                i iVar2 = i.this;
                iVar2.f3104x.j0(iVar2, bVar.f2955b, bVar.f2957d);
            } else if (i10 == 4) {
                i iVar3 = i.this;
                iVar3.f3104x.l0(iVar3, bVar.f2955b, bVar.f2957d, bVar.f2956c);
            } else if (i10 == 8) {
                i iVar4 = i.this;
                iVar4.f3104x.i0(iVar4, bVar.f2955b, bVar.f2957d, 1);
            }
        }
    }

    public static abstract class g<VH extends b0> {
    }

    public static abstract class h {
    }

    /* renamed from: androidx.recyclerview.widget.i$i  reason: collision with other inner class name */
    public interface C0062i {
        int a(int i10, int i11);
    }

    public static class j {
        /* access modifiers changed from: protected */
        public EdgeEffect a(i iVar, int i10) {
            return new EdgeEffect(iVar.getContext());
        }
    }

    public static abstract class k {

        /* renamed from: a  reason: collision with root package name */
        private b f3141a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<a> f3142b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private long f3143c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f3144d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f3145e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f3146f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(b0 b0Var);
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f3147a;

            /* renamed from: b  reason: collision with root package name */
            public int f3148b;

            /* renamed from: c  reason: collision with root package name */
            public int f3149c;

            /* renamed from: d  reason: collision with root package name */
            public int f3150d;

            public c a(b0 b0Var) {
                return b(b0Var, 0);
            }

            public c b(b0 b0Var, int i10) {
                View view = b0Var.f3120a;
                this.f3147a = view.getLeft();
                this.f3148b = view.getTop();
                this.f3149c = view.getRight();
                this.f3150d = view.getBottom();
                return this;
            }
        }

        static int a(b0 b0Var) {
            int i10 = b0Var.f3129j & 14;
            if (b0Var.q()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int l10 = b0Var.l();
            int i11 = b0Var.i();
            return (l10 == -1 || i11 == -1 || l10 == i11) ? i10 : i10 | 2048;
        }

        public abstract boolean b(b0 b0Var);

        public boolean c(b0 b0Var, List<Object> list) {
            return b(b0Var);
        }

        public final void d(b0 b0Var) {
            n(b0Var);
            b bVar = this.f3141a;
            if (bVar != null) {
                bVar.a(b0Var);
            }
        }

        public final void e() {
            int size = this.f3142b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3142b.get(i10).a();
            }
            this.f3142b.clear();
        }

        public abstract void f(b0 b0Var);

        public abstract void g();

        public long h() {
            return this.f3143c;
        }

        public long i() {
            return this.f3146f;
        }

        public long j() {
            return this.f3145e;
        }

        public long k() {
            return this.f3144d;
        }

        public abstract boolean l();

        public c m() {
            return new c();
        }

        public void n(b0 b0Var) {
        }

        public c o(y yVar, b0 b0Var, int i10, List<Object> list) {
            return m().a(b0Var);
        }

        public abstract void p();

        /* access modifiers changed from: package-private */
        public void q(b bVar) {
            this.f3141a = bVar;
        }
    }

    private class l implements k.b {
        l() {
        }

        public void a(b0 b0Var) {
            b0Var.B(true);
            if (b0Var.f3127h != null && b0Var.f3128i == null) {
                b0Var.f3127h = null;
            }
            b0Var.f3128i = null;
            if (!b0Var.D() && !i.this.p0(b0Var.f3120a) && b0Var.u()) {
                i.this.removeDetachedView(b0Var.f3120a, false);
            }
        }
    }

    public static abstract class m {
        @Deprecated
        public void d(Canvas canvas, i iVar) {
        }

        public void e(Canvas canvas, i iVar, y yVar) {
            d(canvas, iVar);
        }

        @Deprecated
        public void f(Canvas canvas, i iVar) {
        }

        public void g(Canvas canvas, i iVar, y yVar) {
            f(canvas, iVar);
        }
    }

    public static abstract class n {

        /* renamed from: a  reason: collision with root package name */
        b f3152a;

        /* renamed from: b  reason: collision with root package name */
        i f3153b;

        /* renamed from: c  reason: collision with root package name */
        private final m.b f3154c;

        /* renamed from: d  reason: collision with root package name */
        private final m.b f3155d;

        /* renamed from: e  reason: collision with root package name */
        m f3156e;

        /* renamed from: f  reason: collision with root package name */
        m f3157f;

        /* renamed from: g  reason: collision with root package name */
        boolean f3158g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f3159h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f3160i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f3161j = true;

        /* renamed from: k  reason: collision with root package name */
        private boolean f3162k = true;

        /* renamed from: l  reason: collision with root package name */
        int f3163l;

        /* renamed from: m  reason: collision with root package name */
        private int f3164m;

        /* renamed from: n  reason: collision with root package name */
        private int f3165n;

        /* renamed from: o  reason: collision with root package name */
        private int f3166o;

        /* renamed from: p  reason: collision with root package name */
        private int f3167p;

        class a implements m.b {
            a() {
            }

            public View a(int i10) {
                return n.this.s(i10);
            }

            public int b() {
                return n.this.O() - n.this.G();
            }

            public int c(View view) {
                return n.this.y(view) - ((o) view.getLayoutParams()).leftMargin;
            }

            public int d() {
                return n.this.F();
            }

            public int e(View view) {
                return n.this.z(view) + ((o) view.getLayoutParams()).rightMargin;
            }
        }

        class b implements m.b {
            b() {
            }

            public View a(int i10) {
                return n.this.s(i10);
            }

            public int b() {
                return n.this.B() - n.this.E();
            }

            public int c(View view) {
                return n.this.A(view) - ((o) view.getLayoutParams()).topMargin;
            }

            public int d() {
                return n.this.H();
            }

            public int e(View view) {
                return n.this.w(view) + ((o) view.getLayoutParams()).bottomMargin;
            }
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f3170a;

            /* renamed from: b  reason: collision with root package name */
            public int f3171b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f3172c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f3173d;
        }

        public n() {
            a aVar = new a();
            this.f3154c = aVar;
            b bVar = new b();
            this.f3155d = bVar;
            this.f3156e = new m(aVar);
            this.f3157f = new m(bVar);
        }

        public static c J(Context context, AttributeSet attributeSet, int i10, int i11) {
            c cVar = new c();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r0.b.f12060h, i10, i11);
            cVar.f3170a = obtainStyledAttributes.getInt(r0.b.f12061i, 1);
            cVar.f3171b = obtainStyledAttributes.getInt(r0.b.f12070r, 1);
            cVar.f3172c = obtainStyledAttributes.getBoolean(r0.b.f12069q, false);
            cVar.f3173d = obtainStyledAttributes.getBoolean(r0.b.f12071s, false);
            obtainStyledAttributes.recycle();
            return cVar;
        }

        private boolean R(i iVar, int i10, int i11) {
            View focusedChild = iVar.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int F = F();
            int H = H();
            int O = O() - G();
            int B = B() - E();
            Rect rect = this.f3153b.f3098u;
            x(focusedChild, rect);
            return rect.left - i10 < O && rect.right - i10 > F && rect.top - i11 < B && rect.bottom - i11 > H;
        }

        public static int e(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private int[] u(i iVar, View view, Rect rect, boolean z9) {
            int[] iArr = new int[2];
            int F = F();
            int H = H();
            int O = O() - G();
            int B = B() - E();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - F;
            int min = Math.min(0, i10);
            int i11 = top - H;
            int min2 = Math.min(0, i11);
            int i12 = width - O;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - B);
            if (C() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public int A(View view) {
            return view.getTop() - N(view);
        }

        public void A0(int i10) {
            if (s(i10) != null) {
                this.f3152a.k(i10);
            }
        }

        public int B() {
            return this.f3167p;
        }

        public boolean B0(i iVar, View view, Rect rect, boolean z9) {
            return C0(iVar, view, rect, z9, false);
        }

        public int C() {
            return androidx.core.view.x.z(this.f3153b);
        }

        public boolean C0(i iVar, View view, Rect rect, boolean z9, boolean z10) {
            int[] u9 = u(iVar, view, rect, z9);
            int i10 = u9[0];
            int i11 = u9[1];
            if ((z10 && !R(iVar, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z9) {
                iVar.scrollBy(i10, i11);
            } else {
                iVar.z0(i10, i11);
            }
            return true;
        }

        public int D(View view) {
            return ((o) view.getLayoutParams()).f3175b.left;
        }

        public void D0() {
            i iVar = this.f3153b;
            if (iVar != null) {
                iVar.requestLayout();
            }
        }

        public int E() {
            i iVar = this.f3153b;
            if (iVar != null) {
                return iVar.getPaddingBottom();
            }
            return 0;
        }

        public void E0() {
            this.f3158g = true;
        }

        public int F() {
            i iVar = this.f3153b;
            if (iVar != null) {
                return iVar.getPaddingLeft();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void F0(i iVar) {
            int i10;
            if (iVar == null) {
                this.f3153b = null;
                this.f3152a = null;
                i10 = 0;
                this.f3166o = 0;
            } else {
                this.f3153b = iVar;
                this.f3152a = iVar.f3090q;
                this.f3166o = iVar.getWidth();
                i10 = iVar.getHeight();
            }
            this.f3167p = i10;
            this.f3164m = 1073741824;
            this.f3165n = 1073741824;
        }

        public int G() {
            i iVar = this.f3153b;
            if (iVar != null) {
                return iVar.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void G0() {
        }

        public int H() {
            i iVar = this.f3153b;
            if (iVar != null) {
                return iVar.getPaddingTop();
            }
            return 0;
        }

        public boolean H0() {
            return false;
        }

        public int I(View view) {
            return ((o) view.getLayoutParams()).a();
        }

        public int K(View view) {
            return ((o) view.getLayoutParams()).f3175b.right;
        }

        public int L(u uVar, y yVar) {
            i iVar = this.f3153b;
            if (iVar == null) {
                return 1;
            }
            Objects.requireNonNull(iVar);
            return 1;
        }

        public int M(u uVar, y yVar) {
            return 0;
        }

        public int N(View view) {
            return ((o) view.getLayoutParams()).f3175b.top;
        }

        public int O() {
            return this.f3166o;
        }

        public boolean P() {
            return this.f3159h;
        }

        public boolean Q() {
            return this.f3160i;
        }

        public boolean S(u uVar, y yVar) {
            return false;
        }

        public boolean T() {
            return false;
        }

        public void U(g gVar, g gVar2) {
        }

        public boolean V(i iVar, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public void W(i iVar) {
        }

        @Deprecated
        public void X(i iVar) {
        }

        public void Y(i iVar, u uVar) {
            X(iVar);
        }

        public void Z(AccessibilityEvent accessibilityEvent) {
            i iVar = this.f3153b;
            a0(iVar.f3084n, iVar.f3093r0, accessibilityEvent);
        }

        public void a(String str) {
            i iVar = this.f3153b;
            if (iVar != null) {
                iVar.i(str);
            }
        }

        public void a0(u uVar, y yVar, AccessibilityEvent accessibilityEvent) {
            i iVar = this.f3153b;
            if (iVar != null && accessibilityEvent != null) {
                boolean z9 = true;
                if (!iVar.canScrollVertically(1) && !this.f3153b.canScrollVertically(-1) && !this.f3153b.canScrollHorizontally(-1) && !this.f3153b.canScrollHorizontally(1)) {
                    z9 = false;
                }
                accessibilityEvent.setScrollable(z9);
                Objects.requireNonNull(this.f3153b);
            }
        }

        public boolean b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void b0(androidx.core.view.accessibility.d dVar) {
            i iVar = this.f3153b;
            c0(iVar.f3084n, iVar.f3093r0, dVar);
        }

        public boolean c() {
            return false;
        }

        public void c0(u uVar, y yVar, androidx.core.view.accessibility.d dVar) {
            if (this.f3153b.canScrollVertically(-1) || this.f3153b.canScrollHorizontally(-1)) {
                dVar.a(8192);
                dVar.R(true);
            }
            if (this.f3153b.canScrollVertically(1) || this.f3153b.canScrollHorizontally(1)) {
                dVar.a(4096);
                dVar.R(true);
            }
            dVar.M(d.c.a(L(uVar, yVar), v(uVar, yVar), S(uVar, yVar), M(uVar, yVar)));
        }

        public boolean d(o oVar) {
            return oVar != null;
        }

        /* access modifiers changed from: package-private */
        public void d0(View view, androidx.core.view.accessibility.d dVar) {
            b0 J = i.J(view);
            if (J != null && !J.s() && !this.f3152a.i(J.f3120a)) {
                i iVar = this.f3153b;
                e0(iVar.f3084n, iVar.f3093r0, view, dVar);
            }
        }

        public void e0(u uVar, y yVar, View view, androidx.core.view.accessibility.d dVar) {
            dVar.N(d.C0033d.a(c() ? I(view) : 0, 1, b() ? I(view) : 0, 1, false, false));
        }

        public int f(y yVar) {
            return 0;
        }

        public View f0(View view, int i10) {
            return null;
        }

        public int g(y yVar) {
            return 0;
        }

        public void g0(i iVar, int i10, int i11) {
        }

        public int h(y yVar) {
            return 0;
        }

        public void h0(i iVar) {
        }

        public int i(y yVar) {
            return 0;
        }

        public void i0(i iVar, int i10, int i11, int i12) {
        }

        public int j(y yVar) {
            return 0;
        }

        public void j0(i iVar, int i10, int i11) {
        }

        public int k(y yVar) {
            return 0;
        }

        public void k0(i iVar, int i10, int i11) {
        }

        /* access modifiers changed from: package-private */
        public void l(i iVar) {
            this.f3159h = true;
            W(iVar);
        }

        public void l0(i iVar, int i10, int i11, Object obj) {
            k0(iVar, i10, i11);
        }

        /* access modifiers changed from: package-private */
        public void m(i iVar, u uVar) {
            this.f3159h = false;
            Y(iVar, uVar);
        }

        public void m0(u uVar, y yVar, int i10, int i11) {
            this.f3153b.p(i10, i11);
        }

        public abstract o n();

        @Deprecated
        public boolean n0(i iVar, View view, View view2) {
            return T() || iVar.V();
        }

        public o o(Context context, AttributeSet attributeSet) {
            return new o(context, attributeSet);
        }

        public boolean o0(i iVar, y yVar, View view, View view2) {
            return n0(iVar, view, view2);
        }

        public o p(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof o ? new o((o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o((ViewGroup.MarginLayoutParams) layoutParams) : new o(layoutParams);
        }

        public void p0(Parcelable parcelable) {
        }

        public int q() {
            return -1;
        }

        public Parcelable q0() {
            return null;
        }

        public int r(View view) {
            return ((o) view.getLayoutParams()).f3175b.bottom;
        }

        public void r0(int i10) {
        }

        public View s(int i10) {
            b bVar = this.f3152a;
            if (bVar != null) {
                return bVar.c(i10);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean s0(int i10, Bundle bundle) {
            i iVar = this.f3153b;
            return t0(iVar.f3084n, iVar.f3093r0, i10, bundle);
        }

        public int t() {
            b bVar = this.f3152a;
            if (bVar != null) {
                return bVar.d();
            }
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean t0(androidx.recyclerview.widget.i.u r2, androidx.recyclerview.widget.i.y r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.i r2 = r1.f3153b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006e
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.B()
                int r5 = r1.H()
                int r2 = r2 - r5
                int r5 = r1.E()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                androidx.recyclerview.widget.i r5 = r1.f3153b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.O()
                int r5 = r1.F()
                int r4 = r4 - r5
                int r5 = r1.G()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x006e
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.B()
                int r4 = r1.H()
                int r2 = r2 - r4
                int r4 = r1.E()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                androidx.recyclerview.widget.i r4 = r1.f3153b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.O()
                int r5 = r1.F()
                int r4 = r4 - r5
                int r5 = r1.G()
                int r4 = r4 - r5
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                if (r4 != 0) goto L_0x0073
                return r3
            L_0x0073:
                androidx.recyclerview.widget.i r3 = r1.f3153b
                r3.z0(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.n.t0(androidx.recyclerview.widget.i$u, androidx.recyclerview.widget.i$y, int, android.os.Bundle):boolean");
        }

        /* access modifiers changed from: package-private */
        public boolean u0(View view, int i10, Bundle bundle) {
            i iVar = this.f3153b;
            return v0(iVar.f3084n, iVar.f3093r0, view, i10, bundle);
        }

        public int v(u uVar, y yVar) {
            i iVar = this.f3153b;
            if (iVar == null) {
                return 1;
            }
            Objects.requireNonNull(iVar);
            return 1;
        }

        public boolean v0(u uVar, y yVar, View view, int i10, Bundle bundle) {
            return false;
        }

        public int w(View view) {
            return view.getBottom() + r(view);
        }

        public void w0(u uVar) {
            for (int t9 = t() - 1; t9 >= 0; t9--) {
                if (!i.J(s(t9)).E()) {
                    y0(t9, uVar);
                }
            }
        }

        public void x(View view, Rect rect) {
            i.K(view, rect);
        }

        /* access modifiers changed from: package-private */
        public void x0(u uVar) {
            int h10 = uVar.h();
            for (int i10 = h10 - 1; i10 >= 0; i10--) {
                View j10 = uVar.j(i10);
                b0 J = i.J(j10);
                if (!J.E()) {
                    J.B(false);
                    if (J.u()) {
                        this.f3153b.removeDetachedView(j10, false);
                    }
                    k kVar = this.f3153b.f3070a0;
                    if (kVar != null) {
                        kVar.f(J);
                    }
                    J.B(true);
                    uVar.q(j10);
                }
            }
            uVar.c();
            if (h10 > 0) {
                this.f3153b.invalidate();
            }
        }

        public int y(View view) {
            return view.getLeft() - D(view);
        }

        public void y0(int i10, u uVar) {
            View s9 = s(i10);
            A0(i10);
            uVar.t(s9);
        }

        public int z(View view) {
            return view.getRight() + K(view);
        }

        public boolean z0(Runnable runnable) {
            i iVar = this.f3153b;
            if (iVar != null) {
                return iVar.removeCallbacks(runnable);
            }
            return false;
        }
    }

    public static class o extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        b0 f3174a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f3175b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f3176c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f3177d = false;

        public o(int i10, int i11) {
            super(i10, i11);
        }

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public o(o oVar) {
            super(oVar);
        }

        public int a() {
            return this.f3174a.k();
        }
    }

    public interface p {
        void a(View view);
    }

    public static abstract class q {
    }

    public interface r {
        boolean a(i iVar, MotionEvent motionEvent);

        void b(i iVar, MotionEvent motionEvent);

        void c(boolean z9);
    }

    public static abstract class s {
        public void a(i iVar, int i10) {
        }
    }

    public static class t {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f3178a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private int f3179b = 0;

        static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<b0> f3180a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f3181b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f3182c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f3183d = 0;

            a() {
            }
        }

        private a c(int i10) {
            a aVar = this.f3178a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3178a.put(i10, aVar2);
            return aVar2;
        }

        public void a() {
            for (int i10 = 0; i10 < this.f3178a.size(); i10++) {
                this.f3178a.valueAt(i10).f3180a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f3179b--;
        }

        /* access modifiers changed from: package-private */
        public void d(g gVar, g gVar2, boolean z9) {
            if (!z9 && this.f3179b == 0) {
                a();
            }
        }

        public void e(b0 b0Var) {
            int j10 = b0Var.j();
            ArrayList<b0> arrayList = c(j10).f3180a;
            if (this.f3178a.get(j10).f3181b > arrayList.size()) {
                b0Var.z();
                arrayList.add(b0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i10, long j10, long j11) {
            long j12 = c(i10).f3183d;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class u {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<b0> f3184a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<b0> f3185b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<b0> f3186c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private final List<b0> f3187d;

        /* renamed from: e  reason: collision with root package name */
        private int f3188e;

        /* renamed from: f  reason: collision with root package name */
        int f3189f;

        /* renamed from: g  reason: collision with root package name */
        t f3190g;

        public u() {
            ArrayList<b0> arrayList = new ArrayList<>();
            this.f3184a = arrayList;
            this.f3187d = Collections.unmodifiableList(arrayList);
            this.f3188e = 2;
            this.f3189f = 2;
        }

        private boolean z(b0 b0Var, int i10, int i11, long j10) {
            b0Var.f3137r = i.this;
            int j11 = b0Var.j();
            long nanoTime = i.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f3190g.f(j11, nanoTime, j10)) {
                return false;
            }
            Objects.requireNonNull(i.this);
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.i.b0 A(int r12, boolean r13, long r14) {
            /*
                r11 = this;
                if (r12 < 0) goto L_0x0148
                androidx.recyclerview.widget.i r0 = androidx.recyclerview.widget.i.this
                androidx.recyclerview.widget.i$y r0 = r0.f3093r0
                int r0 = r0.a()
                if (r12 >= r0) goto L_0x0148
                androidx.recyclerview.widget.i r0 = androidx.recyclerview.widget.i.this
                androidx.recyclerview.widget.i$y r0 = r0.f3093r0
                boolean r0 = r0.b()
                r1 = 1
                r2 = 0
                r3 = 0
                if (r0 == 0) goto L_0x0021
                androidx.recyclerview.widget.i$b0 r0 = r11.f(r12)
                if (r0 == 0) goto L_0x0022
                r4 = 1
                goto L_0x0023
            L_0x0021:
                r0 = r2
            L_0x0022:
                r4 = 0
            L_0x0023:
                if (r0 != 0) goto L_0x0057
                androidx.recyclerview.widget.i$b0 r0 = r11.i(r12, r13)
                if (r0 == 0) goto L_0x0057
                boolean r5 = r11.D(r0)
                if (r5 != 0) goto L_0x0056
                if (r13 != 0) goto L_0x0054
                r13 = 4
                r0.b(r13)
                boolean r13 = r0.t()
                if (r13 == 0) goto L_0x0048
                androidx.recyclerview.widget.i r13 = androidx.recyclerview.widget.i.this
                android.view.View r5 = r0.f3120a
                r13.removeDetachedView(r5, r3)
                r0.F()
                goto L_0x0051
            L_0x0048:
                boolean r13 = r0.G()
                if (r13 == 0) goto L_0x0051
                r0.d()
            L_0x0051:
                r11.u(r0)
            L_0x0054:
                r0 = r2
                goto L_0x0057
            L_0x0056:
                r4 = 1
            L_0x0057:
                if (r0 != 0) goto L_0x00a6
                androidx.recyclerview.widget.i r13 = androidx.recyclerview.widget.i.this
                androidx.recyclerview.widget.a r13 = r13.f3088p
                int r13 = r13.m(r12)
                if (r13 < 0) goto L_0x0069
                androidx.recyclerview.widget.i r12 = androidx.recyclerview.widget.i.this
                java.util.Objects.requireNonNull(r12)
                throw r2
            L_0x0069:
                java.lang.IndexOutOfBoundsException r14 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r0 = "Inconsistency detected. Invalid item position "
                r15.append(r0)
                r15.append(r12)
                java.lang.String r12 = "(offset:"
                r15.append(r12)
                r15.append(r13)
                java.lang.String r12 = ")."
                r15.append(r12)
                java.lang.String r12 = "state:"
                r15.append(r12)
                androidx.recyclerview.widget.i r12 = androidx.recyclerview.widget.i.this
                androidx.recyclerview.widget.i$y r12 = r12.f3093r0
                int r12 = r12.a()
                r15.append(r12)
                androidx.recyclerview.widget.i r12 = androidx.recyclerview.widget.i.this
                java.lang.String r12 = r12.D()
                r15.append(r12)
                java.lang.String r12 = r15.toString()
                r14.<init>(r12)
                throw r14
            L_0x00a6:
                if (r4 == 0) goto L_0x00de
                androidx.recyclerview.widget.i r13 = androidx.recyclerview.widget.i.this
                androidx.recyclerview.widget.i$y r13 = r13.f3093r0
                boolean r13 = r13.b()
                if (r13 != 0) goto L_0x00de
                r13 = 8192(0x2000, float:1.14794E-41)
                boolean r2 = r0.n(r13)
                if (r2 == 0) goto L_0x00de
                r0.A(r3, r13)
                androidx.recyclerview.widget.i r13 = androidx.recyclerview.widget.i.this
                androidx.recyclerview.widget.i$y r13 = r13.f3093r0
                boolean r13 = r13.f3204k
                if (r13 == 0) goto L_0x00de
                int r13 = androidx.recyclerview.widget.i.k.a(r0)
                r13 = r13 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.i r2 = androidx.recyclerview.widget.i.this
                androidx.recyclerview.widget.i$k r5 = r2.f3070a0
                androidx.recyclerview.widget.i$y r2 = r2.f3093r0
                java.util.List r6 = r0.m()
                androidx.recyclerview.widget.i$k$c r13 = r5.o(r2, r0, r13, r6)
                androidx.recyclerview.widget.i r2 = androidx.recyclerview.widget.i.this
                r2.m0(r0, r13)
            L_0x00de:
                androidx.recyclerview.widget.i r13 = androidx.recyclerview.widget.i.this
                androidx.recyclerview.widget.i$y r13 = r13.f3093r0
                boolean r13 = r13.b()
                if (r13 == 0) goto L_0x00f1
                boolean r13 = r0.p()
                if (r13 == 0) goto L_0x00f1
                r0.f3126g = r12
                goto L_0x0104
            L_0x00f1:
                boolean r13 = r0.p()
                if (r13 == 0) goto L_0x0106
                boolean r13 = r0.w()
                if (r13 != 0) goto L_0x0106
                boolean r13 = r0.q()
                if (r13 == 0) goto L_0x0104
                goto L_0x0106
            L_0x0104:
                r12 = 0
                goto L_0x0116
            L_0x0106:
                androidx.recyclerview.widget.i r13 = androidx.recyclerview.widget.i.this
                androidx.recyclerview.widget.a r13 = r13.f3088p
                int r7 = r13.m(r12)
                r5 = r11
                r6 = r0
                r8 = r12
                r9 = r14
                boolean r12 = r5.z(r6, r7, r8, r9)
            L_0x0116:
                android.view.View r13 = r0.f3120a
                android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
                if (r13 != 0) goto L_0x012c
                androidx.recyclerview.widget.i r13 = androidx.recyclerview.widget.i.this
                android.view.ViewGroup$LayoutParams r13 = r13.generateDefaultLayoutParams()
            L_0x0124:
                androidx.recyclerview.widget.i$o r13 = (androidx.recyclerview.widget.i.o) r13
                android.view.View r14 = r0.f3120a
                r14.setLayoutParams(r13)
                goto L_0x013d
            L_0x012c:
                androidx.recyclerview.widget.i r14 = androidx.recyclerview.widget.i.this
                boolean r14 = r14.checkLayoutParams(r13)
                if (r14 != 0) goto L_0x013b
                androidx.recyclerview.widget.i r14 = androidx.recyclerview.widget.i.this
                android.view.ViewGroup$LayoutParams r13 = r14.generateLayoutParams((android.view.ViewGroup.LayoutParams) r13)
                goto L_0x0124
            L_0x013b:
                androidx.recyclerview.widget.i$o r13 = (androidx.recyclerview.widget.i.o) r13
            L_0x013d:
                r13.f3174a = r0
                if (r4 == 0) goto L_0x0144
                if (r12 == 0) goto L_0x0144
                goto L_0x0145
            L_0x0144:
                r1 = 0
            L_0x0145:
                r13.f3177d = r1
                return r0
            L_0x0148:
                java.lang.IndexOutOfBoundsException r13 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "Invalid item position "
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "("
                r14.append(r15)
                r14.append(r12)
                java.lang.String r12 = "). Item count:"
                r14.append(r12)
                androidx.recyclerview.widget.i r12 = androidx.recyclerview.widget.i.this
                androidx.recyclerview.widget.i$y r12 = r12.f3093r0
                int r12 = r12.a()
                r14.append(r12)
                androidx.recyclerview.widget.i r12 = androidx.recyclerview.widget.i.this
                java.lang.String r12 = r12.D()
                r14.append(r12)
                java.lang.String r12 = r14.toString()
                r13.<init>(r12)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.u.A(int, boolean, long):androidx.recyclerview.widget.i$b0");
        }

        /* access modifiers changed from: package-private */
        public void B(b0 b0Var) {
            (b0Var.f3134o ? this.f3185b : this.f3184a).remove(b0Var);
            b0Var.f3133n = null;
            b0Var.f3134o = false;
            b0Var.d();
        }

        /* access modifiers changed from: package-private */
        public void C() {
            n nVar = i.this.f3104x;
            this.f3189f = this.f3188e + (nVar != null ? nVar.f3163l : 0);
            for (int size = this.f3186c.size() - 1; size >= 0 && this.f3186c.size() > this.f3189f; size--) {
                s(size);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean D(b0 b0Var) {
            if (b0Var.s()) {
                return i.this.f3093r0.b();
            }
            if (b0Var.f3122c >= 0) {
                Objects.requireNonNull(i.this);
                throw null;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + b0Var + i.this.D());
        }

        /* access modifiers changed from: package-private */
        public void E(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f3186c.size() - 1; size >= 0; size--) {
                b0 b0Var = this.f3186c.get(size);
                if (b0Var != null && (i12 = b0Var.f3122c) >= i10 && i12 < i13) {
                    b0Var.b(2);
                    s(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(b0 b0Var, boolean z9) {
            i.l(b0Var);
            if (b0Var.n(16384)) {
                b0Var.A(0, 16384);
                androidx.core.view.x.g0(b0Var.f3120a, (androidx.core.view.a) null);
            }
            if (z9) {
                e(b0Var);
            }
            b0Var.f3137r = null;
            g().e(b0Var);
        }

        public void b() {
            this.f3184a.clear();
            r();
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f3184a.clear();
            ArrayList<b0> arrayList = this.f3185b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int d(int i10) {
            if (i10 >= 0 && i10 < i.this.f3093r0.a()) {
                return !i.this.f3093r0.b() ? i10 : i.this.f3088p.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State " + "item count is " + i.this.f3093r0.a() + i.this.D());
        }

        /* access modifiers changed from: package-private */
        public void e(b0 b0Var) {
            v vVar = i.this.f3106y;
            if (vVar != null) {
                vVar.a(b0Var);
            }
            Objects.requireNonNull(i.this);
            i iVar = i.this;
            if (iVar.f3093r0 != null) {
                iVar.f3092r.d(b0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public b0 f(int i10) {
            int size;
            ArrayList<b0> arrayList = this.f3185b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                return null;
            }
            int i11 = 0;
            while (i11 < size) {
                b0 b0Var = this.f3185b.get(i11);
                if (b0Var.G() || b0Var.k() != i10) {
                    i11++;
                } else {
                    b0Var.b(32);
                    return b0Var;
                }
            }
            Objects.requireNonNull(i.this);
            throw null;
        }

        /* access modifiers changed from: package-private */
        public t g() {
            if (this.f3190g == null) {
                this.f3190g = new t();
            }
            return this.f3190g;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f3184a.size();
        }

        /* access modifiers changed from: package-private */
        public b0 i(int i10, boolean z9) {
            View b10;
            int size = this.f3184a.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                b0 b0Var = this.f3184a.get(i12);
                if (b0Var.G() || b0Var.k() != i10 || b0Var.q() || (!i.this.f3093r0.f3201h && b0Var.s())) {
                    i12++;
                } else {
                    b0Var.b(32);
                    return b0Var;
                }
            }
            if (z9 || (b10 = i.this.f3090q.b(i10)) == null) {
                int size2 = this.f3186c.size();
                while (i11 < size2) {
                    b0 b0Var2 = this.f3186c.get(i11);
                    if (b0Var2.q() || b0Var2.k() != i10) {
                        i11++;
                    } else {
                        if (!z9) {
                            this.f3186c.remove(i11);
                        }
                        return b0Var2;
                    }
                }
                return null;
            }
            b0 J = i.J(b10);
            i.this.f3090q.m(b10);
            int h10 = i.this.f3090q.h(b10);
            if (h10 != -1) {
                i.this.f3090q.a(h10);
                v(b10);
                J.b(8224);
                return J;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + J + i.this.D());
        }

        /* access modifiers changed from: package-private */
        public View j(int i10) {
            return this.f3184a.get(i10).f3120a;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            int size = this.f3186c.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) this.f3186c.get(i10).f3120a.getLayoutParams();
                if (oVar != null) {
                    oVar.f3176c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void l() {
            int size = this.f3186c.size();
            for (int i10 = 0; i10 < size; i10++) {
                b0 b0Var = this.f3186c.get(i10);
                if (b0Var != null) {
                    b0Var.b(6);
                    b0Var.a((Object) null);
                }
            }
            Objects.requireNonNull(i.this);
            r();
        }

        /* access modifiers changed from: package-private */
        public void m(int i10, int i11) {
            int size = this.f3186c.size();
            for (int i12 = 0; i12 < size; i12++) {
                b0 b0Var = this.f3186c.get(i12);
                if (b0Var != null && b0Var.f3122c >= i10) {
                    b0Var.x(i11, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void n(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i14 = -1;
                i13 = i10;
                i12 = i11;
            } else {
                i14 = 1;
                i12 = i10;
                i13 = i11;
            }
            int size = this.f3186c.size();
            for (int i16 = 0; i16 < size; i16++) {
                b0 b0Var = this.f3186c.get(i16);
                if (b0Var != null && (i15 = b0Var.f3122c) >= i13 && i15 <= i12) {
                    if (i15 == i10) {
                        b0Var.x(i11 - i10, false);
                    } else {
                        b0Var.x(i14, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void o(int i10, int i11, boolean z9) {
            int i12 = i10 + i11;
            for (int size = this.f3186c.size() - 1; size >= 0; size--) {
                b0 b0Var = this.f3186c.get(size);
                if (b0Var != null) {
                    int i13 = b0Var.f3122c;
                    if (i13 >= i12) {
                        b0Var.x(-i11, z9);
                    } else if (i13 >= i10) {
                        b0Var.b(8);
                        s(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void p(g gVar, g gVar2, boolean z9) {
            b();
            g().d(gVar, gVar2, z9);
        }

        /* access modifiers changed from: package-private */
        public void q(View view) {
            b0 J = i.J(view);
            J.f3133n = null;
            J.f3134o = false;
            J.d();
            u(J);
        }

        /* access modifiers changed from: package-private */
        public void r() {
            for (int size = this.f3186c.size() - 1; size >= 0; size--) {
                s(size);
            }
            this.f3186c.clear();
            if (i.O0) {
                i.this.f3091q0.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void s(int i10) {
            a(this.f3186c.get(i10), true);
            this.f3186c.remove(i10);
        }

        public void t(View view) {
            b0 J = i.J(view);
            if (J.u()) {
                i.this.removeDetachedView(view, false);
            }
            if (J.t()) {
                J.F();
            } else if (J.G()) {
                J.d();
            }
            u(J);
        }

        /* access modifiers changed from: package-private */
        public void u(b0 b0Var) {
            boolean z9;
            boolean z10 = false;
            boolean z11 = true;
            if (b0Var.t() || b0Var.f3120a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(b0Var.t());
                sb.append(" isAttached:");
                if (b0Var.f3120a.getParent() != null) {
                    z10 = true;
                }
                sb.append(z10);
                sb.append(i.this.D());
                throw new IllegalArgumentException(sb.toString());
            } else if (b0Var.u()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + b0Var + i.this.D());
            } else if (!b0Var.E()) {
                boolean g10 = b0Var.g();
                Objects.requireNonNull(i.this);
                if (b0Var.r()) {
                    if (this.f3189f <= 0 || b0Var.n(526)) {
                        z9 = false;
                    } else {
                        int size = this.f3186c.size();
                        if (size >= this.f3189f && size > 0) {
                            s(0);
                            size--;
                        }
                        if (i.O0 && size > 0 && !i.this.f3091q0.c(b0Var.f3122c)) {
                            int i10 = size - 1;
                            while (i10 >= 0) {
                                if (!i.this.f3091q0.c(this.f3186c.get(i10).f3122c)) {
                                    break;
                                }
                                i10--;
                            }
                            size = i10 + 1;
                        }
                        this.f3186c.add(size, b0Var);
                        z9 = true;
                    }
                    if (!z9) {
                        a(b0Var, true);
                        z10 = z9;
                        i.this.f3092r.d(b0Var);
                        if (!z10 && !z11 && g10) {
                            b0Var.f3137r = null;
                            return;
                        }
                        return;
                    }
                    z10 = z9;
                }
                z11 = false;
                i.this.f3092r.d(b0Var);
                if (!z10) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + i.this.D());
            }
        }

        /* access modifiers changed from: package-private */
        public void v(View view) {
            ArrayList<b0> arrayList;
            b0 J = i.J(view);
            if (!J.n(12) && J.v() && !i.this.j(J)) {
                if (this.f3185b == null) {
                    this.f3185b = new ArrayList<>();
                }
                J.C(this, true);
                arrayList = this.f3185b;
            } else if (!J.q() || J.s()) {
                J.C(this, false);
                arrayList = this.f3184a;
            } else {
                Objects.requireNonNull(i.this);
                throw null;
            }
            arrayList.add(J);
        }

        /* access modifiers changed from: package-private */
        public void w(t tVar) {
            t tVar2 = this.f3190g;
            if (tVar2 != null) {
                tVar2.b();
            }
            this.f3190g = tVar;
            if (tVar != null) {
                i.this.getAdapter();
            }
        }

        /* access modifiers changed from: package-private */
        public void x(z zVar) {
        }

        public void y(int i10) {
            this.f3188e = i10;
            C();
        }
    }

    public interface v {
        void a(b0 b0Var);
    }

    private class w extends h {
        w() {
        }
    }

    public static class x extends w.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        Parcelable f3193o;

        static class a implements Parcelable.ClassLoaderCreator<x> {
            a() {
            }

            /* renamed from: a */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            /* renamed from: c */
            public x[] newArray(int i10) {
                return new x[i10];
            }
        }

        x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3193o = parcel.readParcelable(classLoader == null ? n.class.getClassLoader() : classLoader);
        }

        x(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        public void b(x xVar) {
            this.f3193o = xVar.f3193o;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f3193o, 0);
        }
    }

    public static class y {

        /* renamed from: a  reason: collision with root package name */
        int f3194a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f3195b;

        /* renamed from: c  reason: collision with root package name */
        int f3196c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f3197d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f3198e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f3199f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f3200g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f3201h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f3202i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f3203j = false;

        /* renamed from: k  reason: collision with root package name */
        boolean f3204k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f3205l = false;

        public int a() {
            return this.f3201h ? this.f3196c - this.f3197d : this.f3199f;
        }

        public boolean b() {
            return this.f3201h;
        }

        /* access modifiers changed from: package-private */
        public void c(g gVar) {
            this.f3198e = 1;
            throw null;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3194a + ", mData=" + this.f3195b + ", mItemCount=" + this.f3199f + ", mIsMeasuring=" + this.f3203j + ", mPreviousLayoutItemCount=" + this.f3196c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3197d + ", mStructureChanged=" + this.f3200g + ", mInPreLayout=" + this.f3201h + ", mRunSimpleAnimations=" + this.f3204k + ", mRunPredictiveAnimations=" + this.f3205l + '}';
        }
    }

    public static abstract class z {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            J0 = r1
            int[] r1 = new int[r0]
            r2 = 16842987(0x10100eb, float:2.3694217E-38)
            r1[r3] = r2
            K0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            L0 = r3
            r2 = 23
            if (r1 < r2) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            M0 = r1
            N0 = r0
            O0 = r0
            P0 = r3
            Q0 = r3
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            R0 = r1
            androidx.recyclerview.widget.i$c r0 = new androidx.recyclerview.widget.i$c
            r0.<init>()
            S0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.<clinit>():void");
    }

    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3082m = new w();
        this.f3084n = new u();
        this.f3092r = new n();
        this.f3096t = new a();
        this.f3098u = new Rect();
        this.f3100v = new Rect();
        this.f3102w = new RectF();
        this.f3108z = new ArrayList<>();
        this.A = new ArrayList<>();
        this.G = 0;
        this.O = false;
        this.P = false;
        this.Q = 0;
        this.R = 0;
        this.S = new j();
        this.f3070a0 = new c();
        this.f3071b0 = 0;
        this.f3072c0 = -1;
        this.f3081l0 = Float.MIN_VALUE;
        this.f3083m0 = Float.MIN_VALUE;
        boolean z9 = true;
        this.f3085n0 = true;
        this.f3087o0 = new a0();
        this.f3091q0 = O0 ? new e.b() : null;
        this.f3093r0 = new y();
        this.f3099u0 = false;
        this.f3101v0 = false;
        this.f3103w0 = new l();
        this.f3105x0 = false;
        this.A0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new ArrayList();
        this.H0 = new b();
        this.I0 = new d();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K0, i10, 0);
            this.f3094s = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f3094s = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3078i0 = viewConfiguration.getScaledTouchSlop();
        this.f3081l0 = androidx.core.view.z.b(viewConfiguration, context);
        this.f3083m0 = androidx.core.view.z.d(viewConfiguration, context);
        this.f3079j0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3080k0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3070a0.q(this.f3103w0);
        P();
        R();
        Q();
        if (androidx.core.view.x.x(this) == 0) {
            androidx.core.view.x.q0(this, 1);
        }
        this.M = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new j(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, r0.b.f12060h, i10, 0);
            String string = obtainStyledAttributes2.getString(r0.b.f12068p);
            if (obtainStyledAttributes2.getInt(r0.b.f12062j, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z10 = obtainStyledAttributes2.getBoolean(r0.b.f12063k, false);
            this.E = z10;
            if (z10) {
                S((StateListDrawable) obtainStyledAttributes2.getDrawable(r0.b.f12066n), obtainStyledAttributes2.getDrawable(r0.b.f12067o), (StateListDrawable) obtainStyledAttributes2.getDrawable(r0.b.f12064l), obtainStyledAttributes2.getDrawable(r0.b.f12065m));
            }
            obtainStyledAttributes2.recycle();
            o(context, string, attributeSet, i10, 0);
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, J0, i10, 0);
            z9 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z9);
    }

    private void F0() {
        this.f3087o0.i();
        n nVar = this.f3104x;
        if (nVar != null) {
            nVar.G0();
        }
    }

    static b0 J(View view) {
        if (view == null) {
            return null;
        }
        return ((o) view.getLayoutParams()).f3174a;
    }

    static void K(View view, Rect rect) {
        o oVar = (o) view.getLayoutParams();
        Rect rect2 = oVar.f3175b;
        rect.set((view.getLeft() - rect2.left) - oVar.leftMargin, (view.getTop() - rect2.top) - oVar.topMargin, view.getRight() + rect2.right + oVar.rightMargin, view.getBottom() + rect2.bottom + oVar.bottomMargin);
    }

    private String L(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return i.class.getPackage().getName() + '.' + str;
        }
    }

    private boolean O() {
        int d10 = this.f3090q.d();
        for (int i10 = 0; i10 < d10; i10++) {
            b0 J2 = J(this.f3090q.c(i10));
            if (J2 != null && !J2.E() && J2.v()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void Q() {
        if (androidx.core.view.x.y(this) == 0) {
            androidx.core.view.x.r0(this, 8);
        }
    }

    private void R() {
        this.f3090q = new b(new e());
    }

    private boolean W(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || E(view2) == null) {
            return false;
        }
        if (view == null || E(view) == null) {
            return true;
        }
        this.f3098u.set(0, 0, view.getWidth(), view.getHeight());
        this.f3100v.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3098u);
        offsetDescendantRectToMyCoords(view2, this.f3100v);
        char c10 = 65535;
        int i12 = this.f3104x.C() == 1 ? -1 : 1;
        Rect rect = this.f3098u;
        int i13 = rect.left;
        Rect rect2 = this.f3100v;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 <= 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 >= 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + D());
    }

    private void g0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3072c0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f3072c0 = motionEvent.getPointerId(i10);
            int x9 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f3076g0 = x9;
            this.f3074e0 = x9;
            int y9 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f3077h0 = y9;
            this.f3075f0 = y9;
        }
    }

    private androidx.core.view.o getScrollingChildHelper() {
        if (this.B0 == null) {
            this.B0 = new androidx.core.view.o(this);
        }
        return this.B0;
    }

    private boolean i0() {
        return this.f3070a0 != null && this.f3104x.H0();
    }

    private void j0() {
        boolean z9;
        boolean z10;
        if (this.O) {
            this.f3088p.t();
            if (this.P) {
                this.f3104x.h0(this);
            }
        }
        if (i0()) {
            this.f3088p.r();
        } else {
            this.f3088p.j();
        }
        boolean z11 = false;
        boolean z12 = this.f3099u0 || this.f3101v0;
        y yVar = this.f3093r0;
        if (!this.F || this.f3070a0 == null || (!(z10 = this.O) && !z12 && !this.f3104x.f3158g)) {
            z9 = false;
        } else if (!z10) {
            z9 = true;
        } else {
            throw null;
        }
        yVar.f3204k = z9;
        if (z9 && z12 && !this.O && i0()) {
            z11 = true;
        }
        yVar.f3205l = z11;
    }

    private void k() {
        u0();
        setScrollState(0);
    }

    static void l(b0 b0Var) {
        WeakReference<i> weakReference = b0Var.f3121b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        b0Var.f3121b = null;
                        return;
                    } else if (view != b0Var.f3120a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.A()
            android.widget.EdgeEffect r3 = r6.T
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            androidx.core.widget.e.c(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.B()
            android.widget.EdgeEffect r3 = r6.V
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.C()
            android.widget.EdgeEffect r9 = r6.U
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.e.c(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.z()
            android.widget.EdgeEffect r9 = r6.W
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.e.c(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            androidx.core.view.x.a0(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.l0(float, float, float, float):void");
    }

    private void n0() {
        boolean z9;
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z9 = this.T.isFinished();
        } else {
            z9 = false;
        }
        EdgeEffect edgeEffect2 = this.U;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z9 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z9 |= this.V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.W;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z9 |= this.W.isFinished();
        }
        if (z9) {
            androidx.core.view.x.a0(this);
        }
    }

    private void o(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String L2 = L(context, trim);
                try {
                    Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(L2).asSubclass(n.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(R0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e10) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((n) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(e10);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + L2, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + L2, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + L2, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + L2, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + L2, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + L2, e16);
                }
            }
        }
    }

    private void r() {
        int i10 = this.K;
        this.K = 0;
        if (i10 != 0 && U()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            androidx.core.view.accessibility.b.b(obtain, i10);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void t0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3098u.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o) {
            o oVar = (o) layoutParams;
            if (!oVar.f3176c) {
                Rect rect = oVar.f3175b;
                Rect rect2 = this.f3098u;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3098u);
            offsetRectIntoDescendantCoords(view, this.f3098u);
        }
        this.f3104x.C0(this, view, this.f3098u, !this.F, view2 == null);
    }

    private void u0() {
        VelocityTracker velocityTracker = this.f3073d0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        a(0);
        n0();
    }

    private boolean v(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        r rVar = this.B;
        if (rVar != null) {
            if (action == 0) {
                this.B = null;
            } else {
                rVar.b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.B = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.A.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar2 = this.A.get(i10);
                if (rVar2.a(this, motionEvent)) {
                    this.B = rVar2;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean w(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.B = null;
        }
        int size = this.A.size();
        int i10 = 0;
        while (i10 < size) {
            r rVar = this.A.get(i10);
            if (!rVar.a(this, motionEvent) || action == 3) {
                i10++;
            } else {
                this.B = rVar;
                return true;
            }
        }
        return false;
    }

    private void w0(g gVar, boolean z9, boolean z10) {
        if (!z9 || z10) {
            o0();
        }
        this.f3088p.t();
        n nVar = this.f3104x;
        if (nVar != null) {
            nVar.U((g) null, (g) null);
        }
        this.f3084n.p((g) null, (g) null, z9);
        this.f3093r0.f3200g = true;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        int i10;
        int i11;
        if (this.T == null) {
            EdgeEffect a10 = this.S.a(this, 0);
            this.T = a10;
            if (this.f3094s) {
                i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i11 = getMeasuredHeight();
                i10 = getMeasuredWidth();
            }
            a10.setSize(i11, i10);
        }
    }

    public void A0(int i10, int i11, Interpolator interpolator) {
        n nVar = this.f3104x;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.I) {
            if (!nVar.b()) {
                i10 = 0;
            }
            if (!this.f3104x.c()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                this.f3087o0.h(i10, i11, interpolator);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void B() {
        int i10;
        int i11;
        if (this.V == null) {
            EdgeEffect a10 = this.S.a(this, 2);
            this.V = a10;
            if (this.f3094s) {
                i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i11 = getMeasuredHeight();
                i10 = getMeasuredWidth();
            }
            a10.setSize(i11, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void B0() {
        int i10 = this.G + 1;
        this.G = i10;
        if (i10 == 1 && !this.I) {
            this.H = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        int i10;
        int i11;
        if (this.U == null) {
            EdgeEffect a10 = this.S.a(this, 1);
            this.U = a10;
            if (this.f3094s) {
                i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i11 = getMeasuredWidth();
                i10 = getMeasuredHeight();
            }
            a10.setSize(i11, i10);
        }
    }

    public boolean C0(int i10, int i11) {
        return getScrollingChildHelper().q(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public String D() {
        return " " + super.toString() + ", adapter:" + null + ", layout:" + this.f3104x + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public void D0(boolean z9) {
        if (this.G < 1) {
            this.G = 1;
        }
        if (!z9 && !this.I) {
            this.H = false;
        }
        int i10 = this.G;
        if (i10 == 1) {
            if (z9 && this.H && !this.I) {
                n nVar = this.f3104x;
            }
            if (!this.I) {
                this.H = false;
            }
        }
        this.G = i10 - 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View E(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.E(android.view.View):android.view.View");
    }

    public void E0() {
        setScrollState(0);
        F0();
    }

    /* access modifiers changed from: package-private */
    public b0 F(int i10, boolean z9) {
        int g10 = this.f3090q.g();
        b0 b0Var = null;
        for (int i11 = 0; i11 < g10; i11++) {
            b0 J2 = J(this.f3090q.f(i11));
            if (J2 != null && !J2.s()) {
                if (z9) {
                    if (J2.f3122c != i10) {
                        continue;
                    }
                } else if (J2.k() != i10) {
                    continue;
                }
                if (!this.f3090q.i(J2.f3120a)) {
                    return J2;
                }
                b0Var = J2;
            }
        }
        return b0Var;
    }

    public boolean G(int i10, int i11) {
        n nVar = this.f3104x;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.I) {
            return false;
        } else {
            boolean b10 = nVar.b();
            boolean c10 = this.f3104x.c();
            if (!b10 || Math.abs(i10) < this.f3079j0) {
                i10 = 0;
            }
            if (!c10 || Math.abs(i11) < this.f3079j0) {
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            float f10 = (float) i10;
            float f11 = (float) i11;
            if (!dispatchNestedPreFling(f10, f11)) {
                boolean z9 = b10 || c10;
                dispatchNestedFling(f10, f11, z9);
                if (z9) {
                    if (c10) {
                        b10 |= true;
                    }
                    C0(b10 ? 1 : 0, 1);
                    int i12 = this.f3080k0;
                    int max = Math.max(-i12, Math.min(i10, i12));
                    int i13 = this.f3080k0;
                    this.f3087o0.e(max, Math.max(-i13, Math.min(i11, i13)));
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void G0(int i10, int i11, Object obj) {
        int i12;
        int g10 = this.f3090q.g();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < g10; i14++) {
            View f10 = this.f3090q.f(i14);
            b0 J2 = J(f10);
            if (J2 != null && !J2.E() && (i12 = J2.f3122c) >= i10 && i12 < i13) {
                J2.b(2);
                J2.a(obj);
                ((o) f10.getLayoutParams()).f3176c = true;
            }
        }
        this.f3084n.E(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public int H(b0 b0Var) {
        if (b0Var.n(524) || !b0Var.p()) {
            return -1;
        }
        return this.f3088p.e(b0Var.f3122c);
    }

    /* access modifiers changed from: package-private */
    public long I(b0 b0Var) {
        throw null;
    }

    public boolean M(int i10) {
        return getScrollingChildHelper().l(i10);
    }

    public boolean N() {
        return !this.F || this.O || this.f3088p.p();
    }

    /* access modifiers changed from: package-private */
    public void P() {
        this.f3088p = new a(new f());
    }

    /* access modifiers changed from: package-private */
    public void S(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + D());
        }
        Resources resources = getContext().getResources();
        new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(r0.a.fastscroll_default_thickness), resources.getDimensionPixelSize(r0.a.fastscroll_minimum_range), resources.getDimensionPixelOffset(r0.a.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    public void T() {
        this.W = null;
        this.U = null;
        this.V = null;
        this.T = null;
    }

    /* access modifiers changed from: package-private */
    public boolean U() {
        AccessibilityManager accessibilityManager = this.M;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean V() {
        return this.Q > 0;
    }

    /* access modifiers changed from: package-private */
    public void X() {
        int g10 = this.f3090q.g();
        for (int i10 = 0; i10 < g10; i10++) {
            ((o) this.f3090q.f(i10).getLayoutParams()).f3176c = true;
        }
        this.f3084n.k();
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        int g10 = this.f3090q.g();
        for (int i10 = 0; i10 < g10; i10++) {
            b0 J2 = J(this.f3090q.f(i10));
            if (J2 != null && !J2.E()) {
                J2.b(6);
            }
        }
        X();
        this.f3084n.l();
    }

    /* access modifiers changed from: package-private */
    public void Z(int i10, int i11) {
        int g10 = this.f3090q.g();
        for (int i12 = 0; i12 < g10; i12++) {
            b0 J2 = J(this.f3090q.f(i12));
            if (J2 != null && !J2.E() && J2.f3122c >= i10) {
                J2.x(i11, false);
                this.f3093r0.f3200g = true;
            }
        }
        this.f3084n.m(i10, i11);
        requestLayout();
    }

    public void a(int i10) {
        getScrollingChildHelper().s(i10);
    }

    /* access modifiers changed from: package-private */
    public void a0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int g10 = this.f3090q.g();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < g10; i16++) {
            b0 J2 = J(this.f3090q.f(i16));
            if (J2 != null && (i15 = J2.f3122c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    J2.x(i11 - i10, false);
                } else {
                    J2.x(i14, false);
                }
                this.f3093r0.f3200g = true;
            }
        }
        this.f3084n.n(i10, i11);
        requestLayout();
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        n nVar = this.f3104x;
        if (nVar == null || !nVar.V(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void b0(int i10, int i11, boolean z9) {
        int i12 = i10 + i11;
        int g10 = this.f3090q.g();
        for (int i13 = 0; i13 < g10; i13++) {
            b0 J2 = J(this.f3090q.f(i13));
            if (J2 != null && !J2.E()) {
                int i14 = J2.f3122c;
                if (i14 >= i12) {
                    J2.x(-i11, z9);
                } else if (i14 >= i10) {
                    J2.h(i10 - 1, -i11, z9);
                }
                this.f3093r0.f3200g = true;
            }
        }
        this.f3084n.o(i10, i11, z9);
        requestLayout();
    }

    public void c0(View view) {
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && this.f3104x.d((o) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        n nVar = this.f3104x;
        if (nVar != null && nVar.b()) {
            return this.f3104x.f(this.f3093r0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        n nVar = this.f3104x;
        if (nVar != null && nVar.b()) {
            return this.f3104x.g(this.f3093r0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        n nVar = this.f3104x;
        if (nVar != null && nVar.b()) {
            return this.f3104x.h(this.f3093r0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        n nVar = this.f3104x;
        if (nVar != null && nVar.c()) {
            return this.f3104x.i(this.f3093r0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        n nVar = this.f3104x;
        if (nVar != null && nVar.c()) {
            return this.f3104x.j(this.f3093r0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        n nVar = this.f3104x;
        if (nVar != null && nVar.c()) {
            return this.f3104x.k(this.f3093r0);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void d0() {
        this.Q++;
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return getScrollingChildHelper().a(f10, f11, z9);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z9;
        int i10;
        float f10;
        super.draw(canvas);
        int size = this.f3108z.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            this.f3108z.get(i11).g(canvas, this, this.f3093r0);
        }
        EdgeEffect edgeEffect = this.T;
        boolean z11 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z9 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3094s ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.T;
            z9 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3094s) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.U;
            z9 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.V;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3094s ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.V;
            z9 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.W;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3094s) {
                f10 = (float) ((-getWidth()) + getPaddingRight());
                i10 = (-getHeight()) + getPaddingBottom();
            } else {
                f10 = (float) (-getWidth());
                i10 = -getHeight();
            }
            canvas.translate(f10, (float) i10);
            EdgeEffect edgeEffect8 = this.W;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z9 |= z10;
            canvas.restoreToCount(save4);
        }
        if (z9 || this.f3070a0 == null || this.f3108z.size() <= 0 || !this.f3070a0.l()) {
            z11 = z9;
        }
        if (z11) {
            androidx.core.view.x.a0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public void e(m mVar) {
        f(mVar, -1);
    }

    /* access modifiers changed from: package-private */
    public void e0() {
        f0(true);
    }

    public void f(m mVar, int i10) {
        n nVar = this.f3104x;
        if (nVar != null) {
            nVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3108z.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f3108z.add(mVar);
        } else {
            this.f3108z.add(i10, mVar);
        }
        X();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void f0(boolean z9) {
        int i10 = this.Q - 1;
        this.Q = i10;
        if (i10 < 1) {
            this.Q = 0;
            if (z9) {
                r();
                y();
            }
        }
    }

    public View focusSearch(View view, int i10) {
        View f02 = this.f3104x.f0(view, i10);
        if (f02 != null) {
            return f02;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        if (findNextFocus == null || findNextFocus.hasFocusable()) {
            return W(view, findNextFocus, i10) ? findNextFocus : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        t0(findNextFocus, (View) null);
        return view;
    }

    public void g(r rVar) {
        this.A.add(rVar);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n nVar = this.f3104x;
        if (nVar != null) {
            return nVar.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + D());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n nVar = this.f3104x;
        if (nVar != null) {
            return nVar.o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + D());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n nVar = this.f3104x;
        if (nVar != null) {
            return nVar.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + D());
    }

    public g getAdapter() {
        return null;
    }

    public int getBaseline() {
        n nVar = this.f3104x;
        return nVar != null ? nVar.q() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        C0062i iVar = this.f3109z0;
        return iVar == null ? super.getChildDrawingOrder(i10, i11) : iVar.a(i10, i11);
    }

    public boolean getClipToPadding() {
        return this.f3094s;
    }

    public j getCompatAccessibilityDelegate() {
        return this.f3107y0;
    }

    public j getEdgeEffectFactory() {
        return this.S;
    }

    public k getItemAnimator() {
        return this.f3070a0;
    }

    public int getItemDecorationCount() {
        return this.f3108z.size();
    }

    public n getLayoutManager() {
        return this.f3104x;
    }

    public int getMaxFlingVelocity() {
        return this.f3080k0;
    }

    public int getMinFlingVelocity() {
        return this.f3079j0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (O0) {
            return System.nanoTime();
        }
        return 0;
    }

    public q getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3085n0;
    }

    public t getRecycledViewPool() {
        return this.f3084n.g();
    }

    public int getScrollState() {
        return this.f3071b0;
    }

    public void h(s sVar) {
        if (this.f3097t0 == null) {
            this.f3097t0 = new ArrayList();
        }
        this.f3097t0.add(sVar);
    }

    public void h0(int i10) {
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    /* access modifiers changed from: package-private */
    public void i(String str) {
        if (V()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + D());
            }
            throw new IllegalStateException(str);
        } else if (this.R > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + D()));
        }
    }

    public boolean isAttachedToWindow() {
        return this.C;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    /* access modifiers changed from: package-private */
    public boolean j(b0 b0Var) {
        k kVar = this.f3070a0;
        return kVar == null || kVar.c(b0Var, b0Var.m());
    }

    /* access modifiers changed from: package-private */
    public void k0(boolean z9) {
        this.P = z9 | this.P;
        this.O = true;
        Y();
    }

    /* access modifiers changed from: package-private */
    public void m(int i10, int i11) {
        boolean z9;
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z9 = false;
        } else {
            this.T.onRelease();
            z9 = this.T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.V;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.V.onRelease();
            z9 |= this.V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.U.onRelease();
            z9 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.W;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.W.onRelease();
            z9 |= this.W.isFinished();
        }
        if (z9) {
            androidx.core.view.x.a0(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void m0(b0 b0Var, k.c cVar) {
        b0Var.A(0, 8192);
        if (this.f3093r0.f3202i && b0Var.v() && !b0Var.s() && !b0Var.E()) {
            this.f3092r.a(I(b0Var), b0Var);
        }
        this.f3092r.b(b0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (!this.F || this.O) {
            androidx.core.os.n.a("RV FullInvalidate");
            s();
            androidx.core.os.n.b();
        } else if (this.f3088p.p()) {
            if (this.f3088p.o(4) && !this.f3088p.o(11)) {
                androidx.core.os.n.a("RV PartialInvalidate");
                B0();
                d0();
                this.f3088p.r();
                if (!this.H) {
                    if (O()) {
                        s();
                    } else {
                        this.f3088p.i();
                    }
                }
                D0(true);
                e0();
            } else if (this.f3088p.p()) {
                androidx.core.os.n.a("RV FullInvalidate");
                s();
            } else {
                return;
            }
            androidx.core.os.n.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void o0() {
        k kVar = this.f3070a0;
        if (kVar != null) {
            kVar.g();
        }
        n nVar = this.f3104x;
        if (nVar != null) {
            nVar.w0(this.f3084n);
            this.f3104x.x0(this.f3084n);
        }
        this.f3084n.b();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = 0;
        boolean z9 = true;
        this.C = true;
        if (!this.F || isLayoutRequested()) {
            z9 = false;
        }
        this.F = z9;
        n nVar = this.f3104x;
        if (nVar != null) {
            nVar.l(this);
        }
        this.f3105x0 = false;
        if (O0) {
            ThreadLocal<e> threadLocal = e.f3044q;
            e eVar = threadLocal.get();
            this.f3089p0 = eVar;
            if (eVar == null) {
                this.f3089p0 = new e();
                Display s9 = androidx.core.view.x.s(this);
                float f10 = 60.0f;
                if (!isInEditMode() && s9 != null) {
                    float refreshRate = s9.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                e eVar2 = this.f3089p0;
                eVar2.f3048o = (long) (1.0E9f / f10);
                threadLocal.set(eVar2);
            }
            this.f3089p0.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        k kVar = this.f3070a0;
        if (kVar != null) {
            kVar.g();
        }
        E0();
        this.C = false;
        n nVar = this.f3104x;
        if (nVar != null) {
            nVar.m(this, this.f3084n);
        }
        this.G0.clear();
        removeCallbacks(this.H0);
        this.f3092r.c();
        if (O0 && (eVar = this.f3089p0) != null) {
            eVar.j(this);
            this.f3089p0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3108z.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3108z.get(i10).e(canvas, this, this.f3093r0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        if (this.f3104x != null && !this.I && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f11 = this.f3104x.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f3104x.b()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (!(f11 == 0.0f && f10 == 0.0f)) {
                        v0((int) (f10 * this.f3081l0), (int) (f11 * this.f3083m0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f3104x.c()) {
                        f11 = -axisValue;
                    } else if (this.f3104x.b()) {
                        f10 = axisValue;
                        f11 = 0.0f;
                        v0((int) (f10 * this.f3081l0), (int) (f11 * this.f3083m0), motionEvent);
                    }
                }
                f11 = 0.0f;
            }
            f10 = 0.0f;
            v0((int) (f10 * this.f3081l0), (int) (f11 * this.f3083m0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (this.I) {
            return false;
        }
        if (w(motionEvent)) {
            k();
            return true;
        }
        n nVar = this.f3104x;
        if (nVar == null) {
            return false;
        }
        boolean b10 = nVar.b();
        boolean c10 = this.f3104x.c();
        if (this.f3073d0 == null) {
            this.f3073d0 = VelocityTracker.obtain();
        }
        this.f3073d0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.J) {
                this.J = false;
            }
            this.f3072c0 = motionEvent.getPointerId(0);
            int x9 = (int) (motionEvent.getX() + 0.5f);
            this.f3076g0 = x9;
            this.f3074e0 = x9;
            int y9 = (int) (motionEvent.getY() + 0.5f);
            this.f3077h0 = y9;
            this.f3075f0 = y9;
            if (this.f3071b0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.E0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (c10) {
                b10 |= true;
            }
            C0(b10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f3073d0.clear();
            a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3072c0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3072c0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f3071b0 != 1) {
                int i10 = x10 - this.f3074e0;
                int i11 = y10 - this.f3075f0;
                if (!b10 || Math.abs(i10) <= this.f3078i0) {
                    z9 = false;
                } else {
                    this.f3076g0 = x10;
                    z9 = true;
                }
                if (c10 && Math.abs(i11) > this.f3078i0) {
                    this.f3077h0 = y10;
                    z9 = true;
                }
                if (z9) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            k();
        } else if (actionMasked == 5) {
            this.f3072c0 = motionEvent.getPointerId(actionIndex);
            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3076g0 = x11;
            this.f3074e0 = x11;
            int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3077h0 = y11;
            this.f3075f0 = y11;
        } else if (actionMasked == 6) {
            g0(motionEvent);
        }
        return this.f3071b0 == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        androidx.core.os.n.a("RV OnLayout");
        s();
        androidx.core.os.n.b();
        this.F = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        n nVar = this.f3104x;
        if (nVar == null) {
            p(i10, i11);
        } else if (nVar.Q()) {
            View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getMode(i11);
            this.f3104x.m0(this.f3084n, this.f3093r0, i10, i11);
        } else if (this.D) {
            this.f3104x.m0(this.f3084n, this.f3093r0, i10, i11);
        } else {
            if (this.L) {
                B0();
                d0();
                j0();
                e0();
                y yVar = this.f3093r0;
                if (yVar.f3205l) {
                    yVar.f3201h = true;
                } else {
                    this.f3088p.j();
                    this.f3093r0.f3201h = false;
                }
                this.L = false;
                D0(false);
            } else if (this.f3093r0.f3205l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            this.f3093r0.f3199f = 0;
            B0();
            this.f3104x.m0(this.f3084n, this.f3093r0, i10, i11);
            D0(false);
            this.f3093r0.f3201h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (V()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f3086o = xVar;
        super.onRestoreInstanceState(xVar.a());
        n nVar = this.f3104x;
        if (nVar != null && (parcelable2 = this.f3086o.f3193o) != null) {
            nVar.p0(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f3086o;
        if (xVar2 != null) {
            xVar.b(xVar2);
        } else {
            n nVar = this.f3104x;
            xVar.f3193o = nVar != null ? nVar.q0() : null;
        }
        return xVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            T();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        boolean z9;
        int i12;
        int i13;
        boolean z10 = false;
        if (this.I || this.J) {
            return false;
        }
        if (v(motionEvent)) {
            k();
            return true;
        }
        n nVar = this.f3104x;
        if (nVar == null) {
            return false;
        }
        boolean b10 = nVar.b();
        boolean c10 = this.f3104x.c();
        if (this.f3073d0 == null) {
            this.f3073d0 = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.E0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.E0;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked == 0) {
            this.f3072c0 = motionEvent.getPointerId(0);
            int x9 = (int) (motionEvent.getX() + 0.5f);
            this.f3076g0 = x9;
            this.f3074e0 = x9;
            int y9 = (int) (motionEvent.getY() + 0.5f);
            this.f3077h0 = y9;
            this.f3075f0 = y9;
            if (c10) {
                b10 |= true;
            }
            C0(b10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f3073d0.addMovement(obtain);
            this.f3073d0.computeCurrentVelocity(1000, (float) this.f3080k0);
            float f10 = b10 ? -this.f3073d0.getXVelocity(this.f3072c0) : 0.0f;
            float f11 = c10 ? -this.f3073d0.getYVelocity(this.f3072c0) : 0.0f;
            if ((f10 == 0.0f && f11 == 0.0f) || !G((int) f10, (int) f11)) {
                setScrollState(0);
            }
            u0();
            z10 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3072c0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3072c0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i14 = this.f3076g0 - x10;
            int i15 = this.f3077h0 - y10;
            if (t(i14, i15, this.D0, this.C0, 0)) {
                int[] iArr3 = this.D0;
                i14 -= iArr3[0];
                i15 -= iArr3[1];
                int[] iArr4 = this.C0;
                obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                int[] iArr5 = this.E0;
                int i16 = iArr5[0];
                int[] iArr6 = this.C0;
                iArr5[0] = i16 + iArr6[0];
                iArr5[1] = iArr5[1] + iArr6[1];
            }
            if (this.f3071b0 != 1) {
                if (!b10 || Math.abs(i11) <= (i13 = this.f3078i0)) {
                    z9 = false;
                } else {
                    i11 = i11 > 0 ? i11 - i13 : i11 + i13;
                    z9 = true;
                }
                if (c10 && Math.abs(i10) > (i12 = this.f3078i0)) {
                    i10 = i10 > 0 ? i10 - i12 : i10 + i12;
                    z9 = true;
                }
                if (z9) {
                    setScrollState(1);
                }
            }
            if (this.f3071b0 == 1) {
                int[] iArr7 = this.C0;
                this.f3076g0 = x10 - iArr7[0];
                this.f3077h0 = y10 - iArr7[1];
                if (v0(b10 ? i11 : 0, c10 ? i10 : 0, obtain)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                e eVar = this.f3089p0;
                if (!(eVar == null || (i11 == 0 && i10 == 0))) {
                    eVar.f(this, i11, i10);
                }
            }
        } else if (actionMasked == 3) {
            k();
        } else if (actionMasked == 5) {
            this.f3072c0 = motionEvent.getPointerId(actionIndex);
            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3076g0 = x11;
            this.f3074e0 = x11;
            int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3077h0 = y11;
            this.f3075f0 = y11;
        } else if (actionMasked == 6) {
            g0(motionEvent);
        }
        if (!z10) {
            this.f3073d0.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p(int i10, int i11) {
        setMeasuredDimension(n.e(i10, getPaddingLeft() + getPaddingRight(), androidx.core.view.x.B(this)), n.e(i11, getPaddingTop() + getPaddingBottom(), androidx.core.view.x.A(this)));
    }

    /* access modifiers changed from: package-private */
    public boolean p0(View view) {
        B0();
        boolean l10 = this.f3090q.l(view);
        if (l10) {
            b0 J2 = J(view);
            this.f3084n.B(J2);
            this.f3084n.u(J2);
        }
        D0(!l10);
        return l10;
    }

    /* access modifiers changed from: package-private */
    public void q(View view) {
        J(view);
        c0(view);
        List<p> list = this.N;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.N.get(size).a(view);
            }
        }
    }

    public void q0(m mVar) {
        n nVar = this.f3104x;
        if (nVar != null) {
            nVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3108z.remove(mVar);
        if (this.f3108z.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        X();
        requestLayout();
    }

    public void r0(r rVar) {
        this.A.remove(rVar);
        if (this.B == rVar) {
            this.B = null;
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z9) {
        b0 J2 = J(view);
        if (J2 != null) {
            if (J2.u()) {
                J2.e();
            } else if (!J2.E()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + J2 + D());
            }
        }
        view.clearAnimation();
        q(view);
        super.removeDetachedView(view, z9);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3104x.o0(this, this.f3093r0, view, view2) && view2 != null) {
            t0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        return this.f3104x.B0(this, view, rect, z9);
    }

    public void requestDisallowInterceptTouchEvent(boolean z9) {
        int size = this.A.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A.get(i10).c(z9);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    public void requestLayout() {
        if (this.G != 0 || this.I) {
            this.H = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        Log.e("RecyclerView", "No adapter attached; skipping layout");
    }

    public void s0(s sVar) {
        List<s> list = this.f3097t0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public void scrollBy(int i10, int i11) {
        n nVar = this.f3104x;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.I) {
            boolean b10 = nVar.b();
            boolean c10 = this.f3104x.c();
            if (b10 || c10) {
                if (!b10) {
                    i10 = 0;
                }
                if (!c10) {
                    i11 = 0;
                }
                v0(i10, i11, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!y0(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(j jVar) {
        this.f3107y0 = jVar;
        androidx.core.view.x.g0(this, jVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        w0(gVar, false, true);
        k0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0062i iVar) {
        if (iVar != this.f3109z0) {
            this.f3109z0 = iVar;
            setChildrenDrawingOrderEnabled(iVar != null);
        }
    }

    public void setClipToPadding(boolean z9) {
        if (z9 != this.f3094s) {
            T();
        }
        this.f3094s = z9;
        super.setClipToPadding(z9);
        if (this.F) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j jVar) {
        androidx.core.util.h.j(jVar);
        this.S = jVar;
        T();
    }

    public void setHasFixedSize(boolean z9) {
        this.D = z9;
    }

    public void setItemAnimator(k kVar) {
        k kVar2 = this.f3070a0;
        if (kVar2 != null) {
            kVar2.g();
            this.f3070a0.q((k.b) null);
        }
        this.f3070a0 = kVar;
        if (kVar != null) {
            kVar.q(this.f3103w0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f3084n.y(i10);
    }

    public void setLayoutFrozen(boolean z9) {
        if (z9 != this.I) {
            i("Do not setLayoutFrozen in layout or scroll");
            if (!z9) {
                this.I = false;
                if (this.H) {
                    n nVar = this.f3104x;
                }
                this.H = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.I = true;
            this.J = true;
            E0();
        }
    }

    public void setLayoutManager(n nVar) {
        if (nVar != this.f3104x) {
            E0();
            if (this.f3104x != null) {
                k kVar = this.f3070a0;
                if (kVar != null) {
                    kVar.g();
                }
                this.f3104x.w0(this.f3084n);
                this.f3104x.x0(this.f3084n);
                this.f3084n.b();
                if (this.C) {
                    this.f3104x.m(this, this.f3084n);
                }
                this.f3104x.F0((i) null);
                this.f3104x = null;
            } else {
                this.f3084n.b();
            }
            this.f3090q.j();
            this.f3104x = nVar;
            if (nVar != null) {
                if (nVar.f3153b == null) {
                    nVar.F0(this);
                    if (this.C) {
                        this.f3104x.l(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + nVar + " is already attached to a RecyclerView:" + nVar.f3153b.D());
                }
            }
            this.f3084n.C();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z9) {
        getScrollingChildHelper().n(z9);
    }

    public void setOnFlingListener(q qVar) {
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f3095s0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z9) {
        this.f3085n0 = z9;
    }

    public void setRecycledViewPool(t tVar) {
        this.f3084n.w(tVar);
    }

    public void setRecyclerListener(v vVar) {
        this.f3106y = vVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        if (i10 != this.f3071b0) {
            this.f3071b0 = i10;
            if (i10 != 2) {
                F0();
            }
            x(i10);
        }
    }

    public void setScrollingTouchSlop(int i10) {
        int i11;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                i11 = viewConfiguration.getScaledPagingTouchSlop();
                this.f3078i0 = i11;
            }
        }
        i11 = viewConfiguration.getScaledTouchSlop();
        this.f3078i0 = i11;
    }

    public void setViewCacheExtension(z zVar) {
        this.f3084n.x(zVar);
    }

    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().p(i10);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public boolean t(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public boolean u(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().g(i10, i11, i12, i13, iArr, i14);
    }

    /* access modifiers changed from: package-private */
    public boolean v0(int i10, int i11, MotionEvent motionEvent) {
        n();
        if (!this.f3108z.isEmpty()) {
            invalidate();
        }
        if (u(0, 0, 0, 0, this.C0, 0)) {
            int i12 = this.f3076g0;
            int[] iArr = this.C0;
            this.f3076g0 = i12 - iArr[0];
            this.f3077h0 -= iArr[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
            }
            int[] iArr2 = this.E0;
            int i13 = iArr2[0];
            int[] iArr3 = this.C0;
            iArr2[0] = i13 + iArr3[0];
            iArr2[1] = iArr2[1] + iArr3[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.l.a(motionEvent, 8194)) {
                l0(motionEvent.getX(), (float) 0, motionEvent.getY(), (float) 0);
            }
            m(i10, i11);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void x(int i10) {
        n nVar = this.f3104x;
        if (nVar != null) {
            nVar.r0(i10);
        }
        h0(i10);
        s sVar = this.f3095s0;
        if (sVar != null) {
            sVar.a(this, i10);
        }
        List<s> list = this.f3097t0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3097t0.get(size).a(this, i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean x0(b0 b0Var, int i10) {
        if (V()) {
            b0Var.f3136q = i10;
            this.G0.add(b0Var);
            return false;
        }
        androidx.core.view.x.q0(b0Var.f3120a, i10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void y() {
        int i10;
        for (int size = this.G0.size() - 1; size >= 0; size--) {
            b0 b0Var = this.G0.get(size);
            if (b0Var.f3120a.getParent() == this && !b0Var.E() && (i10 = b0Var.f3136q) != -1) {
                androidx.core.view.x.q0(b0Var.f3120a, i10);
                b0Var.f3136q = -1;
            }
        }
        this.G0.clear();
    }

    /* access modifiers changed from: package-private */
    public boolean y0(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (!V()) {
            return false;
        }
        int a10 = accessibilityEvent != null ? androidx.core.view.accessibility.b.a(accessibilityEvent) : 0;
        if (a10 != 0) {
            i10 = a10;
        }
        this.K |= i10;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        int i10;
        int i11;
        if (this.W == null) {
            EdgeEffect a10 = this.S.a(this, 3);
            this.W = a10;
            if (this.f3094s) {
                i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i11 = getMeasuredWidth();
                i10 = getMeasuredHeight();
            }
            a10.setSize(i11, i10);
        }
    }

    public void z0(int i10, int i11) {
        A0(i10, i11, (Interpolator) null);
    }
}
