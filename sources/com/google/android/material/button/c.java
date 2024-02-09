package com.google.android.material.button;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.a;
import androidx.core.view.x;
import com.google.android.material.internal.e;
import e3.i;

class c {

    /* renamed from: w  reason: collision with root package name */
    private static final boolean f6948w = true;

    /* renamed from: a  reason: collision with root package name */
    private final a f6949a;

    /* renamed from: b  reason: collision with root package name */
    private int f6950b;

    /* renamed from: c  reason: collision with root package name */
    private int f6951c;

    /* renamed from: d  reason: collision with root package name */
    private int f6952d;

    /* renamed from: e  reason: collision with root package name */
    private int f6953e;

    /* renamed from: f  reason: collision with root package name */
    private int f6954f;

    /* renamed from: g  reason: collision with root package name */
    private int f6955g;

    /* renamed from: h  reason: collision with root package name */
    private PorterDuff.Mode f6956h;

    /* renamed from: i  reason: collision with root package name */
    private ColorStateList f6957i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f6958j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f6959k;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f6960l = new Paint(1);

    /* renamed from: m  reason: collision with root package name */
    private final Rect f6961m = new Rect();

    /* renamed from: n  reason: collision with root package name */
    private final RectF f6962n = new RectF();

    /* renamed from: o  reason: collision with root package name */
    private GradientDrawable f6963o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f6964p;

    /* renamed from: q  reason: collision with root package name */
    private GradientDrawable f6965q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f6966r;

    /* renamed from: s  reason: collision with root package name */
    private GradientDrawable f6967s;

    /* renamed from: t  reason: collision with root package name */
    private GradientDrawable f6968t;

    /* renamed from: u  reason: collision with root package name */
    private GradientDrawable f6969u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6970v = false;

    public c(a aVar) {
        this.f6949a = aVar;
    }

    private Drawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f6963o = gradientDrawable;
        gradientDrawable.setCornerRadius(((float) this.f6954f) + 1.0E-5f);
        this.f6963o.setColor(-1);
        Drawable q9 = a.q(this.f6963o);
        this.f6964p = q9;
        a.o(q9, this.f6957i);
        PorterDuff.Mode mode = this.f6956h;
        if (mode != null) {
            a.p(this.f6964p, mode);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.f6965q = gradientDrawable2;
        gradientDrawable2.setCornerRadius(((float) this.f6954f) + 1.0E-5f);
        this.f6965q.setColor(-1);
        Drawable q10 = a.q(this.f6965q);
        this.f6966r = q10;
        a.o(q10, this.f6959k);
        return x(new LayerDrawable(new Drawable[]{this.f6964p, this.f6966r}));
    }

