package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.x;
import androidx.core.widget.i;
import f.j;
import java.lang.reflect.Method;

public class n0 implements k.e {
    private static Method S;
    private static Method T;
    private static Method U;
    int A;
    private View B;
    private int C;
    private DataSetObserver D;
    private View E;
    private Drawable F;
    private AdapterView.OnItemClickListener G;
    private AdapterView.OnItemSelectedListener H;
    final g I;
    private final f J;
    private final e K;
    private final c L;
    private Runnable M;
    final Handler N;
    private final Rect O;
    private Rect P;
    private boolean Q;
    PopupWindow R;

    /* renamed from: m  reason: collision with root package name */
    private Context f991m;

    /* renamed from: n  reason: collision with root package name */
    private ListAdapter f992n;

    /* renamed from: o  reason: collision with root package name */
    j0 f993o;

    /* renamed from: p  reason: collision with root package name */
    private int f994p;

    /* renamed from: q  reason: collision with root package name */
    private int f995q;

    /* renamed from: r  reason: collision with root package name */
    private int f996r;

    /* renamed from: s  reason: collision with root package name */
    private int f997s;

    /* renamed from: t  reason: collision with root package name */
    private int f998t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f999u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1000v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1001w;

    /* renamed from: x  reason: collision with root package name */
    private int f1002x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1003y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1004z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            View t9 = n0.this.t();
            if (t9 != null && t9.getWindowToken() != null) {
                n0.this.a();
            }
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            j0 j0Var;
            if (i10 != -1 && (j0Var = n0.this.f993o) != null) {
                j0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class c implements Runnable {
        c() {
        }

        public void run() {
            n0.this.r();
        }
    }

    private class d extends DataSetObserver {
        d() {
        }

        public void onChanged() {
            if (n0.this.c()) {
                n0.this.a();
            }
        }

        public void onInvalidated() {
            n0.this.dismiss();
        }
    }

    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1 && !n0.this.w() && n0.this.R.getContentView() != null) {
                n0 n0Var = n0.this;
                n0Var.N.removeCallbacks(n0Var.I);
                n0.this.I.run();
            }
        }
    }

    private class f implements View.OnTouchListener {
        f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x9 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = n0.this.R) != null && popupWindow.isShowing() && x9 >= 0 && x9 < n0.this.R.getWidth() && y9 >= 0 && y9 < n0.this.R.getHeight()) {
                n0 n0Var = n0.this;
                n0Var.N.postDelayed(n0Var.I, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                n0 n0Var2 = n0.this;
                n0Var2.N.removeCallbacks(n0Var2.I);
                return false;
            }
        }
    }

    private class g implements Runnable {
        g() {
        }

        public void run() {
            j0 j0Var = n0.this.f993o;
            if (j0Var != null && x.O(j0Var) && n0.this.f993o.getCount() > n0.this.f993o.getChildCount()) {
                int childCount = n0.this.f993o.getChildCount();
                n0 n0Var = n0.this;
                if (childCount <= n0Var.A) {
                    n0Var.R.setInputMethodMode(2);
                    n0.this.a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                S = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                U = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                T = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public n0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public n0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f994p = -2;
        this.f995q = -2;
        this.f998t = 1002;
        this.f1002x = 0;
        this.f1003y = false;
        this.f1004z = false;
        this.A = Integer.MAX_VALUE;
        this.C = 0;
        this.I = new g();
        this.J = new f();
        this.K = new e();
        this.L = new c();
        this.O = new Rect();
        this.f991m = context;
        this.N = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8645l1, i10, i11);
        this.f996r = obtainStyledAttributes.getDimensionPixelOffset(j.f8650m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.f8655n1, 0);
        this.f997s = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f999u = true;
        }
        obtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i10, i11);
        this.R = tVar;
        tVar.setInputMethodMode(1);
    }

    private void J(boolean z9) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = S;
            if (method != null) {
                try {
                    method.invoke(this.R, new Object[]{Boolean.valueOf(z9)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.R.setIsClippedToScreen(z9);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.j0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int q() {
        /*
            r12 = this;
            androidx.appcompat.widget.j0 r0 = r12.f993o
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00bf
            android.content.Context r0 = r12.f991m
            androidx.appcompat.widget.n0$a r5 = new androidx.appcompat.widget.n0$a
            r5.<init>()
            r12.M = r5
            boolean r5 = r12.Q
            r5 = r5 ^ r3
            androidx.appcompat.widget.j0 r5 = r12.s(r0, r5)
            r12.f993o = r5
            android.graphics.drawable.Drawable r6 = r12.F
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.j0 r5 = r12.f993o
            android.widget.ListAdapter r6 = r12.f992n
            r5.setAdapter(r6)
            androidx.appcompat.widget.j0 r5 = r12.f993o
            android.widget.AdapterView$OnItemClickListener r6 = r12.G
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.j0 r5 = r12.f993o
            r5.setFocusable(r3)
            androidx.appcompat.widget.j0 r5 = r12.f993o
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.j0 r5 = r12.f993o
            androidx.appcompat.widget.n0$b r6 = new androidx.appcompat.widget.n0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.j0 r5 = r12.f993o
            androidx.appcompat.widget.n0$e r6 = r12.K
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.H
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.j0 r6 = r12.f993o
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.j0 r5 = r12.f993o
            android.view.View r6 = r12.B
            if (r6 == 0) goto L_0x00b8
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.C
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.C
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f995q
            if (r0 < 0) goto L_0x009c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009e
        L_0x009c:
            r0 = 0
            r5 = 0
        L_0x009e:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            android.widget.PopupWindow r6 = r12.R
            r6.setContentView(r5)
            goto L_0x00dd
        L_0x00bf:
            android.widget.PopupWindow r0 = r12.R
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.B
            if (r0 == 0) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            android.widget.PopupWindow r5 = r12.R
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f9
            android.graphics.Rect r6 = r12.O
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.O
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f999u
            if (r7 != 0) goto L_0x00ff
            int r6 = -r6
            r12.f997s = r6
            goto L_0x00ff
        L_0x00f9:
            android.graphics.Rect r5 = r12.O
            r5.setEmpty()
            r5 = 0
        L_0x00ff:
            android.widget.PopupWindow r6 = r12.R
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r3 = 0
        L_0x010a:
            android.view.View r4 = r12.t()
            int r6 = r12.f997s
            int r3 = r12.u(r4, r6, r3)
            boolean r4 = r12.f1003y
            if (r4 != 0) goto L_0x0162
            int r4 = r12.f994p
            if (r4 != r2) goto L_0x011d
            goto L_0x0162
        L_0x011d:
            int r4 = r12.f995q
            r6 = -2
            if (r4 == r6) goto L_0x012b
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0143
        L_0x012b:
            android.content.Context r2 = r12.f991m
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.O
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0143:
            r7 = r1
            androidx.appcompat.widget.j0 r6 = r12.f993o
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0160
            androidx.appcompat.widget.j0 r2 = r12.f993o
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.j0 r3 = r12.f993o
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0160:
            int r1 = r1 + r0
            return r1
        L_0x0162:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.q():int");
    }

    private int u(View view, int i10, boolean z9) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.R.getMaxAvailableHeight(view, i10, z9);
        }
        Method method = T;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.R, new Object[]{view, Integer.valueOf(i10), Boolean.valueOf(z9)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.R.getMaxAvailableHeight(view, i10);
    }

    private void y() {
        View view = this.B;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.B);
            }
        }
    }

    public void A(int i10) {
        this.R.setAnimationStyle(i10);
    }

    public void B(int i10) {
        Drawable background = this.R.getBackground();
        if (background != null) {
            background.getPadding(this.O);
            Rect rect = this.O;
            this.f995q = rect.left + rect.right + i10;
            return;
        }
        M(i10);
    }

    public void C(int i10) {
        this.f1002x = i10;
    }

    public void D(Rect rect) {
        this.P = rect != null ? new Rect(rect) : null;
    }

    public void E(int i10) {
        this.R.setInputMethodMode(i10);
    }

    public void F(boolean z9) {
        this.Q = z9;
        this.R.setFocusable(z9);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.R.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.G = onItemClickListener;
    }

    public void I(boolean z9) {
        this.f1001w = true;
        this.f1000v = z9;
    }

    public void K(int i10) {
        this.C = i10;
    }

    public void L(int i10) {
        j0 j0Var = this.f993o;
        if (c() && j0Var != null) {
            j0Var.setListSelectionHidden(false);
            j0Var.setSelection(i10);
            if (j0Var.getChoiceMode() != 0) {
                j0Var.setItemChecked(i10, true);
            }
        }
    }

    public void M(int i10) {
        this.f995q = i10;
    }

    public void a() {
        int q9 = q();
        boolean w9 = w();
        i.b(this.R, this.f998t);
        boolean z9 = true;
        if (!this.R.isShowing()) {
            int i10 = this.f995q;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = t().getWidth();
            }
            int i11 = this.f994p;
            if (i11 == -1) {
                q9 = -1;
            } else if (i11 != -2) {
                q9 = i11;
            }
            this.R.setWidth(i10);
            this.R.setHeight(q9);
            J(true);
            this.R.setOutsideTouchable(!this.f1004z && !this.f1003y);
            this.R.setTouchInterceptor(this.J);
            if (this.f1001w) {
                i.a(this.R, this.f1000v);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = U;
                if (method != null) {
                    try {
                        method.invoke(this.R, new Object[]{this.P});
                    } catch (Exception e10) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                    }
                }
            } else {
                this.R.setEpicenterBounds(this.P);
            }
            i.c(this.R, t(), this.f996r, this.f997s, this.f1002x);
            this.f993o.setSelection(-1);
            if (!this.Q || this.f993o.isInTouchMode()) {
                r();
            }
            if (!this.Q) {
                this.N.post(this.L);
            }
        } else if (x.O(t())) {
            int i12 = this.f995q;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = t().getWidth();
            }
            int i13 = this.f994p;
            if (i13 == -1) {
                if (!w9) {
                    q9 = -1;
                }
                if (w9) {
                    this.R.setWidth(this.f995q == -1 ? -1 : 0);
                    this.R.setHeight(0);
                } else {
                    this.R.setWidth(this.f995q == -1 ? -1 : 0);
                    this.R.setHeight(-1);
                }
            } else if (i13 != -2) {
                q9 = i13;
            }
            PopupWindow popupWindow = this.R;
            if (this.f1004z || this.f1003y) {
                z9 = false;
            }
            popupWindow.setOutsideTouchable(z9);
            this.R.update(t(), this.f996r, this.f997s, i12 < 0 ? -1 : i12, q9 < 0 ? -1 : q9);
        }
    }

    public void b(Drawable drawable) {
        this.R.setBackgroundDrawable(drawable);
    }

    public boolean c() {
        return this.R.isShowing();
    }

    public int d() {
        return this.f996r;
    }

    public void dismiss() {
        this.R.dismiss();
        y();
        this.R.setContentView((View) null);
        this.f993o = null;
        this.N.removeCallbacks(this.I);
    }

    public Drawable g() {
        return this.R.getBackground();
    }

    public ListView h() {
        return this.f993o;
    }

    public void j(int i10) {
        this.f997s = i10;
        this.f999u = true;
    }

    public void l(int i10) {
        this.f996r = i10;
    }

    public int n() {
        if (!this.f999u) {
            return 0;
        }
        return this.f997s;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.D;
        if (dataSetObserver == null) {
            this.D = new d();
        } else {
            ListAdapter listAdapter2 = this.f992n;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f992n = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.D);
        }
        j0 j0Var = this.f993o;
        if (j0Var != null) {
            j0Var.setAdapter(this.f992n);
        }
    }

    public void r() {
        j0 j0Var = this.f993o;
        if (j0Var != null) {
            j0Var.setListSelectionHidden(true);
            j0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public j0 s(Context context, boolean z9) {
        return new j0(context, z9);
    }

    public View t() {
        return this.E;
    }

    public int v() {
        return this.f995q;
    }

    public boolean w() {
        return this.R.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.Q;
    }

    public void z(View view) {
        this.E = view;
    }
}
