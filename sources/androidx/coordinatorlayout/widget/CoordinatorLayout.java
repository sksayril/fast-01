package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.h0;
import androidx.core.view.p;
import androidx.core.view.r;
import androidx.core.view.s;
import androidx.core.view.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements p {
    static final String F;
    static final Class<?>[] G = {Context.class, AttributeSet.class};
    static final ThreadLocal<Map<String, Constructor<c>>> H = new ThreadLocal<>();
    static final Comparator<View> I = new i();
    private static final androidx.core.util.e<Rect> J = new androidx.core.util.g(12);
    private boolean A;
    private Drawable B;
    ViewGroup.OnHierarchyChangeListener C;
    private s D;
    private final r E;

    /* renamed from: m  reason: collision with root package name */
    private final List<View> f1165m;

    /* renamed from: n  reason: collision with root package name */
    private final a<View> f1166n;

    /* renamed from: o  reason: collision with root package name */
    private final List<View> f1167o;

    /* renamed from: p  reason: collision with root package name */
    private final List<View> f1168p;

    /* renamed from: q  reason: collision with root package name */
    private final int[] f1169q;

    /* renamed from: r  reason: collision with root package name */
    private Paint f1170r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1171s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1172t;

    /* renamed from: u  reason: collision with root package name */
    private int[] f1173u;

    /* renamed from: v  reason: collision with root package name */
    private View f1174v;

    /* renamed from: w  reason: collision with root package name */
    private View f1175w;

    /* renamed from: x  reason: collision with root package name */
    private g f1176x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1177y;

    /* renamed from: z  reason: collision with root package name */
    private h0 f1178z;

    class a implements s {
        a() {
        }

        public h0 a(View view, h0 h0Var) {
            return CoordinatorLayout.this.W(h0Var);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        @Deprecated
        public void A(CoordinatorLayout coordinatorLayout, V v9, View view) {
        }

        public void B(CoordinatorLayout coordinatorLayout, V v9, View view, int i10) {
            if (i10 == 0) {
                A(coordinatorLayout, v9, view);
            }
        }

        public boolean C(CoordinatorLayout coordinatorLayout, V v9, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v9) {
            return d(coordinatorLayout, v9) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v9, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v9) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v9) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v9, View view) {
            return false;
        }

        public h0 f(CoordinatorLayout coordinatorLayout, V v9, h0 h0Var) {
            return h0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v9, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v9, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v9, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v9, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v9, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v9, View view, float f10, float f11, boolean z9) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v9, View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v9, View view, int i10, int i11, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v9, View view, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, v9, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v9, View view, int i10, int i11, int i12, int i13) {
        }

        public void s(CoordinatorLayout coordinatorLayout, V v9, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, v9, view, i10, i11, i12, i13);
            }
        }

        @Deprecated
        public void t(CoordinatorLayout coordinatorLayout, V v9, View view, View view2, int i10) {
        }

        public void u(CoordinatorLayout coordinatorLayout, V v9, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                t(coordinatorLayout, v9, view, view2, i10);
            }
        }

        public boolean v(CoordinatorLayout coordinatorLayout, V v9, Rect rect, boolean z9) {
            return false;
        }

        public void w(CoordinatorLayout coordinatorLayout, V v9, Parcelable parcelable) {
        }

        public Parcelable x(CoordinatorLayout coordinatorLayout, V v9) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean y(CoordinatorLayout coordinatorLayout, V v9, View view, View view2, int i10) {
            return false;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, V v9, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                return y(coordinatorLayout, v9, view, view2, i10);
            }
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.C;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.C;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        c f1181a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1182b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f1183c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1184d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1185e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f1186f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1187g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1188h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f1189i;

        /* renamed from: j  reason: collision with root package name */
        int f1190j;

        /* renamed from: k  reason: collision with root package name */
        View f1191k;

        /* renamed from: l  reason: collision with root package name */
        View f1192l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f1193m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f1194n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f1195o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f1196p;

        /* renamed from: q  reason: collision with root package name */
        final Rect f1197q = new Rect();

        /* renamed from: r  reason: collision with root package name */
        Object f1198r;

        public f(int i10, int i11) {
            super(i10, i11);
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.c.f11944e);
            this.f1183c = obtainStyledAttributes.getInteger(q.c.f11945f, 0);
            this.f1186f = obtainStyledAttributes.getResourceId(q.c.f11946g, -1);
            this.f1184d = obtainStyledAttributes.getInteger(q.c.f11947h, 0);
            this.f1185e = obtainStyledAttributes.getInteger(q.c.f11951l, -1);
            this.f1187g = obtainStyledAttributes.getInt(q.c.f11950k, 0);
            this.f1188h = obtainStyledAttributes.getInt(q.c.f11949j, 0);
            int i10 = q.c.f11948i;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f1182b = hasValue;
            if (hasValue) {
                this.f1181a = CoordinatorLayout.K(context, attributeSet, obtainStyledAttributes.getString(i10));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f1181a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f fVar) {
            super(fVar);
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f1186f);
            this.f1191k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1192l = findViewById;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1186f) + " to anchor view " + view);
            }
            this.f1192l = null;
            this.f1191k = null;
        }

        private boolean s(View view, int i10) {
            int b10 = androidx.core.view.e.b(((f) view.getLayoutParams()).f1187g, i10);
            return b10 != 0 && (androidx.core.view.e.b(this.f1188h, i10) & b10) == b10;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1191k.getId() != this.f1186f) {
                return false;
            }
            View view2 = this.f1191k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1192l = null;
                    this.f1191k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f1192l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f1191k == null && this.f1186f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f1181a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f1192l
                if (r4 == r0) goto L_0x001b
                int r0 = androidx.core.view.x.z(r2)
                boolean r0 = r1.s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f1181a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.f.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (this.f1181a == null) {
                this.f1193m = false;
            }
            return this.f1193m;
        }

        /* access modifiers changed from: package-private */
        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1186f == -1) {
                this.f1192l = null;
                this.f1191k = null;
                return null;
            }
            if (this.f1191k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f1191k;
        }

        public int e() {
            return this.f1186f;
        }

        public c f() {
            return this.f1181a;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return this.f1196p;
        }

        /* access modifiers changed from: package-private */
        public Rect h() {
            return this.f1197q;
        }

        /* access modifiers changed from: package-private */
        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z9 = this.f1193m;
            if (z9) {
                return true;
            }
            c cVar = this.f1181a;
            boolean a10 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z9;
            this.f1193m = a10;
            return a10;
        }

        /* access modifiers changed from: package-private */
        public boolean j(int i10) {
            if (i10 == 0) {
                return this.f1194n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f1195o;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.f1196p = false;
        }

        /* access modifiers changed from: package-private */
        public void l(int i10) {
            r(i10, false);
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.f1193m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f1181a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f1181a = cVar;
                this.f1198r = null;
                this.f1182b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void p(boolean z9) {
            this.f1196p = z9;
        }

        /* access modifiers changed from: package-private */
        public void q(Rect rect) {
            this.f1197q.set(rect);
        }

        /* access modifiers changed from: package-private */
        public void r(int i10, boolean z9) {
            if (i10 == 0) {
                this.f1194n = z9;
            } else if (i10 == 1) {
                this.f1195o = z9;
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    protected static class h extends w.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        SparseArray<Parcelable> f1200o;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1200o = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f1200o.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f1200o;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f1200o.keyAt(i11);
                parcelableArr[i11] = this.f1200o.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float J = x.J(view);
            float J2 = x.J(view2);
            if (J > J2) {
                return -1;
            }
            return J < J2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            F = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            I = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            G = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            H = r0
            androidx.core.util.g r0 = new androidx.core.util.g
            r1 = 12
            r0.<init>(r1)
            J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1165m = new ArrayList();
        this.f1166n = new a<>();
        this.f1167o = new ArrayList();
        this.f1168p = new ArrayList();
        this.f1169q = new int[2];
        this.E = new r(this);
        TypedArray obtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, q.c.f11941b, 0, q.b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, q.c.f11941b, i10, 0);
        int resourceId = obtainStyledAttributes.getResourceId(q.c.f11942c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1173u = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f1173u.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = this.f1173u;
                iArr[i11] = (int) (((float) iArr[i11]) * f10);
            }
        }
        this.B = obtainStyledAttributes.getDrawable(q.c.f11943d);
        obtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
    }

    private boolean A(View view) {
        return this.f1166n.j(view);
    }

    private void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect a10 = a();
        a10.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f1178z != null && x.w(this) && !x.w(view)) {
            a10.left += this.f1178z.i();
            a10.top += this.f1178z.k();
            a10.right -= this.f1178z.j();
            a10.bottom -= this.f1178z.h();
        }
        Rect a11 = a();
        androidx.core.view.e.a(S(fVar.f1183c), view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
        O(a10);
        O(a11);
    }

    private void D(View view, View view2, int i10) {
        Rect a10 = a();
        Rect a11 = a();
        try {
            t(view2, a10);
            u(view, i10, a10, a11);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
        } finally {
            O(a10);
            O(a11);
        }
    }

    private void E(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int b10 = androidx.core.view.e.b(T(fVar.f1183c), i11);
        int i12 = b10 & 7;
        int i13 = b10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int w9 = w(i10) - measuredWidth;
        int i14 = 0;
        if (i12 == 1) {
            w9 += measuredWidth / 2;
        } else if (i12 == 5) {
            w9 += measuredWidth;
        }
        if (i13 == 16) {
            i14 = 0 + (measuredHeight / 2);
        } else if (i13 == 80) {
            i14 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(w9, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void F(View view, Rect rect, int i10) {
        boolean z9;
        boolean z10;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (x.P(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            Rect a10 = a();
            Rect a11 = a();
            a11.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f10 == null || !f10.b(this, view, a10)) {
                a10.set(a11);
            } else if (!a11.contains(a10)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a10.toShortString() + " | Bounds:" + a11.toShortString());
            }
            O(a11);
            if (a10.isEmpty()) {
                O(a10);
                return;
            }
            int b10 = androidx.core.view.e.b(fVar.f1188h, i10);
            boolean z11 = true;
            if ((b10 & 48) != 48 || (i15 = (a10.top - fVar.topMargin) - fVar.f1190j) >= (i16 = rect.top)) {
                z9 = false;
            } else {
                V(view, i16 - i15);
                z9 = true;
            }
            if ((b10 & 80) == 80 && (height = ((getHeight() - a10.bottom) - fVar.bottomMargin) + fVar.f1190j) < (i14 = rect.bottom)) {
                V(view, height - i14);
                z9 = true;
            }
            if (!z9) {
                V(view, 0);
            }
            if ((b10 & 3) != 3 || (i12 = (a10.left - fVar.leftMargin) - fVar.f1189i) >= (i13 = rect.left)) {
                z10 = false;
            } else {
                U(view, i13 - i12);
                z10 = true;
            }
            if ((b10 & 5) != 5 || (width = ((getWidth() - a10.right) - fVar.rightMargin) + fVar.f1189i) >= (i11 = rect.right)) {
                z11 = z10;
            } else {
                U(view, width - i11);
            }
            if (!z11) {
                U(view, 0);
            }
            O(a10);
        }
    }

    static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = F;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = H;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(G);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean L(MotionEvent motionEvent, int i10) {
        MotionEvent motionEvent2 = motionEvent;
        int i11 = i10;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1167o;
        z(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z9 = false;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = list.get(i12);
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            if ((!z9 && !z10) || actionMasked == 0) {
                if (!z9 && f10 != null) {
                    if (i11 == 0) {
                        z9 = f10.k(this, view, motionEvent2);
                    } else if (i11 == 1) {
                        z9 = f10.C(this, view, motionEvent2);
                    }
                    if (z9) {
                        this.f1174v = view;
                    }
                }
                boolean c10 = fVar.c();
                boolean i13 = fVar.i(this, view);
                z10 = i13 && !c10;
                if (i13 && !z10) {
                    break;
                }
            } else if (f10 != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i11 == 0) {
                    f10.k(this, view, motionEvent3);
                } else if (i11 == 1) {
                    f10.C(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z9;
    }

    private void M() {
        this.f1165m.clear();
        this.f1166n.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f y9 = y(childAt);
            y9.d(this, childAt);
            this.f1166n.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (y9.b(this, childAt, childAt2)) {
                        if (!this.f1166n.d(childAt2)) {
                            this.f1166n.b(childAt2);
                        }
                        this.f1166n.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1165m.addAll(this.f1166n.i());
        Collections.reverse(this.f1165m);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        J.a(rect);
    }

    private void Q(boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (f10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z9) {
                    f10.k(this, childAt, obtain);
                } else {
                    f10.C(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.f1174v = null;
        this.f1171s = false;
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int S(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int T(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void U(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1189i;
        if (i11 != i10) {
            x.V(view, i10 - i11);
            fVar.f1189i = i10;
        }
    }

    private void V(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1190j;
        if (i11 != i10) {
            x.W(view, i10 - i11);
            fVar.f1190j = i10;
        }
    }

    private void X() {
        if (x.w(this)) {
            if (this.D == null) {
                this.D = new a();
            }
            x.s0(this, this.D);
            setSystemUiVisibility(1280);
            return;
        }
        x.s0(this, (s) null);
    }

    private static Rect a() {
        Rect b10 = J.b();
        return b10 == null ? new Rect() : b10;
    }

    private static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - fVar.bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    private h0 e(h0 h0Var) {
        c f10;
        if (h0Var.n()) {
            return h0Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (x.w(childAt) && (f10 = ((f) childAt.getLayoutParams()).f()) != null) {
                h0Var = f10.f(this, childAt, h0Var);
                if (h0Var.n()) {
                    break;
                }
            }
        }
        return h0Var;
    }

    private void v(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int b10 = androidx.core.view.e.b(R(fVar.f1183c), i10);
        int b11 = androidx.core.view.e.b(S(fVar.f1184d), i10);
        int i13 = b10 & 7;
        int i14 = b10 & 112;
        int i15 = b11 & 7;
        int i16 = b11 & 112;
        int width = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            width -= i11 / 2;
        } else if (i13 != 5) {
            width -= i11;
        }
        if (i14 == 16) {
            height -= i12 / 2;
        } else if (i14 != 80) {
            height -= i12;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    private int w(int i10) {
        StringBuilder sb;
        int[] iArr = this.f1173u;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i10);
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i10);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    private void z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = I;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i10, int i11) {
        Rect a10 = a();
        t(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            O(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(View view, int i10) {
        c f10;
        View view2 = view;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f1191k != null) {
            Rect a10 = a();
            Rect a11 = a();
            Rect a12 = a();
            t(fVar.f1191k, a10);
            boolean z9 = false;
            q(view2, false, a11);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = measuredHeight;
            v(view, i10, a10, a12, fVar, measuredWidth, measuredHeight);
            if (!(a12.left == a11.left && a12.top == a11.top)) {
                z9 = true;
            }
            d(fVar, a12, measuredWidth, i11);
            int i12 = a12.left - a11.left;
            int i13 = a12.top - a11.top;
            if (i12 != 0) {
                x.V(view2, i12);
            }
            if (i13 != 0) {
                x.W(view2, i13);
            }
            if (z9 && (f10 = fVar.f()) != null) {
                f10.h(this, view2, fVar.f1191k);
            }
            O(a10);
            O(a11);
            O(a12);
        }
    }

    /* access modifiers changed from: package-private */
    public final void H(int i10) {
        boolean z9;
        int i11 = i10;
        int z10 = x.z(this);
        int size = this.f1165m.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f1165m.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i11 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f1192l == this.f1165m.get(i13)) {
                        G(view, z10);
                    }
                }
                q(view, true, a11);
                if (fVar.f1187g != 0 && !a11.isEmpty()) {
                    int b10 = androidx.core.view.e.b(fVar.f1187g, z10);
                    int i14 = b10 & 112;
                    if (i14 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i14 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i15 = b10 & 7;
                    if (i15 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i15 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar.f1188h != 0 && view.getVisibility() == 0) {
                    F(view, a10, z10);
                }
                if (i11 != 2) {
                    x(view, a12);
                    if (!a12.equals(a11)) {
                        N(view, a11);
                    }
                }
                for (int i16 = i12 + 1; i16 < size; i16++) {
                    View view2 = this.f1165m.get(i16);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f10 = fVar2.f();
                    if (f10 != null && f10.e(this, view2, view)) {
                        if (i11 != 0 || !fVar2.g()) {
                            if (i11 != 2) {
                                z9 = f10.h(this, view2, view);
                            } else {
                                f10.i(this, view2, view);
                                z9 = true;
                            }
                            if (i11 == 1) {
                                fVar2.p(z9);
                            }
                        } else {
                            fVar2.k();
                        }
                    }
                }
            }
        }
        O(a10);
        O(a11);
        O(a12);
    }

    public void I(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f1191k;
            if (view2 != null) {
                D(view, view2, i10);
                return;
            }
            int i11 = fVar.f1185e;
            if (i11 >= 0) {
                E(view, i11, i10);
            } else {
                C(view, i10);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void J(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* access modifiers changed from: package-private */
    public void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    /* access modifiers changed from: package-private */
    public void P() {
        if (this.f1172t && this.f1176x != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1176x);
        }
        this.f1177y = false;
    }

    /* access modifiers changed from: package-private */
    public final h0 W(h0 h0Var) {
        if (androidx.core.util.c.a(this.f1178z, h0Var)) {
            return h0Var;
        }
        this.f1178z = h0Var;
        boolean z9 = true;
        boolean z10 = h0Var != null && h0Var.k() > 0;
        this.A = z10;
        if (z10 || getBackground() != null) {
            z9 = false;
        }
        setWillNotDraw(z9);
        h0 e10 = e(h0Var);
        requestLayout();
        return e10;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f1172t) {
            if (this.f1176x == null) {
                this.f1176x = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1176x);
        }
        this.f1177y = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f1181a;
        if (cVar != null) {
            float d10 = cVar.d(this, view);
            if (d10 > 0.0f) {
                if (this.f1170r == null) {
                    this.f1170r = new Paint();
                }
                this.f1170r.setColor(fVar.f1181a.c(this, view));
                this.f1170r.setAlpha(c(Math.round(d10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f1170r);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.B;
        boolean z9 = false;
        if (drawable != null && drawable.isStateful()) {
            z9 = false | drawable.setState(drawableState);
        }
        if (z9) {
            invalidate();
        }
    }

    public void f(View view) {
        List g10 = this.f1166n.g(view);
        if (g10 != null && !g10.isEmpty()) {
            for (int i10 = 0; i10 < g10.size(); i10++) {
                View view2 = (View) g10.get(i10);
                c f10 = ((f) view2.getLayoutParams()).f();
                if (f10 != null) {
                    f10.h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        int childCount = getChildCount();
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (A(getChildAt(i10))) {
                z9 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z9 == this.f1177y) {
            return;
        }
        if (z9) {
            b();
        } else {
            P();
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f1165m);
    }

    public final h0 getLastWindowInsets() {
        return this.f1178z;
    }

    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public Drawable getStatusBarBackground() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void h(View view, View view2, int i10, int i11) {
        c f10;
        this.E.c(view, view2, i10, i11);
        this.f1175w = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (f10 = fVar.f()) != null) {
                f10.u(this, childAt, view, view2, i10, i11);
            }
        }
    }

    public void i(View view, int i10) {
        this.E.d(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c f10 = fVar.f();
                if (f10 != null) {
                    f10.B(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f1175w = null;
    }

    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        c f10;
        int childCount = getChildCount();
        boolean z9 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                int i16 = i12;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f1169q;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    f10.q(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f1169q;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.f1169q;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z9 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z9) {
            H(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    /* renamed from: l */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        c f10;
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                int i16 = i14;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (f10 = fVar.f()) != null) {
                    f10.s(this, childAt, view, i10, i11, i12, i13, i14);
                    z9 = true;
                }
            }
        }
        if (z9) {
            H(1);
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        int i12 = i11;
        int childCount = getChildCount();
        int i13 = 0;
        boolean z9 = false;
        while (true) {
            if (i13 >= childCount) {
                return z9;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f10 = fVar.f();
                if (f10 != null) {
                    boolean z10 = f10.z(this, childAt, view, view2, i10, i11);
                    z9 |= z10;
                    fVar.r(i12, z10);
                } else {
                    fVar.r(i12, false);
                }
            }
            i13++;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f1177y) {
            if (this.f1176x == null) {
                this.f1176x = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1176x);
        }
        if (this.f1178z == null && x.w(this)) {
            x.d0(this);
        }
        this.f1172t = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f1177y && this.f1176x != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1176x);
        }
        View view = this.f1175w;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1172t = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A && this.B != null) {
            h0 h0Var = this.f1178z;
            int k10 = h0Var != null ? h0Var.k() : 0;
            if (k10 > 0) {
                this.B.setBounds(0, 0, getWidth(), k10);
                this.B.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean L = L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            Q(true);
        }
        return L;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        c f10;
        int z10 = x.z(this);
        int size = this.f1165m.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f1165m.get(i14);
            if (view.getVisibility() != 8 && ((f10 = ((f) view.getLayoutParams()).f()) == null || !f10.l(this, view, z10))) {
                I(view, z10);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.M()
            r30.g()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.view.x.z(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.h0 r3 = r7.f1178z
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.view.x.w(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f1165m
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f1165m
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r1
            int r0 = r1.f1185e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.w(r0)
            int r11 = r1.f1183c
            int r11 = T(r11)
            int r11 = androidx.core.view.e.b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = androidx.core.view.x.w(r20)
            if (r0 != 0) goto L_0x00f1
            androidx.core.view.h0 r0 = r7.f1178z
            int r0 = r0.i()
            androidx.core.view.h0 r2 = r7.f1178z
            int r2 = r2.j()
            int r0 = r0 + r2
            androidx.core.view.h0 r2 = r7.f1178z
            int r2 = r2.k()
            androidx.core.view.h0 r11 = r7.f1178z
            int r11 = r11.h()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.J(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        c f12;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z10 |= f12.n(this, childAt, view, f10, f11, z9);
                }
            }
        }
        if (z10) {
            H(1);
        }
        return z10;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        c f12;
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z9 |= f12.o(this, childAt, view, f10, f11);
                }
            }
        }
        return z9;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        h(view, view2, i10, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f1200o;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c f10 = y(childAt).f();
            if (!(id == -1 || f10 == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f10.w(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable x9;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (!(id == -1 || f10 == null || (x9 = f10.x(this, childAt)) == null)) {
                sparseArray.append(id, x9);
            }
        }
        hVar.f1200o = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1174v
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f1174v
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f1174v
            boolean r6 = r6.C(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f1174v
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.Q(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void q(View view, boolean z9, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z9) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> r(View view) {
        List<View> h10 = this.f1166n.h(view);
        this.f1168p.clear();
        if (h10 != null) {
            this.f1168p.addAll(h10);
        }
        return this.f1168p;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        c f10 = ((f) view.getLayoutParams()).f();
        if (f10 == null || !f10.v(this, view, rect, z9)) {
            return super.requestChildRectangleOnScreen(view, rect, z9);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (z9 && !this.f1171s) {
            Q(false);
            this.f1171s = true;
        }
    }

    public List<View> s(View view) {
        List g10 = this.f1166n.g(view);
        this.f1168p.clear();
        if (g10 != null) {
            this.f1168p.addAll(g10);
        }
        return this.f1168p;
    }

    public void setFitsSystemWindows(boolean z9) {
        super.setFitsSystemWindows(z9);
        X();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.C = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.B = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.B.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.B, x.z(this));
                this.B.setVisible(getVisibility() == 0, false);
                this.B.setCallback(this);
            }
            x.a0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? androidx.core.content.a.e(getContext(), i10) : null);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.B;
        if (drawable != null && drawable.isVisible() != z9) {
            this.B.setVisible(z9, false);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(View view, Rect rect) {
        b.a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    public void u(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B;
    }

    /* access modifiers changed from: package-private */
    public void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* access modifiers changed from: package-private */
    public f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1182b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget" + " a default constructor?", e10);
                    }
                }
            }
            fVar.f1182b = true;
        }
        return fVar;
    }
}