    @TargetApi(21)
    private Drawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f6967s = gradientDrawable;
        gradientDrawable.setCornerRadius(((float) this.f6954f) + 1.0E-5f);
        this.f6967s.setColor(-1);
        w();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.f6968t = gradientDrawable2;
        gradientDrawable2.setCornerRadius(((float) this.f6954f) + 1.0E-5f);
        this.f6968t.setColor(0);
        this.f6968t.setStroke(this.f6955g, this.f6958j);
        InsetDrawable x9 = x(new LayerDrawable(new Drawable[]{this.f6967s, this.f6968t}));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.f6969u = gradientDrawable3;
        gradientDrawable3.setCornerRadius(((float) this.f6954f) + 1.0E-5f);
        this.f6969u.setColor(-1);
        return new b(l3.a.a(this.f6959k), x9, this.f6969u);
    }

    private GradientDrawable s() {
        if (!f6948w || this.f6949a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f6949a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }

    private GradientDrawable t() {
        if (!f6948w || this.f6949a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f6949a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    private void v() {
        boolean z9 = f6948w;
        if (z9 && this.f6968t != null) {
            this.f6949a.setInternalBackground(b());
        } else if (!z9) {
            this.f6949a.invalidate();
        }
    }

    private void w() {
        GradientDrawable gradientDrawable = this.f6967s;
        if (gradientDrawable != null) {
            a.o(gradientDrawable, this.f6957i);
            PorterDuff.Mode mode = this.f6956h;
            if (mode != null) {
                a.p(this.f6967s, mode);
            }
        }
    }

    private InsetDrawable x(Drawable drawable) {
        return new InsetDrawable(drawable, this.f6950b, this.f6952d, this.f6951c, this.f6953e);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f6954f;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList d() {
        return this.f6959k;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList e() {
        return this.f6958j;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f6955g;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList g() {
        return this.f6957i;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode h() {
        return this.f6956h;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f6970v;
    }

    public void j(TypedArray typedArray) {
        int i10 = 0;
        this.f6950b = typedArray.getDimensionPixelOffset(i.X, 0);
        this.f6951c = typedArray.getDimensionPixelOffset(i.Y, 0);
        this.f6952d = typedArray.getDimensionPixelOffset(i.Z, 0);
        this.f6953e = typedArray.getDimensionPixelOffset(i.f8386a0, 0);
        this.f6954f = typedArray.getDimensionPixelSize(i.f8392d0, 0);
        this.f6955g = typedArray.getDimensionPixelSize(i.f8410m0, 0);
        this.f6956h = e.a(typedArray.getInt(i.f8390c0, -1), PorterDuff.Mode.SRC_IN);
        this.f6957i = k3.a.a(this.f6949a.getContext(), typedArray, i.f8388b0);
        this.f6958j = k3.a.a(this.f6949a.getContext(), typedArray, i.f8408l0);
        this.f6959k = k3.a.a(this.f6949a.getContext(), typedArray, i.f8406k0);
        this.f6960l.setStyle(Paint.Style.STROKE);
        this.f6960l.setStrokeWidth((float) this.f6955g);
        Paint paint = this.f6960l;
        ColorStateList colorStateList = this.f6958j;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(this.f6949a.getDrawableState(), 0);
        }
        paint.setColor(i10);
        int E = x.E(this.f6949a);
        int paddingTop = this.f6949a.getPaddingTop();
        int D = x.D(this.f6949a);
        int paddingBottom = this.f6949a.getPaddingBottom();
        this.f6949a.setInternalBackground(f6948w ? b() : a());
        x.t0(this.f6949a, E + this.f6950b, paddingTop + this.f6952d, D + this.f6951c, paddingBottom + this.f6953e);
    }

    /* access modifiers changed from: package-private */
    public void k(int i10) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        boolean z9 = f6948w;
        if (z9 && (gradientDrawable2 = this.f6967s) != null) {
            gradientDrawable2.setColor(i10);
        } else if (!z9 && (gradientDrawable = this.f6963o) != null) {
            gradientDrawable.setColor(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f6970v = true;
        this.f6949a.setSupportBackgroundTintList(this.f6957i);
        this.f6949a.setSupportBackgroundTintMode(this.f6956h);
    }

    /* access modifiers changed from: package-private */
    public void m(int i10) {
        GradientDrawable gradientDrawable;
        if (this.f6954f != i10) {
            this.f6954f = i10;
            boolean z9 = f6948w;
            if (z9 && this.f6967s != null && this.f6968t != null && this.f6969u != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    float f10 = ((float) i10) + 1.0E-5f;
                    s().setCornerRadius(f10);
                    t().setCornerRadius(f10);
                }
                float f11 = ((float) i10) + 1.0E-5f;
                this.f6967s.setCornerRadius(f11);
                this.f6968t.setCornerRadius(f11);
                this.f6969u.setCornerRadius(f11);
            } else if (!z9 && (gradientDrawable = this.f6963o) != null && this.f6965q != null) {
                float f12 = ((float) i10) + 1.0E-5f;
                gradientDrawable.setCornerRadius(f12);
                this.f6965q.setCornerRadius(f12);
                this.f6949a.invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f6959k != colorStateList) {
            this.f6959k = colorStateList;
            boolean z9 = f6948w;
            if (z9 && (this.f6949a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f6949a.getBackground()).setColor(colorStateList);
            } else if (!z9 && (drawable = this.f6966r) != null) {
                a.o(drawable, colorStateList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        if (this.f6958j != colorStateList) {
            this.f6958j = colorStateList;
            Paint paint = this.f6960l;
            int i10 = 0;
            if (colorStateList != null) {
                i10 = colorStateList.getColorForState(this.f6949a.getDrawableState(), 0);
            }
            paint.setColor(i10);
            v();
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i10) {
        if (this.f6955g != i10) {
            this.f6955g = i10;
            this.f6960l.setStrokeWidth((float) i10);
            v();
        }
    }

    /* access modifiers changed from: package-private */
    public void q(ColorStateList colorStateList) {
        if (this.f6957i != colorStateList) {
            this.f6957i = colorStateList;
            if (f6948w) {
                w();
                return;
            }
            Drawable drawable = this.f6964p;
            if (drawable != null) {
                a.o(drawable, colorStateList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(PorterDuff.Mode mode) {
        if (this.f6956h != mode) {
            this.f6956h = mode;
            if (f6948w) {
                w();
                return;
            }
            Drawable drawable = this.f6964p;
            if (drawable != null && mode != null) {
                a.p(drawable, mode);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(int i10, int i11) {
        GradientDrawable gradientDrawable = this.f6969u;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f6950b, this.f6952d, i11 - this.f6951c, i10 - this.f6953e);
        }
    }
}
