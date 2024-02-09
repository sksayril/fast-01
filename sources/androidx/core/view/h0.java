package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class h0 {

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f1753b = (Build.VERSION.SDK_INT >= 30 ? k.f1783q : l.f1784b);

    /* renamed from: a  reason: collision with root package name */
    private final l f1754a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f1755a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f1756b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f1757c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f1758d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f1755a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f1756b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f1757c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static h0 a(View view) {
            if (f1758d && view.isAttachedToWindow()) {
                try {
                    Object obj = f1755a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f1756b.get(obj);
                        Rect rect2 = (Rect) f1757c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            h0 a10 = new b().b(androidx.core.graphics.b.c(rect)).c(androidx.core.graphics.b.c(rect2)).a();
                            a10.s(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f1759a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f1759a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : new c();
        }

        public b(h0 h0Var) {
            int i10 = Build.VERSION.SDK_INT;
            this.f1759a = i10 >= 30 ? new e(h0Var) : i10 >= 29 ? new d(h0Var) : new c(h0Var);
        }

        public h0 a() {
            return this.f1759a.b();
        }

        @Deprecated
        public b b(androidx.core.graphics.b bVar) {
            this.f1759a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.b bVar) {
            this.f1759a.f(bVar);
            return this;
        }
    }

    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f1760e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f1761f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f1762g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f1763h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f1764c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b f1765d;

        c() {
            this.f1764c = h();
        }

        c(h0 h0Var) {
            super(h0Var);
            this.f1764c = h0Var.u();
        }

        private static WindowInsets h() {
            if (!f1761f) {
                try {
                    f1760e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f1761f = true;
            }
            Field field = f1760e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f1763h) {
                try {
                    f1762g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f1763h = true;
            }
            Constructor<WindowInsets> constructor = f1762g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public h0 b() {
            a();
            h0 v9 = h0.v(this.f1764c);
            v9.q(this.f1768b);
            v9.t(this.f1765d);
            return v9;
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.b bVar) {
            this.f1765d = bVar;
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f1764c;
            if (windowInsets != null) {
                this.f1764c = windowInsets.replaceSystemWindowInsets(bVar.f1452a, bVar.f1453b, bVar.f1454c, bVar.f1455d);
            }
        }
    }

    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f1766c;

        d() {
            this.f1766c = new WindowInsets.Builder();
        }

        d(h0 h0Var) {
            super(h0Var);
            WindowInsets.Builder builder;
            WindowInsets u9 = h0Var.u();
            if (u9 == null) {
                builder = new WindowInsets.Builder();
            }
            this.f1766c = builder;
        }

        /* access modifiers changed from: package-private */
        public h0 b() {
            a();
            h0 v9 = h0.v(this.f1766c.build());
            v9.q(this.f1768b);
            return v9;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.core.graphics.b bVar) {
            this.f1766c.setMandatorySystemGestureInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.b bVar) {
            this.f1766c.setStableInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.core.graphics.b bVar) {
            this.f1766c.setSystemGestureInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.b bVar) {
            this.f1766c.setSystemWindowInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void g(androidx.core.graphics.b bVar) {
            this.f1766c.setTappableElementInsets(bVar.e());
        }
    }

    private static class e extends d {
        e() {
        }

        e(h0 h0Var) {
            super(h0Var);
        }
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private final h0 f1767a;

        /* renamed from: b  reason: collision with root package name */
        androidx.core.graphics.b[] f1768b;

        f() {
            this(new h0((h0) null));
        }

        f(h0 h0Var) {
            this.f1767a = h0Var;
        }

        /* access modifiers changed from: protected */
        public final void a() {
            androidx.core.graphics.b[] bVarArr = this.f1768b;
            if (bVarArr != null) {
                androidx.core.graphics.b bVar = bVarArr[m.b(1)];
                androidx.core.graphics.b bVar2 = this.f1768b[m.b(2)];
                if (bVar2 == null) {
                    bVar2 = this.f1767a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f1767a.f(1);
                }
                f(androidx.core.graphics.b.a(bVar, bVar2));
                androidx.core.graphics.b bVar3 = this.f1768b[m.b(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                androidx.core.graphics.b bVar4 = this.f1768b[m.b(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                androidx.core.graphics.b bVar5 = this.f1768b[m.b(64)];
                if (bVar5 != null) {
                    g(bVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public h0 b() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.core.graphics.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.b bVar) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.core.graphics.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.b bVar) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void g(androidx.core.graphics.b bVar) {
        }
    }

    private static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f1769h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f1770i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f1771j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f1772k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f1773l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f1774c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b[] f1775d;

        /* renamed from: e  reason: collision with root package name */
        private androidx.core.graphics.b f1776e;

        /* renamed from: f  reason: collision with root package name */
        private h0 f1777f;

        /* renamed from: g  reason: collision with root package name */
        androidx.core.graphics.b f1778g;

        g(h0 h0Var, WindowInsets windowInsets) {
            super(h0Var);
            this.f1776e = null;
            this.f1774c = windowInsets;
        }

        g(h0 h0Var, g gVar) {
            this(h0Var, new WindowInsets(gVar.f1774c));
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.b u(int i10, boolean z9) {
            androidx.core.graphics.b bVar = androidx.core.graphics.b.f1451e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = androidx.core.graphics.b.a(bVar, v(i11, z9));
                }
            }
            return bVar;
        }

        private androidx.core.graphics.b w() {
            h0 h0Var = this.f1777f;
            return h0Var != null ? h0Var.g() : androidx.core.graphics.b.f1451e;
        }

        private androidx.core.graphics.b x(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f1769h) {
                    z();
                }
                Method method = f1770i;
                if (!(method == null || f1771j == null || f1772k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f1772k.get(f1773l.get(invoke));
                        if (rect != null) {
                            return androidx.core.graphics.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void z() {
            try {
                f1770i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f1771j = cls;
                f1772k = cls.getDeclaredField("mVisibleInsets");
                f1773l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f1772k.setAccessible(true);
                f1773l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f1769h = true;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            androidx.core.graphics.b x9 = x(view);
            if (x9 == null) {
                x9 = androidx.core.graphics.b.f1451e;
            }
            r(x9);
        }

        /* access modifiers changed from: package-private */
        public void e(h0 h0Var) {
            h0Var.s(this.f1777f);
            h0Var.r(this.f1778g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f1778g, ((g) obj).f1778g);
        }

        public androidx.core.graphics.b g(int i10) {
            return u(i10, false);
        }

        /* access modifiers changed from: package-private */
        public final androidx.core.graphics.b k() {
            if (this.f1776e == null) {
                this.f1776e = androidx.core.graphics.b.b(this.f1774c.getSystemWindowInsetLeft(), this.f1774c.getSystemWindowInsetTop(), this.f1774c.getSystemWindowInsetRight(), this.f1774c.getSystemWindowInsetBottom());
            }
            return this.f1776e;
        }

        /* access modifiers changed from: package-private */
        public h0 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(h0.v(this.f1774c));
            bVar.c(h0.m(k(), i10, i11, i12, i13));
            bVar.b(h0.m(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return this.f1774c.isRound();
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean p(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !y(i11)) {
                    return false;
                }
            }
            return true;
        }

        public void q(androidx.core.graphics.b[] bVarArr) {
            this.f1775d = bVarArr;
        }

        /* access modifiers changed from: package-private */
        public void r(androidx.core.graphics.b bVar) {
            this.f1778g = bVar;
        }

        /* access modifiers changed from: package-private */
        public void s(h0 h0Var) {
            this.f1777f = h0Var;
        }

        /* access modifiers changed from: protected */
        public androidx.core.graphics.b v(int i10, boolean z9) {
            int i11;
            if (i10 == 1) {
                return z9 ? androidx.core.graphics.b.b(0, Math.max(w().f1453b, k().f1453b), 0, 0) : androidx.core.graphics.b.b(0, k().f1453b, 0, 0);
            }
            androidx.core.graphics.b bVar = null;
            if (i10 != 2) {
                if (i10 == 8) {
                    androidx.core.graphics.b[] bVarArr = this.f1775d;
                    if (bVarArr != null) {
                        bVar = bVarArr[m.b(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    androidx.core.graphics.b k10 = k();
                    androidx.core.graphics.b w9 = w();
                    int i12 = k10.f1455d;
                    if (i12 > w9.f1455d) {
                        return androidx.core.graphics.b.b(0, 0, 0, i12);
                    }
                    androidx.core.graphics.b bVar2 = this.f1778g;
                    return (bVar2 == null || bVar2.equals(androidx.core.graphics.b.f1451e) || (i11 = this.f1778g.f1455d) <= w9.f1455d) ? androidx.core.graphics.b.f1451e : androidx.core.graphics.b.b(0, 0, 0, i11);
                } else if (i10 == 16) {
                    return j();
                } else {
                    if (i10 == 32) {
                        return h();
                    }
                    if (i10 == 64) {
                        return l();
                    }
                    if (i10 != 128) {
                        return androidx.core.graphics.b.f1451e;
                    }
                    h0 h0Var = this.f1777f;
                    d e10 = h0Var != null ? h0Var.e() : f();
                    return e10 != null ? androidx.core.graphics.b.b(e10.b(), e10.d(), e10.c(), e10.a()) : androidx.core.graphics.b.f1451e;
                }
            } else if (z9) {
                androidx.core.graphics.b w10 = w();
                androidx.core.graphics.b i13 = i();
                return androidx.core.graphics.b.b(Math.max(w10.f1452a, i13.f1452a), 0, Math.max(w10.f1454c, i13.f1454c), Math.max(w10.f1455d, i13.f1455d));
            } else {
                androidx.core.graphics.b k11 = k();
                h0 h0Var2 = this.f1777f;
                if (h0Var2 != null) {
                    bVar = h0Var2.g();
                }
                int i14 = k11.f1455d;
                if (bVar != null) {
                    i14 = Math.min(i14, bVar.f1455d);
                }
                return androidx.core.graphics.b.b(k11.f1452a, 0, k11.f1454c, i14);
            }
        }

        /* access modifiers changed from: protected */
        public boolean y(int i10) {
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 4) {
                    return false;
                }
                if (!(i10 == 8 || i10 == 128)) {
                    return true;
                }
            }
            return !v(i10, false).equals(androidx.core.graphics.b.f1451e);
        }
    }

    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private androidx.core.graphics.b f1779m = null;

        h(h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
        }

        h(h0 h0Var, h hVar) {
            super(h0Var, (g) hVar);
            this.f1779m = hVar.f1779m;
        }

        /* access modifiers changed from: package-private */
        public h0 b() {
            return h0.v(this.f1774c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        public h0 c() {
            return h0.v(this.f1774c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        public final androidx.core.graphics.b i() {
            if (this.f1779m == null) {
                this.f1779m = androidx.core.graphics.b.b(this.f1774c.getStableInsetLeft(), this.f1774c.getStableInsetTop(), this.f1774c.getStableInsetRight(), this.f1774c.getStableInsetBottom());
            }
            return this.f1779m;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return this.f1774c.isConsumed();
        }

        public void t(androidx.core.graphics.b bVar) {
            this.f1779m = bVar;
        }
    }

    private static class i extends h {
        i(h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
        }

        i(h0 h0Var, i iVar) {
            super(h0Var, (h) iVar);
        }

        /* access modifiers changed from: package-private */
        public h0 a() {
            return h0.v(this.f1774c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f1774c, iVar.f1774c) && Objects.equals(this.f1778g, iVar.f1778g);
        }

        /* access modifiers changed from: package-private */
        public d f() {
            return d.e(this.f1774c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f1774c.hashCode();
        }
    }

    private static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        private androidx.core.graphics.b f1780n = null;

        /* renamed from: o  reason: collision with root package name */
        private androidx.core.graphics.b f1781o = null;

        /* renamed from: p  reason: collision with root package name */
        private androidx.core.graphics.b f1782p = null;

        j(h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
        }

        j(h0 h0Var, j jVar) {
            super(h0Var, (i) jVar);
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b h() {
            if (this.f1781o == null) {
                this.f1781o = androidx.core.graphics.b.d(this.f1774c.getMandatorySystemGestureInsets());
            }
            return this.f1781o;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b j() {
            if (this.f1780n == null) {
                this.f1780n = androidx.core.graphics.b.d(this.f1774c.getSystemGestureInsets());
            }
            return this.f1780n;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b l() {
            if (this.f1782p == null) {
                this.f1782p = androidx.core.graphics.b.d(this.f1774c.getTappableElementInsets());
            }
            return this.f1782p;
        }

        /* access modifiers changed from: package-private */
        public h0 m(int i10, int i11, int i12, int i13) {
            return h0.v(this.f1774c.inset(i10, i11, i12, i13));
        }

        public void t(androidx.core.graphics.b bVar) {
        }
    }

    private static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        static final h0 f1783q = h0.v(WindowInsets.CONSUMED);

        k(h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
        }

        k(h0 h0Var, k kVar) {
            super(h0Var, (j) kVar);
        }

        /* access modifiers changed from: package-private */
        public final void d(View view) {
        }

        public androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.d(this.f1774c.getInsets(n.a(i10)));
        }

        public boolean p(int i10) {
            return this.f1774c.isVisible(n.a(i10));
        }
    }

    private static class l {

        /* renamed from: b  reason: collision with root package name */
        static final h0 f1784b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final h0 f1785a;

        l(h0 h0Var) {
            this.f1785a = h0Var;
        }

        /* access modifiers changed from: package-private */
        public h0 a() {
            return this.f1785a;
        }

        /* access modifiers changed from: package-private */
        public h0 b() {
            return this.f1785a;
        }

        /* access modifiers changed from: package-private */
        public h0 c() {
            return this.f1785a;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
        }

        /* access modifiers changed from: package-private */
        public void e(h0 h0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && androidx.core.util.c.a(k(), lVar.k()) && androidx.core.util.c.a(i(), lVar.i()) && androidx.core.util.c.a(f(), lVar.f());
        }

        /* access modifiers changed from: package-private */
        public d f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.f1451e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b i() {
            return androidx.core.graphics.b.f1451e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b j() {
            return k();
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b k() {
            return androidx.core.graphics.b.f1451e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b l() {
            return k();
        }

        /* access modifiers changed from: package-private */
        public h0 m(int i10, int i11, int i12, int i13) {
            return f1784b;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean p(int i10) {
            return true;
        }

        public void q(androidx.core.graphics.b[] bVarArr) {
        }

        /* access modifiers changed from: package-private */
        public void r(androidx.core.graphics.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void s(h0 h0Var) {
        }

        public void t(androidx.core.graphics.b bVar) {
        }
    }

    public static final class m {
        public static int a() {
            return 8;
        }

        static int b(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }
    }

    private static final class n {
        static int a(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i10 & i13) != 0) {
                    if (i13 == 1) {
                        i11 = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        i11 = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        i11 = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        i11 = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        i11 = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        i11 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        i11 = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        i11 = WindowInsets.Type.displayCutout();
                    }
                    i12 |= i11;
                }
            }
            return i12;
        }
    }

    private h0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f1754a = i10 >= 30 ? new k(this, windowInsets) : i10 >= 29 ? new j(this, windowInsets) : i10 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public h0(h0 h0Var) {
        if (h0Var != null) {
            l lVar = h0Var.f1754a;
            int i10 = Build.VERSION.SDK_INT;
            this.f1754a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
            lVar.e(this);
            return;
        }
        this.f1754a = new l(this);
    }

    static androidx.core.graphics.b m(androidx.core.graphics.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f1452a - i10);
        int max2 = Math.max(0, bVar.f1453b - i11);
        int max3 = Math.max(0, bVar.f1454c - i12);
        int max4 = Math.max(0, bVar.f1455d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : androidx.core.graphics.b.b(max, max2, max3, max4);
    }

    public static h0 v(WindowInsets windowInsets) {
        return w(windowInsets, (View) null);
    }

    public static h0 w(WindowInsets windowInsets, View view) {
        h0 h0Var = new h0((WindowInsets) androidx.core.util.h.j(windowInsets));
        if (view != null && x.O(view)) {
            h0Var.s(x.F(view));
            h0Var.d(view.getRootView());
        }
        return h0Var;
    }

    @Deprecated
    public h0 a() {
        return this.f1754a.a();
    }

    @Deprecated
    public h0 b() {
        return this.f1754a.b();
    }

    @Deprecated
    public h0 c() {
        return this.f1754a.c();
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        this.f1754a.d(view);
    }

    public d e() {
        return this.f1754a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        return androidx.core.util.c.a(this.f1754a, ((h0) obj).f1754a);
    }

    public androidx.core.graphics.b f(int i10) {
        return this.f1754a.g(i10);
    }

    @Deprecated
    public androidx.core.graphics.b g() {
        return this.f1754a.i();
    }

    @Deprecated
    public int h() {
        return this.f1754a.k().f1455d;
    }

    public int hashCode() {
        l lVar = this.f1754a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f1754a.k().f1452a;
    }

    @Deprecated
    public int j() {
        return this.f1754a.k().f1454c;
    }

    @Deprecated
    public int k() {
        return this.f1754a.k().f1453b;
    }

    public h0 l(int i10, int i11, int i12, int i13) {
        return this.f1754a.m(i10, i11, i12, i13);
    }

    public boolean n() {
        return this.f1754a.n();
    }

    public boolean o(int i10) {
        return this.f1754a.p(i10);
    }

    @Deprecated
    public h0 p(int i10, int i11, int i12, int i13) {
        return new b(this).c(androidx.core.graphics.b.b(i10, i11, i12, i13)).a();
    }

    /* access modifiers changed from: package-private */
    public void q(androidx.core.graphics.b[] bVarArr) {
        this.f1754a.q(bVarArr);
    }

    /* access modifiers changed from: package-private */
    public void r(androidx.core.graphics.b bVar) {
        this.f1754a.r(bVar);
    }

    /* access modifiers changed from: package-private */
    public void s(h0 h0Var) {
        this.f1754a.s(h0Var);
    }

    /* access modifiers changed from: package-private */
    public void t(androidx.core.graphics.b bVar) {
        this.f1754a.t(bVar);
    }

    public WindowInsets u() {
        l lVar = this.f1754a;
        if (lVar instanceof g) {
            return ((g) lVar).f1774c;
        }
        return null;
    }
}
