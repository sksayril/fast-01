package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

class b extends Drawable implements Drawable.Callback {

    /* renamed from: m  reason: collision with root package name */
    private d f9057m;

    /* renamed from: n  reason: collision with root package name */
    private Rect f9058n;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f9059o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f9060p;

    /* renamed from: q  reason: collision with root package name */
    private int f9061q = 255;

    /* renamed from: r  reason: collision with root package name */
    private boolean f9062r;

    /* renamed from: s  reason: collision with root package name */
    private int f9063s = -1;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9064t;

    /* renamed from: u  reason: collision with root package name */
    private Runnable f9065u;

    /* renamed from: v  reason: collision with root package name */
    private long f9066v;

    /* renamed from: w  reason: collision with root package name */
    private long f9067w;

    /* renamed from: x  reason: collision with root package name */
    private c f9068x;

    class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: h.b$b  reason: collision with other inner class name */
    private static class C0141b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    static class c implements Drawable.Callback {

        /* renamed from: m  reason: collision with root package name */
        private Drawable.Callback f9070m;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f9070m;
            this.f9070m = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f9070m = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f9070m;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f9070m;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class d extends Drawable.ConstantState {
        int A = 0;
        int B = 0;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f9071a;

        /* renamed from: b  reason: collision with root package name */
        Resources f9072b;

        /* renamed from: c  reason: collision with root package name */
        int f9073c;

        /* renamed from: d  reason: collision with root package name */
        int f9074d;

        /* renamed from: e  reason: collision with root package name */
        int f9075e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f9076f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f9077g;

        /* renamed from: h  reason: collision with root package name */
        int f9078h;

        /* renamed from: i  reason: collision with root package name */
        boolean f9079i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f9080j;

        /* renamed from: k  reason: collision with root package name */
        Rect f9081k;

        /* renamed from: l  reason: collision with root package name */
        boolean f9082l = false;

        /* renamed from: m  reason: collision with root package name */
        boolean f9083m;

        /* renamed from: n  reason: collision with root package name */
        int f9084n;

        /* renamed from: o  reason: collision with root package name */
        int f9085o;

        /* renamed from: p  reason: collision with root package name */
        int f9086p;

        /* renamed from: q  reason: collision with root package name */
        int f9087q;

        /* renamed from: r  reason: collision with root package name */
        boolean f9088r;

        /* renamed from: s  reason: collision with root package name */
        int f9089s;

        /* renamed from: t  reason: collision with root package name */
        boolean f9090t;

        /* renamed from: u  reason: collision with root package name */
        boolean f9091u;

        /* renamed from: v  reason: collision with root package name */
        boolean f9092v;

        /* renamed from: w  reason: collision with root package name */
        boolean f9093w;

        /* renamed from: x  reason: collision with root package name */
        boolean f9094x = true;

        /* renamed from: y  reason: collision with root package name */
        boolean f9095y;

        /* renamed from: z  reason: collision with root package name */
        int f9096z;

        d(d dVar, b bVar, Resources resources) {
            this.f9071a = bVar;
            Rect rect = null;
            this.f9072b = resources != null ? resources : dVar != null ? dVar.f9072b : null;
            int f10 = b.f(resources, dVar != null ? dVar.f9073c : 0);
            this.f9073c = f10;
            if (dVar != null) {
                this.f9074d = dVar.f9074d;
                this.f9075e = dVar.f9075e;
                this.f9092v = true;
                this.f9093w = true;
                this.f9079i = dVar.f9079i;
                this.f9082l = dVar.f9082l;
                this.f9094x = dVar.f9094x;
                this.f9095y = dVar.f9095y;
                this.f9096z = dVar.f9096z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.f9073c == f10) {
                    if (dVar.f9080j) {
                        this.f9081k = dVar.f9081k != null ? new Rect(dVar.f9081k) : rect;
                        this.f9080j = true;
                    }
                    if (dVar.f9083m) {
                        this.f9084n = dVar.f9084n;
                        this.f9085o = dVar.f9085o;
                        this.f9086p = dVar.f9086p;
                        this.f9087q = dVar.f9087q;
                        this.f9083m = true;
                    }
                }
                if (dVar.f9088r) {
                    this.f9089s = dVar.f9089s;
                    this.f9088r = true;
                }
                if (dVar.f9090t) {
                    this.f9091u = dVar.f9091u;
                    this.f9090t = true;
                }
                Drawable[] drawableArr = dVar.f9077g;
                this.f9077g = new Drawable[drawableArr.length];
                this.f9078h = dVar.f9078h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f9076f;
                this.f9076f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f9078h);
                int i10 = this.f9078h;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null) {
                        Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                        if (constantState != null) {
                            this.f9076f.put(i11, constantState);
                        } else {
                            this.f9077g[i11] = drawableArr[i11];
                        }
                    }
                }
                return;
            }
            this.f9077g = new Drawable[10];
            this.f9078h = 0;
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f9076f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f9077g[this.f9076f.keyAt(i10)] = s(this.f9076f.valueAt(i10).newDrawable(this.f9072b));
                }
                this.f9076f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, this.f9096z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f9071a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f9078h;
            if (i10 >= this.f9077g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f9071a);
            this.f9077g[i10] = drawable;
            this.f9078h++;
            this.f9075e = drawable.getChangingConfigurations() | this.f9075e;
            p();
            this.f9081k = null;
            this.f9080j = false;
            this.f9083m = false;
            this.f9092v = false;
            return i10;
        }

        /* access modifiers changed from: package-private */
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f9078h;
                Drawable[] drawableArr = this.f9077g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && androidx.core.graphics.drawable.a.b(drawableArr[i11])) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i11], theme);
                        this.f9075e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(C0141b.c(theme));
            }
        }

        public boolean c() {
            if (this.f9092v) {
                return this.f9093w;
            }
            e();
            this.f9092v = true;
            int i10 = this.f9078h;
            Drawable[] drawableArr = this.f9077g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f9093w = false;
                    return false;
                }
            }
            this.f9093w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i10 = this.f9078h;
            Drawable[] drawableArr = this.f9077g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f9076f.get(i11);
                    if (constantState != null && C0141b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void d() {
            this.f9083m = true;
            e();
            int i10 = this.f9078h;
            Drawable[] drawableArr = this.f9077g;
            this.f9085o = -1;
            this.f9084n = -1;
            this.f9087q = 0;
            this.f9086p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f9084n) {
                    this.f9084n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f9085o) {
                    this.f9085o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f9086p) {
                    this.f9086p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f9087q) {
                    this.f9087q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int f() {
            return this.f9077g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f9077g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f9076f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s9 = s(this.f9076f.valueAt(indexOfKey).newDrawable(this.f9072b));
            this.f9077g[i10] = s9;
            this.f9076f.removeAt(indexOfKey);
            if (this.f9076f.size() == 0) {
                this.f9076f = null;
            }
            return s9;
        }

        public int getChangingConfigurations() {
            return this.f9074d | this.f9075e;
        }

        public final int h() {
            return this.f9078h;
        }

        public final int i() {
            if (!this.f9083m) {
                d();
            }
            return this.f9085o;
        }

        public final int j() {
            if (!this.f9083m) {
                d();
            }
            return this.f9087q;
        }

        public final int k() {
            if (!this.f9083m) {
                d();
            }
            return this.f9086p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f9079i) {
                return null;
            }
            Rect rect2 = this.f9081k;
            if (rect2 != null || this.f9080j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f9078h;
            Drawable[] drawableArr = this.f9077g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f9080j = true;
            this.f9081k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f9083m) {
                d();
            }
            return this.f9084n;
        }

        public final int n() {
            if (this.f9088r) {
                return this.f9089s;
            }
            e();
            int i10 = this.f9078h;
            Drawable[] drawableArr = this.f9077g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f9089s = opacity;
            this.f9088r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f9077g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f9077g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            this.f9088r = false;
            this.f9090t = false;
        }

        public final boolean q() {
            return this.f9082l;
        }

        /* access modifiers changed from: package-private */
        public abstract void r();

        public final void t(boolean z9) {
            this.f9082l = z9;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        /* access modifiers changed from: package-private */
        public final boolean w(int i10, int i11) {
            int i12 = this.f9078h;
            Drawable[] drawableArr = this.f9077g;
            boolean z9 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean m10 = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.m(drawableArr[i13], i10) : false;
                    if (i13 == i11) {
                        z9 = m10;
                    }
                }
            }
            this.f9096z = i10;
            return z9;
        }

        public final void x(boolean z9) {
            this.f9079i = z9;
        }

        /* access modifiers changed from: package-private */
        public final void y(Resources resources) {
            if (resources != null) {
                this.f9072b = resources;
                int f10 = b.f(resources, this.f9073c);
                int i10 = this.f9073c;
                this.f9073c = f10;
                if (i10 != f10) {
                    this.f9083m = false;
                    this.f9080j = false;
                }
            }
        }
    }

    b() {
    }

    private void d(Drawable drawable) {
        if (this.f9068x == null) {
            this.f9068x = new c();
        }
        drawable.setCallback(this.f9068x.b(drawable.getCallback()));
        try {
            if (this.f9057m.A <= 0 && this.f9062r) {
                drawable.setAlpha(this.f9061q);
            }
            d dVar = this.f9057m;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f9057m;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f9057m.f9094x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            }
            androidx.core.graphics.drawable.a.j(drawable, this.f9057m.C);
            Rect rect = this.f9058n;
            if (rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f9068x.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f9062r = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f9059o
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f9066v
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f9061q
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            h.b$d r9 = r13.f9057m
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f9061q
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f9066v = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f9060p
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f9067w
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f9060p = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b$d r4 = r13.f9057m
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f9061q
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f9067w = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f9065u
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f9057m.b(theme);
    }

    /* access modifiers changed from: package-private */
    public d b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f9063s;
    }

    public boolean canApplyTheme() {
        return this.f9057m.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f9059o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f9060p;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f9063s
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$d r0 = r9.f9057m
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f9060p
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f9059o
            if (r0 == 0) goto L_0x0029
            r9.f9060p = r0
            h.b$d r0 = r9.f9057m
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f9067w = r0
            goto L_0x0035
        L_0x0029:
            r9.f9060p = r4
            r9.f9067w = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f9059o
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            h.b$d r0 = r9.f9057m
            int r1 = r0.f9078h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f9059o = r0
            r9.f9063s = r10
            if (r0 == 0) goto L_0x005a
            h.b$d r10 = r9.f9057m
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f9066v = r2
        L_0x0051:
            r9.d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f9059o = r4
            r10 = -1
            r9.f9063s = r10
        L_0x005a:
            long r0 = r9.f9066v
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f9067w
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f9065u
            if (r0 != 0) goto L_0x0073
            h.b$a r0 = new h.b$a
            r0.<init>()
            r9.f9065u = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.g(int):boolean");
    }

    public int getAlpha() {
        return this.f9061q;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f9057m.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f9057m.c()) {
            return null;
        }
        this.f9057m.f9074d = getChangingConfigurations();
        return this.f9057m;
    }

    public Drawable getCurrent() {
        return this.f9059o;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f9058n;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f9057m.q()) {
            return this.f9057m.i();
        }
        Drawable drawable = this.f9059o;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f9057m.q()) {
            return this.f9057m.m();
        }
        Drawable drawable = this.f9059o;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f9057m.q()) {
            return this.f9057m.j();
        }
        Drawable drawable = this.f9059o;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f9057m.q()) {
            return this.f9057m.k();
        }
        Drawable drawable = this.f9059o;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f9059o;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f9057m.n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f9059o;
        if (drawable != null) {
            C0141b.b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z9;
        Rect l10 = this.f9057m.l();
        if (l10 != null) {
            rect.set(l10);
            z9 = (l10.right | ((l10.left | l10.top) | l10.bottom)) != 0;
        } else {
            Drawable drawable = this.f9059o;
            z9 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return z9;
    }

    /* access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f9057m = dVar;
        int i10 = this.f9063s;
        if (i10 >= 0) {
            Drawable g10 = dVar.g(i10);
            this.f9059o = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.f9060p = null;
    }

    /* access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f9057m.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f9057m;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable == this.f9059o && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f9057m.C;
    }

    public void jumpToCurrentState() {
        boolean z9;
        Drawable drawable = this.f9060p;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f9060p = null;
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable2 = this.f9059o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f9062r) {
                this.f9059o.setAlpha(this.f9061q);
            }
        }
        if (this.f9067w != 0) {
            this.f9067w = 0;
            z9 = true;
        }
        if (this.f9066v != 0) {
            this.f9066v = 0;
        } else {
            z10 = z9;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f9064t && super.mutate() == this) {
            d b10 = b();
            b10.r();
            h(b10);
            this.f9064t = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9060p;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f9059o;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i10) {
        return this.f9057m.w(i10, c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f9060p;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f9059o;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9060p;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f9059o;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f9059o && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (!this.f9062r || this.f9061q != i10) {
            this.f9062r = true;
            this.f9061q = i10;
            Drawable drawable = this.f9059o;
            if (drawable == null) {
                return;
            }
            if (this.f9066v == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z9) {
        d dVar = this.f9057m;
        if (dVar.C != z9) {
            dVar.C = z9;
            Drawable drawable = this.f9059o;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z9);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f9057m;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f9059o;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z9) {
        d dVar = this.f9057m;
        if (dVar.f9094x != z9) {
            dVar.f9094x = z9;
            Drawable drawable = this.f9059o;
            if (drawable != null) {
                drawable.setDither(z9);
            }
        }
    }

    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f9059o;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f10, f11);
        }
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f9058n;
        if (rect == null) {
            this.f9058n = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f9059o;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i10, i11, i12, i13);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f9057m;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f9059o, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f9057m;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f9059o, mode);
        }
    }

    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        Drawable drawable = this.f9060p;
        if (drawable != null) {
            drawable.setVisible(z9, z10);
        }
        Drawable drawable2 = this.f9059o;
        if (drawable2 != null) {
            drawable2.setVisible(z9, z10);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f9059o && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
