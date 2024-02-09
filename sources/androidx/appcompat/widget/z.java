package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import androidx.core.view.x;
import f.j;

class z extends u {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1103d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1104e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1105f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f1106g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1107h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1108i = false;

    z(SeekBar seekBar) {
        super(seekBar);
        this.f1103d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1104e;
        if (drawable == null) {
            return;
        }
        if (this.f1107h || this.f1108i) {
            Drawable q9 = a.q(drawable.mutate());
            this.f1104e = q9;
            if (this.f1107h) {
                a.o(q9, this.f1105f);
            }
            if (this.f1108i) {
                a.p(this.f1104e, this.f1106g);
            }
            if (this.f1104e.isStateful()) {
                this.f1104e.setState(this.f1103d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1103d.getContext();
        int[] iArr = j.T;
        a1 u9 = a1.u(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1103d;
        x.e0(seekBar, seekBar.getContext(), iArr, attributeSet, u9.q(), i10, 0);
        Drawable g10 = u9.g(j.U);
        if (g10 != null) {
            this.f1103d.setThumb(g10);
        }
        j(u9.f(j.V));
        int i11 = j.X;
        if (u9.r(i11)) {
            this.f1106g = i0.d(u9.j(i11, -1), this.f1106g);
            this.f1108i = true;
        }
        int i12 = j.W;
        if (u9.r(i12)) {
            this.f1105f = u9.c(i12);
            this.f1107h = true;
        }
        u9.v();
        f();
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1104e != null) {
            int max = this.f1103d.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1104e.getIntrinsicWidth();
                int intrinsicHeight = this.f1104e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f1104e.setBounds(-i11, -i10, i11, i10);
                float width = ((float) ((this.f1103d.getWidth() - this.f1103d.getPaddingLeft()) - this.f1103d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1103d.getPaddingLeft(), (float) (this.f1103d.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1104e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1104e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1103d.getDrawableState())) {
            this.f1103d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1104e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Drawable drawable) {
        Drawable drawable2 = this.f1104e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1104e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1103d);
            a.m(drawable, x.z(this.f1103d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1103d.getDrawableState());
            }
            f();
        }
        this.f1103d.invalidate();
    }
}
