package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.x;
import f.j;

class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f860a;

    /* renamed from: b  reason: collision with root package name */
    private final k f861b;

    /* renamed from: c  reason: collision with root package name */
    private int f862c = -1;

    /* renamed from: d  reason: collision with root package name */
    private y0 f863d;

    /* renamed from: e  reason: collision with root package name */
    private y0 f864e;

    /* renamed from: f  reason: collision with root package name */
    private y0 f865f;

    e(View view) {
        this.f860a = view;
        this.f861b = k.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f865f == null) {
            this.f865f = new y0();
        }
        y0 y0Var = this.f865f;
        y0Var.a();
        ColorStateList p10 = x.p(this.f860a);
        if (p10 != null) {
            y0Var.f1102d = true;
            y0Var.f1099a = p10;
        }
        PorterDuff.Mode q9 = x.q(this.f860a);
        if (q9 != null) {
            y0Var.f1101c = true;
            y0Var.f1100b = q9;
        }
        if (!y0Var.f1102d && !y0Var.f1101c) {
            return false;
        }
        k.i(drawable, y0Var, this.f860a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f863d != null : i10 == 21;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f860a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            y0 y0Var = this.f864e;
            if (y0Var != null) {
                k.i(background, y0Var, this.f860a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.f863d;
            if (y0Var2 != null) {
                k.i(background, y0Var2, this.f860a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        y0 y0Var = this.f864e;
        if (y0Var != null) {
            return y0Var.f1099a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        y0 y0Var = this.f864e;
        if (y0Var != null) {
            return y0Var.f1100b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f860a.getContext();
        int[] iArr = j.f8712y3;
        a1 u9 = a1.u(context, attributeSet, iArr, i10, 0);
        View view = this.f860a;
        x.e0(view, view.getContext(), iArr, attributeSet, u9.q(), i10, 0);
        try {
            int i11 = j.f8717z3;
            if (u9.r(i11)) {
                this.f862c = u9.m(i11, -1);
                ColorStateList f10 = this.f861b.f(this.f860a.getContext(), this.f862c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = j.A3;
            if (u9.r(i12)) {
                x.k0(this.f860a, u9.c(i12));
            }
            int i13 = j.B3;
            if (u9.r(i13)) {
                x.l0(this.f860a, i0.d(u9.j(i13, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u9.v();
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f862c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i10) {
        this.f862c = i10;
        k kVar = this.f861b;
        h(kVar != null ? kVar.f(this.f860a.getContext(), i10) : null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f863d == null) {
                this.f863d = new y0();
            }
            y0 y0Var = this.f863d;
            y0Var.f1099a = colorStateList;
            y0Var.f1102d = true;
        } else {
            this.f863d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f864e == null) {
            this.f864e = new y0();
        }
        y0 y0Var = this.f864e;
        y0Var.f1099a = colorStateList;
        y0Var.f1102d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f864e == null) {
            this.f864e = new y0();
        }
        y0 y0Var = this.f864e;
        y0Var.f1100b = mode;
        y0Var.f1101c = true;
        b();
    }
}
