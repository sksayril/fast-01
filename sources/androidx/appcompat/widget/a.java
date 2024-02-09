package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.d0;
import androidx.core.view.e0;
import androidx.core.view.x;
import f.j;

abstract class a extends ViewGroup {

    /* renamed from: m  reason: collision with root package name */
    protected final C0008a f752m;

    /* renamed from: n  reason: collision with root package name */
    protected final Context f753n;

    /* renamed from: o  reason: collision with root package name */
    protected ActionMenuView f754o;

    /* renamed from: p  reason: collision with root package name */
    protected c f755p;

    /* renamed from: q  reason: collision with root package name */
    protected int f756q;

    /* renamed from: r  reason: collision with root package name */
    protected d0 f757r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f758s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f759t;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    protected class C0008a implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f760a = false;

        /* renamed from: b  reason: collision with root package name */
        int f761b;

        protected C0008a() {
        }

        public void a(View view) {
            this.f760a = true;
        }

        public void b(View view) {
            if (!this.f760a) {
                a aVar = a.this;
                aVar.f757r = null;
                a.super.setVisibility(this.f761b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.f760a = false;
        }

        public C0008a d(d0 d0Var, int i10) {
            a.this.f757r = d0Var;
            this.f761b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f752m = new C0008a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(f.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f753n = context;
        } else {
            this.f753n = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z9) {
        return z9 ? i10 - i11 : i10 + i11;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i10, int i11, int i12, boolean z9) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z9) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z9 ? -measuredWidth : measuredWidth;
    }

    public d0 f(int i10, long j10) {
        d0 b10;
        d0 d0Var = this.f757r;
        if (d0Var != null) {
            d0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b10 = x.c(this).b(1.0f);
        } else {
            b10 = x.c(this).b(0.0f);
        }
        b10.f(j10);
        b10.h(this.f752m.d(b10, i10));
        return b10;
    }

    public int getAnimatedVisibility() {
        return this.f757r != null ? this.f752m.f761b : getVisibility();
    }

    public int getContentHeight() {
        return this.f756q;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.f8588a, f.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.f8633j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f755p;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f759t = false;
        }
        if (!this.f759t) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f759t = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f759t = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f758s = false;
        }
        if (!this.f758s) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f758s = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f758s = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f756q = i10;
        requestLayout();
    }

    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            d0 d0Var = this.f757r;
            if (d0Var != null) {
                d0Var.c();
            }
            super.setVisibility(i10);
        }
    }
}
