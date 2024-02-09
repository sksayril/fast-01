package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import d8.h;
import io.flutter.embedding.android.k;
import io.flutter.embedding.android.u;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.systemchannels.l;
import io.flutter.plugin.editing.f;
import io.flutter.view.c;
import io.flutter.view.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import x6.b;

public class q implements k {
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static Class[] f10119w = {SurfaceView.class};

    /* renamed from: a  reason: collision with root package name */
    private final i f10120a = new i();

    /* renamed from: b  reason: collision with root package name */
    private io.flutter.embedding.android.a f10121b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Context f10122c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public k f10123d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public e f10124e;

    /* renamed from: f  reason: collision with root package name */
    private f f10125f;

    /* renamed from: g  reason: collision with root package name */
    private l f10126g;

    /* renamed from: h  reason: collision with root package name */
    private final a f10127h = new a();

    /* renamed from: i  reason: collision with root package name */
    final HashMap<Integer, r> f10128i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    final HashMap<Context, View> f10129j = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final SparseArray<f> f10130k = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final SparseArray<b7.a> f10131l = new SparseArray<>();

    /* renamed from: m  reason: collision with root package name */
    private final SparseArray<b> f10132m = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final SparseArray<j> f10133n = new SparseArray<>();

    /* renamed from: o  reason: collision with root package name */
    private int f10134o = 0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10135p = false;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f10136q = true;

    /* renamed from: r  reason: collision with root package name */
    private final HashSet<Integer> f10137r = new HashSet<>();

    /* renamed from: s  reason: collision with root package name */
    private final HashSet<Integer> f10138s = new HashSet<>();

    /* renamed from: t  reason: collision with root package name */
    private final u f10139t = u.a();
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f10140u = false;

    /* renamed from: v  reason: collision with root package name */
    private final l.g f10141v = new a();

    class a implements l.g {
        a() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(r rVar, float f10, l.b bVar) {
            q.this.x0(rVar);
            if (q.this.f10122c != null) {
                f10 = q.this.W();
            }
            bVar.a(new l.c(q.this.u0((double) rVar.d(), f10), q.this.u0((double) rVar.c(), f10)));
        }

        public void a(boolean z9) {
            boolean unused = q.this.f10136q = z9;
        }

