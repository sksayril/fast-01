package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

class i {

    /* renamed from: a  reason: collision with root package name */
    private final CheckedTextView f917a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f918b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f919c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f920d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f921e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f922f;

    i(CheckedTextView checkedTextView) {
        this.f917a = checkedTextView;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a10 = c.a(this.f917a);
        if (a10 == null) {
            return;
        }
        if (this.f920d || this.f921e) {
            Drawable mutate = a.q(a10).mutate();
            if (this.f920d) {
                a.o(mutate, this.f918b);
            }
            if (this.f921e) {
                a.p(mutate, this.f919c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f917a.getDrawableState());
            }
            this.f917a.setCheckMarkDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f918b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f919c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f917a
            android.content.Context r0 = r0.getContext()
            int[] r3 = f.j.P0
            r8 = 0
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.a1.u(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f917a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.q()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.x.e0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = f.j.R0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CheckedTextView r11 = r9.f917a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = g.a.b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setCheckMarkDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = f.j.Q0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CheckedTextView r11 = r9.f917a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = g.a.b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setCheckMarkDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = f.j.S0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CheckedTextView r11 = r9.f917a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.c.b(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = f.j.T0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CheckedTextView r11 = r9.f917a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.j(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.i0.d(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.c.c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.v()
            return
        L_0x0084:
            r10 = move-exception
            r0.v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.d(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f922f) {
            this.f922f = false;
            return;
        }
        this.f922f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void f(ColorStateList colorStateList) {
        this.f918b = colorStateList;
        this.f920d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(PorterDuff.Mode mode) {
        this.f919c = mode;
        this.f921e = true;
        a();
    }
}
