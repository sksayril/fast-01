package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.h;
import androidx.core.view.i;
import androidx.core.view.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private s0 F;
    private int G;
    private int H;
    private int I;
    private CharSequence J;
    private CharSequence K;
    private ColorStateList L;
    private ColorStateList M;
    private boolean N;
    private boolean O;
    private final ArrayList<View> P;
    private final ArrayList<View> Q;
    private final int[] R;
    final i S;
    private ArrayList<MenuItem> T;
    f U;
    private final ActionMenuView.e V;
    private c1 W;

    /* renamed from: a0  reason: collision with root package name */
    private c f718a0;

    /* renamed from: b0  reason: collision with root package name */
    private d f719b0;

    /* renamed from: c0  reason: collision with root package name */
    private j.a f720c0;

    /* renamed from: d0  reason: collision with root package name */
    private e.a f721d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f722e0;

    /* renamed from: f0  reason: collision with root package name */
    private final Runnable f723f0;

    /* renamed from: m  reason: collision with root package name */
    private ActionMenuView f724m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f725n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f726o;

    /* renamed from: p  reason: collision with root package name */
    private ImageButton f727p;

    /* renamed from: q  reason: collision with root package name */
    private ImageView f728q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f729r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f730s;

    /* renamed from: t  reason: collision with root package name */
    ImageButton f731t;

    /* renamed from: u  reason: collision with root package name */
    View f732u;

    /* renamed from: v  reason: collision with root package name */
    private Context f733v;

    /* renamed from: w  reason: collision with root package name */
    private int f734w;

    /* renamed from: x  reason: collision with root package name */
    private int f735x;

    /* renamed from: y  reason: collision with root package name */
    private int f736y;

    /* renamed from: z  reason: collision with root package name */
    int f737z;

    class a implements ActionMenuView.e {
        a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.S.c(menuItem)) {
                return true;
            }
            f fVar = Toolbar.this.U;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.P();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements j {

        /* renamed from: m  reason: collision with root package name */
        androidx.appcompat.view.menu.e f741m;

        /* renamed from: n  reason: collision with root package name */
        androidx.appcompat.view.menu.g f742n;

        d() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
        }

        public void d(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f741m;
            if (!(eVar2 == null || (gVar = this.f742n) == null)) {
                eVar2.f(gVar);
            }
            this.f741m = eVar;
        }

        public boolean e(m mVar) {
            return false;
        }

        public void f(boolean z9) {
            if (this.f742n != null) {
                androidx.appcompat.view.menu.e eVar = this.f741m;
                boolean z10 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f741m.getItem(i10) == this.f742n) {
                            z10 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z10) {
                    i(this.f741m, this.f742n);
                }
            }
        }

        public boolean g() {
            return false;
        }

        public boolean i(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f732u;
            if (view instanceof j.c) {
                ((j.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f732u);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f731t);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f732u = null;
            toolbar3.a();
            this.f742n = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f731t.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f731t);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f731t);
            }
            Toolbar.this.f732u = gVar.getActionView();
            this.f742n = gVar;
            ViewParent parent2 = Toolbar.this.f732u.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f732u);
                }
                e m10 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m10.f307a = 8388611 | (toolbar4.f737z & 112);
                m10.f744b = 2;
                toolbar4.f732u.setLayoutParams(m10);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f732u);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.f732u;
            if (view instanceof j.c) {
                ((j.c) view).c();
            }
            return true;
        }
    }

    public static class e extends a.C0005a {

        /* renamed from: b  reason: collision with root package name */
        int f744b = 0;

        public e(int i10, int i11) {
            super(i10, i11);
            this.f307a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public e(a.C0005a aVar) {
            super(aVar);
        }

        public e(e eVar) {
            super((a.C0005a) eVar);
            this.f744b = eVar.f744b;
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends w.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        int f745o;

        /* renamed from: p  reason: collision with root package name */
        boolean f746p;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f745o = parcel.readInt();
            this.f746p = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f745o);
            parcel.writeInt(this.f746p ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.I = 8388627;
        this.P = new ArrayList<>();
        this.Q = new ArrayList<>();
        this.R = new int[2];
        this.S = new i(new b1(this));
        this.T = new ArrayList<>();
        this.V = new a();
        this.f723f0 = new b();
        Context context2 = getContext();
        int[] iArr = f.j.R2;
        a1 u9 = a1.u(context2, attributeSet, iArr, i10, 0);
        x.e0(this, context, iArr, attributeSet, u9.q(), i10, 0);
        this.f735x = u9.m(f.j.f8687t3, 0);
        this.f736y = u9.m(f.j.f8642k3, 0);
        this.I = u9.k(f.j.S2, this.I);
        this.f737z = u9.k(f.j.T2, 48);
        int d10 = u9.d(f.j.f8657n3, 0);
        int i11 = f.j.f8682s3;
        d10 = u9.r(i11) ? u9.d(i11, d10) : d10;
        this.E = d10;
        this.D = d10;
        this.C = d10;
        this.B = d10;
        int d11 = u9.d(f.j.f8672q3, -1);
        if (d11 >= 0) {
            this.B = d11;
        }
        int d12 = u9.d(f.j.f8667p3, -1);
        if (d12 >= 0) {
            this.C = d12;
        }
        int d13 = u9.d(f.j.f8677r3, -1);
        if (d13 >= 0) {
            this.D = d13;
        }
        int d14 = u9.d(f.j.f8662o3, -1);
        if (d14 >= 0) {
            this.E = d14;
        }
        this.A = u9.e(f.j.f8612e3, -1);
        int d15 = u9.d(f.j.f8592a3, Integer.MIN_VALUE);
        int d16 = u9.d(f.j.W2, Integer.MIN_VALUE);
        int e10 = u9.e(f.j.Y2, 0);
        int e11 = u9.e(f.j.Z2, 0);
        h();
        this.F.e(e10, e11);
        if (!(d15 == Integer.MIN_VALUE && d16 == Integer.MIN_VALUE)) {
            this.F.g(d15, d16);
        }
        this.G = u9.d(f.j.f8597b3, Integer.MIN_VALUE);
        this.H = u9.d(f.j.X2, Integer.MIN_VALUE);
        this.f729r = u9.f(f.j.V2);
        this.f730s = u9.o(f.j.U2);
        CharSequence o10 = u9.o(f.j.f8652m3);
        if (!TextUtils.isEmpty(o10)) {
            setTitle(o10);
        }
        CharSequence o11 = u9.o(f.j.f8637j3);
        if (!TextUtils.isEmpty(o11)) {
            setSubtitle(o11);
        }
        this.f733v = getContext();
        setPopupTheme(u9.m(f.j.f8632i3, 0));
        Drawable f10 = u9.f(f.j.f8627h3);
        if (f10 != null) {
            setNavigationIcon(f10);
        }
        CharSequence o12 = u9.o(f.j.f8622g3);
        if (!TextUtils.isEmpty(o12)) {
            setNavigationContentDescription(o12);
        }
        Drawable f11 = u9.f(f.j.f8602c3);
        if (f11 != null) {
            setLogo(f11);
        }
        CharSequence o13 = u9.o(f.j.f8607d3);
        if (!TextUtils.isEmpty(o13)) {
            setLogoDescription(o13);
        }
        int i12 = f.j.f8692u3;
        if (u9.r(i12)) {
            setTitleTextColor(u9.c(i12));
        }
        int i13 = f.j.f8647l3;
        if (u9.r(i13)) {
            setSubtitleTextColor(u9.c(i13));
        }
        int i14 = f.j.f8617f3;
        if (u9.r(i14)) {
            x(u9.m(i14, 0));
        }
        u9.v();
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q9 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q9, max + measuredWidth, view.getMeasuredHeight() + q9);
        return max + measuredWidth + eVar.rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q9 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q9, max, view.getMeasuredHeight() + q9);
        return max - (measuredWidth + eVar.leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.S.a(getMenu(), getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.T = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f723f0);
        post(this.f723f0);
    }

    private boolean N() {
        if (!this.f722e0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (O(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean O(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z9 = x.z(this) == 1;
        int childCount = getChildCount();
        int b10 = androidx.core.view.e.b(i10, x.z(this));
        list.clear();
        if (z9) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f744b == 0 && O(childAt) && p(eVar.f307a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f744b == 0 && O(childAt2) && p(eVar2.f307a) == b10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e m10 = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        m10.f744b = 1;
        if (!z9 || this.f732u == null) {
            addView(view, m10);
            return;
        }
        view.setLayoutParams(m10);
        this.Q.add(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j.g(getContext());
    }

    private void h() {
        if (this.F == null) {
            this.F = new s0();
        }
    }

    private void i() {
        if (this.f728q == null) {
            this.f728q = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f724m.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f724m.getMenu();
            if (this.f719b0 == null) {
                this.f719b0 = new d();
            }
            this.f724m.setExpandedActionViewsExclusive(true);
            eVar.c(this.f719b0, this.f733v);
        }
    }

    private void k() {
        if (this.f724m == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f724m = actionMenuView;
            actionMenuView.setPopupTheme(this.f734w);
            this.f724m.setOnMenuItemClickListener(this.V);
            this.f724m.O(this.f720c0, this.f721d0);
            e m10 = generateDefaultLayoutParams();
            m10.f307a = 8388613 | (this.f737z & 112);
            this.f724m.setLayoutParams(m10);
            c(this.f724m, false);
        }
    }

    private void l() {
        if (this.f727p == null) {
            this.f727p = new p(getContext(), (AttributeSet) null, f.a.toolbarNavigationButtonStyle);
            e m10 = generateDefaultLayoutParams();
            m10.f307a = 8388611 | (this.f737z & 112);
            this.f727p.setLayoutParams(m10);
        }
    }

    private int p(int i10) {
        int z9 = x.z(this);
        int b10 = androidx.core.view.e.b(i10, z9) & 7;
        return (b10 == 1 || b10 == 3 || b10 == 5) ? b10 : z9 == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r9 = r(eVar.f307a);
        if (r9 == 48) {
            return getPaddingTop() - i11;
        }
        if (r9 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = eVar.topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = eVar.bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.I & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return h.b(marginLayoutParams) + h.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            e eVar = (e) view.getLayoutParams();
            int i14 = eVar.leftMargin - i10;
            int i15 = eVar.rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.Q.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f724m;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f724m;
        return actionMenuView != null && actionMenuView.J();
    }

    /* access modifiers changed from: package-private */
    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).f744b == 2 || childAt == this.f724m)) {
                removeViewAt(childCount);
                this.Q.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.F.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.e eVar, c cVar) {
        if (eVar != null || this.f724m != null) {
            k();
            androidx.appcompat.view.menu.e N2 = this.f724m.N();
            if (N2 != eVar) {
                if (N2 != null) {
                    N2.O(this.f718a0);
                    N2.O(this.f719b0);
                }
                if (this.f719b0 == null) {
                    this.f719b0 = new d();
                }
                cVar.G(true);
                if (eVar != null) {
                    eVar.c(cVar, this.f733v);
                    eVar.c(this.f719b0, this.f733v);
                } else {
                    cVar.d(this.f733v, (androidx.appcompat.view.menu.e) null);
                    this.f719b0.d(this.f733v, (androidx.appcompat.view.menu.e) null);
                    cVar.f(true);
                    this.f719b0.f(true);
                }
                this.f724m.setPopupTheme(this.f734w);
                this.f724m.setPresenter(cVar);
                this.f718a0 = cVar;
            }
        }
    }

    public void L(Context context, int i10) {
        this.f736y = i10;
        TextView textView = this.f726o;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void M(Context context, int i10) {
        this.f735x = i10;
        TextView textView = this.f725n;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean P() {
        ActionMenuView actionMenuView = this.f724m;
        return actionMenuView != null && actionMenuView.P();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.Q.size() - 1; size >= 0; size--) {
            addView(this.Q.get(size));
        }
        this.Q.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f724m;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f724m
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.d():boolean");
    }

    public void e() {
        d dVar = this.f719b0;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f742n;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f724m;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f731t == null) {
            p pVar = new p(getContext(), (AttributeSet) null, f.a.toolbarNavigationButtonStyle);
            this.f731t = pVar;
            pVar.setImageDrawable(this.f729r);
            this.f731t.setContentDescription(this.f730s);
            e m10 = generateDefaultLayoutParams();
            m10.f307a = 8388611 | (this.f737z & 112);
            m10.f744b = 2;
            this.f731t.setLayoutParams(m10);
            this.f731t.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f731t;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f731t;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        s0 s0Var = this.F;
        if (s0Var != null) {
            return s0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.H;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        s0 s0Var = this.F;
        if (s0Var != null) {
            return s0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        s0 s0Var = this.F;
        if (s0Var != null) {
            return s0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        s0 s0Var = this.F;
        if (s0Var != null) {
            return s0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.G;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f724m
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.e r0 = r0.N()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.H
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return x.z(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return x.z(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.G, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f728q;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f728q;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f724m.getMenu();
    }

    /* access modifiers changed from: package-private */
    public View getNavButtonView() {
        return this.f727p;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f727p;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f727p;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c getOuterActionMenuPresenter() {
        return this.f718a0;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f724m.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f733v;
    }

    public int getPopupTheme() {
        return this.f734w;
    }

    public CharSequence getSubtitle() {
        return this.K;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f726o;
    }

    public CharSequence getTitle() {
        return this.J;
    }

    public int getTitleMarginBottom() {
        return this.E;
    }

    public int getTitleMarginEnd() {
        return this.C;
    }

    public int getTitleMarginStart() {
        return this.B;
    }

    public int getTitleMarginTop() {
        return this.D;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f725n;
    }

    public h0 getWrapper() {
        if (this.W == null) {
            this.W = new c1(this, true);
        }
        return this.W;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0005a ? new e((a.C0005a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f723f0);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.O = false;
        }
        if (!this.O) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.O = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.O = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[LOOP:0: B:106:0x0293->B:107:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7 A[LOOP:1: B:109:0x02b5->B:110:0x02b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f0 A[LOOP:2: B:117:0x02ee->B:118:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.x.z(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.R
            r11[r2] = r3
            r11[r3] = r3
            int r12 = androidx.core.view.x.A(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f727p
            boolean r13 = r0.O(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f727p
            if (r1 == 0) goto L_0x004e
            int r13 = r0.D(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.C(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f731t
            boolean r15 = r0.O(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f731t
            if (r1 == 0) goto L_0x0066
            int r14 = r0.D(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.C(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f724m
            boolean r15 = r0.O(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f724m
            if (r1 == 0) goto L_0x007b
            int r13 = r0.C(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.D(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f732u
            boolean r13 = r0.O(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f732u
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.D(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.C(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f728q
            boolean r13 = r0.O(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f728q
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.D(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.C(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f725n
            boolean r13 = r0.O(r13)
            android.widget.TextView r14 = r0.f726o
            boolean r14 = r0.O(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f725n
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f725n
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r3 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r7 = r0.f726o
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f726o
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0121
            if (r14 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r18 = r6
            r22 = r12
        L_0x011e:
            r1 = 0
            goto L_0x0286
        L_0x0121:
            if (r13 == 0) goto L_0x0126
            android.widget.TextView r4 = r0.f725n
            goto L_0x0128
        L_0x0126:
            android.widget.TextView r4 = r0.f726o
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            android.widget.TextView r7 = r0.f726o
            goto L_0x012f
        L_0x012d:
            android.widget.TextView r7 = r0.f725n
        L_0x012f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            if (r13 == 0) goto L_0x0145
            android.widget.TextView r15 = r0.f725n
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014f
        L_0x0145:
            if (r14 == 0) goto L_0x0152
            android.widget.TextView r15 = r0.f726o
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0152
        L_0x014f:
            r17 = 1
            goto L_0x0154
        L_0x0152:
            r17 = 0
        L_0x0154:
            int r15 = r0.I
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019c
            r6 = 80
            if (r15 == r6) goto L_0x018e
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.D
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0177
            int r6 = r15 + r12
            goto L_0x018c
        L_0x0177:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.E
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018c
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018c:
            int r8 = r8 + r6
            goto L_0x01ab
        L_0x018e:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.E
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01ab
        L_0x019c:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.D
            int r8 = r2 + r3
        L_0x01ab:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b2
            int r1 = r0.B
            goto L_0x01b3
        L_0x01b2:
            r1 = 0
        L_0x01b3:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ea
            android.widget.TextView r1 = r0.f725n
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f725n
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f725n
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f725n
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.C
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01eb
        L_0x01ea:
            r2 = r10
        L_0x01eb:
            if (r14 == 0) goto L_0x0211
            android.widget.TextView r1 = r0.f726o
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f726o
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f726o
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f726o
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.C
            int r1 = r10 - r1
            goto L_0x0212
        L_0x0211:
            r1 = r10
        L_0x0212:
            if (r17 == 0) goto L_0x0219
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0219:
            r2 = r24
            goto L_0x011e
        L_0x021d:
            if (r17 == 0) goto L_0x0223
            int r7 = r0.B
            r1 = 0
            goto L_0x0225
        L_0x0223:
            r1 = 0
            r7 = 0
        L_0x0225:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x025a
            android.widget.TextView r3 = r0.f725n
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.widget.TextView r4 = r0.f725n
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f725n
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f725n
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.C
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x025b
        L_0x025a:
            r4 = r2
        L_0x025b:
            if (r14 == 0) goto L_0x027f
            android.widget.TextView r3 = r0.f726o
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f726o
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f726o
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f726o
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.C
            int r3 = r3 + r5
            goto L_0x0280
        L_0x027f:
            r3 = r2
        L_0x0280:
            if (r17 == 0) goto L_0x0286
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0286:
            java.util.ArrayList<android.view.View> r3 = r0.P
            r4 = 3
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.P
            int r3 = r3.size()
            r7 = 0
        L_0x0293:
            if (r7 >= r3) goto L_0x02a6
            java.util.ArrayList<android.view.View> r4 = r0.P
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.C(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x0293
        L_0x02a6:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.P
            r4 = 5
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.P
            int r3 = r3.size()
            r7 = 0
        L_0x02b5:
            if (r7 >= r3) goto L_0x02c6
            java.util.ArrayList<android.view.View> r4 = r0.P
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.D(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02b5
        L_0x02c6:
            java.util.ArrayList<android.view.View> r3 = r0.P
            r4 = 1
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.P
            int r3 = r0.u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02e1
            goto L_0x02e8
        L_0x02e1:
            if (r3 <= r10) goto L_0x02e7
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02e8
        L_0x02e7:
            r2 = r6
        L_0x02e8:
            java.util.ArrayList<android.view.View> r3 = r0.P
            int r3 = r3.size()
        L_0x02ee:
            if (r1 >= r3) goto L_0x02ff
            java.util.ArrayList<android.view.View> r4 = r0.P
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.C(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02ee
        L_0x02ff:
            java.util.ArrayList<android.view.View> r1 = r0.P
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.R;
        char b10 = h1.b(this);
        int i19 = 0;
        char c10 = b10 ^ 1;
        if (O(this.f727p)) {
            F(this.f727p, i10, 0, i11, 0, this.A);
            i14 = this.f727p.getMeasuredWidth() + s(this.f727p);
            i13 = Math.max(0, this.f727p.getMeasuredHeight() + t(this.f727p));
            i12 = View.combineMeasuredStates(0, this.f727p.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (O(this.f731t)) {
            F(this.f731t, i10, 0, i11, 0, this.A);
            i14 = this.f731t.getMeasuredWidth() + s(this.f731t);
            i13 = Math.max(i13, this.f731t.getMeasuredHeight() + t(this.f731t));
            i12 = View.combineMeasuredStates(i12, this.f731t.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i14);
        iArr[b10] = Math.max(0, currentContentInsetStart - i14);
        if (O(this.f724m)) {
            F(this.f724m, i10, max, i11, 0, this.A);
            i15 = this.f724m.getMeasuredWidth() + s(this.f724m);
            i13 = Math.max(i13, this.f724m.getMeasuredHeight() + t(this.f724m));
            i12 = View.combineMeasuredStates(i12, this.f724m.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i15);
        if (O(this.f732u)) {
            max2 += E(this.f732u, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f732u.getMeasuredHeight() + t(this.f732u));
            i12 = View.combineMeasuredStates(i12, this.f732u.getMeasuredState());
        }
        if (O(this.f728q)) {
            max2 += E(this.f728q, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f728q.getMeasuredHeight() + t(this.f728q));
            i12 = View.combineMeasuredStates(i12, this.f728q.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((e) childAt.getLayoutParams()).f744b == 0 && O(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i21 = this.D + this.E;
        int i22 = this.B + this.C;
        if (O(this.f725n)) {
            E(this.f725n, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f725n.getMeasuredWidth() + s(this.f725n);
            i16 = this.f725n.getMeasuredHeight() + t(this.f725n);
            i18 = View.combineMeasuredStates(i12, this.f725n.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i18 = i12;
            i17 = 0;
            i16 = 0;
        }
        if (O(this.f726o)) {
            int i23 = i16 + i21;
            i17 = Math.max(i17, E(this.f726o, i10, max2 + i22, i11, i23, iArr));
            i16 += this.f726o.getMeasuredHeight() + t(this.f726o);
            i18 = View.combineMeasuredStates(i18, this.f726o.getMeasuredState());
        } else {
            int i24 = i18;
        }
        int max3 = Math.max(i13, i16);
        int paddingLeft = max2 + i17 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, -16777216 & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (!N()) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f724m;
        androidx.appcompat.view.menu.e N2 = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = gVar.f745o;
        if (!(i10 == 0 || this.f719b0 == null || N2 == null || (findItem = N2.findItem(i10)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f746p) {
            H();
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        s0 s0Var = this.F;
        boolean z9 = true;
        if (i10 != 1) {
            z9 = false;
        }
        s0Var.f(z9);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.f719b0;
        if (!(dVar == null || (gVar = dVar.f742n) == null)) {
            gVar2.f745o = gVar.getItemId();
        }
        gVar2.f746p = B();
        return gVar2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.N = false;
        }
        if (!this.N) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.N = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.N = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f731t;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(g.a.b(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f731t.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f731t;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f729r);
        }
    }

    public void setCollapsible(boolean z9) {
        this.f722e0 = z9;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.H) {
            this.H = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.G) {
            this.G = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(g.a.b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f728q)) {
                c(this.f728q, true);
            }
        } else {
            ImageView imageView = this.f728q;
            if (imageView != null && z(imageView)) {
                removeView(this.f728q);
                this.Q.remove(this.f728q);
            }
        }
        ImageView imageView2 = this.f728q;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f728q;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f727p;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            d1.a(this.f727p, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(g.a.b(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f727p)) {
                c(this.f727p, true);
            }
        } else {
            ImageButton imageButton = this.f727p;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f727p);
                this.Q.remove(this.f727p);
            }
        }
        ImageButton imageButton2 = this.f727p;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f727p.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.U = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f724m.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f734w != i10) {
            this.f734w = i10;
            if (i10 == 0) {
                this.f733v = getContext();
            } else {
                this.f733v = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f726o == null) {
                Context context = getContext();
                d0 d0Var = new d0(context);
                this.f726o = d0Var;
                d0Var.setSingleLine();
                this.f726o.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f736y;
                if (i10 != 0) {
                    this.f726o.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.M;
                if (colorStateList != null) {
                    this.f726o.setTextColor(colorStateList);
                }
            }
            if (!z(this.f726o)) {
                c(this.f726o, true);
            }
        } else {
            TextView textView = this.f726o;
            if (textView != null && z(textView)) {
                removeView(this.f726o);
                this.Q.remove(this.f726o);
            }
        }
        TextView textView2 = this.f726o;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.K = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.M = colorStateList;
        TextView textView = this.f726o;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f725n == null) {
                Context context = getContext();
                d0 d0Var = new d0(context);
                this.f725n = d0Var;
                d0Var.setSingleLine();
                this.f725n.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f735x;
                if (i10 != 0) {
                    this.f725n.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.L;
                if (colorStateList != null) {
                    this.f725n.setTextColor(colorStateList);
                }
            }
            if (!z(this.f725n)) {
                c(this.f725n, true);
            }
        } else {
            TextView textView = this.f725n;
            if (textView != null && z(textView)) {
                removeView(this.f725n);
                this.Q.remove(this.f725n);
            }
        }
        TextView textView2 = this.f725n;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.J = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.E = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.C = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.B = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.D = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        TextView textView = this.f725n;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.f719b0;
        return (dVar == null || dVar.f742n == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f724m;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator<MenuItem> it = this.T.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        G();
    }
}
