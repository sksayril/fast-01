package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p.h;

public final class q0 {

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f1020h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    private static q0 f1021i;

    /* renamed from: j  reason: collision with root package name */
    private static final c f1022j = new c(6);

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, h<ColorStateList>> f1023a;

    /* renamed from: b  reason: collision with root package name */
    private p.g<String, e> f1024b;

    /* renamed from: c  reason: collision with root package name */
    private h<String> f1025c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, p.d<WeakReference<Drawable.ConstantState>>> f1026d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1027e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1028f;

    /* renamed from: g  reason: collision with root package name */
    private f f1029g;

    static class a implements e {
        a() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return h.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    private static class b implements e {
        b() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    private static class c extends p.e<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        private static int j(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i10, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter l(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i10, mode)), porterDuffColorFilter);
        }
    }

    static class d implements e {
        d() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    i.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    private interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(q0 q0Var, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private static class g implements e {
        g() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.g.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f1024b == null) {
            this.f1024b = new p.g<>();
        }
        this.f1024b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j10, Drawable drawable) {
        boolean z9;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            p.d dVar = this.f1026d.get(context);
            if (dVar == null) {
                dVar = new p.d();
                this.f1026d.put(context, dVar);
            }
            dVar.p(j10, new WeakReference(constantState));
            z9 = true;
        } else {
            z9 = false;
        }
        return z9;
    }

    private void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1023a == null) {
            this.f1023a = new WeakHashMap<>();
        }
        h hVar = this.f1023a.get(context);
        if (hVar == null) {
            hVar = new h();
            this.f1023a.put(context, hVar);
        }
        hVar.b(i10, colorStateList);
    }

    private void d(Context context) {
        if (!this.f1028f) {
            this.f1028f = true;
            Drawable j10 = j(context, i.d.abc_vector_test);
            if (j10 == null || !q(j10)) {
                this.f1028f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable f(Context context, int i10) {
        if (this.f1027e == null) {
            this.f1027e = new TypedValue();
        }
        TypedValue typedValue = this.f1027e;
        context.getResources().getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        f fVar = this.f1029g;
        Drawable c10 = fVar == null ? null : fVar.c(this, context, i10);
        if (c10 != null) {
            c10.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e10, c10);
        }
        return c10;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized q0 h() {
        q0 q0Var;
        synchronized (q0.class) {
            if (f1021i == null) {
                q0 q0Var2 = new q0();
                f1021i = q0Var2;
                p(q0Var2);
            }
            q0Var = f1021i;
        }
        return q0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, p.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1026d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            p.d r0 = (p.d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.h(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.q(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q0.i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter k10;
        synchronized (q0.class) {
            c cVar = f1022j;
            k10 = cVar.k(i10, mode);
            if (k10 == null) {
                k10 = new PorterDuffColorFilter(i10, mode);
                cVar.l(i10, mode, k10);
            }
        }
        return k10;
    }

    private ColorStateList n(Context context, int i10) {
        h hVar;
        WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.f1023a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.h(i10);
    }

    private static void p(q0 q0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            q0Var.a("vector", new g());
            q0Var.a("animated-vector", new b());
            q0Var.a("animated-selector", new a());
            q0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            p.g<java.lang.String, androidx.appcompat.widget.q0$e> r0 = r10.f1024b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            p.h<java.lang.String> r0 = r10.f1025c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.h(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            p.g<java.lang.String, androidx.appcompat.widget.q0$e> r3 = r10.f1024b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            p.h r0 = new p.h
            r0.<init>()
            r10.f1025c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1027e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1027e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1027e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = e(r0)
            android.graphics.drawable.Drawable r6 = r10.i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            p.h<java.lang.String> r8 = r10.f1025c     // Catch:{ Exception -> 0x00a2 }
            r8.b(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            p.g<java.lang.String, androidx.appcompat.widget.q0$e> r8 = r10.f1024b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.q0$e r3 = (androidx.appcompat.widget.q0.e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            p.h<java.lang.String> r11 = r10.f1025c
            r11.b(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q0.r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable v(Context context, int i10, boolean z9, Drawable drawable) {
        ColorStateList m10 = m(context, i10);
        if (m10 != null) {
            if (i0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable q9 = androidx.core.graphics.drawable.a.q(drawable);
            androidx.core.graphics.drawable.a.o(q9, m10);
            PorterDuff.Mode o10 = o(i10);
            if (o10 == null) {
                return q9;
            }
            androidx.core.graphics.drawable.a.p(q9, o10);
            return q9;
        }
        f fVar = this.f1029g;
        if ((fVar == null || !fVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z9) {
            return null;
        }
        return drawable;
    }

    static void w(Drawable drawable, y0 y0Var, int[] iArr) {
        if (!i0.a(drawable) || drawable.mutate() == drawable) {
            boolean z9 = y0Var.f1102d;
            if (z9 || y0Var.f1101c) {
                drawable.setColorFilter(g(z9 ? y0Var.f1099a : null, y0Var.f1101c ? y0Var.f1100b : f1020h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i10, boolean z9) {
        Drawable r9;
        d(context);
        r9 = r(context, i10);
        if (r9 == null) {
            r9 = f(context, i10);
        }
        if (r9 == null) {
            r9 = androidx.core.content.a.e(context, i10);
        }
        if (r9 != null) {
            r9 = v(context, i10, z9, r9);
        }
        if (r9 != null) {
            i0.b(r9);
        }
        return r9;
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i10) {
        ColorStateList n10;
        n10 = n(context, i10);
        if (n10 == null) {
            f fVar = this.f1029g;
            n10 = fVar == null ? null : fVar.d(context, i10);
            if (n10 != null) {
                c(context, i10, n10);
            }
        }
        return n10;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode o(int i10) {
        f fVar = this.f1029g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i10);
    }

    public synchronized void s(Context context) {
        p.d dVar = this.f1026d.get(context);
        if (dVar != null) {
            dVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, g1 g1Var, int i10) {
        Drawable r9 = r(context, i10);
        if (r9 == null) {
            r9 = g1Var.a(i10);
        }
        if (r9 == null) {
            return null;
        }
        return v(context, i10, false, r9);
    }

    public synchronized void u(f fVar) {
        this.f1029g = fVar;
    }

    /* access modifiers changed from: package-private */
    public boolean x(Context context, int i10, Drawable drawable) {
        f fVar = this.f1029g;
        return fVar != null && fVar.a(context, i10, drawable);
    }
}
