package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.m0;

public class t0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: v  reason: collision with root package name */
    private static final Interpolator f1048v = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    Runnable f1049m;

    /* renamed from: n  reason: collision with root package name */
    private c f1050n;

    /* renamed from: o  reason: collision with root package name */
    m0 f1051o;

    /* renamed from: p  reason: collision with root package name */
    private Spinner f1052p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1053q;

    /* renamed from: r  reason: collision with root package name */
    int f1054r;

    /* renamed from: s  reason: collision with root package name */
    int f1055s;

    /* renamed from: t  reason: collision with root package name */
    private int f1056t;

    /* renamed from: u  reason: collision with root package name */
    private int f1057u;

    class a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ View f1058m;

        a(View view) {
            this.f1058m = view;
        }

        public void run() {
            t0.this.smoothScrollTo(this.f1058m.getLeft() - ((t0.this.getWidth() - this.f1058m.getWidth()) / 2), 0);
            t0.this.f1049m = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return t0.this.f1051o.getChildCount();
        }

        public Object getItem(int i10) {
            return ((d) t0.this.f1051o.getChildAt(i10)).b();
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return t0.this.c((a.c) getItem(i10), true);
            }
            ((d) view).a((a.c) getItem(i10));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = t0.this.f1051o.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t0.this.f1051o.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* renamed from: m  reason: collision with root package name */
        private final int[] f1062m;

        /* renamed from: n  reason: collision with root package name */
        private a.c f1063n;

        /* renamed from: o  reason: collision with root package name */
        private TextView f1064o;

        /* renamed from: p  reason: collision with root package name */
        private ImageView f1065p;

        /* renamed from: q  reason: collision with root package name */
        private View f1066q;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(android.content.Context r6, androidx.appcompat.app.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.t0.this = r5
                int r5 = f.a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1062m = r1
                r4.f1063n = r7
                androidx.appcompat.widget.a1 r5 = androidx.appcompat.widget.a1.u(r6, r0, r1, r5, r3)
                boolean r6 = r5.r(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.f(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.v()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.d.<init>(androidx.appcompat.widget.t0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f1063n = cVar;
            c();
        }

        public a.c b() {
            return this.f1063n;
        }

        public void c() {
            a.c cVar = this.f1063n;
            View b10 = cVar.b();
            CharSequence charSequence = null;
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f1066q = b10;
                TextView textView = this.f1064o;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1065p;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1065p.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1066q;
            if (view != null) {
                removeView(view);
                this.f1066q = null;
            }
            Drawable c10 = cVar.c();
            CharSequence d10 = cVar.d();
            if (c10 != null) {
                if (this.f1065p == null) {
                    r rVar = new r(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    rVar.setLayoutParams(layoutParams);
                    addView(rVar, 0);
                    this.f1065p = rVar;
                }
                this.f1065p.setImageDrawable(c10);
                this.f1065p.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1065p;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1065p.setImageDrawable((Drawable) null);
                }
            }
            boolean z9 = !TextUtils.isEmpty(d10);
            if (z9) {
                if (this.f1064o == null) {
                    d0 d0Var = new d0(getContext(), (AttributeSet) null, f.a.actionBarTabTextStyle);
                    d0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    d0Var.setLayoutParams(layoutParams2);
                    addView(d0Var);
                    this.f1064o = d0Var;
                }
                this.f1064o.setText(d10);
                this.f1064o.setVisibility(0);
            } else {
                TextView textView2 = this.f1064o;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1064o.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1065p;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z9) {
                charSequence = cVar.a();
            }
            d1.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (t0.this.f1054r > 0 && getMeasuredWidth() > (i12 = t0.this.f1054r)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        public void setSelected(boolean z9) {
            boolean z10 = isSelected() != z9;
            super.setSelected(z9);
            if (z10 && z9) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        a0 a0Var = new a0(getContext(), (AttributeSet) null, f.a.actionDropDownStyle);
        a0Var.setLayoutParams(new m0.a(-2, -1));
        a0Var.setOnItemSelectedListener(this);
        return a0Var;
    }

    private boolean d() {
        Spinner spinner = this.f1052p;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (!d()) {
            if (this.f1052p == null) {
                this.f1052p = b();
            }
            removeView(this.f1051o);
            addView(this.f1052p, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1052p.getAdapter() == null) {
                this.f1052p.setAdapter(new b());
            }
            Runnable runnable = this.f1049m;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1049m = null;
            }
            this.f1052p.setSelection(this.f1057u);
        }
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1052p);
        addView(this.f1051o, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1052p.getSelectedItemPosition());
        return false;
    }

    public void a(int i10) {
        View childAt = this.f1051o.getChildAt(i10);
        Runnable runnable = this.f1049m;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1049m = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    public d c(a.c cVar, boolean z9) {
        d dVar = new d(getContext(), cVar, z9);
        if (z9) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1056t));
        } else {
            dVar.setFocusable(true);
            if (this.f1050n == null) {
                this.f1050n = new c();
            }
            dVar.setOnClickListener(this.f1050n);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1049m;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j.a b10 = j.a.b(getContext());
        setContentHeight(b10.f());
        this.f1055s = b10.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1049m;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z9 = true;
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f1051o.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i12 = -1;
        } else {
            if (childCount > 2) {
                this.f1054r = (int) (((float) View.MeasureSpec.getSize(i10)) * 0.4f);
            } else {
                this.f1054r = View.MeasureSpec.getSize(i10) / 2;
            }
            i12 = Math.min(this.f1054r, this.f1055s);
        }
        this.f1054r = i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1056t, 1073741824);
        if (z10 || !this.f1053q) {
            z9 = false;
        }
        if (z9) {
            this.f1051o.measure(0, makeMeasureSpec);
            if (this.f1051o.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i10, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z10 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f1057u);
                    return;
                }
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z10) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z9) {
        this.f1053q = z9;
    }

    public void setContentHeight(int i10) {
        this.f1056t = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1057u = i10;
        int childCount = this.f1051o.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1051o.getChildAt(i11);
            boolean z9 = i11 == i10;
            childAt.setSelected(z9);
            if (z9) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1052p;
        if (spinner != null && i10 >= 0) {
            spinner.setSelection(i10);
        }
    }
}
