package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.d;

class j {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f926a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f927b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f928c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f929d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f930e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f931f;

    j(CompoundButton compoundButton) {
        this.f926a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a10 = d.a(this.f926a);
        if (a10 == null) {
            return;
        }
        if (this.f929d || this.f930e) {
            Drawable mutate = a.q(a10).mutate();
            if (this.f929d) {
                a.o(mutate, this.f927b);
            }
            if (this.f930e) {
                a.p(mutate, this.f928c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f926a.getDrawableState());
            }
            this.f926a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public int b(int i10) {
        return i10;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f927b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f928c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f926a
            android.content.Context r0 = r0.getContext()
            int[] r3 = f.j.U0
            r8 = 0
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.a1.u(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f926a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.q()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.x.e0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = f.j.W0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f926a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = g.a.b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = f.j.V0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f926a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = g.a.b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = f.j.X0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f926a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.d.b(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = f.j.Y0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f926a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.j(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.i0.d(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.d.c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.v()
            return
        L_0x0084:
            r10 = move-exception
            r0.v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f931f) {
            this.f931f = false;
            return;
        }
        this.f931f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f927b = colorStateList;
        this.f929d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.f928c = mode;
        this.f930e = true;
        a();
    }
}
