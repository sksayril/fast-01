package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.x;
import androidx.core.widget.f;
import f.j;
import g.a;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1015a;

    /* renamed from: b  reason: collision with root package name */
    private y0 f1016b;

    /* renamed from: c  reason: collision with root package name */
    private y0 f1017c;

    /* renamed from: d  reason: collision with root package name */
    private y0 f1018d;

    /* renamed from: e  reason: collision with root package name */
    private int f1019e = 0;

    public q(ImageView imageView) {
        this.f1015a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1018d == null) {
            this.f1018d = new y0();
        }
        y0 y0Var = this.f1018d;
        y0Var.a();
        ColorStateList a10 = f.a(this.f1015a);
        if (a10 != null) {
            y0Var.f1102d = true;
            y0Var.f1099a = a10;
        }
        PorterDuff.Mode b10 = f.b(this.f1015a);
        if (b10 != null) {
            y0Var.f1101c = true;
            y0Var.f1100b = b10;
        }
        if (!y0Var.f1102d && !y0Var.f1101c) {
            return false;
        }
        k.i(drawable, y0Var, this.f1015a.getDrawableState());
        return true;
    }

    private boolean l() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f1016b != null : i10 == 21;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f1015a.getDrawable() != null) {
            this.f1015a.getDrawable().setLevel(this.f1019e);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f1015a.getDrawable();
        if (drawable != null) {
            i0.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!l() || !a(drawable)) {
            y0 y0Var = this.f1017c;
            if (y0Var != null) {
                k.i(drawable, y0Var, this.f1015a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.f1016b;
            if (y0Var2 != null) {
                k.i(drawable, y0Var2, this.f1015a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList d() {
        y0 y0Var = this.f1017c;
        if (y0Var != null) {
            return y0Var.f1099a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        y0 y0Var = this.f1017c;
        if (y0Var != null) {
            return y0Var.f1100b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return !(this.f1015a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int m10;
        Context context = this.f1015a.getContext();
        int[] iArr = j.P;
        a1 u9 = a1.u(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1015a;
        x.e0(imageView, imageView.getContext(), iArr, attributeSet, u9.q(), i10, 0);
        try {
            Drawable drawable = this.f1015a.getDrawable();
            if (!(drawable != null || (m10 = u9.m(j.Q, -1)) == -1 || (drawable = a.b(this.f1015a.getContext(), m10)) == null)) {
                this.f1015a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                i0.b(drawable);
            }
            int i11 = j.R;
            if (u9.r(i11)) {
                f.c(this.f1015a, u9.c(i11));
            }
            int i12 = j.S;
            if (u9.r(i12)) {
                f.d(this.f1015a, i0.d(u9.j(i12, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u9.v();
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Drawable drawable) {
        this.f1019e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = a.b(this.f1015a.getContext(), i10);
            if (b10 != null) {
                i0.b(b10);
            }
            this.f1015a.setImageDrawable(b10);
        } else {
            this.f1015a.setImageDrawable((Drawable) null);
        }
        c();
    }

    /* access modifiers changed from: package-private */
    public void j(ColorStateList colorStateList) {
        if (this.f1017c == null) {
            this.f1017c = new y0();
        }
        y0 y0Var = this.f1017c;
        y0Var.f1099a = colorStateList;
        y0Var.f1102d = true;
        c();
    }

    /* access modifiers changed from: package-private */
    public void k(PorterDuff.Mode mode) {
        if (this.f1017c == null) {
            this.f1017c = new y0();
        }
        y0 y0Var = this.f1017c;
        y0Var.f1100b = mode;
        y0Var.f1101c = true;
        c();
    }
}