        public void b(int i10, double d10, double d11) {
            if (!q.this.b(i10)) {
                j jVar = (j) q.this.f10133n.get(i10);
                if (jVar == null) {
                    b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i10);
                    return;
                }
                int m10 = q.this.w0(d10);
                int m11 = q.this.w0(d11);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
                layoutParams.topMargin = m10;
                layoutParams.leftMargin = m11;
                jVar.j(layoutParams);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(int r4, int r5) {
            /*
                r3 = this;
                boolean r0 = io.flutter.plugin.platform.q.y0(r5)
                if (r0 == 0) goto L_0x0058
                io.flutter.plugin.platform.q r0 = io.flutter.plugin.platform.q.this
                boolean r0 = r0.b(r4)
                java.lang.String r1 = "PlatformViewsController"
                if (r0 == 0) goto L_0x0023
                io.flutter.plugin.platform.q r0 = io.flutter.plugin.platform.q.this
                java.util.HashMap<java.lang.Integer, io.flutter.plugin.platform.r> r0 = r0.f10128i
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r2)
                io.flutter.plugin.platform.r r0 = (io.flutter.plugin.platform.r) r0
                android.view.View r0 = r0.e()
                goto L_0x004a
            L_0x0023:
                io.flutter.plugin.platform.q r0 = io.flutter.plugin.platform.q.this
                android.util.SparseArray r0 = r0.f10130k
                java.lang.Object r0 = r0.get(r4)
                io.flutter.plugin.platform.f r0 = (io.flutter.plugin.platform.f) r0
                if (r0 != 0) goto L_0x0046
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Setting direction to an unknown view with id: "
            L_0x0038:
                r5.append(r0)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                x6.b.b(r1, r4)
                return
            L_0x0046:
                android.view.View r0 = r0.I()
            L_0x004a:
                if (r0 != 0) goto L_0x0054
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Setting direction to a null view with id: "
                goto L_0x0038
            L_0x0054:
                r0.setLayoutDirection(r5)
                return
            L_0x0058:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Trying to set unknown direction value: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = "(view id: "
                r1.append(r5)
                r1.append(r4)
                java.lang.String r4 = ")"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.q.a.c(int, int):void");
        }

        @TargetApi(20)
        public long d(l.d dVar) {
            q.this.U(dVar);
            int i10 = dVar.f9920a;
            if (q.this.f10133n.get(i10) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i10);
            } else if (q.this.f10124e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i10);
            } else if (q.this.f10123d != null) {
                boolean z9 = true;
                f N = q.this.N(dVar, true);
                View I = N.I();
                if (I.getParent() == null) {
                    if (Build.VERSION.SDK_INT < 23 || h.g(I, q.f10119w)) {
                        z9 = false;
                    }
                    if (!z9) {
                        if (dVar.f9927h == l.d.a.TEXTURE_WITH_HYBRID_FALLBACK) {
                            q.this.I(N, dVar);
                            return -2;
                        } else if (!q.this.f10140u) {
                            return q.this.K(N, dVar);
                        }
                    }
                    return q.this.J(N, dVar);
                }
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            } else {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i10);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e(int r4) {
            /*
                r3 = this;
                io.flutter.plugin.platform.q r0 = io.flutter.plugin.platform.q.this
                boolean r0 = r0.b(r4)
                java.lang.String r1 = "PlatformViewsController"
                if (r0 == 0) goto L_0x001d
                io.flutter.plugin.platform.q r0 = io.flutter.plugin.platform.q.this
                java.util.HashMap<java.lang.Integer, io.flutter.plugin.platform.r> r0 = r0.f10128i
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r2)
                io.flutter.plugin.platform.r r0 = (io.flutter.plugin.platform.r) r0
                android.view.View r0 = r0.e()
                goto L_0x0044
            L_0x001d:
                io.flutter.plugin.platform.q r0 = io.flutter.plugin.platform.q.this
                android.util.SparseArray r0 = r0.f10130k
                java.lang.Object r0 = r0.get(r4)
                io.flutter.plugin.platform.f r0 = (io.flutter.plugin.platform.f) r0
                if (r0 != 0) goto L_0x0040
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Clearing focus on an unknown view with id: "
            L_0x0032:
                r0.append(r2)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                x6.b.b(r1, r4)
                return
            L_0x0040:
                android.view.View r0 = r0.I()
            L_0x0044:
                if (r0 != 0) goto L_0x004e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Clearing focus on a null view with id: "
                goto L_0x0032
            L_0x004e:
                r0.clearFocus()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.q.a.e(int):void");
        }

        @TargetApi(19)
        public void f(l.d dVar) {
            q.this.T(19);
            q.this.U(dVar);
            q.this.I(q.this.N(dVar, false), dVar);
        }

        public void g(l.e eVar, l.b bVar) {
            int m10 = q.this.w0(eVar.f9930b);
            int m11 = q.this.w0(eVar.f9931c);
            int i10 = eVar.f9929a;
            if (q.this.b(i10)) {
                float n10 = q.this.W();
                r rVar = q.this.f10128i.get(Integer.valueOf(i10));
                q.this.e0(rVar);
                rVar.h(m10, m11, new p(this, rVar, n10, bVar));
                return;
            }
            f fVar = (f) q.this.f10130k.get(i10);
            j jVar = (j) q.this.f10133n.get(i10);
            if (fVar == null || jVar == null) {
                b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i10);
                return;
            }
            if (m10 > jVar.e() || m11 > jVar.d()) {
                jVar.i(m10, m11);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = m10;
            layoutParams.height = m11;
            jVar.setLayoutParams(layoutParams);
            View I = fVar.I();
            if (I != null) {
                ViewGroup.LayoutParams layoutParams2 = I.getLayoutParams();
                layoutParams2.width = m10;
                layoutParams2.height = m11;
                I.setLayoutParams(layoutParams2);
            }
            bVar.a(new l.c(q.this.t0((double) jVar.e()), q.this.t0((double) jVar.d())));
        }

        public void h(int i10) {
            f fVar = (f) q.this.f10130k.get(i10);
            if (fVar == null) {
                b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i10);
                return;
            }
            q.this.f10130k.remove(i10);
            try {
                fVar.e();
            } catch (RuntimeException e10) {
                b.c("PlatformViewsController", "Disposing platform view threw an exception", e10);
            }
            if (q.this.b(i10)) {
                View e11 = q.this.f10128i.get(Integer.valueOf(i10)).e();
                if (e11 != null) {
                    q.this.f10129j.remove(e11.getContext());
                }
                q.this.f10128i.remove(Integer.valueOf(i10));
                return;
            }
            j jVar = (j) q.this.f10133n.get(i10);
            if (jVar != null) {
                jVar.removeAllViews();
                jVar.h();
                jVar.o();
                ViewGroup viewGroup = (ViewGroup) jVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(jVar);
                }
                q.this.f10133n.remove(i10);
                return;
            }
            b7.a aVar = (b7.a) q.this.f10131l.get(i10);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(aVar);
                }
                q.this.f10131l.remove(i10);
            }
        }

        public void i(l.f fVar) {
            int i10 = fVar.f9932a;
            float f10 = q.this.f10122c.getResources().getDisplayMetrics().density;
            if (q.this.b(i10)) {
                q.this.f10128i.get(Integer.valueOf(i10)).b(q.this.v0(f10, fVar, true));
                return;
            }
            f fVar2 = (f) q.this.f10130k.get(i10);
            if (fVar2 == null) {
                b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i10);
                return;
            }
            View I = fVar2.I();
            if (I == null) {
                b.b("PlatformViewsController", "Sending touch to a null view with id: " + i10);
                return;
            }
            I.dispatchTouchEvent(q.this.v0(f10, fVar, false));
        }
    }

    /* access modifiers changed from: private */
    public void I(f fVar, l.d dVar) {
        T(19);
        b.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f9920a);
    }

    /* access modifiers changed from: private */
    @TargetApi(23)
    public long J(f fVar, l.d dVar) {
        long j10;
        j jVar;
        T(23);
        b.e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + dVar.f9920a);
        int w02 = w0(dVar.f9922c);
        int w03 = w0(dVar.f9923d);
        if (this.f10140u) {
            jVar = new j(this.f10122c);
            j10 = -1;
        } else {
            e.c a10 = this.f10124e.a();
            j jVar2 = new j(this.f10122c, a10);
            long e10 = a10.e();
            jVar = jVar2;
            j10 = e10;
        }
        jVar.m(this.f10121b);
        jVar.i(w02, w03);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(w02, w03);
        int w04 = w0(dVar.f9924e);
        int w05 = w0(dVar.f9925f);
        layoutParams.topMargin = w04;
        layoutParams.leftMargin = w05;
        jVar.j(layoutParams);
        View I = fVar.I();
        I.setLayoutParams(new FrameLayout.LayoutParams(w02, w03));
        I.setImportantForAccessibility(4);
        jVar.addView(I);
        jVar.k(new n(this, dVar));
        this.f10123d.addView(jVar);
        this.f10133n.append(dVar.f9920a, jVar);
        f0(fVar);
        return j10;
    }

