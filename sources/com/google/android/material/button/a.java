package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.f;
import androidx.core.view.x;
import androidx.core.widget.j;
import com.google.android.material.internal.d;
import com.google.android.material.internal.e;
import e3.b;
import e3.h;
import e3.i;

public class a extends f {

    /* renamed from: p  reason: collision with root package name */
    private final c f6940p;

    /* renamed from: q  reason: collision with root package name */
    private int f6941q;

    /* renamed from: r  reason: collision with root package name */
    private PorterDuff.Mode f6942r;

    /* renamed from: s  reason: collision with root package name */
    private ColorStateList f6943s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f6944t;

    /* renamed from: u  reason: collision with root package name */
    private int f6945u;

    /* renamed from: v  reason: collision with root package name */
    private int f6946v;

    /* renamed from: w  reason: collision with root package name */
    private int f6947w;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.materialButtonStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray h10 = d.h(context, attributeSet, i.W, i10, h.Widget_MaterialComponents_Button, new int[0]);
        this.f6941q = h10.getDimensionPixelSize(i.f8398g0, 0);
        this.f6942r = e.a(h10.getInt(i.f8404j0, -1), PorterDuff.Mode.SRC_IN);
        this.f6943s = k3.a.a(getContext(), h10, i.f8402i0);
        this.f6944t = k3.a.b(getContext(), h10, i.f8394e0);
        this.f6947w = h10.getInteger(i.f8396f0, 1);
        this.f6945u = h10.getDimensionPixelSize(i.f8400h0, 0);
        c cVar = new c(this);
        this.f6940p = cVar;
        cVar.j(h10);
        h10.recycle();
        setCompoundDrawablePadding(this.f6941q);
        c();
    }

    private boolean a() {
        return x.z(this) == 1;
    }

    private boolean b() {
        c cVar = this.f6940p;
        return cVar != null && !cVar.i();
    }

    private void c() {
        Drawable drawable = this.f6944t;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f6944t = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f6943s);
            PorterDuff.Mode mode = this.f6942r;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f6944t, mode);
            }
            int i10 = this.f6945u;
            if (i10 == 0) {
                i10 = this.f6944t.getIntrinsicWidth();
            }
            int i11 = this.f6945u;
            if (i11 == 0) {
                i11 = this.f6944t.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6944t;
            int i12 = this.f6946v;
            drawable2.setBounds(i12, 0, i10 + i12, i11);
        }
        j.h(this, this.f6944t, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f6940p.c();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f6944t;
    }

    public int getIconGravity() {
        return this.f6947w;
    }

    public int getIconPadding() {
        return this.f6941q;
    }

    public int getIconSize() {
        return this.f6945u;
    }

    public ColorStateList getIconTint() {
        return this.f6943s;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f6942r;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f6940p.d();
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f6940p.e();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f6940p.f();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f6940p.g() : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f6940p.h() : super.getSupportBackgroundTintMode();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        c cVar;
        super.onLayout(z9, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (cVar = this.f6940p) != null) {
            cVar.u(i13 - i11, i12 - i10);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f6944t != null && this.f6947w == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i12 = this.f6945u;
            if (i12 == 0) {
                i12 = this.f6944t.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - x.D(this)) - i12) - this.f6941q) - x.E(this)) / 2;
            if (a()) {
                measuredWidth = -measuredWidth;
            }
            if (this.f6946v != measuredWidth) {
                this.f6946v = measuredWidth;
                c();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i10) {
        if (b()) {
            this.f6940p.k(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (b()) {
            if (drawable != getBackground()) {
                Log.i("MaterialButton", "Setting a custom background is not supported.");
                this.f6940p.l();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i10) {
        if (b()) {
            this.f6940p.m(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f6944t != drawable) {
            this.f6944t = drawable;
            c();
        }
    }

    public void setIconGravity(int i10) {
        this.f6947w = i10;
    }

    public void setIconPadding(int i10) {
        if (this.f6941q != i10) {
            this.f6941q = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f6945u != i10) {
            this.f6945u = i10;
            c();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f6943s != colorStateList) {
            this.f6943s = colorStateList;
            c();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f6942r != mode) {
            this.f6942r = mode;
            c();
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(g.a.a(getContext(), i10));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            this.f6940p.n(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (b()) {
            setRippleColor(g.a.a(getContext(), i10));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            this.f6940p.o(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (b()) {
            setStrokeColor(g.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (b()) {
            this.f6940p.p(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            this.f6940p.q(colorStateList);
        } else if (this.f6940p != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            this.f6940p.r(mode);
        } else if (this.f6940p != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }
}