    /* access modifiers changed from: private */
    public long K(f fVar, l.d dVar) {
        T(20);
        b.e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + dVar.f9920a);
        e.c a10 = this.f10124e.a();
        f fVar2 = fVar;
        e.c cVar = a10;
        r a11 = r.a(this.f10122c, this.f10127h, fVar2, cVar, w0(dVar.f9922c), w0(dVar.f9923d), dVar.f9920a, (Object) null, new m(this, dVar));
        if (a11 != null) {
            this.f10128i.put(Integer.valueOf(dVar.f9920a), a11);
            View I = fVar.I();
            this.f10129j.put(I.getContext(), I);
            return a10.e();
        }
        throw new IllegalStateException("Failed creating virtual display for a " + dVar.f9921b + " with id: " + dVar.f9920a);
    }

    private void S() {
        while (this.f10130k.size() > 0) {
            this.f10141v.h(this.f10130k.keyAt(0));
        }
    }

    /* access modifiers changed from: private */
    public void T(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < i10) {
            throw new IllegalStateException("Trying to use platform views with API " + i11 + ", required API level is: " + i10);
        }
    }

    /* access modifiers changed from: private */
    public void U(l.d dVar) {
        if (!y0(dVar.f9926g)) {
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f9926g + "(view id: " + dVar.f9920a + ")");
        }
    }

    private void V(boolean z9) {
        for (int i10 = 0; i10 < this.f10132m.size(); i10++) {
            int keyAt = this.f10132m.keyAt(i10);
            b valueAt = this.f10132m.valueAt(i10);
            if (this.f10137r.contains(Integer.valueOf(keyAt))) {
                this.f10123d.n(valueAt);
                z9 &= valueAt.a();
            } else {
                if (!this.f10135p) {
                    valueAt.d();
                }
                valueAt.setVisibility(8);
                this.f10123d.removeView(valueAt);
            }
        }
        for (int i11 = 0; i11 < this.f10131l.size(); i11++) {
            int keyAt2 = this.f10131l.keyAt(i11);
            View view = this.f10131l.get(keyAt2);
            if (!this.f10138s.contains(Integer.valueOf(keyAt2)) || (!z9 && this.f10136q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public float W() {
        return this.f10122c.getResources().getDisplayMetrics().density;
    }

    private void Z() {
        if (this.f10136q && !this.f10135p) {
            this.f10123d.q();
            this.f10135p = true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a0(l.d dVar, View view, boolean z9) {
        if (z9) {
            this.f10126g.d(dVar.f9920a);
            return;
        }
        f fVar = this.f10125f;
        if (fVar != null) {
            fVar.l(dVar.f9920a);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b0(l.d dVar, View view, boolean z9) {
        if (z9) {
            this.f10126g.d(dVar.f9920a);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c0(int i10, View view, boolean z9) {
        if (z9) {
            this.f10126g.d(i10);
            return;
        }
        f fVar = this.f10125f;
        if (fVar != null) {
            fVar.l(i10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d0() {
        V(false);
    }

    /* access modifiers changed from: private */
    public void e0(r rVar) {
        f fVar = this.f10125f;
        if (fVar != null) {
            fVar.u();
            rVar.f();
        }
    }

    private void f0(f fVar) {
        k kVar = this.f10123d;
        if (kVar == null) {
            b.e("PlatformViewsController", "null flutterView");
        } else {
            fVar.K(kVar);
        }
    }

    private static MotionEvent.PointerCoords n0(Object obj, float f10) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f10;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f10;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f10;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f10;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f10;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f10;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> o0(Object obj, float f10) {
        ArrayList arrayList = new ArrayList();
        for (Object n02 : (List) obj) {
            arrayList.add(n0(n02, f10));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties p0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> q0(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object p02 : (List) obj) {
            arrayList.add(p0(p02));
        }
        return arrayList;
    }

    private void r0() {
        if (this.f10123d == null) {
            b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i10 = 0; i10 < this.f10132m.size(); i10++) {
            this.f10123d.removeView(this.f10132m.valueAt(i10));
        }
        this.f10132m.clear();
    }

    /* access modifiers changed from: private */
    public int t0(double d10) {
        return u0(d10, W());
    }

    /* access modifiers changed from: private */
    public int u0(double d10, float f10) {
        return (int) Math.round(d10 / ((double) f10));
    }

    /* access modifiers changed from: private */
    public int w0(double d10) {
        return (int) Math.round(d10 * ((double) W()));
    }

    /* access modifiers changed from: private */
    public void x0(r rVar) {
        f fVar = this.f10125f;
        if (fVar != null) {
            fVar.H();
            rVar.g();
        }
    }

    /* access modifiers changed from: private */
    public static boolean y0(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public void D(Context context, e eVar, y6.a aVar) {
        if (this.f10122c == null) {
            this.f10122c = context;
            this.f10124e = eVar;
            l lVar = new l(aVar);
            this.f10126g = lVar;
            lVar.e(this.f10141v);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public void E(f fVar) {
        this.f10125f = fVar;
    }

    public void F(j7.a aVar) {
        this.f10121b = new io.flutter.embedding.android.a(aVar, true);
    }

    public void G(k kVar) {
        this.f10123d = kVar;
        for (int i10 = 0; i10 < this.f10133n.size(); i10++) {
            this.f10123d.addView(this.f10133n.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.f10131l.size(); i11++) {
            this.f10123d.addView(this.f10131l.valueAt(i11));
        }
        for (int i12 = 0; i12 < this.f10130k.size(); i12++) {
            this.f10130k.valueAt(i12).K(this.f10123d);
        }
    }

    public boolean H(View view) {
        if (view == null || !this.f10129j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f10129j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(19)
    public FlutterOverlaySurface L() {
        return M(new b(this.f10123d.getContext(), this.f10123d.getWidth(), this.f10123d.getHeight(), this.f10127h));
    }

    @TargetApi(19)
    public FlutterOverlaySurface M(b bVar) {
        int i10 = this.f10134o;
        this.f10134o = i10 + 1;
        this.f10132m.put(i10, bVar);
        return new FlutterOverlaySurface(i10, bVar.getSurface());
    }

    @TargetApi(19)
    public f N(l.d dVar, boolean z9) {
        g b10 = this.f10120a.b(dVar.f9921b);
        if (b10 != null) {
            Object obj = null;
            if (dVar.f9928i != null) {
                obj = b10.b().b(dVar.f9928i);
            }
            f a10 = b10.a(z9 ? new MutableContextWrapper(this.f10122c) : this.f10122c, dVar.f9920a, obj);
            View I = a10.I();
            if (I != null) {
                I.setLayoutDirection(dVar.f9926g);
                this.f10130k.put(dVar.f9920a, a10);
                f0(a10);
                return a10;
            }
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f9921b);
    }

    public void O() {
        for (int i10 = 0; i10 < this.f10132m.size(); i10++) {
            b valueAt = this.f10132m.valueAt(i10);
            valueAt.d();
            valueAt.f();
        }
    }

    public void P() {
        l lVar = this.f10126g;
        if (lVar != null) {
            lVar.e((l.g) null);
        }
        O();
        this.f10126g = null;
        this.f10122c = null;
        this.f10124e = null;
    }

    public void Q() {
        for (int i10 = 0; i10 < this.f10133n.size(); i10++) {
            this.f10123d.removeView(this.f10133n.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.f10131l.size(); i11++) {
            this.f10123d.removeView(this.f10131l.valueAt(i11));
        }
        O();
        r0();
        this.f10123d = null;
        this.f10135p = false;
        for (int i12 = 0; i12 < this.f10130k.size(); i12++) {
            this.f10130k.valueAt(i12).O();
        }
    }

    public void R() {
        this.f10125f = null;
    }

    public h X() {
        return this.f10120a;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(19)
    public void Y(int i10) {
        f fVar = this.f10130k.get(i10);
        if (fVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        } else if (this.f10131l.get(i10) == null) {
            View I = fVar.I();
            if (I == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            } else if (I.getParent() == null) {
                Context context = this.f10122c;
                b7.a aVar = new b7.a(context, context.getResources().getDisplayMetrics().density, this.f10121b);
                aVar.setOnDescendantFocusChangeListener(new l(this, i10));
                this.f10131l.put(i10, aVar);
                I.setImportantForAccessibility(4);
                aVar.addView(I);
                this.f10123d.addView(aVar);
            } else {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
        }
    }

    public void a(c cVar) {
        this.f10127h.c(cVar);
    }

    public boolean b(int i10) {
        return this.f10128i.containsKey(Integer.valueOf(i10));
    }

    public View c(int i10) {
        if (b(i10)) {
            return this.f10128i.get(Integer.valueOf(i10)).e();
        }
        f fVar = this.f10130k.get(i10);
        if (fVar == null) {
            return null;
        }
        return fVar.I();
    }

    public void d() {
        this.f10127h.c((c) null);
    }

    public void g0() {
    }

    public void h0() {
        this.f10137r.clear();
        this.f10138s.clear();
    }

    public void i0() {
        S();
    }

    public void j0(int i10, int i11, int i12, int i13, int i14) {
        if (this.f10132m.get(i10) != null) {
            Z();
            b bVar = this.f10132m.get(i10);
            if (bVar.getParent() == null) {
                this.f10123d.addView(bVar);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
            layoutParams.leftMargin = i11;
            layoutParams.topMargin = i12;
            bVar.setLayoutParams(layoutParams);
            bVar.setVisibility(0);
            bVar.bringToFront();
            this.f10137r.add(Integer.valueOf(i10));
            return;
        }
        throw new IllegalStateException("The overlay surface (id:" + i10 + ") doesn't exist");
    }

    public void k0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        Z();
        Y(i10);
        b7.a aVar = this.f10131l.get(i10);
        aVar.a(flutterMutatorsStack, i11, i12, i13, i14);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i16);
        View I = this.f10130k.get(i10).I();
        if (I != null) {
            I.setLayoutParams(layoutParams);
            I.bringToFront();
        }
        this.f10138s.add(Integer.valueOf(i10));
    }

    public void l0() {
        boolean z9 = false;
        if (!this.f10135p || !this.f10138s.isEmpty()) {
            if (this.f10135p && this.f10123d.k()) {
                z9 = true;
            }
            V(z9);
            return;
        }
        this.f10135p = false;
        this.f10123d.D(new o(this));
    }

    public void m0() {
        S();
    }

    public void s0(boolean z9) {
        this.f10140u = z9;
    }

    public MotionEvent v0(float f10, l.f fVar, boolean z9) {
        l.f fVar2 = fVar;
        MotionEvent b10 = this.f10139t.b(u.a.c(fVar2.f9947p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) q0(fVar2.f9937f).toArray(new MotionEvent.PointerProperties[fVar2.f9936e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) o0(fVar2.f9938g, f10).toArray(new MotionEvent.PointerCoords[fVar2.f9936e]);
        if (!z9 && b10 != null) {
            return MotionEvent.obtain(b10.getDownTime(), b10.getEventTime(), fVar2.f9935d, fVar2.f9936e, pointerPropertiesArr, pointerCoordsArr, b10.getMetaState(), b10.getButtonState(), b10.getXPrecision(), b10.getYPrecision(), b10.getDeviceId(), b10.getEdgeFlags(), b10.getSource(), b10.getFlags());
        }
        return MotionEvent.obtain(fVar2.f9933b.longValue(), fVar2.f9934c.longValue(), fVar2.f9935d, fVar2.f9936e, pointerPropertiesArr, pointerCoordsArr, fVar2.f9939h, fVar2.f9940i, fVar2.f9941j, fVar2.f9942k, fVar2.f9943l, fVar2.f9944m, fVar2.f9945n, fVar2.f9946o);
    }
}
